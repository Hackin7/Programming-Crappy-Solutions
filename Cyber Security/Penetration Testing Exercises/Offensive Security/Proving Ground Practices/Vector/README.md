# Vector

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Sat Feb  5 03:21:09 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Vector/results/192.168.121.119/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Vector/results/192.168.121.119/scans/xml/_full_tcp_nmap.xml" 192.168.121.119
Nmap scan report for 192.168.121.119
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-05 03:21:09 EST for 500s
Not shown: 65527 filtered ports
Reason: 65527 no-responses
PORT     STATE SERVICE       REASON          VERSION
21/tcp   open  ftp           syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
80/tcp   open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
|_http-server-header: Microsoft-IIS/10.0
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds  syn-ack ttl 127 Microsoft Windows Server 2008 R2 - 2012 microsoft-ds
2290/tcp open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
|_http-server-header: Microsoft-IIS/10.0
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
3389/tcp open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: VECTOR
|   NetBIOS_Domain_Name: VECTOR
|   NetBIOS_Computer_Name: VECTOR
|   DNS_Domain_Name: vector
|   DNS_Computer_Name: vector
|   Product_Version: 10.0.17763
|_  System_Time: 2022-02-05T08:35:17+00:00
| ssl-cert: Subject: commonName=vector
| Issuer: commonName=vector
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-02-04T08:18:47
| Not valid after:  2022-08-06T08:18:47
| MD5:   8f16 c9f9 1471 cb40 6431 5516 e278 59cd
| SHA-1: f8dc cfa0 5c41 2863 08a3 3045 7649 feb8 3a88 6e87
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIQRU6hxV4+bZdHpBxwTXQTzTANBgkqhkiG9w0BAQsFADAR
| MQ8wDQYDVQQDEwZ2ZWN0b3IwHhcNMjIwMjA0MDgxODQ3WhcNMjIwODA2MDgxODQ3
| WjARMQ8wDQYDVQQDEwZ2ZWN0b3IwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK
| AoIBAQDT9ybD1afIzz4iIFhgKMwvFvg3q2L7ZqHLVot14HV6laUm49NM9ghGPMKy
| i46kCeqcfpSfgkXf2IzFwCrIMMDfwxQoYBzmX9reWSlJemO6HZlk7750lesZiuCo
| SynCPOFSf0/HRtQ1Zxq5LDLop9FbiNubBoKNAmzuPrjKtufufzz6BL1BGe7hikor
| BHJPWTA9M3IFh+dgN69QZ6pYhINtvr2QOP1JTlrIoxFGo0GismHq5xDwJGtKyBBY
| KCViTgygOojoqMdCE62X0ilmhpOa71ABkOZp3i0W2/Qvm9IcACR/wTX4TuNncGnY
| 90q2aAo6mRQ7JHqDxfPIL56kwZuZAgMBAAGjJDAiMBMGA1UdJQQMMAoGCCsGAQUF
| BwMBMAsGA1UdDwQEAwIEMDANBgkqhkiG9w0BAQsFAAOCAQEARLn//FpU8eW6MGFM
| vqGyprjbTvxuvCt/MjeysXIw59CvhkfiK3RooqugirtE7G53IP1N7hFdtPMdaTZ3
| 3O4yJ5okjGP90Ryq+L2iLOHlaj2b0hbG6YJCMqlxp7zOY5jg/uVZauJhbvYZmJda
| 4LuusyXB8iP/RHQGoDwwbxglhrn9/SEf/NU2UliUVCgFCGdrzEHDGKRACjiF7JUT
| MLQPWF83IXWuDJVwx63/AldR8ZX4oN1SFMeVPrICSJcadCV88iV4WmpBOwvcVe0E
| PM6zaWTpeo/g0pDIZHqSfE6IRCv5IAlEkQMvB9qLbidjIgNYG1KqmGg+wJpmv4/L
| CSejmA==
|_-----END CERTIFICATE-----
|_ssl-date: 2022-02-05T08:35:56+00:00; +6m28s from scanner time.
5985/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/5%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61FE3569%P=x86_64-pc-linux-gnu)
SEQ(SP=102%GCD=2%ISR=10C%TI=I%II=I%SS=S%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=Y%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OSs: Windows, Windows Server 2008 R2 - 2012; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 6m28s, deviation: 0s, median: 6m27s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 17622/tcp): CLEAN (Timeout)
|   Check 2 (port 43564/tcp): CLEAN (Timeout)
|   Check 3 (port 23898/udp): CLEAN (Timeout)
|   Check 4 (port 28789/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-05T08:35:18
|_  start_date: N/A

TRACEROUTE (using port 135/tcp)
HOP RTT       ADDRESS
1   171.55 ms 192.168.49.1
2   171.71 ms 192.168.121.119

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Feb  5 03:29:30 2022 -- 1 IP address (1 host up) scanned in 501.40 seconds

```


## 21 - FTP


## 80 - Web

![](Pasted%20image%2020220205163749.png)

```
┌──(kali㉿kali)-[~/Documents/tools]
└─$ curl 192.168.121.119             


<div style="margin-top: 20px;">
<center>
        <form method="post" action="./" id="MyForm">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwULLTE3MDc5MjQzOTdkZA5XabFPKKHupfORu704bwTqobxphiTj3yhQa5q7V9uV" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAATSWdnRpYU82safa9MhaDYZ0L2DLJhpxQ2WXTNAV4E6IuKXTPonOLALxhfCJ/svpfncqaj6i4HaaYTcyD0yJuxuEHBx0oIshU1qMtIme16sR22cuQyR6UH9ar7OgWG7q48=" />
                <img src="grumpy.PNG" width="500px" height="600px">
                <table style="margin-top: 20px;">
                        <tr>
                                <td><b>Username:</b></td>
                                <td><input name="UsernameTextBox" type="text" id="UsernameTextBox" /></td>
                        </tr>
                        <tr>
                                <td><b>Password:</b></td>
                                <td><input name="PasswordTextBox" type="password" id="PasswordTextBox" /></td>
                        </tr>
                        <tr>
                                <td colspan=2 style="padding-top: 20px;"><center><input type="submit" name="LoginButton" value="Login" id="LoginButton" class="button" /></center></td>
                        </tr>
                </table>
                <span style="font-weight: bold; color: red;"><span id="MyLabel"></span></span>
        </form>
</center>
</div>                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools]
└─$ 
```

Source code when you submitted the incorrect creds

```
<div style="margin-top: 20px;">
<center>
	<form method="post" action="./" id="MyForm">
