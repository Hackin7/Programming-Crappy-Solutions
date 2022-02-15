# Depreciated

# Enumeration
## nmap
```
# Nmap 7.91 scan initiated Mon Feb 14 06:32:17 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Depreciated/results/192.168.90.170/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Depreciated/results/192.168.90.170/scans/xml/_full_tcp_nmap.xml" 192.168.90.170
Increasing send delay for 192.168.90.170 from 0 to 5 due to 288 out of 719 dropped probes since last increase.
Warning: 192.168.90.170 giving up on port because retransmission cap hit (6).
Nmap scan report for 192.168.90.170
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 06:32:17 EST for 1331s
Not shown: 65486 closed ports
Reason: 65486 resets
PORT      STATE    SERVICE         REASON         VERSION
22/tcp    open     ssh             syn-ack ttl 63 OpenSSH 8.2p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 c1:99:4b:95:22:25:ed:0f:85:20:d3:63:b4:48:bb:cf (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDH6PH1/ST7TUJ4Mp/l4c7G+TM07YbX7YIsnHzq1TRpvtiBh8MQuFkL1SWW9+za+h6ZraqoZ0ewwkH+0la436t9Q+2H/Nh4CntJOrRbpLJKg4hChjgCHd5KiLCOKHhXPs/FA3mm0Zkzw1tVJLPR6RTbIkkbQiV2Zk3u8oamV5srWIJeYUY5O2XXmTnKENfrPXeHup1+3wBOkTO4Mu17wBSw6yvXyj+lleKjQ6Hnje7KozW5q4U6ijd3LmvHE34UHq/qUbCUbiwY06N2Mj0NQiZqWW8z48eTzGsuh6u1SfGIDnCCq3sWm37Y5LIUvqAFyIEJZVsC/UyrJDPBE+YIODNbN2QLD9JeBr8P4n1rkMaXbsHGywFtutdSrBZwYuRuB2W0GjIEWD/J7lxKIJ9UxRq0UxWWkZ8s3SNqUq2enfPwQt399nigtUerccskdyUD0oRKqVnhZCjEYfX3qOnlAqejr3Lpm8nA31pp6lrKNAmQEjdSO8Jxk04OR2JBxcfVNfs=
|   256 0f:44:8b:ad:ad:95:b8:22:6a:f0:36:ac:19:d0:0e:f3 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBI0EdIHR7NOReMM0G7C8zxbLgwB3ump+nb2D3Pe3tXqp/6jNJ/GbU2e4Ab44njMKHJbm/PzrtYzojMjGDuBlQCg=
|   256 32:e1:2a:6c:cc:7c:e6:3e:23:f4:80:8d:33:ce:9b:3a (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDCc0saExmeDXtqm5FS+D5RnDke8aJEvFq3DJIr0KZML
80/tcp    open     http            syn-ack ttl 63 nginx 1.18.0 (Ubuntu)
| http-methods: 
|_  Supported Methods: HEAD GET OPTIONS
|_http-server-header: nginx/1.18.0 (Ubuntu)
|_http-title: Under Maintainence
3422/tcp  filtered rusb-sys-port   no-response
4144/tcp  filtered wincim          no-response
4405/tcp  filtered ds-mail         no-response
5132/tcp  open     unknown         syn-ack ttl 63
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, NULL: 
|     Enter Username:
|   GenericLines, GetRequest, HTTPOptions, RTSPRequest: 
|     Enter Username: Enter OTP: Incorrect username or password
|   Hello, Help: 
|     Enter Username: Enter OTP:
|   RPCCheck: 
|     Enter Username: Traceback (most recent call last):
|     File "/opt/depreciated/messaging/messages.py", line 100, in <module>
|     main()
|     File "/opt/depreciated/messaging/messages.py", line 82, in main
|     username = input("Enter Username: ")
|     File "/usr/lib/python3.8/codecs.py", line 322, in decode
|     (result, consumed) = self._buffer_decode(data, self.errors, final)
|     UnicodeDecodeError: 'utf-8' codec can't decode byte 0x80 in position 0: invalid start byte
|   SSLSessionReq: 
|     Enter Username: Traceback (most recent call last):
|     File "/opt/depreciated/messaging/messages.py", line 100, in <module>
|     main()
|     File "/opt/depreciated/messaging/messages.py", line 82, in main
|     username = input("Enter Username: ")
|     File "/usr/lib/python3.8/codecs.py", line 322, in decode
|     (result, consumed) = self._buffer_decode(data, self.errors, final)
|_    UnicodeDecodeError: 'utf-8' codec can't decode byte 0xd7 in position 13: invalid continuation byte
5507/tcp  filtered psl-management  no-response
5635/tcp  filtered sfmsso          no-response
8433/tcp  open     http            syn-ack ttl 63 Werkzeug httpd 2.0.2 (Python 3.8.10)
| http-methods: 
|_  Supported Methods: OPTIONS GET HEAD
|_http-server-header: Werkzeug/2.0.2 Python/3.8.10
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
9845/tcp  filtered unknown         no-response
11910/tcp filtered unknown         no-response
12053/tcp filtered unknown         no-response
14564/tcp filtered unknown         no-response
16314/tcp filtered unknown         no-response
19553/tcp filtered unknown         no-response
22097/tcp filtered unknown         no-response
23766/tcp filtered unknown         no-response
24789/tcp filtered unknown         no-response
26754/tcp filtered unknown         no-response
28986/tcp filtered unknown         no-response
30103/tcp filtered unknown         no-response
32968/tcp filtered unknown         no-response
34317/tcp filtered unknown         no-response
35004/tcp filtered rt-classmanager no-response
35204/tcp filtered unknown         no-response
35263/tcp filtered unknown         no-response
35459/tcp filtered unknown         no-response
36338/tcp filtered unknown         no-response
36416/tcp filtered unknown         no-response
37488/tcp filtered unknown         no-response
38803/tcp filtered unknown         no-response
39412/tcp filtered unknown         no-response
40221/tcp filtered unknown         no-response
42558/tcp filtered unknown         no-response
43585/tcp filtered unknown         no-response
45754/tcp filtered unknown         no-response
46124/tcp filtered unknown         no-response
46479/tcp filtered unknown         no-response
46835/tcp filtered unknown         no-response
46985/tcp filtered unknown         no-response
47615/tcp filtered unknown         no-response
49508/tcp filtered unknown         no-response
49681/tcp filtered unknown         no-response
51195/tcp filtered unknown         no-response
56693/tcp filtered unknown         no-response
57390/tcp filtered unknown         no-response
58493/tcp filtered unknown         no-response
59261/tcp filtered unknown         no-response
62781/tcp filtered unknown         no-response
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port5132-TCP:V=7.91%I=9%D=2/14%Time=620A41B5%P=x86_64-pc-linux-gnu%r(NU
SF:LL,10,"Enter\x20Username:\x20")%r(GenericLines,3A,"Enter\x20Username:\x
SF:20Enter\x20OTP:\x20Incorrect\x20username\x20or\x20password\n")%r(GetReq
SF:uest,3A,"Enter\x20Username:\x20Enter\x20OTP:\x20Incorrect\x20username\x
SF:20or\x20password\n")%r(HTTPOptions,3A,"Enter\x20Username:\x20Enter\x20O
SF:TP:\x20Incorrect\x20username\x20or\x20password\n")%r(RTSPRequest,3A,"En
SF:ter\x20Username:\x20Enter\x20OTP:\x20Incorrect\x20username\x20or\x20pas
SF:sword\n")%r(RPCCheck,1CD,"Enter\x20Username:\x20Traceback\x20\(most\x20
SF:recent\x20call\x20last\):\n\x20\x20File\x20\"/opt/depreciated/messaging
SF:/messages\.py\",\x20line\x20100,\x20in\x20<module>\n\x20\x20\x20\x20mai
SF:n\(\)\n\x20\x20File\x20\"/opt/depreciated/messaging/messages\.py\",\x20
SF:line\x2082,\x20in\x20main\n\x20\x20\x20\x20username\x20=\x20input\(\"En
SF:ter\x20Username:\x20\"\)\n\x20\x20File\x20\"/usr/lib/python3\.8/codecs\
SF:.py\",\x20line\x20322,\x20in\x20decode\n\x20\x20\x20\x20\(result,\x20co
SF:nsumed\)\x20=\x20self\._buffer_decode\(data,\x20self\.errors,\x20final\
SF:)\nUnicodeDecodeError:\x20'utf-8'\x20codec\x20can't\x20decode\x20byte\x
SF:200x80\x20in\x20position\x200:\x20invalid\x20start\x20byte\n")%r(DNSVer
SF:sionBindReqTCP,10,"Enter\x20Username:\x20")%r(DNSStatusRequestTCP,10,"E
SF:nter\x20Username:\x20")%r(Hello,1B,"Enter\x20Username:\x20Enter\x20OTP:
SF:\x20")%r(Help,1B,"Enter\x20Username:\x20Enter\x20OTP:\x20")%r(SSLSessio
SF:nReq,1D5,"Enter\x20Username:\x20Traceback\x20\(most\x20recent\x20call\x
SF:20last\):\n\x20\x20File\x20\"/opt/depreciated/messaging/messages\.py\",
SF:\x20line\x20100,\x20in\x20<module>\n\x20\x20\x20\x20main\(\)\n\x20\x20F
SF:ile\x20\"/opt/depreciated/messaging/messages\.py\",\x20line\x2082,\x20i
SF:n\x20main\n\x20\x20\x20\x20username\x20=\x20input\(\"Enter\x20Username:
SF:\x20\"\)\n\x20\x20File\x20\"/usr/lib/python3\.8/codecs\.py\",\x20line\x
SF:20322,\x20in\x20decode\n\x20\x20\x20\x20\(result,\x20consumed\)\x20=\x2
SF:0self\._buffer_decode\(data,\x20self\.errors,\x20final\)\nUnicodeDecode
SF:Error:\x20'utf-8'\x20codec\x20can't\x20decode\x20byte\x200xd7\x20in\x20
SF:position\x2013:\x20invalid\x20continuation\x20byte\n");
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 3.4 (91%), Linux 3.5 (91%), Linux 4.2 (91%), Linux 4.4 (91%), Synology DiskStation Manager 5.1 (91%), WatchGuard Fireware 11.8 (91%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/14%OT=22%CT=1%CU=33414%PV=Y%DS=2%DC=T%G=Y%TM=620A42F
OS:4%P=x86_64-pc-linux-gnu)SEQ(SP=104%GCD=1%ISR=10B%TI=Z%II=I%TS=A)SEQ(SP=1
OS:04%GCD=1%ISR=10B%TI=Z%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT1
OS:1NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=FE88%W2=FE88%W3=FE
OS:88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=
OS:)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y
OS:%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=16
OS:4%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 26.244 days (since Wed Jan 19 01:02:44 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=260 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 1720/tcp)
HOP RTT       ADDRESS
1   179.75 ms 192.168.49.1
2   179.69 ms 192.168.90.170

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 06:54:28 2022 -- 1 IP address (1 host up) scanned in 1332.15 seconds
```

