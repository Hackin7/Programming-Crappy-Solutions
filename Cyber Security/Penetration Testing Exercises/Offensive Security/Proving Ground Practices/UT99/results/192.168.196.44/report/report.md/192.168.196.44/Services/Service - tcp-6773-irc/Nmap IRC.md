```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/tcp_6773_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/xml/tcp_6773_irc_nmap.xml" -p 6773 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/tcp_6773_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/tcp_6773_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:55 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/tcp_6773_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6773/xml/tcp_6773_irc_nmap.xml" -p 6773 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:02 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6773/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   HTTPOptions, Help, LDAPSearchReq, LPDString, NCP, NULL, SMBProgNeg, WMSRequest, X11Probe, afp, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6773-TCP:V=7.91%I=7%D=1/21%Time=61EAAF80%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(HTTPOptions,7B,"ERROR\
SF:x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x
SF:20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conn
SF:ect\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Closing\x20link:
SF:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20all
SF:owed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(lo
SF:cal\)\]\r\n")%r(SMBProgNeg,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@
SF:192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x
SF:20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%
SF:r(X11Probe,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.19
SF:6\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x
SF:20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LPDString,7B,"
SF:ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20
SF:more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x
SF:20connect\x20class\x20\(local\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(NCP,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.1
SF:68\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your
SF:\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(orac
SF:le-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\
SF:x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20vi
SF:a\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:
SF:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20co
SF:nnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\
SF:x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:19 2022 -- 1 IP address (1 host up) scanned in 24.44 seconds

```
