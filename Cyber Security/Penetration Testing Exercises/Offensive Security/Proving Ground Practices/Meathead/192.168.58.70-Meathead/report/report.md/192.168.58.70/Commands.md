```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/root/autorecon/results/192.168.58.70/scans/_quick_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_quick_tcp_nmap.xml" 192.168.58.70

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_full_tcp_nmap.xml" 192.168.58.70

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/root/autorecon/results/192.168.58.70/scans/_top_100_udp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_top_100_udp_nmap.xml" 192.168.58.70

feroxbuster -u http://192.168.58.70:80/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt"

curl -sSik http://192.168.58.70:80/

curl -sSikf http://192.168.58.70:80/.well-known/security.txt

curl -sSikf http://192.168.58.70:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.58.70

whatweb --color=never --no-errors -a 3 -v http://192.168.58.70:80 2>&1

wkhtmltoimage --format png http://192.168.58.70:80/ /root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_screenshot.png

getArch.py -target 192.168.58.70

nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/root/autorecon/results/192.168.58.70/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.58.70

impacket-rpcdump -port 135 192.168.58.70

enum4linux -a -M -l -d 192.168.58.70 2>&1

nbtscan -rvh 192.168.58.70 2>&1

nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.58.70

smbclient -L //192.168.58.70 -N -I 192.168.58.70 2>&1

smbmap -H 192.168.58.70 -P 139 2>&1

nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.58.70

smbmap -H 192.168.58.70 -P 445 2>&1

nmap -vv --reason -Pn -T4 -sV -p 3389 --script="banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.58.70

smbmap -u null -p "" -H 192.168.58.70 -P 445 2>&1

smbmap -H 192.168.58.70 -P 445 -R 2>&1

smbmap -u null -p "" -H 192.168.58.70 -P 139 2>&1

smbmap -u null -p "" -H 192.168.58.70 -P 445 -R 2>&1

smbmap -H 192.168.58.70 -P 445 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.58.70 -P 445 -x "ipconfig /all" 2>&1

smbmap -H 192.168.58.70 -P 139 -R 2>&1

smbmap -u null -p "" -H 192.168.58.70 -P 139 -R 2>&1

smbmap -H 192.168.58.70 -P 139 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.58.70 -P 139 -x "ipconfig /all" 2>&1

nmap -vv --reason -Pn -T4 -sV -p 1221 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp1221/xml/tcp_1221_ftp_nmap.xml" 192.168.58.70

nmap -vv --reason -Pn -T4 -sV -p 1435 --script="banner,(ms-sql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" --script-args="mssql.instance-port=1435,mssql.username=sa,mssql.password=sa" -oN "/root/autorecon/results/192.168.58.70/scans/tcp1435/tcp_1435_mssql_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp1435/xml/tcp_1435_mssql_nmap.xml" 192.168.58.70

feroxbuster -u http://192.168.58.70:5985/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_feroxbuster_dirbuster.txt"

curl -sSik http://192.168.58.70:5985/

curl -sSikf http://192.168.58.70:5985/.well-known/security.txt

curl -sSikf http://192.168.58.70:5985/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 5985 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp5985/xml/tcp_5985_http_nmap.xml" 192.168.58.70

whatweb --color=never --no-errors -a 3 -v http://192.168.58.70:5985 2>&1

wkhtmltoimage --format png http://192.168.58.70:5985/ /root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_screenshot.png


```