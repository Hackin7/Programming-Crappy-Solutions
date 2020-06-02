import flask
app = flask.Flask(__name__)
@app.route('/A')
def view_A():
    return flask.render_template('A.html')

@app.route('/B')
def view_B():
    return flask.render_template('B.html')

@app.route('/C')
def view_C():
    return flask.render_template('C.html')

@app.route('/D')
def view_D():
    return flask.render_template('D.html')

if __name__ == '__main__':
    app.run()
