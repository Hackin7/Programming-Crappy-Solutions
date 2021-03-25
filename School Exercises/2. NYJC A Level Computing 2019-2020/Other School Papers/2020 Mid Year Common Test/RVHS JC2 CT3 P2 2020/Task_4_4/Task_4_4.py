import flask
app = flask.Flask(__name__)

# Get the sql command

@app.route('/')
def form():
    return flask.render_template('form.html')

import sqlite3


@app.route('/table', methods=['POST'])
def table():
    student_class = flask.request.form['class']
    conn = sqlite3.connect("result_mgm.db")

    command = """
    SELECT Class, IndexNo, Name, Gender, MatricNo 
    FROM Student
    WHERE Class == ? 
    ORDER BY Student.IndexNo ASC;
    """

    cursor = conn.execute(command, (student_class,))
    data = []
    for i in cursor:
        data.append(i)
    return flask.render_template('table.html', data=data)
    
app.run('0.0.0.0', 5000, debug=True)
