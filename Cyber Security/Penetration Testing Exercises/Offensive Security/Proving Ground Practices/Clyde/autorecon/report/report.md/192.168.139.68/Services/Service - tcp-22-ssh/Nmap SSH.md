```bash
nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.139.68
```

[/root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_nmap.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_nmap.txt):

```
# Nmap 7.92 scan initiated Sun Jan 30 17:02:59 2022 as: nmap -vv --reason -Pn -T4 -sV -p 22 --script=banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods -oN /root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_nmap.txt -oX /root/autorecon/results/192.168.139.68/scans/tcp22/xml/tcp_22_ssh_nmap.xml 192.168.139.68
Nmap scan report for 192.168.139.68
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-30 17:03:00 +08 for 8s

PORT   STATE SERVICE REASON         VERSION
22/tcp open  ssh     syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
|_banner: SSH-2.0-OpenSSH_7.4p1 Debian-10+deb9u7
| ssh-auth-methods: 
|   Supported authentication methods: 
|     publickey
|_    password
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
|       ssh-rsa
|       rsa-sha2-512
|       rsa-sha2-256
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
| ssh-hostkey: 
|   2048 df:63:99:a4:cf:79:00:c8:b1:d6:67:97:81:4d:4f:af (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCr/d1s9Q0w6n653cUossuwd+RzMkHkrS949i2W4XTYfr4AwaDRL7lY1m/2ivtq9BwDgiX89B8j8De8KCE8a3MHayMet3wkJ5qqEGOJHC6neK/m8PQFgqh2E4Rnkibj7GhL0VAB6pe3CX3krfyp5EPI3jOakGk4CABQPQhSNICkM3b9mg9Ygozh/+M/2hNeAfqFvruzmsWr3Lu8HbCqxT4edZFSAgD+QVTaaGwOIqd62PdoWrqPW/aHMEjlhUogNtKQf9KnrvItsNRdJ9XW2W43ON8CastlXe0+08qQCzDE5B6ZiJgaNKHGkfBtLwRMQI+d4O86h9KHuVlLDiO2a/ir
|   256 bd:9b:35:41:34:a2:5a:4c:fa:1b:9f:f1:36:f3:6a:fd (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBGpueXIR7Jzq4HWLhVFpJJPnh0pS2dUbQmQ8iMUKm2I+ZQe1on2TmBtGmEfflRS5fQq8Wvz5w79VQRvQFLmwXac=
|   256 db:96:ee:8d:29:2b:f4:a3:58:b2:fb:c1:ac:65:92:48 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIBqsvA0Cq307uCVNl2PINBX6HEkeisjNyUVOHdXQT5xt
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 30 17:03:08 2022 -- 1 IP address (1 host up) scanned in 9.97 seconds

```
