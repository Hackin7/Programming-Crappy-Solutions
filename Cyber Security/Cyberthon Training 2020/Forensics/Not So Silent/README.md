# Not So Silent

# Problem
Can you figure out the admin's password from this packet capture?

Given: noisy.pcap
# Solution

Check up
https://developer.mozilla.org/en-US/docs/Web/HTTP/Authentication


You notice packet 4241 has a HTTP OK Response, so the GET request before that has the password. which is 4239
* filter with `http.response.code==200`

```
No.     Time           Source                Destination           Protocol Length Info
      1 0.000000000    192.168.0.142         192.168.0.150         HTTP     220    GET /storage/classified HTTP/1.1 

Frame 1: 220 bytes on wire (1760 bits), 220 bytes captured (1760 bits) on interface 0
Linux cooked capture
Internet Protocol Version 4, Src: 192.168.0.142, Dst: 192.168.0.150
Transmission Control Protocol, Src Port: 47392, Dst Port: 80, Seq: 1, Ack: 1, Len: 152
Hypertext Transfer Protocol
    GET /storage/classified HTTP/1.1\r\n
    Host: 192.168.0.150\r\n
    Connection: close\r\n
    Authorization: Basic YWRtaW46Y2F0aGVyaW5l\r\n
    User-Agent: Mozilla/4.0 (Hydra)\r\n
    \r\n
    [Full request URI: http://192.168.0.150/storage/classified]
    [HTTP request 1/1]
    [Response in frame: 2]
```

You get the base 64 encoded code `YWRtaW46Y2F0aGVyaW5l`
When you decode you get `admin:catherine`

Flag: `CTFSG{catherine}`
