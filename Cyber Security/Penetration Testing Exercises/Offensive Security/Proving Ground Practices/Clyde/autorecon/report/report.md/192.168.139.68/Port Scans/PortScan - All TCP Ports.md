```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/root/autorecon/results/192.168.139.68/scans/_full_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/xml/_full_tcp_nmap.xml" 192.168.139.68
```

[/root/autorecon/results/192.168.139.68/scans/_full_tcp_nmap.txt](file:///root/autorecon/results/192.168.139.68/scans/_full_tcp_nmap.txt):

```
# Nmap 7.92 scan initiated Sun Jan 30 16:56:37 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /root/autorecon/results/192.168.139.68/scans/_full_tcp_nmap.txt -oX /root/autorecon/results/192.168.139.68/scans/xml/_full_tcp_nmap.xml 192.168.139.68
Nmap scan report for 192.168.139.68
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-30 16:56:38 +08 for 563s
Not shown: 65517 filtered tcp ports (no-response)
PORT      STATE  SERVICE     REASON         VERSION
21/tcp    open   ftp         syn-ack ttl 63 vsftpd 3.0.3
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 PackageKit
| drwxr-xr-x    5 ftp      ftp          4096 Apr 24  2020 apache2
| drwxr-xr-x    5 ftp      ftp          4096 Sep 21  2020 apt
| drwxr-xr-x    2 ftp      ftp          4096 Apr 22  2020 dbus
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 dhcp
| drwxr-xr-x    7 ftp      ftp          4096 Sep 21  2020 dpkg
| drwxr-xr-x    2 ftp      ftp          4096 Apr 20  2020 git
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 initramfs-tools
| drwxr-xr-x    2 ftp      ftp          4096 May 07  2020 logrotate
| drwxr-xr-x    2 ftp      ftp          4096 Sep 08  2019 misc
| drwxr-xr-x    5 ftp      ftp          4096 Mar 10  2021 mysql
| drwxr-xr-x    2 ftp      ftp          4096 Jul 13  2017 os-prober
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 pam
| drwxr-xr-x    4 ftp      ftp          4096 Apr 24  2020 php
| drwx------    3 ftp      ftp          4096 Apr 24  2020 polkit-1
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 python
| drwxr-xr-x    3 ftp      ftp          4096 May 08  2020 rabbitmq
| drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 sgml-base
| drwxr-xr-x    6 ftp      ftp          4096 Apr 22  2020 systemd
| drwxr-xr-x    3 ftp      ftp          4096 Apr 30  2020 ucf
| drwxr-xr-x    3 ftp      ftp          4096 Apr 22  2020 vim
| drwxr-xr-x    3 ftp      ftp          4096 Apr 24  2020 vmware
|_drwxr-xr-x    2 ftp      ftp          4096 Apr 24  2020 xml-core
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.139
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 1
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
22/tcp    open   ssh         syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
| ssh-hostkey: 
|   2048 df:63:99:a4:cf:79:00:c8:b1:d6:67:97:81:4d:4f:af (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCr/d1s9Q0w6n653cUossuwd+RzMkHkrS949i2W4XTYfr4AwaDRL7lY1m/2ivtq9BwDgiX89B8j8De8KCE8a3MHayMet3wkJ5qqEGOJHC6neK/m8PQFgqh2E4Rnkibj7GhL0VAB6pe3CX3krfyp5EPI3jOakGk4CABQPQhSNICkM3b9mg9Ygozh/+M/2hNeAfqFvruzmsWr3Lu8HbCqxT4edZFSAgD+QVTaaGwOIqd62PdoWrqPW/aHMEjlhUogNtKQf9KnrvItsNRdJ9XW2W43ON8CastlXe0+08qQCzDE5B6ZiJgaNKHGkfBtLwRMQI+d4O86h9KHuVlLDiO2a/ir
|   256 bd:9b:35:41:34:a2:5a:4c:fa:1b:9f:f1:36:f3:6a:fd (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBGpueXIR7Jzq4HWLhVFpJJPnh0pS2dUbQmQ8iMUKm2I+ZQe1on2TmBtGmEfflRS5fQq8Wvz5w79VQRvQFLmwXac=
|   256 db:96:ee:8d:29:2b:f4:a3:58:b2:fb:c1:ac:65:92:48 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIBqsvA0Cq307uCVNl2PINBX6HEkeisjNyUVOHdXQT5xt
53/tcp    closed domain      reset ttl 63
80/tcp    open   http        syn-ack ttl 63 Apache httpd 2.4.25 ((Debian))
|_http-title: Apache2 Debian Default Page: It works
| http-methods: 
|_  Supported Methods: HEAD GET POST OPTIONS
|_http-server-header: Apache/2.4.25 (Debian)
4369/tcp  open   epmd        syn-ack ttl 63 Erlang Port Mapper Daemon
| epmd-info: 
|   epmd_port: 4369
|   nodes: 
|_    rabbit: 65000
15672/tcp open   http        syn-ack ttl 63 Cowboy httpd
| http-methods: 
|_  Supported Methods: HEAD GET OPTIONS
|_http-favicon: Unknown favicon MD5: DDC75B0899DBF4F7B15290A77FBEB8FF
|_http-title: RabbitMQ Management
|_http-server-header: Cowboy
40000/tcp closed safetynetp  reset ttl 63
40001/tcp closed unknown     reset ttl 63
40002/tcp closed unknown     reset ttl 63
40003/tcp closed unknown     reset ttl 63
40004/tcp closed unknown     reset ttl 63
40005/tcp closed unknown     reset ttl 63
40006/tcp closed unknown     reset ttl 63
40007/tcp closed unknown     reset ttl 63
40008/tcp closed unknown     reset ttl 63
40009/tcp closed unknown     reset ttl 63
40010/tcp closed unknown     reset ttl 63
65000/tcp open   erlang-node syn-ack ttl 63 Erlang Distribution Node (Node name: rabbit@clyd)
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 4.4 (93%), Linux 3.16 (90%), Linux 3.13 (90%), Linux 3.10 - 3.16 (88%), Linux 2.6.32 (88%), Linux 3.2 - 3.8 (88%), Linux 3.8 (88%), WatchGuard Fireware 11.8 (88%), Kyocera CopyStar CS-2560 printer (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/30%OT=21%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F654F9%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=108%TI=Z%II=I%TS=8)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.006 days (since Sun Jan 30 16:56:55 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   252.40 ms 192.168.49.1
2   252.42 ms 192.168.139.68

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 30 17:06:01 2022 -- 1 IP address (1 host up) scanned in 564.42 seconds

```
