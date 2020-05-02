import sys
import logging

from flask import Flask, jsonify
import json

app = Flask(__name__)
flag = open('flag.txt').read().strip()

country_code = {}
with open('countries.json') as f:
    country_code = json.loads(f.read())

class Country(object):
    def __init__(self, name, code):
        self.name = name
        self.code = code

countries = {x:Country(x, country_code[x]) for x in country_code.keys()}
#countries['flag']=flag
@app.route('/', methods = ['GET'])
def home():
    data = {
        'specific country code': '/api/v1/:country:',
        'all country codes': '/api/v1/all'
    }
    return jsonify(data)

@app.route('/api/v1/all', methods = ['GET'])
def all_codes():
    return jsonify([{'Name': x.name, 'Code': x.code} for x in countries.values()])

@app.route('/api/v1/<string:country>', methods = ['GET'])
def get_code(country):
    print()
    print("Step 1:",'{{'+f'{country.lower()}'+'.code}}')

    step2 = f'{{{country.lower()}.code}}'
    print("Step 2:",step2)
    print(dir(countries["china"]))
    try:
        step3 = step2.format(**countries)
        #print(f'Data:{{{flag}}} {{{tokelau}.code}}'.format(**countries))
        data = {
            'Name': country.lower(),
            'Code': f'{{{country.lower()}.code}}'.format(**countries)
        }
    except Exception as e:
        print("Error:",e)
        data = {
            'error': 'country not found!'
        }


    return jsonify(data)


@app.errorhandler(404)
def not_found(e):
    data = {
    'error': str(e)
    }

    return jsonify(data)
app.run(debug=True)
