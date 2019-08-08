filepath = "A-large-practice.in"
infile = open(filepath, "r")
t = int(infile.readline().strip())

cases = []
for i in range(t):
    n = int(infile.readline().strip())
    words = []
    for w in range(n):
        words.append(infile.readline().strip())
    cases.append(words)
infile.close()

output = ""
for case in range(len(cases)):
    output += f"Case #{case+1}: "
    
    comparison = []
    for i in cases[case]:
        comparison.append(len(set(list(i.replace(" ", "")))))
    #Max
    maxIndex = 0
    for i in range(1,len(cases[case])):
        if comparison[maxIndex] < comparison[i]:
            maxIndex = i
        elif comparison[maxIndex] == comparison[i]:
            if cases[case][maxIndex] > cases[case][i]:
                maxIndex = i
    output+=cases[case][maxIndex]+"\n"
        
print(output)
 
outfile = open(filepath[:-2]+"out", 'w')
outfile.write(output)
outfile.close()
