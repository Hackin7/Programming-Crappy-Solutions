```bash
nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.225.96
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/tcp_135_rpc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/tcp_135_rpc_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 09:34:36 2022 as: nmap -vv --reason -Pn -T4 -sV -p 135 --script=banner,msrpc-enum,rpc-grind,rpcinfo -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.225.96
Nmap scan report for 192.168.225.96
Host is up, received user-set (0.28s latency).
Scanned at 2022-01-16 09:34:38 EST for 23s

PORT    STATE SERVICE REASON          VERSION
135/tcp open  msrpc   syn-ack ttl 127 Microsoft Windows RPC
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 09:35:01 2022 -- 1 IP address (1 host up) scanned in 25.97 seconds

```