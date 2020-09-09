import sqlite3
from datetime import datetime
import flask
app = flask.Flask(__name__)

@app.route('/<location_id>')
def form(location_id):
    return flask.render_template('checkin.html', locationid=location_id)

@app.route('/checkin/<location_id>')
def checkin(location_id):
    name = flask.request.args['name']
    nric = flask.request.args['nric']
    contact = flask.request.args['contact-no']
    now = datetime.now()
    date = f"{now.year:04d}{now.month:02d}{now.day:02d}"
    timein = f"{now.hour:02d}{now.minute:02d}"

    # Insert into DB
    conn = sqlite3.connect("EntryDB.db")
    conn.execute("INSERT INTO Visitor(NRIC, LocationID, Name, Contact, Date, TimeIn) VALUES(?,?,?,?,?,?)",
                 (nric, location_id, name, contact, date, timein))
    conn.commit()
    conn.close()
    return flask.render_template('checkedin.html', tag=f'{nric}/{location_id}/{date}/{timein}')

@app.route('/checkout/<nric>/<location_id>/<date>/<timein>')
def checkout(nric, location_id, date, timein):
    now = datetime.now()
    timeout = f"{now.hour:02d}{now.minute:02d}"

    conn = sqlite3.connect("EntryDB.db")
    conn.execute("UPDATE Visitor SET TimeOut=?"
                 "WHERE NRIC==? AND LocationID==? AND Date==? AND TimeIn==?;",
                 (timeout,nric, location_id, date, timein))
    conn.commit()
    conn.close()
    return flask.render_template('checkedout.html', nric=str(nric), location_id=location_id)

app.run('0.0.0.0', 5000, debug=True)
