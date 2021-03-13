from flask import Flask
from flask import request as flaskrequest
from urllib import request
from urllib.parse import urlparse

app = Flask(__name__)


@app.route('/search')
def hello():
    if flaskrequest.args['url'] == None:
        return "You need to access via /search?url=Your URL"
    url_proxy = flaskrequest.args['url']
    b = urlparse(url_proxy)
    if b.netloc != "tinyurl.com":
        return "URL is not from tinyurl.com"
    proxy_data = request.urlopen(url_proxy)
    safe_url = proxy_data.read().decode('utf-8')
    safe_url_parsed = urlparse(safe_url)
    if safe_url_parsed.scheme in ["file","gopher","ftp","smtp","tftp","mailto"]:
        return "Illegal Scheme Detected!"
    response = request.urlopen(safe_url)
    return response.read().decode('utf-8')

@app.route('/')
def main():
    return "Flag is in environment variable. <br>Please explore /search?url=[URL]"

if __name__ == '__main__':
    app.run()