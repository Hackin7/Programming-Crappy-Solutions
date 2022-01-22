```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/tcp_6688_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/xml/tcp_6688_irc_nmap.xml" -p 6688 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/tcp_6688_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/tcp_6688_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:03:42 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/tcp_6688_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6688/xml/tcp_6688_irc_nmap.xml" -p 6688 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:03:47 EST for 18s

PORT     STATE SERVICE       REASON          VERSION
6688/tcp open  clever-tcpip? syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, JavaRMI, Kerberos, LANDesk-RC, LDAPBindReq, LPDString, NULL, SIPOptions, SSLSessionReq, TerminalServerCookie, WMSRequest: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6688-TCP:V=7.91%I=7%D=1/21%Time=61EAAF35%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\
SF:.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20yo
SF:ur\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LD
SF:APBindReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196
SF:\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x2
SF:0via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SIPOptions,7B,"
SF:ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20
SF:more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x
SF:20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x20:Clos
SF:ing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connec
SF:tions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20c
SF:lass\x20\(local\)\]\r\n")%r(JavaRMI,7B,"ERROR\x20:Closing\x20link:\x20\
SF:(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\
SF:x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)
SF:\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.
SF:168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20you
SF:r\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:04:06 2022 -- 1 IP address (1 host up) scanned in 23.98 seconds

```
