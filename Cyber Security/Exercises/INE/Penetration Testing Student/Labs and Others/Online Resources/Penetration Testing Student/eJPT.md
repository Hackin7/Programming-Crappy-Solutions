eJPT

# Rules of Engagement

The network contains production services so you are allowed to run brute
force login attacks and vulnerability scanners on hosts connected to the
internal network only (to avoid Denial of Service on production
services).
 - Can bruteforce FTP Server only in internal network

# What the questions are asking

1. (DONE) How many routers there are in the internal network?
    1. 1-4 -> Maximum 4 internal networks
    1. Only 1 router in internal network (192.168.193.85)
2. (UNCONFIRMED) How many networks can you reach within client's network?
	1. 1 -> false
	2. 2 (`10.85.174.0/24` and `10.86.74.0/24`)
	3. 3
	4. 4
	5. Would be wrong if I missed out some part of enumeration
3. (DONE) What brand of speakers does the studio use?
    1. Yamaha
    2. Atomic
    3. Matrix
    4. (ANS) Dynaudio <- `Presonus Centralstation + CSR-1
    Dynaudio BM15A`
4. (DONE) Did Robert J. Rock start Motville studios?
    1. Yes
5. (DONE) Is Motville hiring?
    1. Yes
6. (DONE) What is the password for the old backend database of the site?
	1.  6cj6u15VvaigJpwLV3CPjOySL (According to `config.old`)
	2.  u5BfTzwTUDoYjjugvID25JdiO
	3.  STN7myjJYRuHKUZthPHq83ZSa
	4.  vKmdvcSKf0Lpypi1ePDsouVN6
8. (DONE) What is the IP address of the old backend database of the site?
    1. 10.86.74.186
    2. 10.86.74.188 (According to `config.old`)
    3. 10.86.74.190
    4. 10.86.74.192
9. (DONE) [multi] Which of the following php scripts are included in the website pages?
    1. menu.php (According to `include/`)
    2. functions.php
    3. sidebar.php (According to `include/`)
    4. footer.php (According to `include/`)
10. (DONE) Is the site developed by ITForMusicians?
	1. Yes
11. (DONE) Which of the following file names exists on a machine?
    1. C:\routersconfiguration.txt  (192.168.193.212)
    2. C:\switchesconfiguration.txt
    3. C:\serversconfiguration.txt
    4. C:\printersconfiguration.txt
12.  (LIKELY) [multi] Which of the following are valid Windows account names (in the networks in scope)?
    1. jessica (192.168.170.211)
    2. patty
    3. will
    4. kirk (192.168.170.211)
12. (LIKELY) What is the maximum Windows password age?
	1. `Maximum password age: 32 days 2 minutes`  -> 32 days according to 192.168.193.211 enum
	2. Would be wrong if 192.168.193.212 also has
15. (DONE) There is a machine with three hard drives. What are their letters?
    1. C, D, E
    2. C, K, W
    3. C, M, Y (192.168.193.211)
    4. C, W, Z
16. (DONE) What is the password of the local user "jeffmoore" on the FTP server?
	1. `butterfly        (jeffmoore)`
18. (DONE) What is the password of the local user "jamessmith" on the FTP server?
	1. `please           (jamessmith)`
20. (DONE) What is the password of the local user "sandrataylor" on the FTP server?
	1. `daisy1           (sandrataylor)`
22. How many network nodes can nmap detect (do not count your own computer)?
    1. 1 -> Confirm Wrong
    2. 10 (5 internal, 2 + 1)
    3. 11
    4. 19
