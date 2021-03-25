from flask import Flask, render_template, request, url_for
import sqlite3

app = Flask(__name__)


@app.route('/')
def index():
    return render_template("index.html")


@app.route("/search", methods=['GET', 'POST'])
def search():
    # RVHS-2020001
    if request.method == "GET":
        return render_template("search.html")
    else:
        matric_no = request.form['matric_no']
        query = """
        SELECT Candidate.CandidateNo, Candidate.Name
        FROM Candidate, Vote
        WHERE Candidate.CandidateNo = Vote.CandidateNo
        AND Vote.MatricNo = ?
        """

        conn = sqlite3.connect("voting_mgm.db")
        cursor = conn.execute(query, (matric_no, ))
        result = cursor.fetchall()
        cursor.close()
        conn.close()

        return render_template("result.html", result=result)


if __name__ == '__main__':
    app.run(host='127.0.0.1', port=8000, debug=False)
