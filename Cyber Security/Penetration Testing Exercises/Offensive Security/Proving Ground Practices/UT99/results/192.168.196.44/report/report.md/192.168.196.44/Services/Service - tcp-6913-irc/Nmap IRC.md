```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/tcp_6913_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/xml/tcp_6913_irc_nmap.xml" -p 6913 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/tcp_6913_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/tcp_6913_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:46 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/tcp_6913_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6913/xml/tcp_6913_irc_nmap.xml" -p 6913 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:04:50 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6913/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, GetRequest, Help, LANDesk-RC, LDAPBindReq, LDAPSearchReq, NULL, RTSPRequest, SSLSessionReq, TLSSessionReq, TerminalServerCookie: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6913-TCP:V=7.91%I=7%D=1/21%Time=61EAAF75%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7B,"ERROR\x20:Closing\x20lin
SF:k:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20a
SF:llowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(
SF:local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\
SF:.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20yo
SF:ur\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SS
SF:LSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.1
SF:96\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\
SF:x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServe
SF:rCookie,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)
SF:\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20v
SF:ia\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TLSSessionReq,7B,
SF:"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x2
SF:0more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\
SF:x20connect\x20class\x20\(local\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:
SF:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20co
SF:nnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\
SF:x20class\x20\(local\)\]\r\n")%r(LDAPBindReq,7B,"ERROR\x20:Closing\x20li
SF:nk:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20
SF:allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\
SF:(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x20:Closing\x20link:\x20\(unkno
SF:wn@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fro
SF:m\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n
SF:");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:08 2022 -- 1 IP address (1 host up) scanned in 22.86 seconds

```
