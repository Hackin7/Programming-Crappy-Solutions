```bash
nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/root/autorecon/results/192.168.58.70/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp135/tcp_135_rpc_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp135/tcp_135_rpc_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:46:12 2022 as: nmap -vv --reason -Pn -T4 -sV -p 135 --script=banner,msrpc-enum,rpc-grind,rpcinfo -oN /root/autorecon/results/192.168.58.70/scans/tcp135/tcp_135_rpc_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp135/xml/tcp_135_rpc_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:46:15 +08 for 22s

PORT    STATE SERVICE REASON          VERSION
135/tcp open  msrpc   syn-ack ttl 127 Microsoft Windows RPC
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:46:37 2022 -- 1 IP address (1 host up) scanned in 25.58 seconds

```
