```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/tcp_6817_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/xml/tcp_6817_irc_nmap.xml" -p 6817 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/tcp_6817_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/tcp_6817_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:25 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/tcp_6817_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6817/xml/tcp_6817_irc_nmap.xml" -p 6817 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:30 EST for 17s

PORT     STATE SERVICE      REASON          VERSION
6817/tcp open  pentbox-sim? syn-ack ttl 127
| fingerprint-strings: 
|   Help, JavaRMI, LPDString, NCP, NULL, NotesRPC, RTSPRequest, SIPOptions, TerminalServerCookie: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6817-TCP:V=7.91%I=7%D=1/21%Time=61EAAF9C%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:
SF:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20all
SF:owed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(lo
SF:cal\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Closing\x20link:\x20
SF:\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed
SF:\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\
SF:)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.
SF:168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20you
SF:r\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SIP
SF:Options,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)
SF:\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20v
SF:ia\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(JavaRMI,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@19
SF:2\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20
SF:your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:47 2022 -- 1 IP address (1 host up) scanned in 23.20 seconds

```
