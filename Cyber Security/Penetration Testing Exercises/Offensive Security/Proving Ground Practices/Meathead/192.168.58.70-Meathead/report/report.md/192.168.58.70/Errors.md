```
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) ran a command which returned a non-zero exit code (1).
[-] Command: smbclient -L //192.168.58.70 -N -I 192.168.58.70 2>&1
[-] Error Output:


[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) ran a command which returned a non-zero exit code (1).
[-] Command: enum4linux -a -M -l -d 192.168.58.70 2>&1
[-] Error Output:


[*] Service scan wkhtmltoimage (tcp/5985/http/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png http://192.168.58.70:5985/ /root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_screenshot.png
[-] Error Output:
QStandardPaths: XDG_RUNTIME_DIR not set, defaulting to '/tmp/runtime-root'
Loading page (1/2)
[>                                                           ] 0%
Error: Failed to load http://192.168.58.70:5985/, with network status code 203 and http status code 404 - Error transferring http://192.168.58.70:5985/ - server replied: Not Found
[==============================>                             ] 50%
[============================================================] 100%
Rendering (2/2)
[>                                                           ] 0%
[===============>                                            ] 25%
[============================================================] 100%
Done
Exit with code 1 due to network error: ContentNotFoundError



```