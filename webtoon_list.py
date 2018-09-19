import requests
from bs4 import BeautifulSoup
import operator

res = requests.get('https://comic.naver.com/webtoon/weekday.nhn')

html = res.text
soup = BeautifulSoup(html, 'html.parser')

titles = soup.select('#content > div.list_area.daily_all > div > div > ul > li > a')

webtoon_lists = []
for title in titles:
    webtoon_lists.append(title.text)

# all the webtoons currently publishing
print(webtoon_lists, '\n\nThe number of webtoons currently publishing is : {}\n'.format(len(webtoon_lists)))

# number of publishing per each webtoons
webtoon_serials_dict = {}
for webtoon in webtoon_lists:
    if webtoon in webtoon_serials_dict:
        webtoon_serials_dict[webtoon] += 1
    else:
        webtoon_serials_dict[webtoon] = 1

webtoon_serials_dict = sorted(webtoon_serials_dict.items(), key = operator.itemgetter(1), reverse = True)

print(webtoon_serials_dict)