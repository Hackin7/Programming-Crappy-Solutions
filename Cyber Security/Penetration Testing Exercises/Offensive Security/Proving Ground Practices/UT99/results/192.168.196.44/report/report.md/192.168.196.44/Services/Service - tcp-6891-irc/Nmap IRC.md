```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/tcp_6891_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/xml/tcp_6891_irc_nmap.xml" -p 6891 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/tcp_6891_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/tcp_6891_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:03 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/tcp_6891_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6891/xml/tcp_6891_irc_nmap.xml" -p 6891 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:08 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6891/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, FourOhFourRequest, GenericLines, HTTPOptions, Kerberos, LDAPSearchReq, NULL, TLSSessionReq, X11Probe, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6891-TCP:V=7.91%I=7%D=1/21%Time=61EAAFC2%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\x20:Closing\
SF:x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connection
SF:s\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class
SF:\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:Closing\x20li
SF:nk:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20
SF:allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\
SF:(local\)\]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(un
SF:known@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20
SF:from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\
SF:r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(X11Probe
SF:,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[N
SF:o\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20t
SF:his\x20connect\x20class\x20\(local\)\]\r\n")%r(FourOhFourRequest,7B,"ER
SF:ROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20mo
SF:re\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20
SF:connect\x20class\x20\(local\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(un
SF:known@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20
SF:from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\
SF:r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:26 2022 -- 1 IP address (1 host up) scanned in 23.45 seconds

```
