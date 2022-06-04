```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/tcp_6949_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/xml/tcp_6949_irc_nmap.xml" -p 6949 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/tcp_6949_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/tcp_6949_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:24 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/tcp_6949_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6949/xml/tcp_6949_irc_nmap.xml" -p 6949 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:29 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6949/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   GetRequest, Help, LDAPBindReq, NULL, RTSPRequest, SMBProgNeg, SSLSessionReq, TerminalServer, TerminalServerCookie, X11Probe, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6949-TCP:V=7.91%I=7%D=1/21%Time=61EAAFD7%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@
SF:192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x
SF:20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%
SF:r(SSLSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.4
SF:9\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20h
SF:ost\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalS
SF:erverCookie,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.1
SF:96\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\
SF:x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SMBProgNeg,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(X11Probe,7B,"ERROR\x20:Clos
SF:ing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connec
SF:tions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20c
SF:lass\x20\(local\)\]\r\n")%r(LDAPBindReq,7B,"ERROR\x20:Closing\x20link:\
SF:x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allo
SF:wed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loc
SF:al\)\]\r\n")%r(TerminalServer,7B,"ERROR\x20:Closing\x20link:\x20\(unkno
SF:wn@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fro
SF:m\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n
SF:")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\
SF:)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20
SF:via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:47 2022 -- 1 IP address (1 host up) scanned in 23.09 seconds

```