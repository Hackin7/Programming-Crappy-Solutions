

import flask
import os
import subprocess
from flask import request
application = flask.Flask(__name__)


@application.route('/', methods=['GET'])
def home():
    env = {}
    for k, v in request.headers:
        env[k.upper().replace('-', '_')] = v
    output = subprocess.check_output(["python3", "welcome.py"], env=env)
    return output

if __name__ == '__main__':
    application.run(host="0.0.0.0", port=8000, debug=False)