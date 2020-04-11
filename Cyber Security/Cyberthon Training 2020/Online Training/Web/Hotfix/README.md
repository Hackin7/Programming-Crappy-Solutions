# Hotfix

# Experiments
The php code given tells us that we can't use the  `admin`,`'` and whitespaces. So the idea is to craft a SQL injection without needing any of those (Because doing it from the password is unrealistic)

BUT
1. the word `admin` is replaced first before replacing `'`. So theoretically, we can put in `ad'min` and it will become `admin` 


Google, my best friend

Fun things researched upon (may be a sidetrack)
1. % is a wildcard character
2. \ is an escape character
3. https://ctf-wiki.github.io/ctf-wiki/web/sqli/
4. https://websec.wordpress.com/2010/12/04/sqli-filter-evasion-cheat-sheet-mysql/


Unicode Escaping doesn't work


```
curl --form "username=ad'min%27--&password=pass" "http://challenges.csdc20t.ctf.sg:10043/login.php"
```
```
SQL error near "min": syntax error
```

Yay progress