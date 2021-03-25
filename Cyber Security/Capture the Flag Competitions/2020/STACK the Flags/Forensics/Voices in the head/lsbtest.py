#!/usr/bin/env python3

# Testing LSB
#https://raw.githubusercontent.com/cyberyouthsg/cysc19-ctf/master/forensics/insignificant/solution/solution.py

import wave

song = wave.open("./forensics-challenge-2.wav", mode='rb')
# Convert audio to byte array
frame_bytes = bytearray(list(song.readframes(song.getnframes())))

# Extract the LSB of each byte
extracted = [frame_bytes[i] & 1 for i in range(len(frame_bytes))]
# Convert byte array back to string
string = "".join(chr(int("".join(map(str,extracted[i:i+8])),2)) for i in range(0,len(extracted),8))
# Cut off at the filler characters
flag = string.split("###")[0]

print(flag)

alphalist = 'asdfghjklqwertyuiopzxcvbnm{}'
alphalist += alphalist.upper()
with open('LSBout.txt', 'w') as f:
    for char in flag:
        if char in alphalist:
            try:f.write(char)
            except:pass
song.close()
