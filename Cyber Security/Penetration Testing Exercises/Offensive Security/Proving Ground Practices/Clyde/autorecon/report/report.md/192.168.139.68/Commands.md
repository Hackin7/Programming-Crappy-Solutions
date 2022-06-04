```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/root/autorecon/results/192.168.139.68/scans/_quick_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/xml/_quick_tcp_nmap.xml" 192.168.139.68

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/root/autorecon/results/192.168.139.68/scans/_full_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/xml/_full_tcp_nmap.xml" 192.168.139.68

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/root/autorecon/results/192.168.139.68/scans/_top_100_udp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/xml/_top_100_udp_nmap.xml" 192.168.139.68

nmap -vv --reason -Pn -T4 -sV -p 21 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.139.68/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.139.68

nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.139.68

feroxbuster -u http://192.168.139.68:80/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt"

curl -sSik http://192.168.139.68:80/

curl -sSikf http://192.168.139.68:80/.well-known/security.txt

curl -sSikf http://192.168.139.68:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.139.68

whatweb --color=never --no-errors -a 3 -v http://192.168.139.68:80 2>&1

wkhtmltoimage --format png http://192.168.139.68:80/ /root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_screenshot.png

feroxbuster -u http://192.168.139.68:15672/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_feroxbuster_dirbuster.txt"

curl -sSik http://192.168.139.68:15672/

curl -sSikf http://192.168.139.68:15672/.well-known/security.txt

curl -sSikf http://192.168.139.68:15672/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 15672 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp15672/xml/tcp_15672_http_nmap.xml" 192.168.139.68

whatweb --color=never --no-errors -a 3 -v http://192.168.139.68:15672 2>&1

wkhtmltoimage --format png http://192.168.139.68:15672/ /root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_screenshot.png


```