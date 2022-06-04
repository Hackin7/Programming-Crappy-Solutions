```bash
[*] http on tcp/80

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://192.168.58.70:80 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_auth_hydra.txt" http-get://192.168.58.70/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_auth_medusa.txt" -M http -h 192.168.58.70 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_form_hydra.txt" http-post-form://192.168.58.70/path/to/login.php:"username=^USER^&password=^PASS^":"invalid-login-message"

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_form_medusa.txt" -M web-form -h 192.168.58.70 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://192.168.58.70:80 2>&1 | tee "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://192.168.58.70:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_wpscan.txt"

[*] msrpc on tcp/135

	[-] RPC Client:

		rpcclient -p 135 -U "" 192.168.58.70

[*] netbios-ssn on tcp/139

	[-] Nmap scans for SMB vulnerabilities that could potentially cause a DoS if scanned (according to Nmap). Be careful:

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms06-025" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp139/tcp_139_smb_ms06-025.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp139/xml/tcp_139_smb_ms06-025.xml" 192.168.58.70

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms07-029" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp139/tcp_139_smb_ms07-029.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp139/xml/tcp_139_smb_ms07-029.xml" 192.168.58.70

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms08-067" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp139/tcp_139_smb_ms08-067.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp139/xml/tcp_139_smb_ms08-067.xml" 192.168.58.70

[*] microsoft-ds on tcp/445

	[-] Nmap scans for SMB vulnerabilities that could potentially cause a DoS if scanned (according to Nmap). Be careful:

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms06-025" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_ms06-025.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_ms06-025.xml" 192.168.58.70

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms07-029" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_ms07-029.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_ms07-029.xml" 192.168.58.70

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms08-067" --script-args="unsafe=1" -oN "/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_ms08-067.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_ms08-067.xml" 192.168.58.70

[*] ms-wbt-server on tcp/3389

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 3389 -o "/root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_hydra.txt" rdp://192.168.58.70

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 3389 -O "/root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_medusa.txt" -M rdp -h 192.168.58.70

[*] ftp on tcp/1221

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 1221 -o "/root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_hydra.txt" ftp://192.168.58.70

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 1221 -O "/root/autorecon/results/192.168.58.70/scans/tcp1221/tcp_1221_ftp_medusa.txt" -M ftp -h 192.168.58.70

[*] ms-sql-s on tcp/1435

	[-] (sqsh) interactive database shell:

		sqsh -U <username> -P <password> -S 192.168.58.70:1435

[*] http on tcp/5985

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://192.168.58.70:5985 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_feroxbuster_dirbuster.txt

	[-] Bruteforce logins:

		crackmapexec winrm 192.168.58.70 -d <domain> -u /usr/share/seclists/Usernames/top-usernames-shortlist.txt -p /usr/share/seclists/Passwords/darkweb2017-top100.txt

	[-] Check login (requires credentials):

		crackmapexec winrm 192.168.58.70 -d <domain> -u <username> -p <password> -x "whoami"

	[-] Evil WinRM (gem install evil-winrm):

		evil-winrm -u <user> -p <password> -i 192.168.58.70

		evil-winrm -u <user> -H <hash> -i 192.168.58.70

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 5985 -o "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_auth_hydra.txt" http-get://192.168.58.70/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 5985 -O "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_auth_medusa.txt" -M http -h 192.168.58.70 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 5985 -o "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_form_hydra.txt" http-post-form://192.168.58.70/path/to/login.php:"username=^USER^&password=^PASS^":"invalid-login-message"

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 5985 -O "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_form_medusa.txt" -M web-form -h 192.168.58.70 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://192.168.58.70:5985 2>&1 | tee "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://192.168.58.70:5985/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_wpscan.txt"


```