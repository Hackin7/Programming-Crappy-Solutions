```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/tcp_6877_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/xml/tcp_6877_irc_nmap.xml" -p 6877 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/tcp_6877_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/tcp_6877_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:56 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/tcp_6877_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6877/xml/tcp_6877_irc_nmap.xml" -p 6877 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:01 EST for 21s

PORT     STATE SERVICE REASON          VERSION
6877/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, FourOhFourRequest, Kerberos, LANDesk-RC, LPDString, NULL, SMBProgNeg, TerminalServer, WMSRequest: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6877-TCP:V=7.91%I=7%D=1/21%Time=61EAAFBB%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Clos
SF:ing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connec
SF:tions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20c
SF:lass\x20\(local\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x20:Closing\x20link:\x
SF:20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allow
SF:ed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loca
SF:l\)\]\r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unk
SF:nown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20f
SF:rom\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r
SF:\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-
SF:RC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServer,7B,"ERR
SF:OR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20mor
SF:e\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20c
SF:onnect\x20class\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing
SF:\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connectio
SF:ns\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20clas
SF:s\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:22 2022 -- 1 IP address (1 host up) scanned in 26.48 seconds

```