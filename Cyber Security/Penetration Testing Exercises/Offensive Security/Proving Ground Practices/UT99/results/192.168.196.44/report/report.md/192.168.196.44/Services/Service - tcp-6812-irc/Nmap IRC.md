```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/tcp_6812_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/xml/tcp_6812_irc_nmap.xml" -p 6812 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/tcp_6812_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/tcp_6812_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:22 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/tcp_6812_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6812/xml/tcp_6812_irc_nmap.xml" -p 6812 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:27 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6812/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   HTTPOptions, LANDesk-RC, LDAPSearchReq, LPDString, NULL, SIPOptions, TerminalServer, WMSRequest: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6812-TCP:V=7.91%I=7%D=1/21%Time=61EAAF99%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20
SF:link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x
SF:20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x2
SF:0\(local\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n")%r(SIPOptions,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.1
SF:68\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your
SF:\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LAND
SF:esk-RC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\
SF:x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20vi
SF:a\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServer,7B,
SF:"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x2
SF:0more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\
SF:x20connect\x20class\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:45 2022 -- 1 IP address (1 host up) scanned in 23.84 seconds

```
