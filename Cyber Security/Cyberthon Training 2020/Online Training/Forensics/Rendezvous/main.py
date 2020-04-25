import base64

with open('smtpdata','rb') as f:
    base64_bytes = f.read()

with open('attachment','wb') as f:
    f.write(base64.b64decode(base64_bytes))
