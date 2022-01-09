```
[*] Service scan Curl Robots (tcp/80/http/curl-robots) ran a command which returned a non-zero exit code (22).
[-] Command: curl -sSikf http://10.10.11.125:80/robots.txt
[-] Error Output:
curl: (22) The requested URL returned error: 404 Not Found


[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png http://10.10.11.125:80/ /media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_screenshot.png
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



[*] Service scan Directory Buster (tcp/80/http/dirbuster) ran a command which returned a non-zero exit code (134).
[-] Command: feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
[-] Error Output:
thread 'tokio-runtime-worker' panicked at 'supplied instant is later than self', library/std/src/time.rs:275:48
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
Aborted


[*] Service scan Directory Buster (tcp/80/http/dirbuster) ran a command which returned a non-zero exit code (134).
[-] Command: feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
[-] Error Output:
thread 'tokio-runtime-worker' panicked at 'supplied instant is later than self', library/std/src/time.rs:275:48
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
Aborted


[*] Service scan Directory Buster (tcp/80/http/dirbuster) ran a command which returned a non-zero exit code (134).
[-] Command: feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
[-] Error Output:
thread 'tokio-runtime-worker' panicked at 'supplied instant is later than self', library/std/src/time.rs:275:48
note: run with `RUST_BACKTRACE=1` environment variable to display a backtrace
Aborted



```