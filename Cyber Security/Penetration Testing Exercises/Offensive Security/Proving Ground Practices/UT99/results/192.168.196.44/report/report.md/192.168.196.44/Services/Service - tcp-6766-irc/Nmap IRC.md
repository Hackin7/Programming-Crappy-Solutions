```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/tcp_6766_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/xml/tcp_6766_irc_nmap.xml" -p 6766 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/tcp_6766_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/tcp_6766_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:34 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/tcp_6766_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6766/xml/tcp_6766_irc_nmap.xml" -p 6766 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:04:40 EST for 22s

PORT     STATE SERVICE REASON          VERSION
6766/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, GenericLines, HTTPOptions, NULL, SIPOptions, SSLSessionReq, TerminalServer, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6766-TCP:V=7.91%I=7%D=1/21%Time=61EAAF6F%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\x20:Closing\
SF:x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connection
SF:s\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class
SF:\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unkn
SF:own@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fr
SF:om\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\
SF:n")%r(SIPOptions,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(Terminal
SF:Server,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\
SF:x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20vi
SF:a\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:
SF:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20co
SF:nnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\
SF:x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:02 2022 -- 1 IP address (1 host up) scanned in 28.60 seconds

```