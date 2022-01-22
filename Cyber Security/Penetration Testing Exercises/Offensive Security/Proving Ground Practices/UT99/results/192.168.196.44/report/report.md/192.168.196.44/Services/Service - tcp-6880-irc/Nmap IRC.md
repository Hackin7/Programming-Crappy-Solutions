```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/tcp_6880_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/xml/tcp_6880_irc_nmap.xml" -p 6880 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/tcp_6880_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/tcp_6880_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:58 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/tcp_6880_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6880/xml/tcp_6880_irc_nmap.xml" -p 6880 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:06:04 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6880/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, Help, NULL, TLSSessionReq, afp, giop, ms-sql-s, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6880-TCP:V=7.91%I=7%D=1/21%Time=61EAAFBE%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(Help,7B,"ERROR\x20:Clo
SF:sing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20conne
SF:ctions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20
SF:class\x20\(local\)\]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20lin
SF:k:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20a
SF:llowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(
SF:local\)\]\r\n")%r(FourOhFourRequest,7B,"ERROR\x20:Closing\x20link:\x20\
SF:(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\
SF:x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)
SF:\]\r\n")%r(oracle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.
SF:168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20you
SF:r\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(ms-
SF:sql-s,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x
SF:20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via
SF:\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x20:Closing\x20link:\x20\
SF:(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\
SF:x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)
SF:\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:22 2022 -- 1 IP address (1 host up) scanned in 24.26 seconds

```
