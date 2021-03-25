```
$ ltrace ./padoru
setvbuf(0x7f744492c980, 0, 2, 0)                                                                        = 0
setvbuf(0x7f744492d6a0, 0, 2, 0)                                                                        = 0
fopen("/home/padoru/aeskey", "r")                                                                       = 0
exit(1 <no return ...>
+++ exited (status 1) +++
```

I modified the binary to `padoru_modified` such that it opens the aes key from 
![1_Modify_Binary.png]()