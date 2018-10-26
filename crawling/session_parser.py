import requests
from bs4 import BeautifulSoup as bs

LOGIN_INFO = {'userID' : 'dirchdmltnv',
              'userPassword' : '4gfP9YxGCPsm3K6'}

# Create Session
with requests.Session() as s:
    req = s.get('https://www.clien.net/service/')
    html = req.text
    header = req.headers
    status = req.status_code
    # Check if HTTP requests were normal
    is_ok = req.ok

    first_page = s.get('https://www.clien.net/service/')
    html = first_page.text
    soup = bs(html, 'html.parser')

    # find input tag named _csrf
    csrf = soup.find('input', {'name' : '_csrf'})

    # print the value of _csrf tag
    print(csrf['value'])

    # put ** to combine 2 dicitionaries
    LOGIN_INFO = {**LOGIN_INFO, **{'_csrf' : csrf['value']}}
    print(LOGIN_INFO)

    login_req = s.post('https://www.clien.net/service/login', data = LOGIN_INFO)
    print(login_req.status_code)

    if login_req.status_code != 200:
        raise Exception('Login denied. Check Id and Password again')

    post_one = s.get('https://www.clien.net/service/board/rule/10707408')
    soup = bs(post_one.text, 'html.parser')

    title = soup.select('#div_content > div.post_title.symph_row > h3')
    contents = soup.select('#div_content > div.post_view > div.post_content > article > div')

    print(title[0].text)
    print(contents[0].text)