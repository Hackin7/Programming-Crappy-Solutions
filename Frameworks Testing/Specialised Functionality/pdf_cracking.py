#!/usr/bin/python3
 
#__author__ = 'spyx'
#https://null-byte.wonderhowto.com/forum/crack-pdf-python-0162896/
#https://pastebin.com/v8UFiHCx

#Have to pip install pypdf2 first
import PyPDF2
import sys

'''
import optparse 
parser = optparse.OptionParser()
parser.add_option('-f','--file',dest='file',help='encrypted file')
parser.add_option('-w','--wordlist',dest='word',help='wordlist file')
(options, args) = parser.parse_args()
if options.file == None or options.word == None:
    print('./pdfCracker.py -f [file] -w [wordlist file]')
    sys.exit()
file = options.file
word = options.word
wordlist = open(word)
'''
def bruteforce(length):
    choices = []
    charset="abcedfghijklmnopqrstuvwxyz"
    if length==1:return list(charset)
    else:
        prevChoices = bruteforce(length-1)
        for prevChoice in prevChoices:
            for c in charset:
                choices.append(prevChoice+c)
        return choices
def dictionary():
    return ["1","test","2"]

file = "test.pdf"
 
pdf = PyPDF2.PdfFileReader(open(file,'rb'))
if not pdf.isEncrypted:
    print('No password')
else:
    choices = bruteforce(4)
    choices = dictionary()
    print(len(choices))
    for line in choices:
    #for line in wordlist.readlines():
        if pdf.decrypt(line.rstrip()) :
            print('[+] PASSWORD: ' +line)
            sys.exit()
    print('[-] Password not found')
