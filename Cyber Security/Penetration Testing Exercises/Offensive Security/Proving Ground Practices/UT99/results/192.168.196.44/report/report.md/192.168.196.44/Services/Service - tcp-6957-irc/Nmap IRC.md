```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/tcp_6957_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/xml/tcp_6957_irc_nmap.xml" -p 6957 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/tcp_6957_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/tcp_6957_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:06:29 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/tcp_6957_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6957/xml/tcp_6957_irc_nmap.xml" -p 6957 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.28s latency).
Scanned at 2022-01-21 08:06:33 EST for 21s

PORT     STATE SERVICE REASON          VERSION
6957/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, NULL, TerminalServerCookie, giop, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6957-TCP:V=7.91%I=7%D=1/21%Time=61EAAFDC%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7
SF:B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\
SF:x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20thi
SF:s\x20connect\x20class\x20\(local\)\]\r\n")%r(TerminalServerCookie,7B,"E
SF:RROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20m
SF:ore\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x2
SF:0connect\x20class\x20\(local\)\]\r\n")%r(oracle-tns,7B,"ERROR\x20:Closi
SF:ng\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connect
SF:ions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cl
SF:ass\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x20:Closing\x20link:\x20\(unk
SF:nown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20f
SF:rom\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r
SF:\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:54 2022 -- 1 IP address (1 host up) scanned in 26.30 seconds

```