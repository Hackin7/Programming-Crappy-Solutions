```bash
hydra smtp-enum://192.168.71.97:25/vrfy -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/tcp_25_smtp_user-enum_hydra_vrfy.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/tcp_25_smtp_user-enum_hydra_vrfy.txt):

```
Hydra v9.1 (c) 2020 by van Hauser/THC & David Maciejak - Please do not use in military or secret service organizations, or for illegal purposes (this is non-binding, these *** ignore laws and ethics anyway).

Hydra (https://github.com/vanhauser-thc/thc-hydra) starting at 2022-02-27 11:49:40
[DATA] max 16 tasks per 1 server, overall 16 tasks, 17 login tries (l:17/p:1), ~2 tries per task
[DATA] attacking smtp-enum://192.168.71.97:25/vrfy
[25][smtp-enum] host: 192.168.71.97   login: root
1 of 1 target successfully completed, 1 valid password found
Hydra (https://github.com/vanhauser-thc/thc-hydra) finished at 2022-02-27 11:49:41


```
```bash
hydra smtp-enum://192.168.71.97:25/expn -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/tcp_25_smtp_user-enum_hydra_expn.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/tcp_25_smtp_user-enum_hydra_expn.txt):

```
Hydra v9.1 (c) 2020 by van Hauser/THC & David Maciejak - Please do not use in military or secret service organizations, or for illegal purposes (this is non-binding, these *** ignore laws and ethics anyway).

Hydra (https://github.com/vanhauser-thc/thc-hydra) starting at 2022-02-27 11:49:42
[DATA] max 16 tasks per 1 server, overall 16 tasks, 17 login tries (l:17/p:1), ~2 tries per task
[DATA] attacking smtp-enum://192.168.71.97:25/expn
1 of 1 target completed, 0 valid password found
Hydra (https://github.com/vanhauser-thc/thc-hydra) finished at 2022-02-27 11:49:44


```
