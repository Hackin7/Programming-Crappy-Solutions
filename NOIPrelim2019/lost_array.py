N, M = raw_input().split(" ")
N, M = int(N), int(M)
X = [1 for i in range(N)]
for abc in range(M):
	a, b, c =[int(n) for n in raw_input().split(" ")]
	a -=1
	b-=1
	if min(X[a],X[b]) == c:pass
	if min(X[a],X[b]) < c:
		if X[a]<c:X[a]=c
		if X[b]<c:X[b]=c
	if min(X[a],X[b]) > c:
		if X[a]>c:X[a]=c
		if X[b]>c:X[b]=c

for i in range(N):
	print X[i],
	#if i < N-1: print " ",
