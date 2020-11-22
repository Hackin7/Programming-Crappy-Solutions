import flask
app = flask.Flask(__name__)

@app.route('/<name>')
def view(name):
    return flask.render_template('template.html',
                                 name=name)

if __name__ == '__main__':
    app.run()
