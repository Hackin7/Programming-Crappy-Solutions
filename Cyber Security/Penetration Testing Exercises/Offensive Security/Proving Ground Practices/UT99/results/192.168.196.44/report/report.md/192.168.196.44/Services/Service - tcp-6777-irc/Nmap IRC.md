```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/tcp_6777_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/xml/tcp_6777_irc_nmap.xml" -p 6777 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/tcp_6777_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/tcp_6777_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:03 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/tcp_6777_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6777/xml/tcp_6777_irc_nmap.xml" -p 6777 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:09 EST for 18s

PORT     STATE SERVICE      REASON          VERSION
6777/tcp open  ntz-tracker? syn-ack ttl 127
| fingerprint-strings: 
|   GenericLines, LPDString, NULL, TLSSessionReq, WMSRequest, giop, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6777-TCP:V=7.91%I=7%D=1/21%Time=61EAAF88%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closin
SF:g\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connecti
SF:ons\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cla
SF:ss\x20\(local\)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closing\x20link:\x20\
SF:(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\
SF:x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)
SF:\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.
SF:168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20you
SF:r\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(ora
SF:cle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)
SF:\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20v
SF:ia\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x2
SF:0:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20
SF:connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connec
SF:t\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:27 2022 -- 1 IP address (1 host up) scanned in 24.06 seconds

```
