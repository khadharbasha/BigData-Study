#!/usr/bin/env python
import sys
import string
import re
import hashlib
while True:
	line = sys.stdin.readline()
	if not line:
		break
	line = string.strip(line, "\n")
	issuerid,businessyear,statedesc,sourcename, defaulter,networkurl = string.split(line, "\t")
	print "\t".join([issuerid,businessyear,hashlib.sha256(statedesc).hexdigest(),hashlib.md5(sourcename).hexdigest(),defaulter,re.sub('b','z',re.sub('j','y',re.sub('/','-',re.sub('.com','.aaa',networkurl))))])
