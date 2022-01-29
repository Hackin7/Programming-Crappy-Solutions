```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/xml/_quick_tcp_nmap.xml" 192.168.234.55

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/xml/_full_tcp_nmap.xml" 192.168.234.55

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/xml/_top_100_udp_nmap.xml" 192.168.234.55

nmap -vv --reason -Pn -T4 -sV -p 21 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.234.55

feroxbuster -u http://192.168.234.55:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_feroxbuster_common.txt"

curl -sSik http://192.168.234.55:80/

curl -sSikf http://192.168.234.55:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.234.55

whatweb --color=never --no-errors -a 3 -v http://192.168.234.55:80 2>&1

wkhtmltoimage --format png http://192.168.234.55:80/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_screenshot.png

nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.234.55

impacket-rpcdump -port 135 192.168.234.55

enum4linux -a -M -l -d 192.168.234.55 2>&1

nbtscan -rvh 192.168.234.55 2>&1

nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.234.55

smbclient -L\\ -N -I 192.168.234.55 2>&1

smbmap -H 192.168.234.55 -P 139 2>&1

feroxbuster -u https://192.168.234.55:443/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_feroxbuster_common.txt"

sslscan --show-certificate --no-colour 192.168.234.55:443 2>&1

curl -sSik https://192.168.234.55:443/

curl -sSikf https://192.168.234.55:443/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 443 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.234.55

whatweb --color=never --no-errors -a 3 -v https://192.168.234.55:443 2>&1

wkhtmltoimage --format png https://192.168.234.55:443/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_screenshot.png

nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.234.55

smbmap -H 192.168.234.55 -P 445 2>&1

nmap -vv --reason -Pn -T4 -sV -p 3306 --script="banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.234.55

smbmap -u null -p "" -H 192.168.234.55 -P 445 2>&1

smbmap -u null -p "" -H 192.168.234.55 -P 139 2>&1

smbmap -H 192.168.234.55 -P 445 -R 2>&1

smbmap -H 192.168.234.55 -P 139 -R 2>&1

smbmap -u null -p "" -H 192.168.234.55 -P 445 -R 2>&1

smbmap -u null -p "" -H 192.168.234.55 -P 139 -R 2>&1

smbmap -H 192.168.234.55 -P 445 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.234.55 -P 445 -x "ipconfig /all" 2>&1

smbmap -H 192.168.234.55 -P 139 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.234.55 -P 139 -x "ipconfig /all" 2>&1

feroxbuster -u https://192.168.234.55:443/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_feroxbuster_big.txt"

feroxbuster -u http://192.168.234.55:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_feroxbuster_big.txt"

feroxbuster -u https://192.168.234.55:443/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_feroxbuster_raft-large-words.txt"

feroxbuster -u http://192.168.234.55:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"


```