#filepath = "test.in"
#infile = open(filepath, "r")

def getInput():
    return input().strip()
    #return infile.readline().strip()

t = int(getInput())
cases = []
for case in range(t):
    n,p = [int(i) for i in getInput().split()]
    s = [int(i) for i in getInput().split()]
    cases.append({"n":n, "p":p, "s":s})
infile.close()

outputData = ""
def output(data, end="\n"):
    global outputData
    outputData += data + end

'''#WRONG           
for case in range(len(cases)):
    s = cases[case]["s"]#sorted(cases[case]["s"])
    chosen = {}
    for i in range(len(s)):
        if s[i] not in chosen.keys():
            chosen[s[i]] = 0
        chosen[s[i]] += 1
    chosenList = list(chosen.items())
    chosenList.sort(key=lambda x: x[1], reverse=True)
    
    flatCL = []
    for i in chosenList:
        for j in range(i[1]):
            flatCL.append(i[0])
    selected = []
    for i in range(cases[case]["p"]):
        selected.append(s[i])
    #print(selected,flatCL)
    
    minHours = 0
    for i in range(cases[case]["p"]):
        minHours += selected[-1] - selected[i]  
        
    output("Case #"+str(case+1)+": "+str(minHours))
'''
for case in range(len(cases)):
    n = cases[case]["n"]
    p = cases[case]["p"]
    s = sorted(cases[case]["s"], reverse=True)

    curr_sum = sum(s[0:p])
    start = 0
    end = p 
    hours = s[start]*p - curr_sum
    while end != n:
        curr_sum -= s[start]
        curr_sum += s[end]
        start+=1
        end+=1
        curr_hours = s[start]*p - curr_sum
        hours = min(hours, curr_hours)
    output("Case #"+str(case+1)+": "+str(hours))

print(outputData)

#outfile = open(filepath[:-2]+"out", 'w')
#outfile.write(outputData)
#outfile.close()

