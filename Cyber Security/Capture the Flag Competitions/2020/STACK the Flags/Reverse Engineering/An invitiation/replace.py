with open("Testing/invite_old.js") as f:
    data = f.read()

replaceList = [
    #('["\x2E\x47", "\x71\x75\x65\x72\x79\x53\x65\x6C\x65\x63\x74\x6F\x72", "\x77\x65\x62\x67\x6C", "\x67\x65\x74\x43\x6F\x6E\x74\x65\x78\x74", "\x63\x6C\x65\x61\x72\x43\x6F\x6C\x6F\x72", "\x63\x6C\x65\x61\x72", "\x73\x68\x61\x64\x65", "\x67\x65\x74\x41\x74\x74\x72\x69\x62\x75\x74\x65", "\x74\x79\x70\x65", "\x73\x6C\x69\x63\x65", "\x69\x64", "\x4B\x47", "\x7C\x7C\x7C\x7C\x7C\x7C\x66\x75\x6E\x63\x74\x69\x6F\x6E\x7C\x76\x61\x72\x7C\x7C\x68\x68\x68\x7C\x7C\x7C\x7C\x66\x6F\x72\x7C\x63\x68\x61\x72\x43\x6F\x64\x65\x41\x74\x7C\x69\x66\x7C\x6C\x65\x6E\x67\x74\x68\x7C\x65\x65\x65\x7C\x7C\x75\x75\x75\x7C\x7C\x6D\x6D\x6D\x7C\x7C\x7C\x63\x75\x73\x74\x6F\x6D\x7C\x66\x72\x6F\x6D\x43\x68\x61\x72\x43\x6F\x64\x65\x7C\x53\x74\x72\x69\x6E\x67\x7C\x76\x76\x76\x7C\x7C\x67\x67\x67\x7C\x6C\x6F\x63\x61\x74\x69\x6F\x6E\x7C\x63\x61\x74\x4C\x45\x44\x7C\x74\x79\x70\x65\x7C\x7C\x63\x6F\x6C\x6F\x72\x7C\x7C\x72\x6F\x75\x6E\x64\x65\x64\x7C\x66\x6F\x6E\x74\x5F\x74\x79\x70\x65\x7C\x62\x61\x63\x6B\x67\x72\x6F\x75\x6E\x64\x5F\x63\x6F\x6C\x6F\x72\x7C\x65\x30\x65\x30\x65\x30\x7C\x73\x69\x7A\x65\x7C\x72\x65\x74\x75\x72\x6E\x7C\x7A\x7A\x7A\x7C\x46\x46\x30\x30\x30\x30\x7C\x76\x61\x6C\x75\x65\x7C\x73\x65\x65\x64\x7C\x79\x79\x79\x7C\x72\x72\x72\x7C\x7C\x6F\x6F\x6F\x7C\x73\x6C\x69\x63\x65\x7C\x74\x74\x74\x7C\x66\x61\x6C\x73\x65\x7C\x77\x69\x6E\x64\x6F\x77\x7C\x65\x6C\x73\x65\x7C\x79\x6F\x75\x7C\x69\x69\x69\x7C\x6C\x65\x74\x7C\x59\x4F\x55\x7C\x7C\x63\x6F\x6D\x70\x61\x72\x65\x7C\x30\x78\x66\x66\x7C\x7C\x7C\x32\x33\x7C\x72\x65\x7C\x68\x6F\x73\x74\x6E\x61\x6D\x65\x7C\x63\x6F\x6E\x73\x6F\x6C\x65\x7C\x7C\x7C\x35\x37\x7C\x70\x72\x6F\x74\x6F\x63\x6F\x6C\x7C\x66\x69\x6C\x65\x7C\x35\x34\x7C\x6C\x6F\x67\x7C\x6D\x61\x78\x7C\x4D\x61\x74\x68\x7C\x39\x38\x7C\x72\x65\x71\x75\x65\x73\x74\x41\x6E\x69\x6D\x61\x74\x69\x6F\x6E\x46\x72\x61\x6D\x65\x7C\x74\x72\x75\x65\x7C\x30\x42\x42\x7C\x30\x30\x7C\x38\x38\x7C\x30\x39\x7C\x30\x46\x5A\x7C\x30\x32\x7C\x30\x44\x7C\x30\x36\x48\x44\x7C\x30\x33\x53\x7C\x33\x31\x7C\x67\x65\x74\x7C\x6E\x65\x77\x7C\x49\x6D\x61\x67\x65\x7C\x4F\x62\x6A\x65\x63\x74\x7C\x64\x65\x66\x69\x6E\x65\x50\x72\x6F\x70\x65\x72\x74\x79\x7C\x69\x64\x7C\x75\x6E\x65\x73\x63\x61\x70\x65\x7C\x69\x6E\x76\x69\x74\x65\x64\x7C\x32\x30\x30\x30\x7C\x70\x61\x74\x68\x6E\x61\x6D\x65\x7C\x63\x6F\x6E\x73\x74\x7C\x65\x63\x68\x7C\x7C\x73\x65\x74\x54\x69\x6D\x65\x6F\x75\x74\x7C\x57\x41\x4E\x54\x7C\x57\x45\x7C\x63\x75\x73\x74\x6F\x6D\x33\x7C\x63\x75\x73\x74\x6F\x6D\x32\x7C\x49\x4E\x56\x49\x54\x45\x44\x7C\x52\x45\x7C\x63\x75\x73\x74\x6F\x6D\x31\x7C\x64\x65\x62\x75\x67\x67\x65\x72\x7C\x31\x30\x30\x30\x7C\x69\x6E\x76\x69\x74\x65\x7C\x74\x68\x65\x7C\x61\x63\x63\x65\x70\x74\x69\x6E\x67\x7C\x61\x6C\x65\x72\x74\x7C\x54\x68\x61\x6E\x6B\x7C\x69\x6E\x64\x65\x78\x4F\x66\x7C\x67\x6F\x7C\x31\x31\x38\x7C\x33\x56\x33\x6A\x59\x61\x6E\x42\x70\x66\x44\x71\x35\x51\x41\x62\x37\x4F\x4D\x43\x63\x54\x7C\x6C\x65\x61\x48\x56\x57\x61\x57\x4C\x66\x68\x6A\x34\x7C\x61\x74\x6F\x62", "\x74\x6F\x53\x74\x72\x69\x6E\x67", "\x72\x65\x70\x6C\x61\x63\x65", "\x78\x3D\x5B\x30\x2C\x30\x2C\x30\x5D\x3B\x31\x43\x20\x59\x3D\x28\x61\x2C\x62\x29\x3D\x3E\x7B\x56\x20\x73\x3D\x27\x27\x3B\x64\x28\x56\x20\x69\x3D\x30\x3B\x69\x3C\x31\x65\x2E\x31\x64\x28\x61\x2E\x67\x2C\x62\x2E\x67\x29\x3B\x69\x2B\x2B\x29\x7B\x73\x2B\x3D\x71\x2E\x70\x28\x28\x61\x2E\x65\x28\x69\x29\x7C\x7C\x30\x29\x5E\x28\x62\x2E\x65\x28\x69\x29\x7C\x7C\x30\x29\x29\x7D\x46\x20\x73\x7D\x3B\x66\x28\x75\x2E\x31\x39\x3D\x3D\x27\x31\x61\x3A\x27\x29\x7B\x78\x5B\x30\x5D\x3D\x31\x32\x7D\x53\x7B\x78\x5B\x30\x5D\x3D\x31\x38\x7D\x66\x28\x59\x28\x52\x2E\x75\x2E\x31\x34\x2C\x22\x54\x27\x31\x33\x20\x31\x7A\x21\x21\x21\x22\x29\x3D\x3D\x31\x79\x28\x22\x25\x31\x45\x25\x31\x6A\x25\x31\x71\x25\x31\x37\x25\x31\x70\x25\x31\x6F\x25\x31\x6E\x25\x31\x6D\x25\x31\x6C\x25\x31\x69\x40\x4D\x22\x29\x29\x7B\x78\x5B\x31\x5D\x3D\x31\x6B\x7D\x53\x7B\x78\x5B\x31\x5D\x3D\x31\x72\x7D\x36\x20\x4B\x28\x29\x7B\x37\x20\x6A\x3D\x51\x3B\x37\x20\x47\x3D\x31\x74\x20\x31\x75\x28\x29\x3B\x31\x76\x2E\x31\x77\x28\x47\x2C\x27\x31\x78\x27\x2C\x7B\x31\x73\x3A\x36\x28\x29\x7B\x6A\x3D\x31\x68\x3B\x78\x5B\x32\x5D\x3D\x31\x62\x7D\x7D\x29\x3B\x31\x67\x28\x36\x20\x58\x28\x29\x7B\x6A\x3D\x51\x3B\x31\x35\x2E\x31\x63\x28\x22\x25\x63\x22\x2C\x47\x29\x3B\x66\x28\x21\x6A\x29\x7B\x78\x5B\x32\x5D\x3D\x31\x66\x7D\x7D\x29\x7D\x3B\x4B\x28\x29\x3B\x36\x20\x4E\x28\x4A\x29\x7B\x37\x20\x6D\x3D\x5A\x3B\x37\x20\x61\x3D\x31\x31\x3B\x37\x20\x63\x3D\x31\x37\x3B\x37\x20\x7A\x3D\x4A\x7C\x7C\x33\x3B\x46\x20\x36\x28\x29\x7B\x7A\x3D\x28\x61\x2A\x7A\x2B\x63\x29\x25\x6D\x3B\x46\x20\x7A\x7D\x7D\x36\x20\x55\x28\x68\x29\x7B\x50\x3D\x68\x5B\x30\x5D\x3C\x3C\x31\x36\x7C\x68\x5B\x31\x5D\x3C\x3C\x38\x7C\x68\x5B\x32\x5D\x3B\x4C\x3D\x4E\x28\x50\x29\x3B\x74\x3D\x52\x2E\x75\x2E\x31\x42\x2E\x4F\x28\x31\x29\x3B\x39\x3D\x22\x22\x3B\x64\x28\x69\x3D\x30\x3B\x69\x3C\x74\x2E\x67\x3B\x69\x2B\x2B\x29\x7B\x39\x2B\x3D\x71\x2E\x70\x28\x74\x2E\x65\x28\x69\x29\x2D\x31\x29\x7D\x72\x3D\x31\x5A\x28\x22\x31\x58\x2F\x2F\x6B\x2F\x31\x59\x3D\x22\x29\x3B\x6C\x3D\x22\x22\x3B\x66\x28\x39\x2E\x4F\x28\x30\x2C\x32\x29\x3D\x3D\x22\x31\x56\x22\x26\x26\x39\x2E\x65\x28\x32\x29\x3D\x3D\x31\x57\x26\x26\x39\x2E\x31\x55\x28\x27\x31\x44\x2D\x63\x27\x29\x3D\x3D\x34\x29\x7B\x64\x28\x69\x3D\x30\x3B\x69\x3C\x72\x2E\x67\x3B\x69\x2B\x2B\x29\x7B\x6C\x2B\x3D\x71\x2E\x70\x28\x72\x2E\x65\x28\x69\x29\x5E\x4C\x28\x29\x29\x7D\x31\x53\x28\x22\x31\x54\x20\x54\x20\x64\x20\x31\x52\x20\x31\x51\x20\x31\x50\x21\x5C\x6E\x22\x2B\x39\x2B\x6C\x29\x7D\x7D\x64\x28\x61\x3D\x30\x3B\x61\x21\x3D\x31\x4F\x3B\x61\x2B\x2B\x29\x7B\x31\x4E\x7D\x24\x28\x27\x2E\x31\x4D\x27\x29\x2E\x76\x28\x7B\x77\x3A\x27\x6F\x27\x2C\x79\x3A\x27\x23\x48\x27\x2C\x43\x3A\x27\x23\x44\x27\x2C\x45\x3A\x31\x30\x2C\x41\x3A\x35\x2C\x42\x3A\x34\x2C\x49\x3A\x22\x20\x57\x27\x31\x4C\x20\x31\x4B\x21\x20\x22\x7D\x29\x3B\x24\x28\x27\x2E\x31\x4A\x27\x29\x2E\x76\x28\x7B\x77\x3A\x27\x6F\x27\x2C\x79\x3A\x27\x23\x48\x27\x2C\x43\x3A\x27\x23\x44\x27\x2C\x45\x3A\x31\x30\x2C\x41\x3A\x35\x2C\x42\x3A\x34\x2C\x49\x3A\x22\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x20\x22\x7D\x29\x3B\x24\x28\x27\x2E\x31\x49\x27\x29\x2E\x76\x28\x7B\x77\x3A\x27\x6F\x27\x2C\x79\x3A\x27\x23\x48\x27\x2C\x43\x3A\x27\x23\x44\x27\x2C\x45\x3A\x31\x30\x2C\x41\x3A\x35\x2C\x42\x3A\x34\x2C\x49\x3A\x22\x20\x20\x20\x31\x48\x20\x31\x47\x20\x57\x21\x20\x20\x22\x7D\x29\x3B\x31\x46\x28\x36\x28\x29\x7B\x55\x28\x78\x29\x7D\x2C\x31\x41\x29\x3B", "\x5C\x77\x2B", "\x73\x68\x69\x66\x74", "\x70\x75\x73\x68", "\x30\x78\x32", "\x7C", "\x73\x70\x6C\x69\x74", "\x30\x78\x34", "", "\x66\x72\x6F\x6D\x43\x68\x61\x72\x43\x6F\x64\x65", "\x30\x78\x30", "\x30\x78\x31", "\x30\x78\x33", "\x5C\x62", "\x67"]', '[".G", "querySelector", "webgl", "getContext", "clearColor", "clear", "shade", "getAttribute", "type", "slice", "id", "KG", "||||||function|var||hhh||||for|charCodeAt|if|lengt…|go|118|3V3jYanBpfDq5QAb7OMCcT|leaHVWaWLfhj4|atob", "toString", "replace", "x=[0,0,0];1C Y=(a,b)=>{V s='';d(V i=0;i<1e.1d(a.g,…:10,A:5,B:4,I:"   1H 1G W!  "});1F(6(){U(x)},1A);", "\w+", "shift", "push", "0x2", "|", "split", "0x4", "", "fromCharCode", "0x0", "0x1", "0x3", "\b", "g"]'),
    #('[_0x3f3a[12], _0x3f3a[13], _0x3f3a[14], _0x3f3a[15], _0x3f3a[16]]', '["toString", "replace", "x=[0,0,0];1C Y=(a,b)=>{V s='';d(V i=0;i<1e.1d(a.g,…:10,A:5,B:4,I:"   1H 1G W!  "});1F(6(){U(x)},1A);", "\w+", "||||||function|var||hhh||||for|charCodeAt|if|lengt…|go|118|3V3jYanBpfDq5QAb7OMCcT|leaHVWaWLfhj4|atob"]'),
    ("_0x27631a", "_0x3db8"), # Same Function
    ("_0x92e4x2", "a"),
    ("_0x92e4x3", "b"),
    #("_0x92e4x5", "a5"),
    #("", ""),
    #("", ""),
    #("", ""),
]

