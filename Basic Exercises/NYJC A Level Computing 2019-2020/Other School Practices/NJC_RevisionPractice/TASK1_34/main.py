# Task 1.3
import flask

app = flask.Flask(__name__)

@app.route('/',methods=['GET'])
def form():
    return flask.render_template('form.html')

# Task 1.4
import sqlite3

@app.route('/query', methods=['POST'])
def query():
    print(flask.request.form)
    conn = sqlite3.connect("schools.db")
    cursor = conn.execute("SELECT SCHOOL.Name, STAFF.Name, STAFF.Department, STAFF.Contact, SCHOOL.Address"
                          " FROM STAFF INNER JOIN SCHOOL ON STAFF.SchoolCode==SCHOOL.SchoolCode"
                          " WHERE STAFF.Department == ?;",
                          (flask.request.form['department'],) )
    retrievedData = []
    for record in cursor:
        if flask.request.form['school-name'] in record[0]:
            retrievedData.append(record)
    conn.close()
    return flask.render_template('query.html', data=retrievedData)

# Task 1.3
if __name__ == "__main__":
    app.run('127.0.0.1',5000,debug=True)
