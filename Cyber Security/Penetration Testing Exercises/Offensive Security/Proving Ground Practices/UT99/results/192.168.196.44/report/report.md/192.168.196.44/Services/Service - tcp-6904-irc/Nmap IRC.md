```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/tcp_6904_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/xml/tcp_6904_irc_nmap.xml" -p 6904 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/tcp_6904_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/tcp_6904_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:38 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/tcp_6904_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6904/xml/tcp_6904_irc_nmap.xml" -p 6904 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.26s latency).
Scanned at 2022-01-21 08:04:48 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6904/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, FourOhFourRequest, JavaRMI, NULL, RPCCheck, TerminalServerCookie, afp, ms-sql-s, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6904-TCP:V=7.91%I=7%D=1/21%Time=61EAAF72%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:Clos
SF:ing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connec
SF:tions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20c
SF:lass\x20\(local\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Closing\
SF:x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connection
SF:s\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class
SF:\x20\(local\)\]\r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(JavaRMI,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@19
SF:2\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20
SF:your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(
SF:oracle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.19
SF:6\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x
SF:20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(ms-sql-s,7B,"E
SF:RROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20m
SF:ore\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x2
SF:0connect\x20class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20l
SF:ink:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x2
SF:0allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20
SF:\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:06 2022 -- 1 IP address (1 host up) scanned in 28.69 seconds

```
