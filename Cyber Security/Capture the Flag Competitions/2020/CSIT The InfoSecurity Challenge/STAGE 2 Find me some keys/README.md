# STAGE 2: Find me some keys

STAGE TWO

## Description

YOU WILL NEED ENCRYPTED.ZIP ATTACHED BELOW

You have recovered the ransomware that has been running on the computers. First, you need to figure out how the ransomware works, what encryption algorithm it uses.

Please handle the anorocware executable with caution, we have provided a Dockerfile for you to containerise the ransomware. You may also choose to use a Virtual Machine.

Find the public key that is embedded in the binary.
Hash the base64 string of the public key using sha256 and submit flag as TISC20{sha256 hash of the base64 encoded public key}

ANSWER FORMAT EXAMPLE:
```
The key file will look something like this but longer:
LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0NCmMyOXRaU0JpWVhObE5qUWdjM1J5YVc1bklHZHZaWE1nYUdWeVpRPT0NCi0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==

Internally it contains something like this:
-----BEGIN PUBLIC KEY-----
c29tZSBiYXNlNjQgc3RyaW5nIGdvZXMgaGVyZQ==
-----END PUBLIC KEY-----

You will need to perform a sha256 hash on the whole key file, i.e. sha256("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0NCmMyOXRaU0JpWVhObE5qUWdjM1J5YVc1bklHZHZaWE1nYUdWeVpRPT0NCi0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQ==") to obtain 799f319d8400243a8331d70ae7df4bacf0290dca303b138b03263655e9548caf

Then submit flag as TISC20{799f319d8400243a8331d70ae7df4bacf0290dca303b138b03263655e9548caf}
```

REMINDER!

Save any code you wrote and take screenshots of your work within your allocated 48h session, THESE WILL NEED TO BE SUBMITTED IN YOUR WRITEUP FOR YOUR ATTEMPT TO BE CONSIDERED VALID!
Writeups should be sent from the email address used to sign up for TISC to tisc_contactus@csit.gov.sg within 48h after the end of your 48h session.
Emails should have "tiscwriteup your_fullname_goes_here" as the subject.
You should not share your writeups with anyone else or post them publicly before 08 Sept 2020 0000hrs.
The clarity of your documentation will contribute to a better evaluation of your work.

## Attached Files

encrypted.zip

# Solution

I'm using Windows, so I need to setup docker first
`com.docker.service`