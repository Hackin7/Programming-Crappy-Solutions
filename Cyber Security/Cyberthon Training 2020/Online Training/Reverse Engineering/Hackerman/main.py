ebpvalues = [6,1,3,8,6,5,2,4,7]
var3 = 1264792680
ebp_9 = 1097691699
ebp_5 = 110


ebp_a8=0
eax = 0
edx = 0
for i in range(9):
    eax = ebpvalues[-i]+ebp_a8
    #(i+arg)%255
    edx = (i+var3)%255+5
    print(chr(edx-eax),end="")

# FACH@EBDG
