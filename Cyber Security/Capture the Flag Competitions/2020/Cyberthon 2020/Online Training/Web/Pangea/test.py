import json

flag = open('flag.txt').read().strip()
country_code = {}
with open('countries.json') as f:
    country_code = json.loads(f.read())

class Country(object):
    def __init__(self, name, code):
        self.name = name
        self.code = code
        
countries = {x:Country(x, country_code[x]) for x in country_code.keys()}

def get_code(country):
    try:
        print(f'{country.lower()}.code}}'.format(**countries))
        
        data = {
            'Name': country.lower(),
            'Code': f'{{{country.lower()}.code}}'.format(**countries)
        }
    except Exception as e:
        print(e)
        data = {
            'error': 'country not found!'
        }

    return data
print(get_code("french southern territories"))
