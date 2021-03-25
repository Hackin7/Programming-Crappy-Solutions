import requests
from bs4 import BeautifulSoup

cookies={"PHPSESSID":"12345"}
URL = 'http://greater-sphinx.chall.cddc2020.nshc.sg:9999/'

def debug(*args):
    print(*args)
    pass

def downloadImage(BASE_URL, imageLink):
    img = requests.get(BASE_URL+imageLink[2:], allow_redirects=True)
    return img.content

def getImg(BASE_URL, soup, class_):
    p = soup.find(class_=class_)
    img = p.findChildren("img" , recursive=False)[0] # Get image src
    src = img['src']
    data = downloadImage(BASE_URL, src)
    return data

### Operators ######################## FAIL

def generateOperatorsData():
    names = ['add.png',
             'minus.png',
             'mul.png',
             'div.png']
    op = ['+',
          '-',
          '*',
          '/']
    operatorsImgData = []
    for i in range(len(op)):
        filename = './operators/'+names[i]
        with open(filename, 'rb') as file:
            operatorsImgData.append( (op[i],filename, file.read()) )
    return operatorsImgData

    
def compareOperators(opData, imgData):
    #saveImg(imgData, 'op')
    #givenImg = Image.open('./sampleImages/op.png')
    
    for op, opFilename, opImg in opData:
        if imgData == opImg:
            #print(op)
            return op

    print()
    print(imgData)
    print(opImg)
    print(op)
    with open('./operators/test.png','wb') as f:f.write(imgData)
    raise Exception('Invalid Operation')

def getOp(BASE_URL, soup, class_, opData):
    imgData = getImg(BASE_URL, soup, class_)
    #saveImg(imgData)
    #data = OCR(imgData)
    return compareOperators(opData, imgData)

### Get Argv ##############################
import random
import os
def saveImg(imgData, c=None):
    if c==None:
        c = './sampleImages/'+chr(random.randint(65,65+26))
    else:
        c = './sampleImages/'+c
    with open(c+'.png','wb') as f:
        f.write(imgData)

import pickle
ocrFilename = "referenceOCR.pickle"
try:
    with open(ocrFilename, 'rb') as f:
        referenceOCR = pickle.load(f)
    print("Reference OCR:",len(referenceOCR))
except:
    referenceOCR = {}

from PIL import Image, ImageChops
import pytesseract    
def OCR(imgData):
    dp = referenceOCR.get(imgData)
    #if dp !=  None:
    #    debug('DP')
    #    return dp
    saveImg(imgData, 'read')
    img = Image.open('./sampleImages/read.png')
    data = pytesseract.image_to_string(img, config=('-l eng --oem 1 --psm 7'))
    #referenceOCR[imgData] = data
    #print(data)
    return data

def saveOCRDP():
    with open(ocrFilename, 'wb') as f:
        pickle.dump(referenceOCR, f)

def eliminateStuff():
    pass

def getArgv(BASE_URL, soup, class_):
    imgData = getImg(BASE_URL, soup, class_)
    return OCR(imgData).strip("0")


def answering(BASE_URL):
    prevStage = 0
    opData = generateOperatorsData()
    
    URL = BASE_URL
    for i in range(50):
        page = requests.get(URL, cookies=cookies)
        try:
            soup = BeautifulSoup(page.content, 'html.parser')

            stage = soup.find(class_='stage')
            stageNo = int(stage.contents[0][7:-3])
            
            if prevStage > stageNo:
                eliminateStuff()
                
            argv1 = getArgv(BASE_URL, soup, 'quiz_argv_1')
            operator = getOp(BASE_URL, soup, 'quiz_operator', opData)
            argv2 = getArgv(BASE_URL, soup, 'quiz_argv_2')
            
            execute = argv1 + operator + argv2
            answer = int(eval(execute))
            debug(i, stage.contents, execute, answer)
            URL = BASE_URL+'?answer='+str(answer)
            
            prevStage = stageNo
        except Exception as e:
            print('Error:',e)
            print(URL)
            print(page.content)

    print()
    print('Final:')
    print(page.content)
    saveOCRDP()

for i in range(100):
    answering(URL)
