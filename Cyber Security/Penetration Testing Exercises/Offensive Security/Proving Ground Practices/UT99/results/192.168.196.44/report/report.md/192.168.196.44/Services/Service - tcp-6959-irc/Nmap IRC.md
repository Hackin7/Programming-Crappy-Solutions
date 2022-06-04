```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/tcp_6959_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/xml/tcp_6959_irc_nmap.xml" -p 6959 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/tcp_6959_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/tcp_6959_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:30 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/tcp_6959_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6959/xml/tcp_6959_irc_nmap.xml" -p 6959 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:35 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6959/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   Kerberos, LANDesk-RC, LDAPSearchReq, LPDString, NULL, RPCCheck, TerminalServerCookie, WMSRequest, giop: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6959-TCP:V=7.91%I=7%D=1/21%Time=61EAAFDC%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20
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
SF:APSearchReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.1
SF:96\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\
SF:x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Cl
SF:osing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conn
SF:ections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x2
SF:0class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:53 2022 -- 1 IP address (1 host up) scanned in 23.10 seconds

```