23. (UNCONFIRMED) How many nodes are connected to the internal network (do not count your own computer)?
    1. 3 -> Confirmed false
    2. 4 (4, 14, 211, 212 are valid) -> False
    3. 5 (Do I include 85 -> yes)
    4. 6 (Do I include 85 and 74? -> false, cannot ping 74)
    5. [https://afteracademy.com/blog/What-is-a-network-and-what-are-the-nodes-present-in-a-network] 
        1. Each device on a network that has a unique logical or IP (Internet Protocol) address can also be termed as a node
24. (DONE) Which of the following IP addresses belongs to a Windows machine?
    1. 192.168.193.4 -> FreeBSD
    2. 192.168.193.14 -> Unix
    3. 192.168.193.85 -> Router
    4. (ANS) 192.168.193.211 -> It has port 445 open, which is SMB
25. (DONE) What is the address of the internal network?
    1. From connecting to the VPN, it is `192.168.193.70/24` -> `192.168.193.0/24`

# Internal Network

Scan for devices, then nmapped

## 4

Nessus enum reveals 
1. NTP Server on port 123

## 14

Nessus enum reveals ProFTPD 1.3.5 Mod_Copy Command Execution, can use metasploit
- turns out to be useless since needs web host lol

FTP connection of jeffmoore fails (with the answer passwords), suggesting that there is another FTP server(s)
Used Hydra and Wordlist to crack into ftp as `[21][ftp] host: 192.168.193.14   login: root   password: metallica`

Downloaded files and displayed them, revealing
1. Other Networks? (Doesn't really work)
  1. `199.193.119.90  lamp.local.lan  lamp`
  2. `dns-search local.lan`, `dns-nameservers 192.168.123.1` 

Realised quite late that can traverse into back dir, so did that, extracted `shadow` and `passwd` file. Got the passwords for **Q14 (jeffmoore), 15 (jamessmith), 16 (sandrataylor)**

```
butterfly        (jeffmoore)
please           (jamessmith)
daisy1           (sandrataylor)
metallica        (root)
```

I achieved reverse shell access by uploading to `/etc/cron.d/php5` after modifying it following the guide [here](https://linuxize.com/post/cron-jobs-every-5-10-15-minutes/). I could download the netcat binary to test it anyway. Aftert that I upgraded it into a meterpreter shell. I then uploaded socat, followed the insturctions [here](https://blog.ropnop.com/upgrading-simple-shells-to-fully-interactive-ttys/) to upgrade the shell and confirm all the passwords.

Also can autoroute through this node

## 85
On 212 meterpreter route, it is listed as a gateway, so should be valid

## 211

enum4linux gave quite a fair bit of information, including
1. Users **Q11**
2. shares

Shares
1. C
    1. share is useless, all files either unaccessible or empty
2. IPC$ : Remote IPC
3. WorkSharinng has `ToDo.txt.txt`, which has some information about
    1. Schedule routers reboot during the night.
    2. (PAID OFF) Disable root access to the FTP server. 
    3. Create new account for Jessica of the HR dept.
4. MyDocuments
    1. Doesn't reveal anything much, looks like some typical windows desktop stuff
5. (LOCKED) M$ : Default share
6. (LOCKED) Y$ : Default share
7. (LOCKED) ADMIN$ : Remote Admin
8. (LOCKED) C$ 


Nessus Scan reveals (whatever free trial I can use)
1. MS06-040
2. MS09-001 -> metasploitable
3. MS10-012 -> Core Impact
4. MS08-067 -> metasploitable and RCE (WORKS)

On Metasploiting found out that
1. Has 3 hard disks, C, M, Y -> **Q13**


`enum4linux` again reveals that max password length is `Maximum password age: 32 days 2 minutes` -> **Q12**

## 212

enum4linux didn't really give much

Nessus reveals
1. MS08-067 -> Metasploitable, arbituary code -> Works
2. MS09-001 -> Metasploitable, leads to RCE
3. MS17-010

In Meterpreter session, found `C:\routersconfiguration.txt` -> Solves **Q10**

Tried routing to 10.85.174.87, 10.86.74.7, 199.193.119.90, 192.168.123.1
  - Cannot ping/ connect
On looking at the routes, noticed that there is a route 0.0.0.0/0 with gateway 192.168.193.85
 - Tried routing it, can connect to network

# PCAP

I only realised there was a PCAP after I did some scanning

There are these devices
1. 10.85.174.87 (Should be the web server, only has `test` at `/`)
2. 10.86.74.7 (Another Web server with the Motiville Stuff this time)
3. 192.168.193.74 (Should be the client)

Mainly TCP & HTTP Objects, some ARP (negligible)

From the HTTP Objects
1. `/` from 10.86.74.7
    1. Links to
        1. search.php
        2. contactus.php
        3. index.php
        4. artists.php
        5. equipment.php
        6. team.php
        7. login.php
        8. albumdetails.php
    2. Information
        1. Motville is the recording studio of choice of many top artists. We have the best engineers, producers and equipment!
2. Images look quite standard
3. recording_style.css also looks quite standard

# Network 1 10.85.174.0/24

## 87
Has a ssh , http and mysql server

# Network 2 10.86.74.0/24

Can connect to this by pivoting from 192.168.193.211 or 192.168.193.212, same method used
 - Can prove by curl to 10.86.74.7
 
 
## 7
 Has a ssh server
 
The website is available, by just browsing through
1. index.php
2. artists.php
3. equipment.php
  1. Monitoring and Speakers: 10.86.74.188'
    Presonus Centralstation + CSR-1
    Dynaudio BM15A
	**Q3**
4. Go to teams.php, 
  1. there's a section on we're hiring **Q5**
  2. Robert Jens "Bob" Rock is the founder **Q4**
5. Contact us 
7.

Potential exploitable inputs
1. Login page
2. search box
	1. Potential XSS -> Payload `<script>alert(1);</script>` works
		1. Doesn't seem stored though so useless
3. Contactus.php
	1. Potential XSS of email -> Doesn't work
4. The Albumdetails.php
	1. Tried sqlmap -> Succeeded use credientials `Admin:GKV49TFG7XK` 
		1. But login page is in maintenance, no incriminating comments too

### Dir Enum
On `dirb`, found out that
```
Index of /include
[ICO]	Name	Last modified	Size	Description
[DIR]	Parent Directory	 	- 	 
[ ]	config.old	05-Mar-2015 10:39 	502 	 
[TXT]	config.php	06-Mar-2015 10:25 	464 	 
[TXT]	footer.php	05-Mar-2015 10:39 	460 	 
[TXT]	header.php	05-Mar-2015 10:39 	1.4K	 
[TXT]	menu.php	05-Mar-2015 10:39 	518 	 
[TXT]	sidebar.php	05-Mar-2015 10:39 	647 	 
Apache/2.2.15 (CentOS) Server at 10.86.74.7 Port 80
```
Site has footer.php, header.php, menu.php, sidebar.php -> **Q8**

`config.old` has
```
$dbhostname='10.86.74.188';
$dbuser='motvilletest';
$dbpassword='6cj6u15VvaigJpwLV3CPjOySL';
$dbname='motvilletestdb';
$dbport='19376';
```
-> **Q6, Q7**

Also found `robots.txt` which disallows `/oSWc0SGN`. The directory shows `Site created by ITForMusicians web agency!` -> **Q9**


## 50

Has ssh, mysql, 

Cannot connect to mysql database at port 3306


## 188

From config.old, tried connecting to old database, but cannot connect to that port