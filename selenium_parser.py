from selenium import webdriver
from bs4 import BeautifulSoup

driver = webdriver.Chrome(r'C:\Users\default.DESKTOP-S5Q9GAA\Downloads\chromedriver_win32\chromedriver')

driver.implicitly_wait(3)

driver.get('https://nid.naver.com/nidlogin.login')

with open('naver_id_password.txt', 'r') as f:
    info = f.readlines()

    driver.find_element_by_name('id').send_keys(info[0].strip())
    driver.find_element_by_name('pw').send_keys(info[1].strip())
    driver.find_element_by_xpath('//*[@id="frmNIDLogin"]/fieldset/input').click()

    driver.get('https://order.pay.naver.com/home')
    html = driver.page_source
    soup = BeautifulSoup(html, 'html.parser')
    notices = soup.select('div.p_inr > div.p_info > a > span')

    for n in notices:
        print(n.text.strip())