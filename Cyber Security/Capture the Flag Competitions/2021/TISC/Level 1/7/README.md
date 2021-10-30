# Challenge Name

### Description

## Solution
https://www.itprotoday.com/security/q-what-are-exact-roles-windows-accounts-sid-and-more-specifically-its-rid-windows-security 
https://www.wikihow.com/Find-a-Users-SID-on-Windows#:~:text=Type%20WMIC%20useraccount%20get%20name,replace%20USER%20with%20the%20username).

```
C:\Users\adam>wmic useraccount get name, sid
Name                SID
adam                S-1-5-21-271853984-2378250948-965456637-1002
Administrator       S-1-5-21-271853984-2378250948-965456637-500
DefaultAccount      S-1-5-21-271853984-2378250948-965456637-503
Guest               S-1-5-21-271853984-2378250948-965456637-501
WDAGUtilityAccount  S-1-5-21-271853984-2378250948-965456637-504
```

## Flag

`TISC{1-Guest-DefaultAccount}`
