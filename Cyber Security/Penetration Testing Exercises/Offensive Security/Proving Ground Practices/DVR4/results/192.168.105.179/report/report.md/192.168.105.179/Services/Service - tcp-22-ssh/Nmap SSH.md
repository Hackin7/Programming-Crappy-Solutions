```bash
nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.105.179
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/tcp_22_ssh_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/tcp_22_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Feb 17 05:07:49 2022 as: nmap -vv --reason -Pn -T4 -sV -p 22 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.105.179
Nmap scan report for 192.168.105.179
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-17 05:07:49 EST for 32s

PORT   STATE SERVICE REASON          VERSION
22/tcp open  ssh     syn-ack ttl 127 Bitvise WinSSHD 8.48 (FlowSsh 8.48; protocol 2.0; non-commercial use)
| banner: SSH-2.0-8.48 FlowSsh: Bitvise SSH Server (WinSSHD) 8.48: free o
|_nly for personal non-commercial use
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|     keyboard-interactive
|_    password
| ssh-hostkey: 
|   3072 21:25:f0:53:b4:99:0f:34:de:2d:ca:bc:5d:fe:20:ce (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCsljcHdJN7STx92SFZR/dtzDsO0v1blAoUfqWva1WJD9WXeKe0S9Oeg4L1eXC6ik5O6+lE7SRqz7Qiudrhk9CXxB0tmmX2SpZKMg1l01wmO5QEhpeuhDOb062dCDc1byOkpbBJq93afwVOEiaCOMVVjnwvJ5MFmZQzBcb02rmHKH7+o2BjMukTA8coWhCc2cqyEgPA031zSYCkdzxLlgHJMUlbDDtD0D143rLPZ6CtP5Nbxpbt/2Hj3thq7GQzToNdgCYCEIMg6Gs4xYHLO4lKcOb92wFdEtx+hA7xFxGOldfmEU4f3jyDSFazolJU4TxzewQ/kIi1W4Cj+tarEVTC6sBUAhHZSLAj5nkz7rljJIXiM8hYp6VMcpsqa1dtlwspeiFXL2RizuQgUzabzsQGmZ0Yu501ieYy1i7mIEWzO2UUx3tnCn9YKAh30jYQQvXYB+oUGuQqDIQh1f0Ds/Jd1IkFMJ8EZQ8Iaoa1UVpxupdZ8jtBm3BKT5+sVtJ4jwE=
|   384 e7:96:f3:6a:d8:92:07:5a:bf:37:06:86:0a:31:73:19 (ECDSA)
|_ecdsa-sha2-nistp384 AAAAE2VjZHNhLXNoYTItbmlzdHAzODQAAAAIbmlzdHAzODQAAABhBEqSs/ONYXuZGcGBUkLstnAWRP6wNsuJz6yUtmYymbBUobb797y3tkgWkCUhaDsB3z8XzhgoyCXS6MuXqF3FmiapitvPj1ig5TnVnHRvzuB2beKi/cH2XBduyaaKO6AORg==
| ssh2-enum-algos: 
|   kex_algorithms: (12)
|       curve25519-sha256
|       curve25519-sha256@libssh.org
|       ecdh-sha2-1.3.132.0.10
|       ecdh-sha2-nistp256
|       ecdh-sha2-nistp384
|       ecdh-sha2-nistp521
|       diffie-hellman-group-exchange-sha256
|       diffie-hellman-group-exchange-sha1
|       diffie-hellman-group15-sha512
|       diffie-hellman-group14-sha256
|       diffie-hellman-group14-sha1
|       ext-info-s
|   server_host_key_algorithms: (4)
|       rsa-sha2-512
|       rsa-sha2-256
|       ssh-rsa
|       ecdsa-sha2-nistp384
|   encryption_algorithms: (5)
|       aes256-gcm@openssh.com
|       aes128-gcm@openssh.com
|       aes256-ctr
|       aes192-ctr
|       aes128-ctr
|   mac_algorithms: (2)
|       hmac-sha2-256
|       hmac-sha1
|   compression_algorithms: (2)
|       zlib
|_      none
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 05:08:21 2022 -- 1 IP address (1 host up) scanned in 32.12 seconds

```
