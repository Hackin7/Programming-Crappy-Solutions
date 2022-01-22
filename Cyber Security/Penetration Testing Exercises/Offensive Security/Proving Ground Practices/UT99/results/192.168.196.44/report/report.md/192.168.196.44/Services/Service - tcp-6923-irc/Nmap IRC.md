```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/tcp_6923_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/xml/tcp_6923_irc_nmap.xml" -p 6923 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/tcp_6923_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/tcp_6923_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:09 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/tcp_6923_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6923/xml/tcp_6923_irc_nmap.xml" -p 6923 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:15 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6923/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, GetRequest, LANDesk-RC, NULL, RPCCheck, TerminalServer: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6923-TCP:V=7.91%I=7%D=1/21%Time=61EAAFC9%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20:Closing\x20li
SF:nk:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20
SF:allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\
SF:(local\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:Closing\x20link:\x
SF:20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allow
SF:ed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loca
SF:l\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@19
SF:2\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20
SF:your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(
SF:TerminalServer,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49
SF:\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20ho
SF:st\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:33 2022 -- 1 IP address (1 host up) scanned in 23.95 seconds

```
