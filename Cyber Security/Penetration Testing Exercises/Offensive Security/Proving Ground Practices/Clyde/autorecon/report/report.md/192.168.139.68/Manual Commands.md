```bash
[*] ftp on tcp/21

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 21 -o "/root/autorecon/results/192.168.139.68/scans/tcp21/tcp_21_ftp_hydra.txt" ftp://192.168.139.68

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 21 -O "/root/autorecon/results/192.168.139.68/scans/tcp21/tcp_21_ftp_medusa.txt" -M ftp -h 192.168.139.68

[*] ssh on tcp/22

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 22 -o "/root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_hydra.txt" ssh://192.168.139.68

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 22 -O "/root/autorecon/results/192.168.139.68/scans/tcp22/tcp_22_ssh_medusa.txt" -M ssh -h 192.168.139.68

[*] http on tcp/80

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://192.168.139.68:80 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_auth_hydra.txt" http-get://192.168.139.68/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_auth_medusa.txt" -M http -h 192.168.139.68 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_form_hydra.txt" http-post-form://192.168.139.68/path/to/login.php:"username=^USER^&password=^PASS^":"invalid-login-message"

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_form_medusa.txt" -M web-form -h 192.168.139.68 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://192.168.139.68:80 2>&1 | tee "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://192.168.139.68:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_wpscan.txt"

[*] http on tcp/15672

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://192.168.139.68:15672 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_feroxbuster_dirbuster.txt

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 15672 -o "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_auth_hydra.txt" http-get://192.168.139.68/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 15672 -O "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_auth_medusa.txt" -M http -h 192.168.139.68 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 15672 -o "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_form_hydra.txt" http-post-form://192.168.139.68/path/to/login.php:"username=^USER^&password=^PASS^":"invalid-login-message"

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 15672 -O "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_form_medusa.txt" -M web-form -h 192.168.139.68 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://192.168.139.68:15672 2>&1 | tee "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://192.168.139.68:15672/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_wpscan.txt"


```