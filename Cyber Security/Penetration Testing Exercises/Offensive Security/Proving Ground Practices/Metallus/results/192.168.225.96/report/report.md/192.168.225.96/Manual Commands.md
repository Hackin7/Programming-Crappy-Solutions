```bash
[*] msrpc on tcp/135

	[-] RPC Client:

		rpcclient -p 135 -U "" 192.168.225.96

[*] netbios-ssn on tcp/139

	[-] Nmap scans for SMB vulnerabilities that could potentially cause a DoS if scanned (according to Nmap). Be careful:

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms06-025" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_139_smb_ms06-025.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_139_smb_ms06-025.xml" 192.168.225.96

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms07-029" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_139_smb_ms07-029.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_139_smb_ms07-029.xml" 192.168.225.96

		nmap -vv --reason -Pn -T4 -sV -p 139 --script="smb-vuln-ms08-067" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_139_smb_ms08-067.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_139_smb_ms08-067.xml" 192.168.225.96

[*] microsoft-ds on tcp/445

	[-] Nmap scans for SMB vulnerabilities that could potentially cause a DoS if scanned (according to Nmap). Be careful:

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms06-025" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_445_smb_ms06-025.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_445_smb_ms06-025.xml" 192.168.225.96

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms07-029" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_445_smb_ms07-029.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_445_smb_ms07-029.xml" 192.168.225.96

		nmap -vv --reason -Pn -T4 -sV -p 445 --script="smb-vuln-ms08-067" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_445_smb_ms08-067.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/tcp_445_smb_ms08-067.xml" 192.168.225.96

[*] ssh on tcp/22222

	[-] Bruteforce logins:

		hydra -L "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e nsr -s 22222 -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_22222_ssh_hydra.txt" ssh://192.168.225.96

		medusa -U "/usr/share/seclists/Usernames/top-usernames-shortlist.txt" -P "/usr/share/seclists/Passwords/darkweb2017-top100.txt" -e ns -n 22222 -O "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/tcp_22222_ssh_medusa.txt" -M ssh -h 192.168.225.96

[*] msrpc on tcp/49664

	[-] RPC Client:

		rpcclient -p 49664 -U "" 192.168.225.96

[*] msrpc on tcp/49665

	[-] RPC Client:

		rpcclient -p 49665 -U "" 192.168.225.96

[*] msrpc on tcp/49666

	[-] RPC Client:

		rpcclient -p 49666 -U "" 192.168.225.96

[*] msrpc on tcp/49667

	[-] RPC Client:

		rpcclient -p 49667 -U "" 192.168.225.96

[*] msrpc on tcp/49668

	[-] RPC Client:

		rpcclient -p 49668 -U "" 192.168.225.96

[*] msrpc on tcp/49669

	[-] RPC Client:

		rpcclient -p 49669 -U "" 192.168.225.96


```