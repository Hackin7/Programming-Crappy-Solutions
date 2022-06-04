```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/xml/_quick_tcp_nmap.xml" 192.168.90.67
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/_quick_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Feb 14 08:35:48 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/xml/_quick_tcp_nmap.xml" 192.168.90.67
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #fcfcfc; color: #333333; margin: 0; padding:0; \}\nh1 \{ font-size: 1\.5em; font-weight: normal; background-color: #9999cc; min-height:2em; line-height:2em; border-bottom: 1px inset black; margin: 0; \}\nh1, p \{ padding-left: 10px; \}\ncode\.url \{ background-color: #eeeeee; font-family:monospace; padding:0 2px;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #ffffff; color: #000000; \}\nh1 \{ font-family: sans-serif; font-size: 150%; background-color: #9999cc; font-weight: bold; color: #000000; margin-top: 0;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #fcfcfc; color: #333333; margin: 0; padding:0; \}\nh1 \{ font-size: 1\.5em; font-weight: normal; background-color: #9999cc; min-height:2em; line-height:2em; border-bottom: 1px inset black; margin: 0; \}\nh1, p \{ padding-left: 10px; \}\ncode\.url \{ background-color: #eeeeee; font-family:monospace; padding:0 2px;\}\n</style>'
Warning: Hit PCRE_ERROR_MATCHLIMIT when probing for service http with the regex '^HTTP/1\.0 404 Not Found\r\n(?:[^<]+|<(?!/head>))*?<style>\nbody \{ background-color: #ffffff; color: #000000; \}\nh1 \{ font-family: sans-serif; font-size: 150%; background-color: #9999cc; font-weight: bold; color: #000000; margin-top: 0;\}\n</style>'
Nmap scan report for 192.168.90.67
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 08:35:49 EST for 431s
Not shown: 995 filtered ports
Reason: 995 no-responses
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
|     Set-Cookie: i_like_gitea=13c61f81f71e691d; Path=/; HttpOnly
|     Set-Cookie: _csrf=T0I6DaE0AsMOofI7IirVsDXQLUI6MTY0NDg0NTY2Njk4MTg2MDYyMw%3D%3D; Path=/; Expires=Tue, 15 Feb 2022 13:34:26 GMT; HttpOnly
|     X-Frame-Options: SAMEORIGIN
|     Date: Mon, 14 Feb 2022 13:34:26 GMT
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
|     Set-Cookie: i_like_gitea=ccd16c942d9db6eb; Path=/; HttpOnly
|     Set-Cookie: _csrf=yT8fHsi_KSRE7_Ru8P3vJBLYL3k6MTY0NDg0NTY3NTk4MDE3MjkwMQ%3D%3D; Path=/; Expires=Tue, 15 Feb 2022 13:34:35 GMT; HttpOnly
|     X-Frame-Options: SAMEORIGIN
|     Date: Mon, 14 Feb 2022 13:34:35 GMT
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
SF-Port3000-TCP:V=7.91%I=9%D=2/14%Time=620A5AC8%P=x86_64-pc-linux-gnu%r(Ge
SF:nericLines,67,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nContent-Type:\x20t
SF:ext/plain;\x20charset=utf-8\r\nConnection:\x20close\r\n\r\n400\x20Bad\x
SF:20Request")%r(GetRequest,2836,"HTTP/1\.0\x20200\x20OK\r\nContent-Type:\
SF:x20text/html;\x20charset=UTF-8\r\nSet-Cookie:\x20lang=en-US;\x20Path=/;
SF:\x20Max-Age=2147483647\r\nSet-Cookie:\x20i_like_gitea=13c61f81f71e691d;
SF:\x20Path=/;\x20HttpOnly\r\nSet-Cookie:\x20_csrf=T0I6DaE0AsMOofI7IirVsDX
SF:QLUI6MTY0NDg0NTY2Njk4MTg2MDYyMw%3D%3D;\x20Path=/;\x20Expires=Tue,\x2015
SF:\x20Feb\x202022\x2013:34:26\x20GMT;\x20HttpOnly\r\nX-Frame-Options:\x20
SF:SAMEORIGIN\r\nDate:\x20Mon,\x2014\x20Feb\x202022\x2013:34:26\x20GMT\r\n
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
SF:e_gitea=ccd16c942d9db6eb;\x20Path=/;\x20HttpOnly\r\nSet-Cookie:\x20_csr
SF:f=yT8fHsi_KSRE7_Ru8P3vJBLYL3k6MTY0NDg0NTY3NTk4MDE3MjkwMQ%3D%3D;\x20Path
SF:=/;\x20Expires=Tue,\x2015\x20Feb\x202022\x2013:34:35\x20GMT;\x20HttpOnl
SF:y\r\nX-Frame-Options:\x20SAMEORIGIN\r\nDate:\x20Mon,\x2014\x20Feb\x2020
SF:22\x2013:34:35\x20GMT\r\n\r\n<!DOCTYPE\x20html>\n<html>\n<head\x20data-
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
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 4.4 (93%), Linux 3.16 (92%), Linux 3.13 (90%), Linux 3.10 - 3.16 (88%), Linux 3.10 - 3.12 (88%), Linux 2.6.32 (88%), Linux 3.2 - 3.8 (88%), Linux 3.8 (88%), WatchGuard Fireware 11.8 (88%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/14%OT=21%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=620A5C64%P=x86_64-pc-linux-gnu)
SEQ(SP=103%GCD=1%ISR=10D%TI=Z%II=I%TS=8)
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

Uptime guess: 0.004 days (since Mon Feb 14 08:36:48 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   179.23 ms 192.168.49.1
2   179.25 ms 192.168.90.67

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 08:43:00 2022 -- 1 IP address (1 host up) scanned in 433.54 seconds

```