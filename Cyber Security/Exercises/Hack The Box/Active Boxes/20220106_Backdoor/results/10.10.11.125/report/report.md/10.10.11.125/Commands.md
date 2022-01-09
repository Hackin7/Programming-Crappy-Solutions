```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/xml/_quick_tcp_nmap.xml" 10.10.11.125

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/xml/_full_tcp_nmap.xml" 10.10.11.125

nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 10.10.11.125

feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_common.txt"

curl -sSik http://10.10.11.125:80/

curl -sSikf http://10.10.11.125:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/xml/tcp_80_http_nmap.xml" 10.10.11.125

whatweb --color=never --no-errors -a 3 -v http://10.10.11.125:80 2>&1

wkhtmltoimage --format png http://10.10.11.125:80/ /media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_screenshot.png

feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_big.txt"

feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"


```