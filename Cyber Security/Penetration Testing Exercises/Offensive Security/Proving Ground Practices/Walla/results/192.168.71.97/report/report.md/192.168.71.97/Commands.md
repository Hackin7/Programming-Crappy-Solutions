```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_quick_tcp_nmap.xml" 192.168.71.97

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_full_tcp_nmap.xml" 192.168.71.97

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_top_100_udp_nmap.xml" 192.168.71.97

nmap -vv --reason -Pn -T4 -sV -p 22 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp22/tcp_22_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp22/xml/tcp_22_ssh_nmap.xml" 192.168.71.97

nmap -vv --reason -Pn -T4 -sV -p 23 --script="banner,telnet-encryption,telnet-ntlm-info" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/tcp_23_telnet-nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/xml/tcp_23_telnet_nmap.xml" 192.168.71.97

nmap -vv --reason -Pn -T4 -sV -p 25 --script="banner,(smtp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/tcp_25_smtp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp25/xml/tcp_25_smtp_nmap.xml" 192.168.71.97

hydra smtp-enum://192.168.71.97:25/vrfy -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" 2>&1

hydra smtp-enum://192.168.71.97:25/expn -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" 2>&1

nmap -vv --reason -Pn -T4 -sV -p 422 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/tcp_422_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp422/xml/tcp_422_ssh_nmap.xml" 192.168.71.97

feroxbuster -u http://192.168.71.97:8091/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_feroxbuster_common.txt"

curl -sSik http://192.168.71.97:8091/

curl -sSikf http://192.168.71.97:8091/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 8091 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/xml/tcp_8091_http_nmap.xml" 192.168.71.97

whatweb --color=never --no-errors -a 3 -v http://192.168.71.97:8091 2>&1

wkhtmltoimage --format png http://192.168.71.97:8091/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_screenshot.png

nmap -vv --reason -Pn -T4 -sV -p 42042 --script="banner,ssh2-enum-algos,ssh-hostkey,ssh-auth-methods" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp42042/tcp_42042_ssh_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp42042/xml/tcp_42042_ssh_nmap.xml" 192.168.71.97

feroxbuster -u http://192.168.71.97:8091/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_feroxbuster_big.txt"

feroxbuster -u http://192.168.71.97:8091/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_feroxbuster_raft-large-words.txt"


```