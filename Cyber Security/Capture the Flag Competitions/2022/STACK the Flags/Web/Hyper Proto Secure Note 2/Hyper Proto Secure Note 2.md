
### Bypassing IDOR

![[Pasted image 20221203095043.png]]

Since `fastapi` is replaced with an empty string...

http://157.230.242.192:30853/fastapi/retrievekey?uid=3&fastapiuid=2

will become

http://localhost:8000/retrievekey?uid=3&uid=2

and can lead to leak

Either way this is what I got

![[Pasted image 20221203100133.png]]

## Now what

### Enumerating FastAPI

Like not much diff eh

http://157.230.242.192:30853/fastapi/openapi.json?uid=3&fastapiuid=2

```json
{"components":{"schemas":{"HTTPValidationError":{"properties":{"detail":{"items":{"$ref":"#/components/schemas/ValidationError"},"title":"Detail","type":"array"}},"title":"HTTPValidationError","type":"object"},"ValidationError":{"properties":{"loc":{"items":{"type":"string"},"title":"Location","type":"array"},"msg":{"title":"Message","type":"string"},"type":{"title":"Error Type","type":"string"}},"required":["loc","msg","type"],"title":"ValidationError","type":"object"}}},"info":{"title":"FastAPI","version":"0.1.0"},"openapi":"3.0.2","paths":{"/":{"get":{"operationId":"root__get","responses":{"200":{"content":{"application/json":{"schema":{}}},"description":"Successful Response"}},"summary":"Root"}},"/retrievekey":{"get":{"operationId":"hpp_retrievekey_get","parameters":[{"in":"query","name":"uid","required":true,"schema":{"title":"Uid","type":"string"}}],"responses":{"200":{"content":{"application/json":{"schema":{}}},"description":"Successful Response"},"422":{"content":{"application/json":{"schema":{"$ref":"#/components/schemas/HTTPValidationError"}}},"description":"Validation Error"}},"summary":"Hpp"}}}}
```


## Experimental Dark mode feature?

![[Pasted image 20221203100233.png]]



### Maybe trying to get to admin panel

# Others

Possible endpoints to exploit from part 1

```
/
/signup
/login
/logout

/health
/list
/profile/<uid>

/fastapi/<apiname>
/securenote/<key>

/admin
/admin-notified
```

## Secret Key

Hmm now can request limit increase
![[Pasted image 20221203101250.png]]

![[Pasted image 20221203101313.png]]

Looking at the source code, the code to notify admin is 
```html
 <div class="position-relative">
     <input type="submit" value="Submit" class="btn btn-primary"/>
     <!-- Currently only available for VIP users -->
     <input type="button" value="Request Limit Increase" onclick='location="/admin-notified"' class="btn btn-outline-primary m-2" />
 </div>
```

![[Pasted image 20221203102031.png]]

Can edit the referrer but cannot get it call custom endpoint

## Darkmode

Not in index page
![[Pasted image 20221204140035.png]]

But in other page

![[Pasted image 20221204140121.png]]

looks like its in that side sidebar

```
    <script>
    function onloadswitchmode(){
      let params = $.deparam(location.search.slice(1));
      if(params.mode){
        if(params.mode==="dark"){
          document.body.classList.toggle("dark");
        }
      }
      let tFunc = _.template('');
    }
    $(document).ready( onloadswitchmode )
    </script>
    
```

Hmm lodash template?
https://www.geeksforgeeks.org/lodash-_-template-method/

# Flag