<div class="aspNetHidden">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwULLTE3MDc5MjQzOTcPZBYCAgEPZBYCAgcPDxYCHgRUZXh0BR9JbnZhbGlkIHVzZXJuYW1lIG9yIHBhc3N3b3JkLi4uZGRkg8uLlaydU+TWnhQ1PhfMV/4bp49BdqrdY02Mz2MJPO0=" />
</div>

<div class="aspNetHidden">

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
	<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAARW1e3gnB1RU9QV60KTM+XQ0L2DLJhpxQ2WXTNAV4E6IuKXTPonOLALxhfCJ/svpfncqaj6i4HaaYTcyD0yJuxugXYZBEGyiBdv/ecdqvLDIdD0PMqLcG7Tn/ndjmI6OzM=" />
</div>
		<img src="grumpy.PNG" width="500px" height="600px">
		<table style="margin-top: 20px;">
			<tr>
				<td><b>Username:</b></td>
				<td><input name="UsernameTextBox" type="text" value="admin" id="UsernameTextBox" /></td>
			</tr>
			<tr>
				<td><b>Password:</b></td>
				<td><input name="PasswordTextBox" type="password" id="PasswordTextBox" /></td>
			</tr>
			<tr>
				<td colspan=2 style="padding-top: 20px;"><center><input type="submit" name="LoginButton" value="Login" id="LoginButton" class="button" /></center></td>
			</tr>
		</table>
		<span style="font-weight: bold; color: red;"><span id="MyLabel">Invalid username or password...</span></span>
	</form>
