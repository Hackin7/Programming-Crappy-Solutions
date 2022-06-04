# Bunyip

# Enumeration

## nmap

```bash
# Nmap 7.91 scan initiated Wed Mar  2 04:55:21 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Bunyip/results/192.168.128.153/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Bunyip/results/192.168.128.153/scans/xml/_full_tcp_nmap.xml" 192.168.128.153
adjust_timeouts2: packet supposedly had rtt of -50349 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -50349 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -64535 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -64535 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -137502 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -137502 microseconds.  Ignoring time.
Nmap scan report for 192.168.128.153
Host is up, received user-set (0.20s latency).
Scanned at 2022-03-02 04:55:22 EST for 295s
Not shown: 65531 filtered ports
Reason: 65531 no-responses
PORT     STATE SERVICE REASON         VERSION
22/tcp   open  ssh     syn-ack ttl 63 OpenSSH 8.2p1 Ubuntu 4ubuntu0.1 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 05:84:62:ba:f7:66:23:ba:79:09:25:46:1f:a3:3d:1d (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDnvr+kfNA4cT1aHmw18eHXIMZ6p3TSIqSPbPuNnQgZndqPmtnatEKRexTgWb3Lg3o5VzojkYB7G/gE+OZI0LgiBSlP9odrUigR+w6j9qXOelig4YHPkkx/iY3y9nqAPJHWSGniT++dxClyLDHEJp4uTxr+gS22uAt1OYFOvJnLcDNXrU0Px2tsDiQ/vn7bDMpLIPbM0KOyUt5JueZyWqNCg+1MbCfFnZB40oQa5kK9r2eXU437mNSkbOZcUGmdjqUM1ujzuZBR8uCG8EzhWynjvJ3DmrS0EkrTujGrx14XkZ/kI6iKiiFy7lyLk3prWxIv6kXsYdhBMeqJ2dcXX0xw1fVKE8JM/6g2gclwBBtyyE+6ZxefRpQ8TcfQcGmTdlUeqUs9N6CxoDHRvSHPgIpUzSEkbD0MBWYT4yVWNXpNeIr2+e1ZKdwd3QjwUZy5O9Obyl3IoBrSObnMg/0KzJ1dEqT/L0UJA9bCxCnDV86rPKBthsnlNg2SJo9l2fOxzrU=
|   256 d2:86:47:43:7d:10:1a:6f:3b:18:0e:04:37:11:51:96 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBIuqZer1Jf9sRfz5frlN0sdb2FDiL7Yll6bma4qq+fAl9Ce5I+m4NlOeBC4TqKJiKMjeZMPuNzHCW7pM/JlsD0U=
|   256 1d:b1:5f:b4:87:50:76:10:db:61:71:52:1b:7e:af:6f (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIAcNix8zuAOsFIws6SN6v5pu3gx96SZBraOLo26sSXxv
80/tcp   open  http    syn-ack ttl 63 nginx 1.18.0 (Ubuntu)
|_http-favicon: Unknown favicon MD5: 338ABBB5EA8D80B9869555ECA253D49D
|_http-generator: Docusaurus
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.18.0 (Ubuntu)
|_http-title: Test Site \xC2\xB7 A website for testing
3306/tcp open  mysql   syn-ack ttl 63 MySQL (unauthorized)
|_ssl-cert: ERROR: Script execution failed (use -d to debug)
|_ssl-date: ERROR: Script execution failed (use -d to debug)
|_sslv2: ERROR: Script execution failed (use -d to debug)
|_tls-alpn: ERROR: Script execution failed (use -d to debug)
|_tls-nextprotoneg: ERROR: Script execution failed (use -d to debug)
8000/tcp open  http    syn-ack ttl 63 Node.js (Express middleware)
|_http-favicon: Unknown favicon MD5: D41D8CD98F00B204E9800998ECF8427E
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: s3cur3 r3pl
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=3/2%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=621F4031%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=10C%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 1.940 days (since Mon Feb 28 06:26:07 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=263 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   199.57 ms 192.168.49.1
2   199.64 ms 192.168.128.153

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Mar  2 05:00:17 2022 -- 1 IP address (1 host up) scanned in 296.52 seconds
```

## 3306 - MySQL
```bash
┌──(kali㉿kali)-[~/Desktop]
└─$ mysql -h 192.168.128.153              
ERROR 1130 (HY000): Host '192.168.49.128' is not allowed to connect to this MySQL server
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Desktop]
└─$
```

# Exploitation

# Privesc