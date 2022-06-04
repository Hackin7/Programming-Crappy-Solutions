```bash
nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/tcp_6707_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/xml/tcp_6707_irc_nmap.xml" -p 6707 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/tcp_6707_irc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/tcp_6707_irc_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 08:03:48 2022 as: nmap -vv --reason -Pn -T4 -sV --script irc-botnet-channels,irc-info,irc-unrealircd-backdoor -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/tcp_6707_irc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp6707/xml/tcp_6707_irc_nmap.xml" -p 6707 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 08:03:53 EST for 36s

PORT     STATE SERVICE REASON          VERSION
6707/tcp open  unknown syn-ack ttl 127
| fingerprint-strings: 
|   Kerberos, LANDesk-RC, LPDString, NULL, RPCCheck, SMBProgNeg, SSLSessionReq, WMSRequest: 
|_    ERROR :Closing link: (unknown@192.168.49.196) [No more connections allowed from your host via this connect class (local)]
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port6707-TCP:V=7.91%I=7%D=1/21%Time=61EAAF3D%P=x86_64-pc-linux-gnu%r(NU
SF:LL,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\
SF:[No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x2
SF:0this\x20connect\x20class\x20\(local\)\]\r\n")%r(RPCCheck,7B,"ERROR\x20
SF::Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20c
SF:onnections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect
SF:\x20class\x20\(local\)\]\r\n")%r(SSLSessionReq,7B,"ERROR\x20:Closing\x2
SF:0link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\
SF:x20allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x
SF:20\(local\)\]\r\n")%r(Kerberos,7B,"ERROR\x20:Closing\x20link:\x20\(unkn
SF:own@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20fr
SF:om\x20your\x20host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\
SF:n")%r(SMBProgNeg,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.
SF:49\.196\)\x20\[No\x20more\x20connections\x20allowed\x20from\x20your\x20
SF:host\x20via\x20this\x20connect\x20class\x20\(local\)\]\r\n")%r(LPDStrin
SF:g,7B,"ERROR\x20:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[
SF:No\x20more\x20connections\x20allowed\x20from\x20your\x20host\x20via\x20
SF:this\x20connect\x20class\x20\(local\)\]\r\n")%r(LANDesk-RC,7B,"ERROR\x2
SF:0:Closing\x20link:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20
SF:connections\x20allowed\x20from\x20your\x20host\x20via\x20this\x20connec
SF:t\x20class\x20\(local\)\]\r\n")%r(WMSRequest,7B,"ERROR\x20:Closing\x20l
SF:ink:\x20\(unknown@192\.168\.49\.196\)\x20\[No\x20more\x20connections\x2
SF:0allowed\x20from\x20your\x20host\x20via\x20this\x20connect\x20class\x20
SF:\(local\)\]\r\n");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:04:30 2022 -- 1 IP address (1 host up) scanned in 42.41 seconds

```