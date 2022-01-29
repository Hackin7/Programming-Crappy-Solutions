```bash
nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.234.55
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/tcp_135_rpc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/tcp_135_rpc_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Jan 24 09:38:24 2022 as: nmap -vv --reason -Pn -T4 -sV -p 135 --script=banner,msrpc-enum,rpc-grind,rpcinfo -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.234.55
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-24 09:38:27 EST for 23s

PORT    STATE SERVICE REASON          VERSION
135/tcp open  msrpc   syn-ack ttl 127 Microsoft Windows RPC
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 24 09:38:50 2022 -- 1 IP address (1 host up) scanned in 26.09 seconds

```
