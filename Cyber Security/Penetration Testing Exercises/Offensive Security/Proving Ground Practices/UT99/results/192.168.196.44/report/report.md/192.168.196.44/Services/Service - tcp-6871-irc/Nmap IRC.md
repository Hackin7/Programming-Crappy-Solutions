```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/tcp_6871_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/xml/tcp_6871_irc_nmap.xml" -p 6871 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/tcp_6871_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/tcp_6871_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:05:54 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/tcp_6871_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6871/xml/tcp_6871_irc_nmap.xml" -p 6871 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:05:58 EST for 18s

PORT     STATE SERVICE REASON          VERSION
6871/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   Kerberos, NULL, NotesRPC, RPCCheck, X11Probe, afp, oracle-tns: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6871-TCP:V=7.91%I=7%D=1/21%Time=61EAAFB8%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(X11Probe,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@1
SF:92\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x2
SF:0your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r
SF:(NotesRPC,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196
SF:\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x2
SF:0via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(oracle-tns,7B,"
SF:ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20
SF:more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x
SF:20connect\x20class\x20\(local\)\]\r\n")%r(afp,7B,"ERROR\x20:Closing\x20
SF:link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x
SF:20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x2
SF:0\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:16 2022 -- 1 IP address (1 host up) scanned in 23.35 seconds

```