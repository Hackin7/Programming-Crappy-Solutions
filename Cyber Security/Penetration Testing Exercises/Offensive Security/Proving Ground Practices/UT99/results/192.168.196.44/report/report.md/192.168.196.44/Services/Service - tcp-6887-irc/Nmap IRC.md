```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/tcp_6887_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/xml/tcp_6887_irc_nmap.xml" -p 6887 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/tcp_6887_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/tcp_6887_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:02 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/tcp_6887_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6887/xml/tcp_6887_irc_nmap.xml" -p 6887 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.28s latency).
Scanned at 2022-01-21 08:06:06 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6887/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, GenericLines, HTTPOptions, Help, LDAPBindReq, NCP, NULL, NotesRPC, TLSSessionReq, ms-sql-s: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6887-TCP:V=7.91%I=7%D=1/21%Time=61EAAFC0%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\x20:Closing\
SF:x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connection
SF:s\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class
SF:\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x20\(unknow
SF:n@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from
SF:\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n"
SF:)%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\
SF:.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x2
SF:0host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(FourOhF
SF:ourRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.19
SF:6\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x
SF:20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LDAPBindReq,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20:Closing\x
SF:20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections
SF:\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\
SF:x20\(local\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Closing\x20link:\x20\(unk
SF:nown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20f
SF:rom\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r
SF:\n")%r(ms-sql-s,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.4
SF:9\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20h
SF:ost\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:24 2022 -- 1 IP address (1 host up) scanned in 22.96 seconds

```