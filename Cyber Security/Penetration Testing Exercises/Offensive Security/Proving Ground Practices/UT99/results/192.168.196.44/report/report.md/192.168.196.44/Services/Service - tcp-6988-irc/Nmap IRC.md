```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/tcp_6988_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/xml/tcp_6988_irc_nmap.xml" -p 6988 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/tcp_6988_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/tcp_6988_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:59 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/tcp_6988_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6988/xml/tcp_6988_irc_nmap.xml" -p 6988 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:04 EST for 17s

PORT     STATE SERVICE REASON          VERSION
6988/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, LDAPBindReq, NULL, TerminalServerCookie, WMSRequest, afp: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6988-TCP:V=7.91%I=7%D=1/21%Time=61EAAF82%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSStatusRequestTCP,7B
SF:,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x
SF:20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this
SF:\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServerCookie,7B,"ER
SF:ROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20mo
SF:re\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20
SF:connect\x20class\x20\(local\)\]\r\n")%r(LDAPBindReq,7B,"ERROR\x20:Closi
SF:ng\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connect
SF:ions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cl
SF:ass\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:21 2022 -- 1 IP address (1 host up) scanned in 23.27 seconds

```
