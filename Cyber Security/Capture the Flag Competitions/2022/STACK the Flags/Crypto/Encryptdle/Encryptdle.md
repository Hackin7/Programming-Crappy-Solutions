my method is pure brute force, the person who created this challenge confirm nvr expect this method
so when u launch the docker, enter the ip addr:port into ur browser then u can play a 32 char wordle
the program will encrypt ur word the outcome u see is a hash
if u look at the program ull notice that they encrypt ur word by adding the flag behind and add \x00 as padding, and cut str to len of 32
so we can exploit this by inputting a lot of 0s and figuring out what is the flag one word at a time
so for starters we input 31 0s first, the program will add the flag to the end of our input. since we alr have 31 char the program can only add the first letter of the flag, then hash the entire thing
knowing the hash, we can bruteforce by trying every single possible printable letters after our 31 0s, until the hash is the same as the correct hash
eg first we guess 
0000000000000000000000000000000
the program will show the correct hash. we will brute force every printable character one by one
000000000000000000000000000000a
000000000000000000000000000000b
000000000000000000000000000000c
...
000000000000000000000000000000S
until our hash matches the correct hash, then we know that is the first letter of the flag. in this case its 'S'.
then we can guess
000000000000000000000000000000
the program will fill the next 2 letters and show us the correct hash. then we start guessing
000000000000000000000000000000Sa
000000000000000000000000000000Sb
...
000000000000000000000000000000ST
so on and so forth
so far my progress is until here
000000000000000
000000000000000STF22{iNS3CuR3!_S
help me finish this
BUT TAKE NOTE!!! everytime u start a new docker instance, the hashing algorithm changes, so u have to use ur first guess on the 0s everytime


Bypasslockout

![[Pasted image 20221204091243.png]]


```python
import requests
import json
import urllib.parse
import string

URL = 'http://157.245.52.169:31981'
charset = string.printable

def getData(guess):
  response = requests.post(f"{URL}/api/compare?guess={urllib.parse.quote_plus(guess)}", data={})
  hashObj = json.loads(response.text)
  output = ""
  for obj in hashObj:
    output += obj["letter"]
  return output, hashObj

#output, _ = getData(guess)
#print(output)

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
  
  
currProgress = ""
for i in range(32 - len(currProgress)): # Loop for remaining characters
  print(f"\nCharacter {i} : {currProgress}")
  newchar = guessEnumerateChar(currProgress, charset)
  currProgress += newchar
  
print(currProgress)
```

![[Pasted image 20221204090610.png]]