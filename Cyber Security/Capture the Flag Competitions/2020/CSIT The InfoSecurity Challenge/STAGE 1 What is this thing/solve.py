# Run in python 2
ZIP_FILE = "04979fdc74cffb769440fd8c69a7c5c0.zip"
PASSWORD = "9a035a"

import os
def route(inname,out):
    if inname != out:
        os.system("mv "+inname+" "+out)
        
def unzip(filename, out="temp.mess"):
    os.system("unzip"+" -P "+PASSWORD+" "+ZIP_FILE)
    route("temp.mess",out)

def unGZ(filename, out):
    os.system("gunzip "+filename)
    route(filename.split('.')[0],out)
def unXz(filename, out):
    command = "xz -d "+filename
    print('Command:' + command)
    os.system(command)
    route(filename.split('.')[0],out)

def unZlib(filename,out):
    command = 'zlib-flate -uncompress < '+filename+' | cat > '+out
    os.system(command)

def reverseHexDump(filename, outFile = "rawFile"):
    with open(filename) as f:
        data = f.read()
    
    # Read 2 characters at a time
    intData = []
    charAtTime = 2
    for i in range(0,len(data),charAtTime):
        intData.append(int( data[i:i+charAtTime] ,16))
    
    byteData = bytes(intData)
    with open(outFile,'wb') as f:
        f.write(byteData)

def readInJson(file, out):
    with open(file) as f:
        data = f.read()
    processedData = eval(data)

    strData = ""
    for i in processedData:
        strData += chr(i)
    with open(out,'w') as f:
        f.write(strData)

#############################################################################
        
def legacy():
    os.system('rm temp*')

    unzip(ZIP_FILE,'temp.gz')
    unGZ('temp.gz','temp.gz')
    unGZ('temp.gz','temp.zlib')
    unZlib('temp.zlib','temp')
    reverseHexDump('temp','temp.json')
    readInJson('temp.json', 'temp.xz')
    os.system('rm temp')
    unXz('temp.xz', 'temp.gz')
    unGZ('temp.gz','temp.xz')
    unXz('temp.xz', 'temp')

    reverseHexDump('temp','temp.json')
    readInJson('temp.json', 'temp')
    reverseHexDump('temp', 'temp')
    readInJson('temp', 'temp.zlib')

    unZlib('temp.zlib','temp.bzip')
    os.system("dtrx temp.bzip && mv temp.bzip.1 temp.zlib")
    unZlib('temp.zlib','temp')
    reverseHexDump('temp','temp.json')
    readInJson('temp.json', 'tempb64')
    readInJson('temp.json', 'test')
    #os.system('$ cat tempb64 | base64 -d > test')
    
    #os.system('rm temp*')

def singleExtraction(filename, outfile):
    cmd = os.popen('file '+filename).read()
    cmdOut = cmd.split(':')[1]
    print(cmdOut)
    
    if 'gzip compressed data' in cmdOut:
        #unGZ(filename,outfile)
        os.system("dtrx "+filename+" && mv "+filename+".1 "+outfile)
        
    elif 'XZ compressed data' in cmdOut:
        os.system('mv '+filename+' '+filename+'.xz')
        unXz(filename+'.xz', outfile)
        
    elif 'zlib compressed data' in cmdOut:
        unZlib(filename, outfile)
        
    elif 'ASCII text, with very long lines' in cmdOut:
        with open(filename) as f:
            data = f.read()
        b64Identify = False
        for i in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
            if i in data: b64Identify = True
        if b64Identify: #base64
           os.system("cat "+filename+" | base64 -d > "+outfile)
        else:
            reverseHexDump(filename,outfile)
            
    elif 'JSON data' in cmdOut:
        readInJson(filename, outfile)
        
    elif 'bzip2 compressed data' in cmdOut:
        os.system("dtrx "+filename+" && mv "+filename+".1 "+outfile)
        
    else:
        os.system("cp "+filename+" undoneyet")
        raise Exception("Not implemented file type of "+cmdOut)


def scriptRun(ogFile):
    os.system("cp "+ogFile+" "+ogFile+str(0))
    counter = 0
    while True:
        inf , outf = ogFile+str(counter), ogFile+str(counter+1) 
        try:
            singleExtraction(inf, outf)
        except Exception as e:
            print(str(e))
            raise Exception(str(e)+"\nCurrent counter at "+str(counter))
        counter += 1

if True:
    legacy()
#singleExtraction('tempb64', 'temp8')
scriptRun('test')
#reverseHexDump('temp1','temp.json')
