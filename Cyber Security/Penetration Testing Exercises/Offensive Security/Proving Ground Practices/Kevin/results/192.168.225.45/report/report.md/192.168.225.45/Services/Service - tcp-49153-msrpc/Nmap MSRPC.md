```bash
nmap -vv --reason -Pn -T4 -sV -p 49153 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/xml/tcp_49153_rpc_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:11:04 2022 as: nmap -vv --reason -Pn -T4 -sV -p 49153 --script=banner,msrpc-enum,rpc-grind,rpcinfo -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/xml/tcp_49153_rpc_nmap.xml" 192.168.225.45
Nmap scan report for 192.168.225.45
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-16 08:11:11 EST for 80s

PORT      STATE SERVICE REASON          VERSION
49153/tcp open  msrpc   syn-ack ttl 127 Microsoft Windows RPC
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:12:31 2022 -- 1 IP address (1 host up) scanned in 87.77 seconds

```
