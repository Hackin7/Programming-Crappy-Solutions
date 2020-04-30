#input_ = ""
flag = "r34l_g4m3rs_eXclus1v3"
theflag="ÄÑÓ¿ÂÒêáøz§è§ñy÷¦"
#theflag="ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã"

latter= theflag[len(theflag)//2:]
for i in latter:
    print(chr(ord(i)+20),end="")
print()

print(theflag)

input_ = ["" for i in range(len(flag))]

input_[0] = "h"
input_[1] = "0"
input_[7] = "u"
c = 0
for i in range(0,len(flag)-14):
    #ord(theflag[c]) = ord(flag[i]) + ord(input_[i+8])
    input_[i+8] = chr( ord(theflag[c]) - ord(flag[i]))
    print(i, i+8, input_[i+8])
    c+=1
for i in range(10,len(flag)-6):
    input_[i-8] = chr( ord(theflag[c]) - ord(flag[i]) )
    print(i, i-8,ord(theflag[c]) - ord(flag[i]), input_[i-8])
    c+=1

for i in range(len(flag)-6, len(flag)):
    print(i, ord(theflag[c]) - ord(flag[i-3]),chr( ord(theflag[c]) - ord(flag[i-3]) ) )
    input_[i] = chr( ord(theflag[c]) - ord(flag[i-3]) )
    c+=1


    
ans = "rtcp{"
for i in input_:
    ans += i

ans += "}"
print(ans, len(ans)-6, len(flag))

# rtcp{h04l_g4u3rs_eXclus1v3}
