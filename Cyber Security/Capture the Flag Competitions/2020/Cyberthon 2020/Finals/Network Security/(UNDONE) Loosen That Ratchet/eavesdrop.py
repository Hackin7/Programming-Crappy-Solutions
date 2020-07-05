'''
#Step 1: Import scapy
from scapy.all import *
#Step 2: Read the PCAP usimg rdpcap
packets = rdpcap("a.pcapng")

print("----------------------------------------")
count=0
#Step 3: Loop and print an IP in a packet in Scapy by looking at Layer 3
for pkt in packets:
  if IP in pkt:
    try:
      print(pkt) # Source IP
      count += 1
    except:
      pass
  

print(count)
'''

import re
with open("a.pcapng","rb") as f:
  data = f.read()

regex = r"GET \/myorders\.php\?orderID=\d* HTTP\/1\.1\nHost: www.sh0ppingbaba.com\nUser-Agent: Mozilla\/5.0 \(Windows NT 6.1; Win64; x64; rv:50.0\) Gecko\/20100101 Firefox\/50.0\nAccept-Encoding: gzip, deflate\nAccept: \*\/\*\nConnection: keep-alive\nContent-Type: application\/octet-stream\nAccept-Language: en-us\nContent-Length: \d*\n\n"
data = re.sub(regex,"",str(data))

regex = r"HTTP\/1\.1 200 OK\nDate: Sun, 23 Feb 2020 \d\d:\d\d:\d\d GMT\nServer: Apache\/2\.4\.41 \(Win64\) OpenSSL\/1\.1\.1c PHP\/7\.2\.27\nX-Powered-By: PHP\/7\.2\.27\nContent-Length: 0\nKeep-Alive: timeout=5, max=100\nConnection: Keep-Alive\nContent-Type: text\/html; charset=UTF-8\n\n"
data = re.sub(regex,"",data)

with open("h.gzip","w") as f:
  f.write(data.strip())

