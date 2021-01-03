import sys
import requests
URL = 'http://challs.sieberrsec.tech:4590/calcvf.php'

before = """<html>\r\n<head>\r\n  <link rel="stylesheet" href="styles.css">\r\n</head>\r\n\r\n<h1> \r\nCalculator App!\r\n</h1>\r\n<h3>Your calculated answer is: """
after = """</h3>\r\n\r\n\r\n</html>"""


def getOutput(value1, value2, opno):
    ops = "+-*/"
    data = {"value1": value1, "operations":ops[opno], "value2": value2}
    response = requests.get(URL, params=data) #headers=headers)
    filtered = response.text[len(before):-len(after)]
    return response.text, filtered

# Actually negative numbers work by the way
diff = []
def bruteforce(numrange = 10):
    for i in range(0, numrange):
        for j in range(0, numrange):
            for opno in range(0,4):
                data = getOutput(i, j, opno)
                sys.stdout.write(f"{i} {j} {opno} {data[1]}\n")
                try:
                    processed = float(data[1])
                    #print(processed)
                except Exception as e:
                    diff.append((i, j, opno, data))
                    sys.stdout.write(str(diff[-1]))
                    #return
#sys.stdout.write("hi")
bruteforce()  
                
            
    
