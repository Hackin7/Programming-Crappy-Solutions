from flask import Flask, render_template, request
import sqlite3


app = Flask(__name__)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/upload_portrait', methods=["GET", "POST"])
def upload_portrait():
    # Ee Pei Chi Neoma
    if request.method == "GET":
        return render_template('upload_portrait.html')
    else:
        name = request.form['name']
        portrait_image = request.files['image']

        if portrait_image.filename != "":
            # checks that the file extension is of defined type
            if portrait_image.filename.split('.', 1)[1].lower() == "png":
                # get room type id
                query = """
                SELECT CandidateNo
                FROM Candidate
                WHERE Name = ?
                """

                conn = sqlite3.connect("voting_mgm.db")
                cursor = conn.execute(query, (name,))
                candidate_no = cursor.fetchone()[0]
                conn.commit()
                conn.close()

                # format to new file name
                new_name = "portrait_{:02}.png".format(candidate_no)
                image_link = 'static/portraits/' + new_name

                # save file to destinated folder
                portrait_image.save(image_link)

                # update database
                query = """
                UPDATE Candidate
                SET PortraitLink = ?
                WHERE CandidateNo = ?
                """

                conn = sqlite3.connect("voting_mgm.db")
                conn.execute(query, (image_link, candidate_no))
                conn.commit()
                conn.close()

                # retrieve updated info from db
                query = """
                SELECT *
                FROM Candidate
                WHERE CandidateNo = ?
                """

                conn = sqlite3.connect("voting_mgm.db")
                cursor = conn.execute(query, (candidate_no,))
                candidate_info = cursor.fetchone()
                conn.commit()
                conn.close()

                return render_template("success_upload.html",
                                       candidate_info=candidate_info)
            else:
                return "Upload failed because file is not an valid image."
        else:
            return "No file was submitted."


if __name__ == '__main__':
    app.run(host='127.0.0.1', port=8001, debug=False)
