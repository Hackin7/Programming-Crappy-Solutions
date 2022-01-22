```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/tcp_6924_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/xml/tcp_6924_irc_nmap.xml" -p 6924 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/tcp_6924_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/tcp_6924_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:11 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/tcp_6924_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6924/xml/tcp_6924_irc_nmap.xml" -p 6924 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:16 EST for 17s

PORT     STATE SERVICE     REASON          VERSION
6924/tcp open  split-ping? syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, GenericLines, GetRequest, LANDesk-RC, NULL, RPCCheck, RTSPRequest, SMBProgNeg, TLSSessionReq, TerminalServerCookie, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6924-TCP:V=7.91%I=7%D=1/21%Time=61EAAFCA%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x20:Closing\x
SF:20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections
SF:\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\
SF:x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n")%r(RPCCheck,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168
SF:\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x
SF:20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSSta
SF:tusRequestTCP,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\
SF:.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20hos
SF:t\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalSer
SF:verCookie,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196
SF:\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x2
SF:0via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TLSSessionReq,7
SF:B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\
SF:x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20thi
SF:s\x20connect\x20class\x20\(local\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(oracle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown
SF:@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\
SF:x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:33 2022 -- 1 IP address (1 host up) scanned in 23.00 seconds

```
