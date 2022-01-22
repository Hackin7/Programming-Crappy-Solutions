```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/tcp_6936_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/xml/tcp_6936_irc_nmap.xml" -p 6936 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/tcp_6936_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/tcp_6936_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:20 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/tcp_6936_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6936/xml/tcp_6936_irc_nmap.xml" -p 6936 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:24 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6936/tcp open  xsmsvc? syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, FourOhFourRequest, Kerberos, LANDesk-RC, NULL, RTSPRequest, SMBProgNeg, WMSRequest, ms-sql-s: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6936-TCP:V=7.91%I=7%D=1/21%Time=61EAAFD2%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7B,"ERROR\x20:
SF:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20co
SF:nnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\
SF:x20class\x20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:
SF:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20all
SF:owed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(lo
SF:cal\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@
SF:192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x
SF:20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%
SF:r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.16
SF:8\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\
SF:x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDe
SF:sk-RC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x
SF:20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via
SF:\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERRO
SF:R\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more
SF:\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20co
SF:nnect\x20class\x20\(local\)\]\r\n")%r(ms-sql-s,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:41 2022 -- 1 IP address (1 host up) scanned in 22.04 seconds

```
