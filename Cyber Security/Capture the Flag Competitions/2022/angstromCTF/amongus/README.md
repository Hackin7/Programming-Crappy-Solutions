# amongus
![](Pasted%20image%2020220502200607.png)

## Solution

Goal: Find the different file

I basically found the md5 hash of all the files, and seperated the different md5 hash. I did this by putting all the md5 hashes into a file

```bash
(base) [hacker@hackerbook out]$ md5sum * > ../../thing.txt
```

I then replaced all the same md5 hashes with empty strings, such that it is easy to identify the different md5 hash and hence the flag

```
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b18f29fb8d5c}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b19d011a4da5}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b1b4714163ef}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b205645b3ad8}.txt
668cb9edd4cd2c7f5f66bee312bd1988  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b21f9732f829}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b28d14a08b47}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b2b75082b5df}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b2e73df3d9e4}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b333b706ed79}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b33902aea9a0}.txt
  actf{look1ng_f0r_answers_in_the_p0uring_r4in_b51e109722c9}.txt
```

## Flag

`actf{look1ng_f0r_answers_in_the_p0uring_r4in_b21f9732f829}`