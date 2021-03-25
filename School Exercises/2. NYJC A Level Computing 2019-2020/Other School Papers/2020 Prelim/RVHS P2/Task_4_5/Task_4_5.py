# Task 4.5
import sqlite3
import flask
import os

### Database ######################################################
UPLOAD_STATEMENT = """
UPDATE Candidate
SET PortraitLink = ?
WHERE CandidateNo == ?;
"""
DB_NAME = "../voting_mgm.db"
def uploadImagePath(candidateNo, path):
    conn = sqlite3.connect(DB_NAME)
    data = conn.execute(UPLOAD_STATEMENT, (path, candidateNo))
    conn.commit()
    conn.close()
    
GET_STATEMENT = """
SELECT Candidate.CandidateNo, Name, Slogan, PortraitLink
FROM Candidate 
WHERE Candidate.CandidateNo == ?
ORDER BY Candidate.CandidateNo ASC;
"""
def getCandidateData(candidateNo):
    # Retrieve data from database
    conn = sqlite3.connect(DB_NAME)
    data = conn.execute(GET_STATEMENT, (candidateNo, )).fetchall()
    conn.close()
    return data

### Web App #######################################################
app = flask.Flask(__name__)

@app.route('/')
def main():
    return flask.render_template('form.html')

@app.route('/upload', methods=['POST'])
def upload():
    candidateNo = int(flask.request.form['candidateNo'])
    ## Upload ##########################
    if flask.request.files:
        image = flask.request.files['image']
        extension = image.filename.split('.')[-1]
        if extension != 'png':
            message = f"Upload Not Successful: File not png, has extension .{extension}"
        else:
            # Save Image
            path = os.path.join('static/portraits/', f'portrait_{candidateNo:02}.png')
            image.save(path)
            # Save to Database
            staticPath = os.path.join('portraits/', f'portrait_{candidateNo:02}.png')
            uploadImagePath(candidateNo, staticPath)
            message = "Upload Successful"
    else:
        message = "Upload Not Successful: No file uploaded"

    ## Get Data ##########################
    data = getCandidateData(candidateNo)
    for index in range(len(data)):
        data[index] = list(data[index])
        imgPath = data[index][3]
        imgURL = flask.url_for('static', filename=imgPath)
        data[index][3] = f"<img src='{imgURL}' alt='{imgPath}'> "

    ## Templating ##########################
    header = ['Candidate Number','Name', 'Slogan', 'Portrait Image']
    return flask.render_template('upload.html',
                                 message=message,
                                 header=header,
                                 data=data)

app.run('0.0.0.0', 5000, debug=True)
