# Shifty

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Mon Jan 31 05:22:36 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shifty/results/192.168.177.59/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shifty/results/192.168.177.59/scans/xml/_full_tcp_nmap.xml" 192.168.177.59
adjust_timeouts2: packet supposedly had rtt of -263184 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -263184 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -262438 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -262438 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -763621 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -763621 microseconds.  Ignoring time.
Nmap scan report for 192.168.177.59
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-31 05:22:37 EST for 278s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT      STATE  SERVICE   REASON         VERSION
22/tcp    open   ssh       syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
| ssh-hostkey: 
|   2048 54:d8:d1:1a:e4:8c:66:48:37:ba:89:0a:9b:aa:db:47 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDSh58OLDmEhil0VmRkmNcijtg4KD/oQ4nP9I7PoS4uoangXCXpjJhuzsZJdKodqIRnp3G33o9HaRvx7LtIMPwl3cGcFNIDR9v+PDhDPgMKyRRJ48kdu3q0krzOWRvYnUEyLYjqDfb8VwBemuFA+gefLrMZLrLhhvArOG69zSCAOwKIC8MpQb+btXjU8c3QM6zKMX4XiEE5MM+TihshX/kJT8GgpJxzc+kXPuRgUkP5dgfQjgSsGos7UdHIGTStL4G2u9gXRj2KvamLZrWugN7onR1oMikWnbIki2OY6q4yn7aRo4RcXh4D9a+/L57R8oekVN4WEdGld2OBLzGCNQ89
|   256 fb:75:84:86:ec:b5:00:f3:4f:cb:c8:f2:18:85:42:b7 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBMTUc/WfFpP13Cs+MfoVp8EAwjODshXOpOBYCLG/SrFn5k1xSZVmqM3BVE/Dm2/AMOQGSmYzhMwUOj3rYuwnhWE=
|   256 2f:fd:b2:b1:6c:02:e8:a0:ba:e7:f7:52:80:3f:de:a3 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIAoY388QpNieLBhyB714K9LnjTUPfbgw4bfpGgdMBT0c
53/tcp    closed domain    reset ttl 63
80/tcp    open   http      syn-ack ttl 63 nginx 1.10.3
|_http-generator: Gatsby 2.22.15
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.10.3
|_http-title: Gatsby + Netlify CMS Starter
5000/tcp  open   http      syn-ack ttl 63 Werkzeug httpd 1.0.1 (Python 3.5.3)
| http-methods: 
|_  Supported Methods: HEAD OPTIONS GET
|_http-server-header: Werkzeug/1.0.1 Python/3.5.3
|_http-title: Hello, world!
11211/tcp open   memcached syn-ack ttl 63 Memcached 1.4.33 (uptime 13213 seconds)
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 4.4 (93%), Linux 3.16 (91%), Linux 3.13 (89%), Linux 2.6.32 (87%), Linux 3.2 - 3.8 (87%), Linux 3.8 (87%), WatchGuard Fireware 11.8 (87%), Linux 3.10 - 3.16 (87%), IPFire 2.11 firewall (Linux 2.6.32) (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/31%OT=22%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F7B983%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=109%TI=Z%TS=8)
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

Uptime guess: 0.151 days (since Mon Jan 31 01:50:00 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=257 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   251.25 ms 192.168.49.1
2   251.58 ms 192.168.177.59

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 31 05:27:15 2022 -- 1 IP address (1 host up) scanned in 278.89 seconds
```

## 80 - Web

![](Pasted%20image%2020220205180400.png)

## 5000 - Web Python

![](Pasted%20image%2020220205180418.png)


## 11211 - Memcached

```
┌──(kali㉿kali)-[/tmp/PadBuster]
└─$ memcstat --servers=192.168.121.59
Server: 192.168.121.59 (11211)
         pid: 522
         uptime: 618
         time: 1627308004
         version: 1.4.33
         libevent: 2.0.21-stable
         pointer_size: 64
         rusage_user: 0.048000
         rusage_system: 0.048000
         curr_connections: 1
         total_connections: 4
         connection_structures: 2
         reserved_fds: 20
         cmd_get: 1
         cmd_set: 2
         cmd_flush: 0
         cmd_touch: 0
         get_hits: 1
         get_misses: 0
         get_expired: 0
         get_flushed: 0
         delete_misses: 0
         delete_hits: 0
         incr_misses: 0
         incr_hits: 0
         decr_misses: 0
         decr_hits: 0
         cas_misses: 0
         cas_hits: 0
         cas_badval: 0
         touch_hits: 0
         touch_misses: 0
         auth_cmds: 0
         auth_errors: 0
         bytes_read: 257
         bytes_written: 122
         limit_maxbytes: 67108864
         accepting_conns: 1
         listen_disabled_num: 0
         time_in_listen_disabled_us: 0
         threads: 4
         conn_yields: 0
         hash_power_level: 16
         hash_bytes: 524288
         hash_is_expanding: 0
         malloc_fails: 0
         log_worker_dropped: 0
         log_worker_written: 0
         log_watcher_skipped: 0
         log_watcher_sent: 0
         bytes: 136
         curr_items: 1
         total_items: 2
         expired_unfetched: 0
         evicted_unfetched: 0
         evictions: 0
         reclaimed: 0
         crawler_reclaimed: 0
         crawler_items_checked: 0
         lrutail_reflocked: 0
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PadBuster]
└─$ memcdump --servers=192.168.121.59
session:d1374ac1-47e1-4d04-955c-03b3ded34e8c
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PadBuster]
└─$ memccat --servers=192.168.121.59  session:d1374ac1-47e1-4d04-955c-03b3ded34e8c                                                                                  1 ⨯
(dp0
V_permanent
p1
I01
s.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PadBuster]
└─$ 
  
```

# Exploitation

# Privesc

# Others
