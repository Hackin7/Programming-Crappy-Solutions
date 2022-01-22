```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/tcp_6934_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/xml/tcp_6934_irc_nmap.xml" -p 6934 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/tcp_6934_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/tcp_6934_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:19 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/tcp_6934_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6934/xml/tcp_6934_irc_nmap.xml" -p 6934 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:24 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6934/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, LDAPSearchReq, NULL, SMBProgNeg, X11Probe: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6934-TCP:V=7.91%I=7%D=1/21%Time=61EAAFD2%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7
SF:B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\
SF:x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20thi
SF:s\x20connect\x20class\x20\(local\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(X11Probe,7B,"ERROR\x20:Closing\x20link:\
SF:x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allo
SF:wed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loc
SF:al\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknow
SF:n@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from
SF:\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n"
SF:);

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:41 2022 -- 1 IP address (1 host up) scanned in 22.76 seconds

```
