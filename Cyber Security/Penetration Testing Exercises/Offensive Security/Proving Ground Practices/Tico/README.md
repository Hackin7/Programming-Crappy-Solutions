# Tico

# Enumeration
## nmap

## 21 - FTP
```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.177.143
Connected to 192.168.177.143.
220 (vsFTPd 3.0.3)
Name (192.168.177.143:kali): admin
530 This FTP server is anonymous only.
Login failed.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220131224057.png)
![](Pasted%20image%2020220131224118.png)

### Analysing debug.pcap

![](Pasted%20image%2020220131224348.png)

![](Pasted%20image%2020220131224458.png)

![](Pasted%20image%2020220131224520.png)

```
  

....................admin.$cmd..............isMaster......saslSupportedMechs.....admin.admin..client......application......name.....MongoDB Shell...driver.;....name.....MongoDB Internal Client..version.....4.0.22...os.R....type.....Linux..name.....Ubuntu..architecture.....x86_64..version.....18.04....0...o....................................ismaster...maxBsonObjectSize......maxMessageSizeBytes..l...maxWriteBatchSize..... localTime....#w....logicalSessionTimeoutMinutes......minWireVersion......maxWireVersion......readOnly...saslSupportedMechs.-....0.....SCRAM-SHA-1..1.....SCRAM-SHA-256...ok........?......................{....saslStart......mechanism.....SCRAM-SHA-256..payload.-....n,,n=admin,r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeK.$db.....admin......p.....................conversationId......done...payload.u....r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeKoGtDP4x0LH5WZgQ9xFMJEJknBHTp6N1D,s=zOa0kWA/OTak0a0vNaN0Zh2drO1uekoDUh4sdg==,i=15000.ok........?...........................saslContinue......payload.x....c=biws,r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeKoGtDP4x0LH5WZgQ9xFMJEJknBHTp6N1D,p=/nW1YVs0JcvxU48jLHanbkQbZ4GFJ8+Na8fj7xM1s98=.conversationId......$db.....admin..}...q................h....conversationId......done...payload......v=vhcU/F2qejXXkfHa5nCX8APoKCTgYTozS0rvhLuTq9Q=.ok........?.]....................H....saslContinue......payload.......conversationId......$db.....admin..O...r................:....conversationId......done...payload.......ok........?.9....................$....whatsmyuri......$db.....admin..?...s................*....you.....127.0.0.1:51072..ok........?.<....................'....buildinfo........?.$db.....admin......t.....................version.....4.0.22..gitVersion.)...1741806fb46c161a1d42870f6e98f5100d196315..modules.......allocator. ...tcmalloc..javascriptEngine.....mozjs..sysInfo.....deprecated..versionArray.!....0......1......2......3.......openssl.V....running.....OpenSSL 1.1.1 11 Sep 2018..compiled.....OpenSSL 1.1.1 11 Sep 2018...buildEnvironment......distmod.....ubuntu1804..distarch.....x86_64..cc.2.../opt/mongodbtoolchain/v2/bin/gcc: gcc (GCC) 5.4.0..ccflags.+...-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp..cxx.2.../opt/mongodbtoolchain/v2/bin/g++: g++ (GCC) 5.4.0..cxxflags.9...-Woverloaded-virtual -Wno-maybe-uninitialized -std=c++14..linkflags.....-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro..target_arch.....x86_64..target_os.....linux...bits.@....debug...maxBsonObjectSize......storageEngines.L....0.....devnull..1.....ephemeralForTest..2.....mmapv1..3.....wiredTiger...ok........?.
```

`r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeK.$db`


## 80 - Web

## 8080 - Web NodeBB

## 27017 - MongoDB

```
┌──(kali㉿kali)-[/tmp]
└─$ mongo 192.168.177.143:27017
MongoDB shell version v5.0.5
connecting to: mongodb://192.168.177.143:27017/test?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("ce0d2aa0-16c3-42af-bb11-a838f09cb29e") }
MongoDB server version: 4.0.22
WARNING: shell and server versions do not match
================
Warning: the "mongo" shell has been superseded by "mongosh",
which delivers improved usability and compatibility.The "mongo" shell has been deprecated and will be removed in
an upcoming release.
For installation instructions, see
https://docs.mongodb.com/mongodb-shell/install/
================
> show dbs
> show collections
Warning: unable to run listCollections, attempting to approximate collection names by parsing connectionStatus
> show dbs
> exit
bye
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploit


# Others