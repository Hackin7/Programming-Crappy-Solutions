```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/tcp_6928_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/xml/tcp_6928_irc_nmap.xml" -p 6928 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/tcp_6928_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/tcp_6928_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:12 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/tcp_6928_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6928/xml/tcp_6928_irc_nmap.xml" -p 6928 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:18 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6928/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   GenericLines, LPDString, NULL, SSLSessionReq, TerminalServerCookie, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6928-TCP:V=7.91%I=7%D=1/21%Time=61EAAFCC%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closin
SF:g\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connecti
SF:ons\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cla
SF:ss\x20\(local\)\]\r\n")%r(TerminalServerCookie,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\(unk
SF:nown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20f
SF:rom\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r
SF:\n")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.19
SF:6\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x
SF:20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:35 2022 -- 1 IP address (1 host up) scanned in 24.21 seconds

```