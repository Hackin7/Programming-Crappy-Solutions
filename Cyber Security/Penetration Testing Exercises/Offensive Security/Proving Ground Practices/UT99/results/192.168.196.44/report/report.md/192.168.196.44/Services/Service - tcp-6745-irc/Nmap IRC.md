```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/tcp_6745_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/xml/tcp_6745_irc_nmap.xml" -p 6745 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/tcp_6745_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/tcp_6745_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:06 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/tcp_6745_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6745/xml/tcp_6745_irc_nmap.xml" -p 6745 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:11 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6745/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, Help, LANDesk-RC, LDAPBindReq, NULL, NotesRPC, RTSPRequest, SSLSessionReq, TLSSessionReq, WMSRequest, X11Probe: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6745-TCP:V=7.91%I=7%D=1/21%Time=61EAAFC5%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:
SF:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20all
SF:owed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(lo
SF:cal\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unkno
SF:wn@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fro
SF:m\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n
SF:")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168
SF:\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x
SF:20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(X11Pro
SF:be,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(FourOhFourRequest,7B,"
SF:ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20
SF:more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x
SF:20connect\x20class\x20\(local\)\]\r\n")%r(LDAPBindReq,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x20:Closing\x20link:\
SF:x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allo
SF:wed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loc
SF:al\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192
SF:\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20y
SF:our\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(W
SF:MSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196
SF:\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x2
SF:0via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:29 2022 -- 1 IP address (1 host up) scanned in 23.51 seconds

```
