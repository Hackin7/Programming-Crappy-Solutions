```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/tcp_6943_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/xml/tcp_6943_irc_nmap.xml" -p 6943 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/tcp_6943_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/tcp_6943_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:04 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/tcp_6943_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6943/xml/tcp_6943_irc_nmap.xml" -p 6943 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.31s latency).
Scanned at 2022-01-21 08:04:14 EST for 38s

PORT     STATE SERVICE REASON          VERSION
6943/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   NULL, NotesRPC, SMBProgNeg, WMSRequest, afp, giop: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6943-TCP:V=7.91%I=7%D=1/21%Time=61EAAF5D%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(NotesRPC,7B,"ERROR\x20:Closing\x20li
SF:nk:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20
SF:allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\
SF:(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unkno
SF:wn@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fro
SF:m\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n
SF:")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\
SF:)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20
SF:via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:04:52 2022 -- 1 IP address (1 host up) scanned in 49.39 seconds

```