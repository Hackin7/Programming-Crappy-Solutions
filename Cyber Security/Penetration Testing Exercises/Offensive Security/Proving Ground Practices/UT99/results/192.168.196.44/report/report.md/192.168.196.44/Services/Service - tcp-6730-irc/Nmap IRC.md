```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/tcp_6730_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/xml/tcp_6730_irc_nmap.xml" -p 6730 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/tcp_6730_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/tcp_6730_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:04:02 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/tcp_6730_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6730/xml/tcp_6730_irc_nmap.xml" -p 6730 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:04:12 EST for 36s

PORT     STATE SERVICE REASON          VERSION
6730/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, GetRequest, Kerberos, LDAPBindReq, NCP, NULL, RPCCheck, SMBProgNeg, TLSSessionReq, TerminalServer: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6730-TCP:V=7.91%I=7%D=1/21%Time=61EAAF5D%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(GetRequest,7B,"ERROR\x
SF:20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x2
SF:0connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20conne
SF:ct\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20:Closing\x20li
SF:nk:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20
SF:allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\
SF:(local\)\]\r\n")%r(DNSVersionBindReqTCP,7B,"ERROR\x20:Closing\x20link:\
SF:x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allo
SF:wed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(loc
SF:al\)\]\r\n")%r(DNSStatusRequestTCP,7B,"ERROR\x20:Closing\x20link:\x20\(
SF:unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x
SF:20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\
SF:]\r\n")%r(TLSSessionReq,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192
SF:\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20y
SF:our\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(K
SF:erberos,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)
SF:\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20v
SF:ia\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(SMBProgNeg,7B,"ER
SF:ROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20mo
SF:re\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20
SF:connect\x20class\x20\(local\)\]\r\n")%r(LDAPBindReq,7B,"ERROR\x20:Closi
SF:ng\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connect
SF:ions\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20cl
SF:ass\x20\(local\)\]\r\n")%r(TerminalServer,7B,"ERROR\x20:Closing\x20link
SF::\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20al
SF:lowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(l
SF:ocal\)\]\r\n")%r(NCP,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.1
SF:68\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your
SF:\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:04:48 2022 -- 1 IP address (1 host up) scanned in 47.83 seconds

```
