inp=''
data = b''
with open("f") as f:
    inp = f.read()

data = bytes(inp,"ascii")

with open("ff.7z","wb") as f:
    f.write(data)
