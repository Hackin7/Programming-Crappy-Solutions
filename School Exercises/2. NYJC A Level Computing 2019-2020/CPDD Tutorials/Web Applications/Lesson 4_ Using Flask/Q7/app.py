import flask
from flask import request
app = flask.Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def home():
    if request.method == 'GET':
        return flask.render_template('form.html')
    else:
        name = request.form['name']
        address = request.form['address']
        return flask.render_template('results.html',
                                     name=name,
                                     address=address)

if __name__ == '__main__':
    app.run()
