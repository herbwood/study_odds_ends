import requests
from bs4 import BeautifulSoup

res = requests.get('https://comic.naver.com/webtoon/weekday.nhn')

html = res.text
soup = BeautifulSoup(html, 'html.parser')

titles = soup.select('div > div > div > ul > li > a')

webtoon_lists = []
for title in titles:
    webtoon_lists.append(title.text)

print(webtoon_lists[42:265])