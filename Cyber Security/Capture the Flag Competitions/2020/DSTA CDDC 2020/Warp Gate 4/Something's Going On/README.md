# Something's Going On

969, GATE 4, 21 SOLVES 

## Description

Looks like we found a hidden secret left behind by one of the Resistance Fighters while they were snooping around Unduplicitous Corp's network.

All we have to go on is this pcap file. How about it? Can you discover its secret?

MD5("analyse.pcap"): 5f76953e753ffd56eae5532d63b7a391

## Attached Files

[analyse.pcap](https://junior-api.cddc2020.nshc.sg/file?id=ckc4y8h6g05ey0786agwqf5ff&name=analyse.pcap)

# Solution

First thing to do is to attempt to extract all the html objects and whatnot. Most of the HTML files are basically 404 or homepage messages. There are other files like `secret.bin`, `ImptRead.pdf`, `memo.log` and more, sent by FTP.

One interesting thing noted in the `.pcap` is that the header includes this: `User-Agent: struts-pwn (https://github.com/mazen160/struts-pwn_CVE-2018-11776)`. On going to that github, its an exploit for Apache Struts CVE-2018-11776. This along with the other HTTP objects suggests that this is running Apache Struts. 

Another interesting thing is that there is actually a console log (saved in `console_log.txt`) which reads out:
```
root@internal-dev-app: ~/.ssh.root@internal-dev-app:~/.ssh# cat priv.pem
cat priv.pem
-----BEGIN RSA PRIVATE KEY-----
MIICXAIBAAKBgQDSo1HHOcvenn8C52mtF/bUkWkmn4n/TNuNp8Anuhx1NmJni0gh
QhTIk0G/uIYHDJJ/z66MJmS6NzysiLm5UjQKitL4HmGGn+i6RQehdrga7N0WZjVg
5ThqCe5Dwue5BjxqtaYocOFVoz7N6uz4cxdHK37kmYxl1x7ztD75+ogv/QIDAQAB
AoGABFyHW/WxZ/mmLZw3DvN5E+uy3q7c/6FKxoMbsnbjEfY/UV+L7cxde824xcx/
UfQLsIPPXG2LFmQAaJ4oIlM2apvX4h3Tzlq/dxrY3HEYOKLg0TNNuKvQTmhOoTD6
t5dyfFHvZoqTkIhLKhP3EQkedtLCerUlucQMg+O7CNSkBw0CQQDwnHJgTBJFQZZB
Mi+QwbX5abPYqPGV5aZlzTRVstu4OKXU8764pzfEf0edXcbw1i2n/pcfU/BPRsv/
DrvJScfvAkEA4Bweaoacbq8XgUsb4a/jtLufpzhNECEbb92eHu70qqDFXUJz6UGk
Z8QrudFo7/SEoB5+OEypQ3/gunwp4Rf60wJBAKeYQW7j7eIBojg9TbZlx2w3/UaP
vt7rPHEycx6yW6tBAfmH4jPafdTH10k8tcKxXNHkWr0+iWee5578Uz8Mvk8CQCVb
CobfITwh210l0+PumZoKnDYXYGEL47Ll0fF+CzJV0hAVf5Sl6G2TeWZjzYYRz/mQ
m6FuxdgGfMMY5zIp+RkCQDW752YJGEjUhMpXbnUrtQx8sMVX26kZMRyw/jBMa6ne
EQ3ImmpYWT37c23+FkdBtz+/ErVR+eP83vfSFd4tiGY=
-----END RSA PRIVATE KEY-----
.]0;root@internal-dev-app: ~/.ssh.root@internal-dev-app:~/.ssh# cat pub.pem
cat pub.pem
-----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDSo1HHOcvenn8C52mtF/bUkWkm
n4n/TNuNp8Anuhx1NmJni0ghQhTIk0G/uIYHDJJ/z66MJmS6NzysiLm5UjQKitL4
HmGGn+i6RQehdrga7N0WZjVg5ThqCe5Dwue5BjxqtaYocOFVoz7N6uz4cxdHK37k
mYxl1x7ztD75+ogv/QIDAQAB
-----END PUBLIC KEY-----
```

After extracting the key I was stuck though and didn't continue with the challenge. But then [my friend](https://github.com/undefined-func) took over and extracted `secret.bin` with the key in the console log.

# Flag
`CDDC20{STOP_STRUTTING_AROUND}`