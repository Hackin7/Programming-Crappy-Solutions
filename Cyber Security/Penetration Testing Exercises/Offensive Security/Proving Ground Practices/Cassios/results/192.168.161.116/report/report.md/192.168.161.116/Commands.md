```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_quick_tcp_nmap.xml" 192.168.161.116

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_full_tcp_nmap.xml" 192.168.161.116

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_top_100_udp_nmap.xml" 192.168.161.116

nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.161.116

feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_common.txt"

curl -sSik http://192.168.161.116:80/

curl -sSikf http://192.168.161.116:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.161.116

whatweb --color=never --no-errors -a 3 -v http://192.168.161.116:80 2>&1

wkhtmltoimage --format png http://192.168.161.116:80/ /media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_screenshot.png

enum4linux -a -M -l -d 192.168.161.116 2>&1

nbtscan -rvh 192.168.161.116 2>&1

nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.161.116

smbclient -L\\ -N -I 192.168.161.116 2>&1

smbmap -H 192.168.161.116 -P 139 2>&1

nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.161.116

smbmap -H 192.168.161.116 -P 445 2>&1

feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt"

curl -sSik http://192.168.161.116:8080/

curl -sSikf http://192.168.161.116:8080/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 8080 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/xml/tcp_8080_http_nmap.xml" 192.168.161.116

whatweb --color=never --no-errors -a 3 -v http://192.168.161.116:8080 2>&1

wkhtmltoimage --format png http://192.168.161.116:8080/ /media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_screenshot.png

feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_big.txt"

feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt"

smbmap -u null -p "" -H 192.168.161.116 -P 445 2>&1

smbmap -H 192.168.161.116 -P 445 -R 2>&1

feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt"

smbmap -u null -p "" -H 192.168.161.116 -P 139 2>&1

smbmap -H 192.168.161.116 -P 139 -R 2>&1

feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"

smbmap -u null -p "" -H 192.168.161.116 -P 445 -R 2>&1

smbmap -H 192.168.161.116 -P 445 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.161.116 -P 445 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.161.116 -P 139 -R 2>&1

smbmap -H 192.168.161.116 -P 139 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.161.116 -P 139 -x "ipconfig /all" 2>&1


```