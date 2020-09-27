import sqlite3
import flask

### Database ###########################################################
def checkInEntry(postalCode, date, time, nric, phoneno):
    conn = sqlite3.connect('covid.db')
    conn.execute("INSERT INTO event(NRIC, Phone, PostalCode, CheckIn, Date, CheckOut)"
                 " VALUES(?,?,?,?,?,?)",
                 (nric, phoneno, postalCode, time, date, ''))
    conn.commit()
    conn.close()

def checkOutEntry(postalCode, date, time, nric, phoneno):
    conn = sqlite3.connect('covid.db')
    conn.execute("UPDATE event SET CheckOut = ? WHERE"
                 " NRIC==? AND Phone==? AND PostalCode==? AND Date == ?;",
                 (time, nric, phoneno, postalCode, date))
    conn.commit()
    conn.close()

### Form Processing ###########################################################
def rejectEmptyInputs():
    for field in flask.request.form.keys():
        if flask.request.form[field] == "":
            return True
    return False

def retrieveFormData():
    postalCode = flask.request.form['postalCode']
    date = flask.request.form['date']
    time = flask.request.form['time']
    nric = flask.request.form['date']
    phoneno = flask.request.form['phoneno']
    return postalCode, date, time, nric, phoneno    

### Web App ###########################################################
app = flask.Flask(__name__, static_folder='/', template_folder='./')

@app.route('/')
def main():
    return flask.redirect(flask.url_for('checkOut'))

@app.route('/checkout', methods=['GET', 'POST']) # Can GET request here, direct access
def checkOut():
    if flask.request.method == 'POST':
        if rejectEmptyInputs():
            return f"Not all fields are filled up"
        postalCode, date, time, nric, phoneno = retrieveFormData()
        checkOutEntry(postalCode, date, time, nric, phoneno)
    return flask.render_template('Task4_index.html')

@app.route('/checkin', methods=['POST']) # Can only POST request here, no direct access
def checkIn():
    ### Processing data #########
    if rejectEmptyInputs():
        return f"Not all fields are filled up"
    postalCode, date, time, nric, phoneno = retrieveFormData()
    checkInEntry(postalCode, date, time, nric, phoneno)
    ### Render #################
    return flask.render_template('Task4_checkout.html')
    
app.run('0.0.0.0', 5000, debug=True)
