import requests
from bs4 import BeautifulSoup

cookies={)#"PHPSESSID":"12345"}
URL = 'http://chals.whitehacks.ctf.sg:13002/'


def answering(BASE_URL):
    page = requests.get(URL, cookies=cookies)
    try:
        soup = BeautifulSoup(page.content, 'html.parser')

        argv1 = soup.find(class_='quiz_argv_1')
        operator = soup.find(class_='quiz_operator')
        argv2 = soup.find(class_='quiz_argv_2')
        execute = argv1.contents[0] + operator.contents[0] + argv2.contents[0]
        answer = int(eval(execute))
        print(execute, answer)
        URL = BASE_URL+'?answer='+str(answer)
    except Exception as e:
        print(e)
        print(page.content)

answering(URL)
