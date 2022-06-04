```
[*] Service scan wkhtmltoimage (tcp/443/http/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png https://192.168.234.55:443/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_screenshot.png
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



[*] Service scan Curl Robots (tcp/80/http/curl-robots) ran a command which returned a non-zero exit code (22).
[-] Command: curl -sSikf http://192.168.234.55:80/robots.txt
[-] Error Output:
curl: (22) The requested URL returned error: 404 Not Found


[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png http://192.168.234.55:80/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_screenshot.png
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



[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) ran a command which returned a non-zero exit code (1).
[-] Command: smbclient -L\\ -N -I 192.168.234.55 2>&1
[-] Error Output:


[*] Service scan Curl Robots (tcp/443/http/curl-robots) ran a command which returned a non-zero exit code (22).
[-] Command: curl -sSikf https://192.168.234.55:443/robots.txt
[-] Error Output:
curl: (22) The requested URL returned error: 404 Not Found


[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) ran a command which returned a non-zero exit code (1).
[-] Command: enum4linux -a -M -l -d 192.168.234.55 2>&1
[-] Error Output:



```