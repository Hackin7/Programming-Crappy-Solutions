[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-using-application-functionality-to-exploit-insecure-deserialization](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-using-application-functionality-to-exploit-insecure-deserialization) 

-   login    
-   change token avatar_link
-   O:4:"User":3:{s:8:"username";s:6:"wiener";s:12:"access_token";s:32:"russibxh8c6vkhdvy75iyj6g8a88zvb2";s:11:"avatar_link";s:23:"/home/carlos/morale.txt";}7

[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-data-types](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-data-types)

-   Change session cookie username to administrator
-   error message about invalid access token,
-   Lists access tokens in error msg
-   brute force access tokens there

[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-objects](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-objects) 
-   Login
-   Session cookie put in cyberchef
-   URL decode, Base64 decode
-   Change admin to 1
-   Refresh webpage and access admin panel
