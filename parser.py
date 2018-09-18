import requests
from bs4 import BeautifulSoup
import json
import os

# HTTP GET Requests

req = requests.get('https://beomi.github.io/beomi.github.io_old/')
html = req.text

# selecting parser

soup = BeautifulSoup(html, 'html.parser')

# choose which tags to scrap by using copy selector
# 'body > h3:nth-child(4) > a'
# tag is too specific... so change the tag into 'h3 > a'

my_titles = soup.select('h3 > a')

for title in my_titles:
    print(title.text)
    print(title.get('href'))

# step1 : requests for text
# step2 : select the parser
# step3 : choose which tags to parse
# step4 : print