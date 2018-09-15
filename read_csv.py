import csv
 
# 2 ways of reading csv file

f = open('aapl.csv', 'r', encoding='utf-8')
rdr = csv.reader(f)
for line in rdr:
    print(line)
f.close()   

with open('aapl.csv', 'r') as csvfile:
    csvFileReader = csv.reader(csvfile)
    for row in csvFileReader:
        print(row)