import flask
import sqlite3
app = flask.Flask(__name__)

@app.route('/')
def form():
    return flask.render_template('form.html')

@app.route('/submit', methods=["POST"])
def generate():
    submission = flask.request.form['submit']
    if submission == 'Generate Report':
        data = report()
        return flask.render_template('table.html', data=data)
    else:
        insert(flask.request.form)
        return 'Data Inserted'

# Inserting into database

DATABASE = '../register.db'
def refresh():
    conn = sqlite3.connect(DATABASE)
    # remove existing tables
    tables = ['Registration', 'Arts', 'Cultural', 'Sports']
    try:
        for i in tables:
            conn.execute(f'DROP TABLE {i};')
    except Exception as e:
        print(e)
    # Create new tables
    commands = []
    with open('../TASK4_1_Chan Zun Mun Terence.sql') as f:
        commands = f.read().split('\n\n')
    for c in commands:
        conn.execute(c)
    # Commit
    conn.commit()
    conn.close()
    
def insert(data):
    conn = sqlite3.connect(DATABASE)
    # Insert into Registration Table
    reg_type = data['type'].strip()
    generalInsert = (data['studentid'], reg_type, data['venue'], data['session'])
    conn.execute('INSERT INTO Registration(StudentID, Type, Venue, Session) VALUES(?,?,?,?)',
                 generalInsert)
    # Insert into specific tables
    if reg_type == 'A':
        specificInsert = (data['studentid'], data['performance'])
        conn.execute('INSERT INTO Arts(StudentID, Performance) VALUES(?,?)',
                     specificInsert)
    elif reg_type == 'C':
        specificInsert = (data['studentid'], data['race'])
        conn.execute('INSERT INTO Cultural(StudentID, Race) VALUES(?,?)',
                     specificInsert)
    elif reg_type == 'S':
        specificInsert = (data['studentid'], data['contact'], data['cost'])
        conn.execute('INSERT INTO Sports(StudentID, Contact, Cost) VALUES(?,?, ?)',
                     specificInsert)
    conn.commit()
    conn.close()

def report():
    conn = sqlite3.connect(DATABASE)
    cursor = conn.execute('SELECT StudentID, Type FROM Registration WHERE Session=="AM";')
    data = []
    for record in cursor:
        data.append(record)
    return data
    conn.close()

#refresh()
app.run('0.0.0.0', 5000, debug=True)
