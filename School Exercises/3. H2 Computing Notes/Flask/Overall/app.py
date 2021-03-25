import flask
app = flask.Flask(__name__)

@app.route('/')
def main():
    return flask.render_template('main.html')

### 3: HTTP Requests and Routing ##################################
base = '/simple'
@app.route(base + '/') # Path name
def simple():
    return 'Simple stuff. Try passing in longer paths next time?'

## Variable Routes
@app.route(base + '/greet/<data>') # More complex paths
def simple_data(data):
    return f'You gave the data {data}'

@app.route(base + '/<int:integer>') # Get Path <data_type:identifier>
def simple_integer(integer):
    return f'You gave the integer {integer}'

## Generate Paths from function names
@app.route(base + '/func_paths')
def func_name_paths():
    return '<b>Paths</b>:' + '<br/>' + \
            f'General path: {flask.url_for("simple")}' + '<br/>' + \
            f'Path and passing in arguments: {flask.url_for("simple_integer", integer=1)}'

## Methods
@app.route('/data/', methods=['POST'])
def post_data():
    return 'You are using POST'

@app.route('/data/', methods=['GET'])
def get_data():
    return 'You are using GET'

### 4: HTTP Responses and Status Codes ##############################
base = '/responses'

## Changing Status Code
@app.route(base + '/get_500')            
def get_500():
    return ('', 500)

@app.route(base + '/header')
def header():
    headers = {'Content-Type': 'text/plain'}
    return ('<b>This is not HTML!</b>', 200, headers)

@app.route(base + '/redirect')
def redirect():
    return flask.redirect(flask.url_for('main'))

### 5 & 6: Templating and Rendering #################################
@app.route('/templating') # Path name
def templating():
    dictionary = {'Key 1':'Value 1', 'Key 2':'Value 2'}
    return flask.render_template('template.html',
                                 value="sample_value",
                                 safe_html="<i>This is html stuff</i>",
                                 choice=1,
                                 dictionary=dictionary)

### 7 & 8: Forms
@app.route('/form', methods=['GET','POST'])
def form():
    if flask.request.method == "GET":
        return f" The data is given in <code>flask.request.args</code> like this: <code>{flask.request.args}</code>"
    elif flask.request.method == "POST":
        print(flask.request.form)
        return f"The data is given in <code>flask.request.form</code> like this: <code>{flask.request.form}</code>"

from werkzeug.utils import secure_filename
import os
@app.route('/upload', methods=['POST'])
def upload():
    if flask.request.files:
        print(flask.request.files)
        file = flask.request.files['file']
        filename = secure_filename(file.filename)
        path = './' + filename
        file.save(path)
        return f'<h1>Uploaded {file.filename}</h1>'
    else:
        return '<h1>Nothing uploaded</h1>'

@app.route('/download')    
def download():
    return flask.send_from_directory("./","app.py")


### Running Code ##################################################
if __name__ == '__main__':
    app.run(host="0.0.0.0", port=5000, debug=True)
