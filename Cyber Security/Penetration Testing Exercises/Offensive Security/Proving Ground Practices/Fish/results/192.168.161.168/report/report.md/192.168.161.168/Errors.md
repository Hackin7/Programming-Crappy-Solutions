```
[*] Service scan wkhtmltoimage (tcp/8080/http-proxy/wkhtmltoimage) ran a command which returned a non-zero exit code (1).
[-] Command: wkhtmltoimage --format png http://192.168.161.168:8080/ /media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/tcp_8080_http_screenshot.png
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



[*] Service scan Curl (tcp/8080/http-proxy/curl) ran a command which returned a non-zero exit code (56).
[-] Command: curl -sSik http://192.168.161.168:8080/
[-] Error Output:
curl: (56) Recv failure: Connection reset by peer


[*] Service scan Curl Robots (tcp/8080/http-proxy/curl-robots) ran a command which returned a non-zero exit code (56).
[-] Command: curl -sSikf http://192.168.161.168:8080/robots.txt
[-] Error Output:
curl: (56) Recv failure: Connection reset by peer



```