## 80 - Web

![](Pasted%20image%2020220214195454.png)

![](Pasted%20image%2020220214195633.png)

## 5132 - CLI

```
┌──(kali㉿kali)-[/tmp]
└─$ nc 192.168.90.170 5132 -v  
192.168.90.170: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.90.170] 5132 (?) open
Enter Username: admin
Enter OTP: admin
Incorrect username or password
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## 8433 - Web

![](Pasted%20image%2020220214195707.png)

![](Pasted%20image%2020220214195731.png)

https://book.hacktricks.xyz/pentesting/pentesting-web/graphql

![](Pasted%20image%2020220214200551.png)

### GraphQL

query, output
`{__schema{types{name,fields{name}}}}`
```
{
  "data": {
    "__schema": {
      "types": [
        {
          "name": "Query",
          "fields": [
            {
              "name": "hello"
            },
            {
              "name": "goodbye"
            },
            {
              "name": "user"
            },
            {
              "name": "getToken"
            },
            {
              "name": "listUsers"
            },
            {
              "name": "getOTP"
            }
          ]
        },
        {
          "name": "String",
          "fields": null
        },
        {
          "name": "__Schema",
          "fields": [
            {
              "name": "types"
            },
            {
              "name": "queryType"
            },
            {
              "name": "mutationType"
            },
            {
              "name": "subscriptionType"
            },
            {
              "name": "directives"
            }
          ]
        },
        {
          "name": "__Type",
          "fields": [
            {
              "name": "kind"
            },
            {
              "name": "name"
            },
            {
              "name": "description"
            },
            {
              "name": "fields"
            },
            {
              "name": "interfaces"
            },
            {
              "name": "possibleTypes"
            },
            {
              "name": "enumValues"
            },
            {
              "name": "inputFields"
            },
            {
              "name": "ofType"
            }
          ]
        },
        {
          "name": "__TypeKind",
          "fields": null
        },
        {
          "name": "Boolean",
          "fields": null
        },
        {
          "name": "__Field",
          "fields": [
            {
              "name": "name"
            },
            {
              "name": "description"
            },
            {
              "name": "args"
            },
            {
              "name": "type"
            },
            {
              "name": "isDeprecated"
            },
            {
              "name": "deprecationReason"
            }
          ]
        },
        {
          "name": "__InputValue",
          "fields": [
            {
              "name": "name"
            },
            {
              "name": "description"
            },
            {
              "name": "type"
            },
            {
              "name": "defaultValue"
            }
          ]
        },
        {
          "name": "__EnumValue",
          "fields": [
            {
              "name": "name"
            },
            {
              "name": "description"
            },
            {
              "name": "isDeprecated"
            },
            {
              "name": "deprecationReason"
            }
          ]
        },
        {
          "name": "__Directive",
          "fields": [
            {
              "name": "name"
            },
            {
              "name": "description"
            },
            {
              "name": "locations"
            },
            {
              "name": "args"
            }
          ]
        },
        {
          "name": "__DirectiveLocation",
          "fields": null
        }
      ]
    }
  }
}
```

`{user}`
```
{
  "data": {
    "user": "Unauthorized Request."
  }
}
```

`{hello, goodbye, listUsers}`
```
{
  "data": {
    "hello": "Hello World!!",
    "goodbye": "Bye!",
    "listUsers": "['peter', 'jason']"
  }
}
```

`{hello(name:"jason"), user(name:"jason")}`
```
{
  "data": {
    "hello": "Hello jason!",
    "user": "jason not found."
  }
}
```

`{getOTP(username:"jason")}`
```
{
  "data": {
    "getOTP": "Your One Time password is: 97rwMXdMAbJ31BqF"
  }
}
```

`{getOTP(username:"jason")}`
```
{
  "data": {
    "getOTP": "Your One Time password is: 67HzNICJmR04FWe2"
  }
}
```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc 192.168.90.170 5132 -v
192.168.90.170: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.90.170] 5132 (?) open
Enter Username: jason
Enter OTP: 67HzNICJmR04FWe2
Incorrect username or password
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

`{getToken(uid:"1")}`
```
{
  "data": {
    "getToken": "The id is: 1"
  }
}
```

`{login(username:"jason", password:"jason")}`
```
{
  "errors": [
    {
      "message": "Cannot query field \"login\" on type \"Query\".",
      "locations": [
        {
          "line": 1,
          "column": 2
        }
      ]
    }
  ]
}
```


```
{
  __schema {
    types {
      name
      fields {
        name
        args {
          name
          description
          type {
            name
            kind
            ofType {
              name
              kind
            }
          }
        }
      }
    }
  }
}
```
```
{
  "data": {
    "__schema": {
      "types": [
        {
          "name": "Query",
          "fields": [
            {
              "name": "hello",
              "args": [
                {
                  "name": "name",
                  "description": null,
                  "type": {
                    "name": "String",
                    "kind": "SCALAR",
                    "ofType": null
                  }
                }
              ]
            },
            {
              "name": "goodbye",
              "args": []
            },
            {
              "name": "user",
              "args": [
                {
                  "name": "name",
                  "description": null,
                  "type": {
                    "name": "String",
                    "kind": "SCALAR",
                    "ofType": null
                  }
                }
              ]
            },
            {
              "name": "getToken",
              "args": [
                {
                  "name": "uid",
                  "description": null,
                  "type": {
                    "name": null,
                    "kind": "NON_NULL",
                    "ofType": {
                      "name": "String",
                      "kind": "SCALAR"
                    }
                  }
                }
              ]
            },
            {
              "name": "listUsers",
              "args": []
            },
            {
              "name": "getOTP",
              "args": [
                {
                  "name": "username",
                  "description": null,
                  "type": {
                    "name": null,
                    "kind": "NON_NULL",
                    "ofType": {
                      "name": "String",
                      "kind": "SCALAR"
                    }
                  }
                }
              ]
            }
          ]
        },
        {
          "name": "String",
          "fields": null
        },
        {
          "name": "__Schema",
          "fields": [
            {
              "name": "types",
              "args": []
            },
            {
              "name": "queryType",
              "args": []
            },
            {
              "name": "mutationType",
              "args": []
            },
            {
              "name": "subscriptionType",
              "args": []
            },
            {
              "name": "directives",
              "args": []
            }
          ]
        },
        {
          "name": "__Type",
          "fields": [
            {
              "name": "kind",
              "args": []
            },
            {
              "name": "name",
              "args": []
            },
            {
              "name": "description",
              "args": []
            },
            {
              "name": "fields",
              "args": [
                {
                  "name": "includeDeprecated",
                  "description": null,
                  "type": {
                    "name": "Boolean",
                    "kind": "SCALAR",
                    "ofType": null
                  }
                }
              ]
            },
            {
              "name": "interfaces",
              "args": []
            },
            {
              "name": "possibleTypes",
              "args": []
            },
            {
              "name": "enumValues",
              "args": [
                {
                  "name": "includeDeprecated",
                  "description": null,
                  "type": {
                    "name": "Boolean",
                    "kind": "SCALAR",
                    "ofType": null
                  }
                }
              ]
            },
            {
              "name": "inputFields",
              "args": []
            },
            {
              "name": "ofType",
              "args": []
            }
          ]
        },
        {
          "name": "__TypeKind",
          "fields": null
        },
        {
          "name": "Boolean",
          "fields": null
        },
        {
          "name": "__Field",
          "fields": [
            {
              "name": "name",
              "args": []
            },
            {
              "name": "description",
              "args": []
            },
            {
              "name": "args",
              "args": []
            },
            {
              "name": "type",
              "args": []
            },
            {
              "name": "isDeprecated",
              "args": []
            },
            {
              "name": "deprecationReason",
              "args": []
            }
          ]
        },
        {
          "name": "__InputValue",
          "fields": [
            {
              "name": "name",
              "args": []
            },
            {
              "name": "description",
              "args": []
            },
            {
              "name": "type",
              "args": []
            },
            {
              "name": "defaultValue",
              "args": []
            }
          ]
        },
        {
          "name": "__EnumValue",
          "fields": [
            {
              "name": "name",
              "args": []
            },
            {
              "name": "description",
              "args": []
            },
            {
              "name": "isDeprecated",
              "args": []
            },
            {
              "name": "deprecationReason",
              "args": []
            }
          ]
        },
        {
          "name": "__Directive",
          "fields": [
            {
              "name": "name",
              "args": []
            },
            {
              "name": "description",
              "args": []
            },
            {
              "name": "locations",
              "args": []
            },
            {
              "name": "args",
              "args": []
            }
          ]
        },
        {
          "name": "__DirectiveLocation",
          "fields": null
        }
      ]
    }
  }
}
```

![](Pasted%20image%2020220214204143.png)
### Login

```
                                                     
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.90.170:8433/login -X POST --data 'uname=jason&pswd=jason' 
Authentication failed, Incorrent username or password                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.90.170:8433/login -X POST --data 'uname=pete&pswd=peter'
Authentication failed, Incorrent username or password                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.90.170:8433/login -X POST --data 'uname=peter&pswd=peter'
Authentication failed, Incorrent username or password                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.90.170:8433/login                                        
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>405 Method Not Allowed</title>
<h1>Method Not Allowed</h1>
<p>The method is not allowed for the requested URL.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

# Exploit

# Privesc

# Others