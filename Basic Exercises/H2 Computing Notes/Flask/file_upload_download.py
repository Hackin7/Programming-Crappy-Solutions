import flask
app = flask.Flask(__name__)

@app.route("/", methods=["GET"])
def page():
    return """
    <form action="/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" id="file">
        <input type="submit"/>
    </form>
    """

@app.route("/upload", methods=["POST"])
def upload():
    if flask.request.files:
        print(flask.request.files)
        file = flask.request.files['file']
        file.save('./'+file.filename)
        return "Uploaded "+file.filename
    else:
        return "Notthing to upload"

@app.route("/download", methods=["GET"])
def download():
    return flask.send_from_directory('./','file_upload_download.py')

app.run('0.0.0.0', port=5000, debug=True)
