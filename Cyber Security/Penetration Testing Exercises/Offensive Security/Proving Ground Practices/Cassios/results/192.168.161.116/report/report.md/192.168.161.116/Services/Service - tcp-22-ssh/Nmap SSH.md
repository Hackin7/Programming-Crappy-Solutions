```bash
nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/tcp_22_ssh_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/tcp_22_ssh_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:53:03 2022 as: nmap -vv --reason -Pn -T4 -sV -p 22 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.161.116
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 10:53:05 EST for 8s

PORT   STATE SERVICE REASON         VERSION
22/tcp open  ssh     syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
|_banner: SSH-2.0-OpenSSH_7.4
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|     gssapi-keyex
|     gssapi-with-mic
|_    password
| ssh-hostkey: 
|   2048 36:cd:06:f8:11:72:6b:29:d8:d8:86:99:00:6b:1d:3a (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDQjISDfZJSrhxHPJNdFOaYN/6v9xvTQ0nvVxY3PC93qraoFeHMiwAYDxzcaY47E965uLcjgBfqicRVIziukrnVDn9R14LZmq74kbAmaf6PcOyjL3iN9uQWE/7umx3rG98dVugfW9SzuHgorDE7anOV8ewsepOSx61qnb0p/p2IID7ExFXgh8UqtMAD1viVHdvOhHFZL4BbzVj57LBaRvEDC2lx8mSvwxRmJyw7Jqm3+S640y6pet4QgLSrWdQt8nh/dW/U9HPkwfqrytd7tdnIRhuR/L+E6H8rKycI/y012pdIlE+wtNY2xgjGm0mQfmVH1sDEN/OGVw7TdH6BEc9x
|   256 7d:12:27:de:dd:4e:8e:88:48:ef:e3:e0:b2:13:42:a1 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBC08uXC/2TmrLqWbD0sPKxdflt2pC5fpX9UHyK0G3f/HMGwFQQlpjuBnK8F8piwnSjXyDHRSFGa/bGXi9n3gIf0=
|   256 c4:db:d3:61:af:85:95:0e:59:77:c5:9e:07:0b:2f:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMWphiQ1WtEPUDgeKuwnZ018EFPqR/4MiEj85mmMdGvk
| ssh2-enum-algos: 
|   kex_algorithms: (12)
|       curve25519-sha256
|       curve25519-sha256@libssh.org
|       ecdh-sha2-nistp256
|       ecdh-sha2-nistp384
|       ecdh-sha2-nistp521
|       diffie-hellman-group-exchange-sha256
|       diffie-hellman-group16-sha512
|       diffie-hellman-group18-sha512
|       diffie-hellman-group-exchange-sha1
|       diffie-hellman-group14-sha256
|       diffie-hellman-group14-sha1
|       diffie-hellman-group1-sha1
|   server_host_key_algorithms: (5)
|       ssh-rsa
|       rsa-sha2-512
|       rsa-sha2-256
|       ecdsa-sha2-nistp256
|       ssh-ed25519
|   encryption_algorithms: (12)
|       chacha20-poly1305@openssh.com
|       aes128-ctr
|       aes192-ctr
|       aes256-ctr
|       aes128-gcm@openssh.com
|       aes256-gcm@openssh.com
|       aes128-cbc
|       aes192-cbc
|       aes256-cbc
|       blowfish-cbc
|       cast128-cbc
|       3des-cbc
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

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:53:13 2022 -- 1 IP address (1 host up) scanned in 10.39 seconds

```