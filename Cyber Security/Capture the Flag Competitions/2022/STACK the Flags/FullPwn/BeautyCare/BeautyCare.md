
# Enumeration

```
nm(base) [hacker@hackerbook ~]$ nmap -sV 10.129.255.215
Starting Nmap 7.92 ( https://nmap.org ) at 2022-12-02 22:34 +08
Nmap scan report for 10.129.255.215
Host is up (0.22s latency).
Not shown: 998 closed tcp ports (conn-refused)
PORT   STATE SERVICE VERSION
22/tcp open  ssh     OpenSSH 8.2p1 Ubuntu 4ubuntu0.5 (Ubuntu Linux; protocol 2.0)
80/tcp open  http    nginx 1.18.0 (Ubuntu)
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 28.17 seconds
(base) [hacker@hackerbook ~]$
```

## Service Enumeration

Enumerated `/admin`

```js
const blank_field_error = (field_id, message) => {
    $(`#${field_id}`).css('border', '2px solid red');
    $(`#${field_id}`).css('color', 'red');

    $('#message').text(message);

    setTimeout(() => {
        $('#message').text('');

        $(`#${field_id}`).css('border', 'none');
        $(`#${field_id}`).css('color', 'black');
    }, 5000);
}

const is_empty = str => !str.trim().length;

const setCookie = (name, value, days) => {
    var expires = '';
    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days*24*60*60*1000));
        expires = `; expires=${date.toUTCString()}`;
    }
    document.cookie = `${name}=${value}${expires}; path=/`;
}

const login = () => {
    username = $('#username-input').val();
    password = $('#password-input').val();

    if (is_empty(username)) {
        blank_field_error('username-input', 'Please fill all the fields!');
        return;
    }

    if (is_empty(password)) {
        blank_field_error('password-input', 'Please fill all the fields!');
        return;
    }

    data = JSON.stringify({
        query: `mutation {\n    LoginUser(username: "${username}", password: "${password}"){\n        message,\n        token    \n}\n}`
    })

    fetch('/graphql', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: data
    })
        .then((res) => res.json())
        .then((data) => {
            if (data.errors) {
                $('#message').text(data.errors[0].message);

                setTimeout(() => {
                    $('#message').text('')
                }, 5000);
            }
            else {
                setCookie('session', data.data.LoginUser.token, 1);
		window.location.href = '/admin/otp_verfification';
            }
        })
}

const otp_verification = () => {
    code = $("#code-input").val();

    if (is_empty(code) || code.length < 4) {
        blank_field_error('code-input', 'Please enter 4 digit code');
        return;
    }


    data = JSON.stringify({
        query: `mutation {\n    verify2FA(otp: "${code}"){\n        message,\n        token    \n}\n}`
    })

    fetch('/graphql', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: data
    })
        .then((res) => res.json())
        .then((data) => {
            if (data.errors) {
                $('#message').text(data.errors[0].message);

                setTimeout(() => {
                    $('#message').text('');
                    if (data.errors[0].message === 'Total number of tries exceed! Please login again' || data.errors[0].message === 'OTP expired! Please login again!' || data.errors[0].message === 'Authentication required!') {
                        window.location.href = '/admin';
                    }
                }, 3000);

            }
            else {
                $('#message').text("Verification Complete!");
                setTimeout(() => {
                    setCookie('session', data.data.verify2FA.token, 1);
		    window.location.href = '/admin/dashboard';
                }, 2000)
            }
        })
}
```

## Graph QL

https://book.hacktricks.xyz/network-services-pentesting/pentesting-web/graphql

```http
POST /graphql HTTP/1.1
Host: 10.129.255.84
Content-Length: 48
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Content-Type: application/json
Accept: */*
Origin: http://10.129.255.84
Referer: http://10.129.255.84/admin
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Connection: close

{"query":"{__schema{types{name,fields{name}}}}"}
```

```json
HTTP/1.1 200 OK
Server: nginx/1.18.0 (Ubuntu)
Date: Sat, 03 Dec 2022 05:24:09 GMT
Content-Type: application/json; charset=utf-8
Content-Length: 1350
Connection: close
X-Powered-By: Express

{"data":{"__schema":{"types":[{"name":"Query","fields":[{"name":"_dummy"}]},{"name":"String","fields":null},{"name":"Mutation","fields":[{"name":"LoginUser"},{"name":"verify2FA"}]},{"name":"Response","fields":[{"name":"message"},{"name":"token"}]},{"name":"Boolean","fields":null},{"name":"__Schema","fields":[{"name":"description"},{"name":"types"},{"name":"queryType"},{"name":"mutationType"},{"name":"subscriptionType"},{"name":"directives"}]},{"name":"__Type","fields":[{"name":"kind"},{"name":"name"},{"name":"description"},{"name":"specifiedByUrl"},{"name":"fields"},{"name":"interfaces"},{"name":"possibleTypes"},{"name":"enumValues"},{"name":"inputFields"},{"name":"ofType"}]},{"name":"__TypeKind","fields":null},{"name":"__Field","fields":[{"name":"name"},{"name":"description"},{"name":"args"},{"name":"type"},{"name":"isDeprecated"},{"name":"deprecationReason"}]},{"name":"__InputValue","fields":[{"name":"name"},{"name":"description"},{"name":"type"},{"name":"defaultValue"},{"name":"isDeprecated"},{"name":"deprecationReason"}]},{"name":"__EnumValue","fields":[{"name":"name"},{"name":"description"},{"name":"isDeprecated"},{"name":"deprecationReason"}]},{"name":"__Directive","fields":[{"name":"name"},{"name":"description"},{"name":"isRepeatable"},{"name":"locations"},{"name":"args"}]},{"name":"__DirectiveLocation","fields":null}]}}}
```


Most importantly are these

```
"types":[{"name":"Query","fields":[{"name":"_dummy"}]},{"name":"String","fields":null},{"name":"Mutation","fields":[{"name":"LoginUser"},{"name":"verify2FA"}]},{"name":"Response","fields":[{"name":"message"},{"name":"token"}]},
```


Another request

```http
POST /graphql HTTP/1.1
Host: 10.129.255.84
Content-Length: 106
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Content-Type: application/json
Accept: */*
Origin: http://10.129.255.84
Referer: http://10.129.255.84/admin
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Connection: close

{"query":"{__schema{types{name,fields{name,args{name,description,type{name,kind,ofType{name, kind}}}}}}}"}
```

And important queries

```json
"types":[{"name":"Query","fields":[{"name":"_dummy","args":[]}]},{"name":"String","fields":null},{"name":"Mutation","fields":[{"name":"LoginUser","args":[{"name":"username","description":null,"type":{"name":null,"kind":"NON_NULL","ofType":{"name":"String","kind":"SCALAR"}}},{"name":"password","description":null,"type":{"name":null,"kind":"NON_NULL","ofType":{"name":"String","kind":"SCALAR"}}}]},{"name":"verify2FA","args":[{"name":"otp","description":null,"type":{"name":null,"kind":"NON_NULL","ofType":{"name":"String","kind":"SCALAR"}}}]}]},{"name":"Response","fields":[{"name":"message","args":[]},{"name":"token","args":[]}]},
```

# Others