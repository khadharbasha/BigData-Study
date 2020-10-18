pass=$1



#echo "*************************** Loading the creditcard, customermaster data into the source DB *********************"

#bash /home/hduser/creditcard_insurance/1_dbscript


sqoop import --connect jdbc:mysql://inceptez/custdb --username root --password $pass --table credits_cst --delete-target-dir --target-dir /user/hduser/credits_cst/ -m 1

sqoop import --connect jdbc:mysql://inceptez/custdb --username root --password $pass --table credits_pst --delete-target-dir --target-dir /user/hduser/credits_pst/ -m 1

echo "***************************SQOOP COMPLETED *********************"

echo "*************************** Hadoop remove pig target folders forcefully if exists *********************"

hadoop fs -rmr -f /user/hduser/defaultersout/
hadoop fs -rmr -f /user/hduser/nondefaultersout/


echo "*************************** merge the 2 dataset using pig and split the defaulters and non-defaulters into 2 data sets and load into hdfs *********************"

pig -x mapreduce -f /home/hduser/creditcard_insurance/2_1-pigscript.pig


hive -f /home/hduser/creditcard_insurance/3_1_hiveinsuranceload.hql


hive -f /home/hduser/creditcard_insurance/3_2_hivestatefixedwidthload.hql



hadoop fs -rmr -f /user/hduser/insuranceorc

imported_cnt=`hadoop fs -cat weblogs_sqoop/* | wc -l`

echo "Number of rows imported from DB to Hadoop is $imported_cnt"

echo "*************** COPYING DATA FROM LINUX TO HADOOP ************"

hadoop fs -mkdir -p /user/hduser/weblogs
hadoop fs -put -f /home/hduser/pigdata/weblogs_parse.txt /user/hduser/weblogs/

echo "***************STARTING PIG PARSING ************"

hadoop fs -rmr $2

pig -x mapreduce -f /home/hduser/weblogs_script/weblogs.pig -p outdir=$2

echo "***************STARTING HIVE LOAD ************"

hive -f ~/weblogs_script/hivescript.hql
