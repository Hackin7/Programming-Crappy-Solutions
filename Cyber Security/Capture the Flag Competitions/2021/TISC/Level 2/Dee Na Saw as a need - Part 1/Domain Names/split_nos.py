data = ""
nos = data
filenaame = 1#
with open("domain_names_extract.txt") as f:
    for line in f:
       nos += line[0:2].strip()
       data += (line[2:]).strip()

with open("data.txt", 'w') as f: f.write(data)
with open("no.txt", 'w') as f: f.write(nos)
