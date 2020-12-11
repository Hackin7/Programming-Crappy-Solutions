# Unlock Me

905, WEB, 22 SOLVES

### Description

Our agents discovered COViD's admin panel! They also stole the credentials minion:banana, but it seems that the user isn't allowed in. Can you find another way?

[Admin Panel](http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41031/)

This challenge:
- Unlocks other challenge(s)
- Is eligible for Awesome Write-ups Award
- Prerequisite for Mastery Award - Web Warrior

## Solution

Inspecting the page reveals nothing much, other that the client webpage makes POST/GET requests to the server to request for the credentials

![](inspect_1.png)
![](inspect_2.png)

I coded a python program using the `requests` library to interface with the server.

The way the thing works (through inspecting and experimentation) is that
1. The jQuery will POST request `/login` endpoint with the username password
    1. For a access token for the user (unique to each user)
2. Then jQuery will GET `/unlock` endpoint with access token in the header 
    1. That way it get the flag if it is authorised

I extracted out a sample token `eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Im1pbmlvbiIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNjA3MTQ2NTMyfQ.CBdshkHuUXlIf7OVE0kgVy-1AcaVzrKKw6Hmd25Q0ycO7hHYZpmz2jCyjckjPa7HSJCJb-9O0W74s1kYdCqMOKCDP2lBdqmcRLh5sFpG5sfti1evVWbms4xHqGtHYIOa7fPDXB1f0_r2meQSFS1C0jGnkVbz3J2_FAZs5j_ruNPalTUbik2ph2zv41phRyRKWB93867-Iqxf-xbAQ9RxEg1WpVX77FHJxEORplIHfNyTwu9Hwbn857yyiNW6Se9xVZMEgp0jCOzoL_FSk1PuKBkEml5NRiV6bytygqNGzyHLChoazMkNNiRWQcls40i1EIoDGEokUlDMfsyuzlU8fBIS5NekKuThEoQp4CkUYTr9Iu63hZoPA2I8Eq2MPcGRrdx8IvB00Rbj3LoncadaIu_bBPJfkPxXAH8kYENS5mDGzV_Wqesr8DkCf0fE-e-t4IZoHV8H8pt2B6Iur_EGN-YS3Tu3_fPJbs21CXJ28hBQTqV0MH6QksxX7aUk3NIExWD8GHnuynanTHS2ybGM8QcTC024g3rSQh-9ljah44r4PbV76VHUh8D3ENto4GcyQYgmx34yDHxjIOSLscwm-_yiJo0HYzeO_rxQYNybpsfE71W-oQwkV3v8ou_1RWqw0bCKFa7F3G4lQpXjUnaid9mQ6PDYYaX1jUBhJIYOTc`. Decoding it in base 64, I get `{"alg":"RS256","typ":"JWT"}{"username":"minion","role":"user","iat":1607146532}` in readable text.

Furthermore for the GET request, you had to put "Bearer", and so I did research
1. https://swagger.io/docs/specification/authentication/bearer-authentication/ .

After that I guessed that it was relating to JSON Web tokens. I googled on similar CTF challenges, and found some writeups about JSON Web tokens
1. https://gist.github.com/bayotop/37bd7605148df096332ed0451db91051 
1. https://nandynarwhals.org/hitbgsec2017-pasty/
1. https://debricked.com/blog/2019/01/10/ctf-json-web-tokens-jwt/ 

I tried using my python program to downgrade the authentication from RS256 to none, but it didn't work.

My friend undefined-func got out the `public.pem`. On redoing the challenge, I noticed the comment `// TODO: Add client-side verification using public.pem` on the main html page. You can infer to go to http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41031/public.pem , which allows you to download the public key.

My friend then suggested downgrading from RS256 to HS256. After doing it through my python program (which is in `solve.py`), I got the flag.

`{"flag":"govtech-csg{5!gN_0F_+h3_T!m3S}"}`

## Flag

`govtech-csg{5!gN_0F_+h3_T!m3S}`