### Generate Replace list #########################
def putToReplaceList(replaceList, lis, lisname):
    for i in range(len(lis)):
        replaceList.append(
            (f"[{lisname}[{i}]]", f'.{lis[i]}')
        )
        replaceList.append(
            (f"{lisname}[{i}]", f'"{lis[i]}"')
        )

_0x3f3a = [".G", "querySelector", "webgl", "getContext", "clearColor", "clear", "shade", "getAttribute", "type", "slice", "id", "KG", "||||||function|var||hhh||||for|charCodeAt|if|lengt…|go|118|3V3jYanBpfDq5QAb7OMCcT|leaHVWaWLfhj4|atob", "toString", "replace", "x=[0,0,0];1C Y=(a,b)=>{V s='';d(V i=0;i<1e.1d(a.g,…:10,A:5,B:4,I:\"   1H 1G W!  \"});1F(6(){U(x)},1A);", "\w+", "shift", "push", "0x2", "|", "split", "0x4", "", "fromCharCode", "0x0", "0x1", "0x3", "\b", "g"]
putToReplaceList(replaceList, _0x3f3a, "_0x3f3a")

# Redundant
#_0x55f3 = ["toString", "replace", "x=[0,0,0];1C Y=(a,b)=>{V s='';d(V i=0;i<1e.1d(a.g,…:10,A:5,B:4,I:\"   1H 1G W!  \"});1F(6(){U(x)},1A);", "\w+", "||||||function|var||hhh||||for|charCodeAt|if|lengt…|go|118|3V3jYanBpfDq5QAb7OMCcT|leaHVWaWLfhj4|atob"]
#putToReplaceList(replaceList, _0x55f3, "_0x55f3")

### Replacing stuff #############################
for before, after in replaceList:
    data = data.replace(before, after)
print(data)

with open("Testing/invite.js",'w') as f:
    f.write(data)
