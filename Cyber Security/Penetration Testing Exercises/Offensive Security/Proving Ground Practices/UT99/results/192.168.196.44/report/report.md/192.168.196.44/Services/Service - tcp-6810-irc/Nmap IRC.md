```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/tcp_6810_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/xml/tcp_6810_irc_nmap.xml" -p 6810 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/tcp_6810_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/tcp_6810_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:21 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/tcp_6810_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6810/xml/tcp_6810_irc_nmap.xml" -p 6810 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:26 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6810/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   Help, JavaRMI, Kerberos, NULL, NotesRPC, SMBProgNeg, SSLSessionReq, TerminalServer, TerminalServerCookie, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6810-TCP:V=7.91%I=7%D=1/21%Time=61EAAF98%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closing\x20lin
SF:k:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20a
SF:llowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(
SF:local\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Closing\x20link:\x
SF:20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allow
SF:ed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loca
SF:l\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\
SF:.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20yo
SF:ur\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SM
SF:BProgNeg,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\
SF:)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20
SF:via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServer,7
SF:B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\
SF:x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20thi
SF:s\x20connect\x20class\x20\(local\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(JavaRMI,7B,"ERROR\x20:Closing\x20link:\x20
SF:\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed
SF:\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\
SF:)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.4
SF:9\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20h
SF:ost\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:44 2022 -- 1 IP address (1 host up) scanned in 23.87 seconds

```