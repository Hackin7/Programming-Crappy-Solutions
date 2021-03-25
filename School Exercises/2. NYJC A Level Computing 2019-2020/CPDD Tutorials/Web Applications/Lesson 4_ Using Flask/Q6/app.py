import flask
app = flask.Flask(__name__)

@app.route('/')
def home():
    return flask.render_template('links.html')

@app.route('/greeting')
def hello():
    return 'Hello, World!'

@app.route('/<int:year>')
def report(year):
    return 'year is ' + str(year)

if __name__ == '__main__':
    app.run()
