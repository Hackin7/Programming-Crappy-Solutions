```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/tcp_6896_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/xml/tcp_6896_irc_nmap.xml" -p 6896 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/tcp_6896_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/tcp_6896_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:33 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/tcp_6896_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6896/xml/tcp_6896_irc_nmap.xml" -p 6896 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:04:38 EST for 22s

PORT     STATE SERVICE REASON          VERSION
6896/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   GetRequest, HTTPOptions, Help, NULL, RTSPRequest, WMSRequest, giop, ms-sql-s: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6896-TCP:V=7.91%I=7%D=1/21%Time=61EAAF69%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n")%r(RTSPRequest,7B,"ERROR\x20:Closing\x20link:\x20\(u
SF:nknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x2
SF:0from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]
SF:\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\
SF:.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20hos
SF:t\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(WMSRequest,
SF:7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No
SF:\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20th
SF:is\x20connect\x20class\x20\(local\)\]\r\n")%r(ms-sql-s,7B,"ERROR\x20:Cl
SF:osing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conn
SF:ections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x2
SF:0class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:00 2022 -- 1 IP address (1 host up) scanned in 28.05 seconds

```