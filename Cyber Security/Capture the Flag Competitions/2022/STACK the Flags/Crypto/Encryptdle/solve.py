import requests
import json
import urllib.parse
import string

URL = 'http://157.245.52.169:31981'
charset = string.printable


guess = "000000000000000STF22{iNS3CuR3!_S"

def getData(guess):
  response = requests.post(f"{URL}/api/compare?guess={urllib.parse.quote_plus(guess)}", data={})
  hashObj = json.loads(response.text)
  output = ""
  for obj in hashObj:
    output += obj["letter"]
  return output, hashObj

output, _ = getData(guess)
print(output)

### Enumerating through Guesses

def guessEnumerateChar(currProgress, charset=charset):
  ### Get initial hash
  noZeros = 32 - len(currProgress) - 1 # -1 for the current bruteforcing character
  initialHash, _ = getData("0"*noZeros)
  ### Enumerate for next flag character
  guess = "0"*noZeros + currProgress 
  for c in charset:
    currGuess = guess + c
    #print(c, end="")
    guessHash, _ = getData(currGuess)
    if guessHash == initialHash:
      return c
  return ''
  
  
currProgress = "STF22{iNS3CuR3!_S"
for i in range(32 - len(currProgress)): # Loop for remaining characters
  print(f"\nCharacter {i} : {currProgress}")
  newchar = guessEnumerateChar(currProgress, charset)
  currProgress += newchar
  
print(currProgress)
### Encryption #########################################################
from cryptography.hazmat.primitives import padding
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
