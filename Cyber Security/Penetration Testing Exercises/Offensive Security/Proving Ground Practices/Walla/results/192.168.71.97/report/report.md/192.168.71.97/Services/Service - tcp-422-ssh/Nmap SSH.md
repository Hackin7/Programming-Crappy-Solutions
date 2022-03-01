```bash
nmap -vv --reason -Pn -T4 -sV -p 422 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/tcp_422_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/xml/tcp_422_ssh_nmap.xml" 192.168.71.97
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/tcp_422_ssh_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/tcp_422_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 27 12:01:54 2022 as: nmap -vv --reason -Pn -T4 -sV -p 422 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/tcp_422_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/xml/tcp_422_ssh_nmap.xml" 192.168.71.97
Nmap scan report for 192.168.71.97
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-27 12:01:57 EST for 7s

PORT    STATE SERVICE REASON         VERSION
422/tcp open  ssh     syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
|_banner: SSH-2.0-OpenSSH_7.9p1 Debian-10+deb10u2
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|_    password
| ssh-hostkey: 
|   2048 02:71:5d:c8:b9:43:ba:6a:c8:ed:15:c5:6c:b2:f5:f9 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtTTLmNtp3zqxLNrL/geNhp8WLkauSPqJ7WY9404pchYQN7BUkpOeUGRNUAtrmwQ02tSIcXSIgaMkP9QYkcgpJ3LgukIrX8aICoFPX8n1PEgZhEryhHomgcWL99ER4uTm9+CXuG3plBp7fgNtacHGGG9tlIn9DqcWwRcsB0WuzZwOT8n0PEwggyMKmhA4LuKKn1933nCCgVFIJ1NLfr9fM+VA3ZwVB7IcPEMrXPRo9q3lZLJtB69biTSnNROXB1pf50LFUUOnuAQwBG+4Md5TK+zbuGuCtf6zB69b+th+XSiGAIO6USodt3DfTo6Vr9ZUEtQykoI2wVJ2ZkeTqzqD3
|   256 f3:e5:10:d4:16:a9:9e:03:47:38:ba:ac:18:24:53:28 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKTe9nM9KOPFzCX46nVw5gPZi8A4pUJ54B+rw0ehE0PlTNyoAuHTnFwZNLsSPI2yXIve0UqQgs4PYXqhht5nc9A=
|   256 02:4f:99:ec:85:6d:79:43:88:b2:b5:7c:f0:91:fe:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIO2CS9VQ1hSSMPudUXJYiFxw7cD92ImmSovNLtyyGSGu
| ssh2-enum-algos: 
|   kex_algorithms: (10)
|       curve25519-sha256
|       curve25519-sha256@libssh.org
|       ecdh-sha2-nistp256
|       ecdh-sha2-nistp384
|       ecdh-sha2-nistp521
|       diffie-hellman-group-exchange-sha256
|       diffie-hellman-group16-sha512
|       diffie-hellman-group18-sha512
|       diffie-hellman-group14-sha256
|       diffie-hellman-group14-sha1
|   server_host_key_algorithms: (5)
|       rsa-sha2-512
|       rsa-sha2-256
|       ssh-rsa
|       ecdsa-sha2-nistp256
|       ssh-ed25519
|   encryption_algorithms: (6)
|       chacha20-poly1305@openssh.com
|       aes128-ctr
|       aes192-ctr
|       aes256-ctr
|       aes128-gcm@openssh.com
|       aes256-gcm@openssh.com
|   mac_algorithms: (10)
|       umac-64-etm@openssh.com
|       umac-128-etm@openssh.com
|       hmac-sha2-256-etm@openssh.com
|       hmac-sha2-512-etm@openssh.com
|       hmac-sha1-etm@openssh.com
|       umac-64@openssh.com
|       umac-128@openssh.com
|       hmac-sha2-256
|       hmac-sha2-512
|       hmac-sha1
|   compression_algorithms: (2)
|       none
|_      zlib@openssh.com
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 12:02:04 2022 -- 1 IP address (1 host up) scanned in 9.62 seconds

```
