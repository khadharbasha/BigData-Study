select transform(custno,firstname,lastname,age,profession) using 'python /home/hduser/mask.py' as
(custno,firstname,lastname,age,profession) from customerall limit 10;

