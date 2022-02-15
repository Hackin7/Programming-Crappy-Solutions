```bash
smbmap -H 192.168.58.70 -P 139 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-share-permissions.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-share-permissions.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 139 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-share-permissions.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-share-permissions.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -H 192.168.58.70 -P 139 -R 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-list-contents.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-list-contents.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 139 -R 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-list-contents.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-list-contents.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -H 192.168.58.70 -P 139 -x "ipconfig /all" 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-execute-command.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-execute-command.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
```bash
smbmap -u null -p "" -H 192.168.58.70 -P 139 -x "ipconfig /all" 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-execute-command.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp139/smbmap-execute-command.txt):

```
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.58.70


```
