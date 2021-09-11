# Gatekeeping

### Description

## Solution

After reading the code and the related files, a strategy I thought of is to
1. Bypass the blocking from nginx and access `/admin/key`
2. Put it in the HTTP header and decode the file

Looking at the comments
```
# === CL Review Comments - 5a7b3f
# <Alex> Is this safe?
# <Brad> Yes, because we have `deny all` in nginx.
# <Alex> Are you sure there won't be any way to get around it?
# <Brad> Here, I wrote a better description in the nginx config, hopefully that will help
# <Brad> Plus we had our code audited after they stole our coins last time
# <Alex> What about dependencies?
# <Brad> You are over thinking it. no one is going to be looking. everyone we encrypt is so bad at security they would never be able to find a bug in a library like that
# ===
```

Looks like it's time to look at dependencies and vulnerabilities. Good practice since I heard I'll be doing that for OSCP too.

When researchiing about gunicorn and nginx, looks like they have this vulnerability HTTP Request Smuggling.

## Flag
``
