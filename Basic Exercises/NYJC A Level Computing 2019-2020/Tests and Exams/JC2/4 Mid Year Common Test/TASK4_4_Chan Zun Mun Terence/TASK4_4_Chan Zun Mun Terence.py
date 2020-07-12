import sqlite3


import flask
app = flask.Flask(__name__)

@app.route('/')
def location():
    # The optimal way would be to put this in a HTML file
    # but that is left as an exercise to you (Also worsens stuff)
    return """
<!doctype html>
<html>
    <head></head>
    <body>
        <h1> Enter Location</h1>
        <form method="GET" action="/show">
		<input type="text" name="location">
		<input type="submit">
        </form>
    </body>
</html>
"""

@app.route('/show', methods=["GET"])
def show():
    data = []
    location = flask.request.args['location']
    conn = sqlite3.connect("../equipment.db")
    cursor = conn.execute('SELECT SerialNumber, Type FROM Device WHERE Writtenoff == "FALSE" AND Location == ?;', (location, ))
    dbData = cursor.fetchall()
    for i in dbData:
        data.append((i[0],i[1]))
    conn.close()
    print(data)
    return flask.render_template('show.html', data=data)


if __name__ == "__main__":
    app.run(port=5000, debug=True)
