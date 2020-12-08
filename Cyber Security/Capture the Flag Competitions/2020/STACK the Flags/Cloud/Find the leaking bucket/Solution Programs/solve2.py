from zipfile import ZipFile
from givenwordlist import *

zip_file = '../secret-files.zip'
with open("givenwords.txt", 'w') as f:
    for x in lst:
        f.write(x+'\n')
        try:
            zf.extractall(pwd=bytes(password,'utf-8'))
            print(password)
        except:
            pass

#for password in lst:
for x in lst:
    for y in lst:
        password = f"{x}-{y}"
        with ZipFile(zip_file) as zf:
            try:
                zf.extractall(pwd=bytes(password,'utf-8'))
                print(password)
            except:
                pass
        
