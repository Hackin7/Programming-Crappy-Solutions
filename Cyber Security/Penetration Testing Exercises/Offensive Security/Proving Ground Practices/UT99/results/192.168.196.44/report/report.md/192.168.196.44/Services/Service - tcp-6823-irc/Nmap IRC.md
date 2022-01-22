```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/tcp_6823_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/xml/tcp_6823_irc_nmap.xml" -p 6823 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/tcp_6823_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/tcp_6823_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:27 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/tcp_6823_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6823/xml/tcp_6823_irc_nmap.xml" -p 6823 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:32 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6823/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, GenericLines, Kerberos, LANDesk-RC, NCP, NULL, RTSPRequest, SIPOptions, WMSRequest, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6823-TCP:V=7.91%I=7%D=1/21%Time=61EAAF9E%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\x20:Closing\
SF:x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connection
SF:s\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class
SF:\x20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:\x20\(un
SF:known@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20
SF:from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\
SF:r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@1
SF:92\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x2
SF:0your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r
SF:(SIPOptions,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.1
SF:96\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\
SF:x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20:Closing\x
SF:20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections
SF:\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\
SF:x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(u
SF:nknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x2
SF:0from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]
SF:\r\n")%r(oracle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.16
SF:8\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\
SF:x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:50 2022 -- 1 IP address (1 host up) scanned in 23.27 seconds

```
