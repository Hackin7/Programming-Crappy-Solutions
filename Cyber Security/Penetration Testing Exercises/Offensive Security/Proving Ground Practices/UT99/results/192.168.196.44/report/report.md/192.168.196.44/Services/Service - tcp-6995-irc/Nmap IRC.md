```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/tcp_6995_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/xml/tcp_6995_irc_nmap.xml" -p 6995 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/tcp_6995_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/tcp_6995_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:08 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/tcp_6995_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6995/xml/tcp_6995_irc_nmap.xml" -p 6995 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:13 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6995/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, FourOhFourRequest, GenericLines, Help, LDAPSearchReq, LPDString, NULL, NotesRPC, TLSSessionReq, TerminalServer, WMSRequest: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6995-TCP:V=7.91%I=7%D=1/21%Time=61EAAF8B%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:
SF:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20co
SF:nnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\
SF:x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x20
SF:\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed
SF:\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\
SF:)\]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@1
SF:92\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x2
SF:0your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r
SF:(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168
SF:\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x
SF:20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LPDStr
SF:ing,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20
SF:\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x
SF:20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LDAPSearchReq,7B,"ERR
SF:OR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20mor
SF:e\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20c
SF:onnect\x20class\x20\(local\)\]\r\n")%r(TerminalServer,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192
SF:\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20y
SF:our\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:30 2022 -- 1 IP address (1 host up) scanned in 22.97 seconds

```
