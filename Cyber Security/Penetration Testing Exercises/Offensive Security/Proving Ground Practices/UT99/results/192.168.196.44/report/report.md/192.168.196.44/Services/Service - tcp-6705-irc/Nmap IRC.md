```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/tcp_6705_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/xml/tcp_6705_irc_nmap.xml" -p 6705 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/tcp_6705_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/tcp_6705_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:03:47 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/tcp_6705_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6705/xml/tcp_6705_irc_nmap.xml" -p 6705 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:03:53 EST for 36s

PORT     STATE SERVICE REASON          VERSION
6705/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   FourOhFourRequest, LPDString, NULL, SIPOptions, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6705-TCP:V=7.91%I=7%D=1/21%Time=61EAAF3D%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(FourOhFourRequest,7B,"
SF:ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20
SF:more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x
SF:20connect\x20class\x20\(local\)\]\r\n")%r(LPDString,7B,"ERROR\x20:Closi
SF:ng\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connect
SF:ions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cl
SF:ass\x20\(local\)\]\r\n")%r(SIPOptions,7B,"ERROR\x20:Closing\x20link:\x2
SF:0\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowe
SF:d\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local
SF:\)\]\r\n")%r(oracle-tns,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192
SF:\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20y
SF:our\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:04:29 2022 -- 1 IP address (1 host up) scanned in 42.55 seconds

```
