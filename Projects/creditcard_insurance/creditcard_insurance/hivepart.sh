#Korne/bourne/c
#!/bin/ksh
#Script to create hive partition load
#bash /home/hduser/creditcard_insurance/hivepart.sh /user/hduser/insurance_clouddata insure.insurance creditcard_insurance

# 1. validated the invocation of the script
# 2. looping the path where data presents -> identify filename /user/hduser/insurance_clouddata/creditcard_insurance_2020100712 - creditcard_insurance_2020100712 -> 
# identify date from the filename 20201007-> format the date (YYYY-MM-DD) 2020-10-07-> 
# identify hour -> create load command substituting src path, tablename, fmtdate, region in the load command 
# LOAD DATA LOCAL INPATH 'PATH'
#OVERWRITE INTO TABLE tablename
#PARTITION (datadt='formatted date',hr=12);
#-> copy the all load commands inside a partload.hql file by append
# 3. Using hive -f option run the partload.hql created.

#Placeholders -> $0 - name of the script, $1 - first arg, $2, $# - no of args, $? - exec state of the previous command

echo "$0 is starting"
rm -f /tmp/partload.hql

if [ $# -ne 3 ]
then
echo "$0 requires source data path and the target table name to load"
exit 10
fi

echo "$1 is the path"
echo "$2 is the tablename"
echo "$3 is the filename prefix"

for i in `hadoop fs -ls $1/$3_* | awk '{ print $8}'`
do
echo "file with path name is $i"

#identify filename /home/hduser/hivepart/txns_20201007_PADE -> txns_20201007_PADE
filenm=$(basename $i)
echo "$filenm"

#identify date from the filename 20201007 -> 2020-10-07
dt=`echo $filenm |awk -F'_' '{print $3}'`
dtcut=`echo $dt | cut -c 1-8`
dtfmt=`date -d $dtcut +'%Y-%m-%d'`
echo $dtfmt

hr=`echo $dt | cut -c 9-10`
echo $hr

echo "LOAD DATA INPATH '$1/$filenm' OVERWRITE INTO TABLE $2 PARTITION (datadt='$dtfmt',hr=$hr);" >> /tmp/partload.hql
done

#needed in case if you are using embedded metastore (derby) in /home/hduser/metastore_db
echo "loading hive table"
hive -f /tmp/partload.hql


