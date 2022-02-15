```bash
smbmap -H 192.168.58.70 -P 445 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-share-permissions.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-share-permissions.txt):

```
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 445 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-share-permissions.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-share-permissions.txt):

```
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -H 192.168.58.70 -P 445 -R 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-list-contents.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-list-contents.txt):

```
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 445 -R 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-list-contents.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-list-contents.txt):

```
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -H 192.168.58.70 -P 445 -x "ipconfig /all" 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-execute-command.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-execute-command.txt):

```
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 445 -x "ipconfig /all" 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-execute-command.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/smbmap-execute-command.txt):

```
[!] Authentication error on 192.168.58.70


```
