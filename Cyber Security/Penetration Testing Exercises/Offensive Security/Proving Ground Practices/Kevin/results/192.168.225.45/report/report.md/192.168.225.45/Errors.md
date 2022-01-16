```
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) ran a command which returned a non-zero exit code (1).
[-] Command: smbclient -L\\ -N -I 192.168.225.45 2>&1
[-] Error Output:


[*] Service scan Curl Robots (tcp/80/http/curl-robots) ran a command which returned a non-zero exit code (22).
[-] Command: curl -sSikf http://192.168.225.45:80/robots.txt
[-] Error Output:
curl: (22) The requested URL returned error: 400 Page not found


[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png http://192.168.225.45:80/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_screenshot.png
[-] Error Output:
Unknown switch -t

Name:
  wkhtmltoimage 0.12.6

Synopsis:
  wkhtmltoimage [OPTIONS]... <input file> <output file>

Description:
  Converts an HTML page into an image,

General Options:
      --crop-h <int>                  Set height for cropping
      --crop-w <int>                  Set width for cropping
      --crop-x <int>                  Set x coordinate for cropping
      --crop-y <int>                  Set y coordinate for cropping
  -H, --extended-help                 Display more extensive help, detailing                                      less common command switches
  -f, --format <format>               Output file format (default png)
      --height <int>                  Set screen height (default is calculated                                      from page content) (default 0)
  -h, --help                          Display help
      --license                       Output license information and exit
      --log-level <level>             Set log level to: none, error, warn or                                      info (default info)
      --quality <int>                 Output image quality (between 0 and 100)                                      (default 94)
  -q, --quiet                         Be less verbose, maintained for backwards                                      compatibility; Same as using --log-level                                      none
  -V, --version                       Output version information and exit
      --width <int>                   Set screen width, note that this is used                                      only as a guide line. Use                                      --disable-smart-width to make it strict.                                      (default 1024)
Contact:
  If you experience bugs or want to request new features please visit
  <https://wkhtmltopdf.org/support.html>



[*] Service scan rpcdump (tcp/49152/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49152 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49152' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49153/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49153 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49153' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49154/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49154 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49154' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49155/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49155 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49155' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49156/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49156 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49156' (choose from '135', '139', '443', '445', '593')


[*] Service scan rpcdump (tcp/49159/msrpc/rpcdump) ran a command which returned a non-zero exit code (2).
[-] Command: impacket-rpcdump -port 49159 192.168.225.45
[-] Error Output:
usage: rpcdump.py [-h] [-debug] [-target-ip ip address]
                  [-port [destination port]] [-hashes LMHASH:NTHASH]
                  target
rpcdump.py: error: argument -port: invalid choice: '49159' (choose from '135', '139', '443', '445', '593')


[*] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) ran a command which returned a non-zero exit code (1).
[-] Command: sslscan --show-certificate --no-colour 192.168.225.45:3389 2>&1
[-] Error Output:



```