import os
with open('stringdump') as f:
    data = f.read()

for line in data.split('\n'):
    os.system(f'echo "{line}" | python chall.py')
