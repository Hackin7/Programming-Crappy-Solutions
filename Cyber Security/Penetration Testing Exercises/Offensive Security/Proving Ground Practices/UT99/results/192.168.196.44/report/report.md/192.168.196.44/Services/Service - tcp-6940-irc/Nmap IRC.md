```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/tcp_6940_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/xml/tcp_6940_irc_nmap.xml" -p 6940 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/tcp_6940_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/tcp_6940_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:22 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/tcp_6940_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6940/xml/tcp_6940_irc_nmap.xml" -p 6940 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:27 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6940/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, FourOhFourRequest, LANDesk-RC, LPDString, NCP, NULL, RTSPRequest, SSLSessionReq, TerminalServerCookie: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6940-TCP:V=7.91%I=7%D=1/21%Time=61EAAFD4%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closing\x20l
SF:ink:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x2
SF:0allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20
SF:\(local\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Closing\x20link:
SF:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20all
SF:owed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(lo
SF:cal\)\]\r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(u
SF:nknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x2
SF:0from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]
SF:\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168
SF:\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x
SF:20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDes
SF:k-RC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x2
SF:0\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\
SF:x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20:Cl
SF:osing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conn
SF:ections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x2
SF:0class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:45 2022 -- 1 IP address (1 host up) scanned in 23.36 seconds

```