# Challenge Name

### Description

## Solution

Just Check the registry
https://smallbusiness.chron.com/mapped-drives-remote-pc-registry-57951.html

"HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\ Explorer\MountPoints2\"

```
C:\Users\adam>reg query HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MountPoints2\

HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MountPoints2\##VBoxSvr#vm-shared
HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MountPoints2\CPC
HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MountPoints2\{3d157072-ce9b-11eb-9164-806e6f6e6963}
HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MountPoints2\{e7be50b6-0000-0000-0000-300300000000}
```

## Flag

`TISC{vm-shared}`
