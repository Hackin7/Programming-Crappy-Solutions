```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/tcp_6784_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/xml/tcp_6784_irc_nmap.xml" -p 6784 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/tcp_6784_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/tcp_6784_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:06 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/tcp_6784_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6784/xml/tcp_6784_irc_nmap.xml" -p 6784 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:12 EST for 17s

PORT     STATE SERVICE  REASON          VERSION
6784/tcp open  bfd-lag? syn-ack ttl 127
| fingerprint-strings: 
|   DNSVersionBindReqTCP, GenericLines, JavaRMI, LDAPBindReq, LDAPSearchReq, NULL, NotesRPC, RPCCheck, giop: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6784-TCP:V=7.91%I=7%D=1/21%Time=61EAAF8A%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GenericLines,7B,"ERROR
SF:\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\
SF:x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20con
SF:nect\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20:Closing\x20
SF:link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x
SF:20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x2
SF:0\(local\)\]\r\n")%r(DNSVersionBindReqTCP,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(LDAPSearchReq,7B,"ERROR\x20:Closing\x20link:\x20\(unkn
SF:own@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fr
SF:om\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\
SF:n")%r(LDAPBindReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\
SF:.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x2
SF:0host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(NotesRP
SF:C,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[
SF:No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20
SF:this\x20connect\x20class\x20\(local\)\]\r\n")%r(JavaRMI,7B,"ERROR\x20:C
SF:losing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20con
SF:nections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x
SF:20class\x20\(local\)\]\r\n")%r(giop,7B,"ERROR\x20:Closing\x20link:\x20\
SF:(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\
SF:x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)
SF:\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:05:29 2022 -- 1 IP address (1 host up) scanned in 23.37 seconds

```
