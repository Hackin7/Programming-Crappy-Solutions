#!/usr/bin/env python


infile = open("janitorin.txt")
outfile = open("janitorout.txt", "w")

###Infile#####################################
data = [int(i) for i in infile.read().split()]
R, C, Q = data[0:3]

h = [[0 for j in range(C)] for i in range(R)]
for i in range(R):
    for j in range(C):
        h[i][j] = data[3+i*C + j]
#print(region)
#print(h)
#############################################
def output():
    #print(tilesToFill)
    outfile.write(str(tilesToFill)+"\n")

####################################################
directions = [[0,1],[0,-1],[1,0],[-1,0]]
filling = [[False for j in range(C)] for i in range(R)]
tilesToFill = 0 #No tiles to put water on
def checktile(x, y):
    toFill = True #Assume need put water
    #Neighbours
    for dx, dy in directions:
        nx, ny = x+dx, y+dy
        if (nx < 0 or ny < 0 or nx >= C or ny >=R):
            continue
        #print(x, y, nx, ny, h[ny][nx])
        if h[ny][nx] > h[y][x]:
            toFill = False #Should let water flow on it
            break
    if (filling[y][x] != toFill):
        filling[y][x] = toFill
        global tilesToFill
        if toFill:tilesToFill += 1
        #Remove if like no need to be filled anymore. For other round of filling
        else: tilesToFill-=1 
for i in range(R):
    for j in range(C):
        checktile(j, i)
output()

replacements = [int(i) for i in data[3+R*C:3+R*C + Q*3]]
for i in range(Q):
    ri = replacements[i*3]-1
    ci = replacements[i*3+1]-1
    hi = replacements[i*3+2]
    #print(ri, ci, hi)
    h[ri][ci] = hi
    x, y = ci, ri
    checktile(x, y)
    for dx, dy in directions:
        nx, ny = x+dx, y+dy
        if (nx < 0 or ny < 0 or nx >= C or ny >=R):
            continue
        else: checktile(nx, ny)
    output()

infile.close()
outfile.close()
