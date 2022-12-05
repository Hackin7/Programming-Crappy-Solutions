
`admin:admin`


```
@app.route("/fastapi/", methods=["GET"])
@app.route("/fastapi/<apiname>", methods=["GET"], strict_slashes=False)
@login_required
def retrievekey(apiname=''):
    '''Obtain a secure note key from backend API. 
    Update: Remediated IDOR attack from recent PT report.'''
```

Hmm former vuln, means this is most likely not fully fixed yet

So I tested this

1. Login as `admin`
2. http://localhost:5000/fastapi/retrievekey?uid=2 to access endpoint
3. Got the secret key

Hmm no IDOR?

## Remote Instance

### Register for an account first

![[Web/Hyper Proto Secure Note 1/1.png]]

![[Web/Hyper Proto Secure Note 1/3.png]]

![[Web/Hyper Proto Secure Note 1/4.png]]

![[Web/Hyper Proto Secure Note 1/5.png]]

### Cannot access key

![[Web/Hyper Proto Secure Note 1/2.png]]
![[Web/Hyper Proto Secure Note 1/6.png]]

### Hint

under `templates/profile.js`, basically hiding from admin?, But we can bypass using the uid check

```html
   {% if not user['isadmin'] and current_user.user['id'] == user['id'] %}
   <div>
       <h2>Access your secure note</h1>
       <p>
        Retrieve your secure private URL key <a href="/fastapi/retrievekey?uid={{ current_user.user['id'] }}">here</a>.<br>
       </p>
       <!-- hint: try to see other users' secure note -->
   </div>
```

Anyway we can get to admin?

### Handling URL?

```
http://localhost:5000/fastapi/?uid=3
```


```
FastAPI 0.1.0
```


Maybe we could smuggle in another `uid` parameter

/fastapi/retrievekey?uid=3&uid=2

![[7.png]]

![[8.png]]

# Flag


`STF22{iDOr_W1tH_ServerSide_HTTP_PaR@m3t3r_P0lluT10n_BypAss}`