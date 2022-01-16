```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_quick_tcp_nmap.xml" 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_full_tcp_nmap.xml" 192.168.225.45

nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_top_100_udp_nmap.xml" 192.168.225.45

feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_common.txt"

curl -sSik http://192.168.225.45:80/

curl -sSikf http://192.168.225.45:80/robots.txt

nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.225.45

whatweb --color=never --no-errors -a 3 -v http://192.168.225.45:80 2>&1

wkhtmltoimage --format png http://192.168.225.45:80/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_screenshot.png

nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 135 192.168.225.45

enum4linux -a -M -l -d 192.168.225.45 2>&1

nbtscan -rvh 192.168.225.45 2>&1

nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.225.45

smbclient -L\\ -N -I 192.168.225.45 2>&1

smbmap -H 192.168.225.45 -P 139 2>&1

nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.225.45

smbmap -H 192.168.225.45 -P 445 2>&1

nmap -vv --reason -Pn -T4 -sV -p 49152 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49152/tcp_49152_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49152/xml/tcp_49152_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49152 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -p 49153 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/xml/tcp_49153_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49153 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -p 49154 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/xml/tcp_49154_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49154 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -p 49155 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49155/tcp_49155_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49155/xml/tcp_49155_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49155 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -p 49156 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49156/tcp_49156_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49156/xml/tcp_49156_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49156 192.168.225.45

nmap -vv --reason -Pn -T4 -sV -p 49159 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49159/tcp_49159_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49159/xml/tcp_49159_rpc_nmap.xml" 192.168.225.45

impacket-rpcdump -port 49159 192.168.225.45

smbmap -u null -p "" -H 192.168.225.45 -P 445 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 139 2>&1

smbmap -H 192.168.225.45 -P 445 -R 2>&1

smbmap -H 192.168.225.45 -P 139 -R 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 445 -R 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 139 -R 2>&1

smbmap -H 192.168.225.45 -P 445 -x "ipconfig /all" 2>&1

smbmap -H 192.168.225.45 -P 139 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 445 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 139 -x "ipconfig /all" 2>&1

nmap -vv --reason -Pn -T4 -sU -sV -p 137 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/xml/udp_137_smb_nmap.xml" 192.168.225.45

smbmap -H 192.168.225.45 -P 137 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 137 2>&1

smbmap -H 192.168.225.45 -P 137 -R 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 137 -R 2>&1

smbmap -H 192.168.225.45 -P 137 -x "ipconfig /all" 2>&1

smbmap -u null -p "" -H 192.168.225.45 -P 137 -x "ipconfig /all" 2>&1

nmap -vv --reason -Pn -T4 -sV -p 3389 --script="banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.225.45

sslscan --show-certificate --no-colour 192.168.225.45:3389 2>&1

feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_big.txt"

feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"


```