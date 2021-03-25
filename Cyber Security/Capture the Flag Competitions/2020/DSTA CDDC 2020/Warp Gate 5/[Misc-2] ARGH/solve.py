data = ['\x04','\x1e','\x76','\x24','\x6a','\x6a','\x48','\x01']
flag = 'CDDC{'+'a'*30+'}'

output = ''
for i in range(len(flag)):
    try:
        output += chr((ord(data[i])+64) ^ ord(flag[i]) )
    except:
        output+='a'

while len(output) <33:
    output+='a'

print(output)
