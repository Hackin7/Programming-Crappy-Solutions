s, e = raw_input().split(' ')
s = long(s)
e = long(e)

for i in range(s,e+1):
	check = str(i)
	if len(check)==1:
		print('Palindrome!')
		pass
	for c in range(long(len(check)/2)):
		if check[c] != check[-c-1]:
			print(check)
			break
		if (c == long(len(check)/2)-1):
			print('Palindrome!')


