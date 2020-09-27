# Task 4.4
import sqlite3
import flask
app = flask.Flask(__name__)

@app.route('/')
def main():
    return flask.render_template('form.html')

STATEMENT = """
SELECT Candidate.CandidateNo, Name
FROM Candidate INNER JOIN Vote ON Candidate.CandidateNo == Vote.CandidateNo
INNER JOIN Student ON Vote.MatricNo == Student.MatricNo
WHERE Student.MatricNo == ?
ORDER BY Candidate.CandidateNo ASC;
"""
@app.route('/table', methods=['POST'])
def table():
    matricno = flask.request.form['matricno']

    # Retrieve data from database
    conn = sqlite3.connect("../voting_mgm.db")
    data = conn.execute(STATEMENT, (matricno, )).fetchall()
    conn.close()
    
    # Templating
    title = f"Candidates voted by student with matriculation number {matricno}"
    header = ["CandidateNo", "Name"]
    return flask.render_template('table.html', title=title, header=header, data=data)

app.run('0.0.0.0', 5000, debug=True)
# Test Data: RVHS-2015289
