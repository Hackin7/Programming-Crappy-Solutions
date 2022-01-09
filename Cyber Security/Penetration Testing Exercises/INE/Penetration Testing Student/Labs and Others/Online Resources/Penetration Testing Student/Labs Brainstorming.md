Labs Brainstorming

Labs

## Scanning and OS Fingerprinting

https://my.ine.com/CyberSecurity/courses/6f986ca5/penetration-testing-basics 

### Goals
1. Run a ping scan with fping
2. Run a ping scan with nmap, do you find any differences? Can you tell why?
3. Perform a SYN scan against the targets. Identify clients and servers
4. Identify the version of every daemon listening on the network

### Plan
https://www.tecmint.com/ping-multiple-linux-hosts-using-fping/
1. `fping -a -G <range>`
2. `nmap -sP <range>` #or `-sn`
3. `nmap -sS -p 1-65535 -iL hosts.txt`
4. `nmap -sV -p 1-65535 -iL hosts.txt`


## Nessus

https://my.ine.com/CyberSecurity/courses/6f986ca5/penetration-testing-basics

### Goals
1. Find a target in the network
  - Since we do not have any information about our lab network and the hosts attached to it, the first step is to find our target!
2. Identify the target role
  - Now that we know there is a host on the target network, let us scan the host and gather as much information as we can in order to properly configure the Nessus scan.
3. Configure Nessus and run the scan
  - You should have identified few services running on the machine. Configure a new Nessus policy and scan depending on the scan results of the previous step.
4. Analyze and export the scan results
  - Once the scan completes, open the results and analyze them. You will find something very interesting! Moreover export the scan results, you may need them!
5. [OPTIONAL] Exploit the machine
  - The target machine has few critical vulnerabilities. Once you finish studying the Metasploit module, start the lab over again and try to exploit the machine.

### Steps

https://www.tenable.com/blog/how-to-run-your-first-vulnerability-scan-with-nessus

1. Use nmap to scan, like `nmap -sP <network>`
2.  `nmap -sV -p 1-65535 <host>`
3. 
4. 
5. Use Metasploit
 
## Dirbuster

### Goals
1. Find all the machines in the network
  - Since we do not have any information about the network and related hosts, the first step is to find all alive hosts in the network.
2. Identify the machines role
  - Now that we know there is a host on the target network, let us scan it and gather as much information as we can about it. We are interested in web servers.
3. Explore the web application
  - Once we have found a web server explore the Web Application from a web browser and analyze it.
  - Remember that the goal of our tests is to access the restricted web area.
4. Find hidden files
  - Now that you have an idea of how the Web Application works, run dirbuster and check if there is any file that may be useful to access the login page!
5. Test the credentials found
  - You should have found two interesting files. Use the information stored in these two files to access the DMBS.
6. Retrieve the correct admin password
  - Now that you have access to the database, dump the administrator credentials and try to log into the Web Application.

### Steps

1. Nmap ping scan for devices, and scan each device
2. Use dirbuster & dirb (common test) 


## Cross site scripting

### Goals
1. Find all the XSS
  - There are many injection points in the web application, but only few of these are vulnerable. Go find them.
2. Steal the admin session cookies
  - You should have found a vulnerable injection point in the previous step. Use it to steal the administrator cookies and then install the cookies in your browser!
  - If you use the administrator cookies you will be able to access the content of the admin.php page.

### Steps

## SQL Injection

### Goals
1. Explore the web application
  - Explore the Web application at the address 10.124.211.96 and find all the possible injection points.
2. Test and exploit the injection points
  - By now, you should have found few injection points. Test them with different techniques.
3. Dump the data
  - Now that you know there is at least one exploitable SQL Injections in the target Web Application, exploit it and dump all the data from the database. You should be able to retrieve some very interesting information that will allow you to log into the web app.
4. Login without using any credential
  - Test the login form against SQL injection and use the correct payload to bypass the authentication mechanism.

### Steps

## Bruteforce and Password cracking

### Goals
1. Find alive hosts on the network
  - Since we do not have any information about the remote network and the hosts attached to it, the first step is to find a possible target!
2. Port scan and service detection
  - You should have found an alive host on the network. Get as many information as you can about it!
3. Bruteforce the service authentication
  - It is time to get our hands dirty. Run a network authentication cracker tool in order to discover valid credentials for the following two services: SSH and Telnet.
```
We suggest you use the following two wordlists:
    Username:
        /usr/share/ncrack/minimal.usr
            If you do not have this in your system, please download it from here.
    Password:
        /usr/share/seclists/Passwords/rockyou-10.txt
        /usr/share/seclists/Passwords/rockyou-15.txt
            If you do not have these in your system, please download them from here (rockyou-10.txt) and here (rockyou-15.txt).
```
For ease of use, you can save those files in the aforementioned locations.
4. Download and crack the local password on the system
  - You should now have SSH access on the remote machine. Download the necessary files to crack local password. Find at least ten passwords!

### Steps

## Null Session

### Goals
1. Find a target in the network
  - Since we do not have any information about the remote network and the hosts attached to it, the first step is to find a possible target in the network lab you are attached to!
2. Check for null session
  - You should have found at least one alive host on the network. Verify if it is vulnerable to null session.
3. Exploit null session

It\'s time to get our hands dirty.

    Gather information with enum4linux

Use enum4linux and gather the following information:

    Shares

    Users

    Password policies

    Groups
    Use smbclient to navigate the target machine

Mount or use the smbclient interactive command line in order to navigate the remote machine and find and inspect the content of the Congratulations.txt file.
Configuration

For this lab, a specific SMB configuration may be required. Execute the below from inside a terminal on your kali machine if the proposed tools don't produce the results you will see in the solutions or indicate errors.
```
vim /etc/samba/smb.conf
```
Now under [global] add the lines below.
```
client min protocol = CORE
client max protocol = SMB3
client use spnego = no
client ntlmv2 auth = no
```

### Steps


## ARP Poisoning

## Goals
1. Identify the telnet server and the client machine
2. Intercept traffic between the two
3. Analyze the traffic and steal valid credentials
4. Login into the telnet server


## Metasploit
### Steps
Find a target in the network

Since we do not have any information about the remote network and the hosts attached to it, the first step is to find a possible target!
Identify available services on the target

Now that we know there is a host on the target network, scan the host and gather as much information as possible.
Find a vulnerable service in Metasploit

You should have identified a few services running on the machine. Check if Metasploit contains any working exploit for that specific services and version
Configure the module and exploit the machine

Select the Metasploit module found in the previous step and configure it with the correct parameters. Once you have the module set, launch the exploit! You should get a meterpreter session!
Obtain SYSTEM privileges on the machine

The most important step once you exploit a machine is to get the highest privileges you can. This will allow you to access much more information as well as run much more commands. Try to obtain system privileges on the machine!
Install a backdoor

Now that you have full privileges on the machine, install a backdoor on it.

If you want to test if the backdoor works, just run \"reboot\" in the meterpreter session and wait a minute. Once the machine turns back, you should be able to use your backdoor!
Get the password hashes and crack them

It is now time to gather some data! Dump all the password hashes of the exploited machine!

Once you have them, you can also try to crack the passwords with John the Ripper.
Gather information

Try to gather as much information as possible from the target machine: applications, routes, interfaces and so on. Explore the machine and the Metasploit module to practice with different tools and output.
Locate and download the congrats.txt file

Browse the target machine, find the file named \"Congrats.txt\" and download it into your machine!