import os
for i in range(64):
    os.system("unzip Matryoshka"+str(64-i)+'.zip')

os.system('rm *.zip')
os.system('strings bin.jpg| grep WH2020{')