</center>
</div>
```

Interesting values

```
/wEPDwULLTE3MDc5MjQzOTcPZBYCAgEPZBYCAgcPDxYCHgRUZXh0BR9JbnZhbGlkIHVzZXJuYW1lIG9yIHBhc3N3b3JkLi4uZGRkg8uLlaydU+TWnhQ1PhfMV/4bp49BdqrdY02Mz2MJPO0=
/wEdAATSWdnRpYU82safa9MhaDYZ0L2DLJhpxQ2WXTNAV4E6IuKXTPonOLALxhfCJ/svpfncqaj6i4HaaYTcyD0yJuxuEHBx0oIshU1qMtIme16sR22cuQyR6UH9ar7OgWG7q48=
/wEPDwULLTE3MDc5MjQzOTdkZA5XabFPKKHupfORu704bwTqobxphiTj3yhQa5q7V9uV
/wEdAATSWdnRpYU82safa9MhaDYZ0L2DLJhpxQ2WXTNAV4E6IuKXTPonOLALxhfCJ/svpfncqaj6i4HaaYTcyD0yJuxuEHBx0oIshU1qMtIme16sR22cuQyR6UH9ar7OgWG7q48=
```

## 2290 - Web

![](Pasted%20image%2020220205164930.png)

```
┌──(kali㉿kali)-[~/Documents/tools]
└─$ curl 192.168.121.119:2290                                                                                                                                  
<form method="post" action="./" id="MyForm">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJMjI5MTY0MjY4D2QWAmYPZBYCAgEPDxYCHgRUZXh0BSNFUlJPUjogbWlzc2luZyBwYXJhbWV0ZXIgIjxiPmM8L2I+ImRkZCdR/53crlUxRFx8ReuZRMpOxl/X0Gi0DzPptxvjUNrI" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
        <span id="MyLabel">ERROR: missing parameter "<b>c</b>"</span>
        <!--
                AES-256-CBC-PKCS7 ciphertext: 4358b2f77165b5130e323f067ab6c8a92312420765204ce350b1fbb826c59488

                Victor's TODO: Need to add authentication eventually..
        -->
</form>                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools]
└─$ curl 192.168.121.119:2290/?c=0
<form method="post" action="./?c=0" id="MyForm">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJMjI5MTY0MjY4D2QWAmYPZBYCAgEPDxYCHgRUZXh0BQEwZGRkrKTBczbVT06GUTZ6QIcDUs10/WrtN8+vQv9cPZFeXoQ=" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
        <span id="MyLabel">0</span>
        <!--
                AES-256-CBC-PKCS7 ciphertext: 4358b2f77165b5130e323f067ab6c8a92312420765204ce350b1fbb826c59488

                Victor's TODO: Need to add authentication eventually..
        -->
</form>                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools]
└─$ 
┌──(kali㉿kali)-[~/Documents/tools]
└─$ curl 192.168.121.119:2290/?c=4358b2f77165b5130e323f067ab6c8a92312420765204ce350b1fbb826c59488

<form method="post" action="./?c=4358b2f77165b5130e323f067ab6c8a92312420765204ce350b1fbb826c59488" id="MyForm">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJMjI5MTY0MjY4D2QWAmYPZBYCAgEPDxYCHgRUZXh0BQExZGRkyxyNSSeI11DTCRjhIzJBIDSN9euM4yamURMBq7G2SP0=" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
        <span id="MyLabel">1</span>
        <!--
                AES-256-CBC-PKCS7 ciphertext: 4358b2f77165b5130e323f067ab6c8a92312420765204ce350b1fbb826c59488

                Victor's TODO: Need to add authentication eventually..
        -->
</form>                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools]
└─$ 
```

## 5985 - WinRM

# Exploitation
I knew something to do with Cipher but lazy lol
also not like really tested for OSCP

https://www.google.com/search?q=AES-256-CBC-PKCS7+vulnerability&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WButBn9UrI6uggV_qTbh5TmsOlmIsw%3A1644053783899&ei=F0X-Yfj_NeieseMPtrGy2Ag&ved=0ahUKEwi4557Ooej1AhVoT2wGHbaYDIsQ4dUDCA8&uact=5&oq=AES-256-CBC-PKCS7+vulnerability&gs_lcp=Cgdnd3Mtd2l6EAM6BwgAEEcQsAM6BAgjECc6BggAEAcQHjoICAAQBxAFEB5KBAhBGABKBAhGGABQzQJYrG9ggnJoAnACeACAATyIAYkCkgEBNZgBAKABAaABAsgBCMABAQ&sclient=gws-wiz

https://github.com/mpgn/Padding-oracle-attack

```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/mpgn/Padding-oracle-attack.git                                                                                                     1 ⨯
Cloning into 'Padding-oracle-attack'...
remote: Enumerating objects: 95, done.
remote: Counting objects: 100% (49/49), done.
remote: Compressing objects: 100% (29/29), done.
remote: Total 95 (delta 24), reused 37 (delta 20), pack-reused 46
Receiving objects: 100% (95/95), 40.99 KiB | 6.83 MiB/s, done.
Resolving deltas: 100% (46/46), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd Padding-oracle-attack 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Padding-oracle-attack]
└─$ ls
exploit.py  LICENSE  README.md  test.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Padding-oracle-attack]
└─$
```

# Privesc

# Others

