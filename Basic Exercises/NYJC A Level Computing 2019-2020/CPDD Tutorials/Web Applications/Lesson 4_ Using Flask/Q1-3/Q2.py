import flask
app = flask.Flask(__name__)

@app.route('/<name>')
def home(name):
    return 'Hello, {}!'.format(name)

if __name__ == '__main__':
    app.run()
