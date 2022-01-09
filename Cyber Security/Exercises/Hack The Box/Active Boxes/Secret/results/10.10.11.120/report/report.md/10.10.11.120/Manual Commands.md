```bash
[*] ssh on tcp/22

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 22 -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_22_ssh_hydra.txt" ssh://10.10.11.120

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 22 -O "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_22_ssh_medusa.txt" -M ssh -h 10.10.11.120

[*] http on tcp/80

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://10.10.11.120:80 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_feroxbuster_dirbuster.txt

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_auth_hydra.txt" http-get://10.10.11.120/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_auth_medusa.txt" -M http -h 10.10.11.120 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 80 -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_form_hydra.txt" http-post-form://10.10.11.120/path/to/login.php:username=^USER^&password=^PASS^:invalid-login-message

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 80 -O "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_form_medusa.txt" -M web-form -h 10.10.11.120 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://10.10.11.120:80 2>&1 | tee "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://10.10.11.120:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_80_http_wpscan.txt"

[*] http on tcp/3000

	[-] (feroxbuster) Multi-threaded recursive directory/file enumeration for web servers using various wordlists:

		feroxbuster -u http://10.10.11.120:3000 -t 10 -w /usr/share/wordlists/dirbuster/directory-list-2.3-medium.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -o /media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_feroxbuster_dirbuster.txt

	[-] Credential bruteforcing commands (don't run these without modifying them):

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 3000 -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_auth_hydra.txt" http-get://10.10.11.120/path/to/auth/area

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 3000 -O "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_auth_medusa.txt" -M http -h 10.10.11.120 -m DIR:/path/to/auth/area

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 3000 -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_form_hydra.txt" http-post-form://10.10.11.120/path/to/login.php:username=^USER^&password=^PASS^:invalid-login-message

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 3000 -O "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_form_medusa.txt" -M web-form -h 10.10.11.120 -m FORM:/path/to/login.php -m FORM-DATA:"post?username=&password=" -m DENY-SIGNAL:"invalid login message"

	[-] (nikto) old but generally reliable web server enumeration tool:

		nikto -ask=no -h http://10.10.11.120:3000 2>&1 | tee "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_nikto.txt"

	[-] (wpscan) WordPress Security Scanner (useful if WordPress is found):

		wpscan --url http://10.10.11.120:3000/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp_3000_http_wpscan.txt"


```