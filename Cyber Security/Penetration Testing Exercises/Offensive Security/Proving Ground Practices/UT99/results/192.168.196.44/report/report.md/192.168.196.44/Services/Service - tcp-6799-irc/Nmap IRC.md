```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/tcp_6799_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/xml/tcp_6799_irc_nmap.xml" -p 6799 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/tcp_6799_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/tcp_6799_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:15 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/tcp_6799_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6799/xml/tcp_6799_irc_nmap.xml" -p 6799 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:19 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6799/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, GenericLines, Help, LANDesk-RC, LDAPSearchReq, NCP, NULL, SIPOptions, TLSSessionReq, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6799-TCP:V=7.91%I=7%D=1/21%Time=61EAAF91%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@
SF:192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x
SF:20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%
SF:r(LDAPSearchReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.4
SF:9\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20h
SF:ost\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SIPOption
SF:s,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[
SF:No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20
SF:this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x2
SF:0:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20
SF:connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connec
SF:t\x20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:37 2022 -- 1 IP address (1 host up) scanned in 21.51 seconds

```