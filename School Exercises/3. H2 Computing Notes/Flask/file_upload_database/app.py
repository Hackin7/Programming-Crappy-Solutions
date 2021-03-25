import sqlite3
import flask
from werkzeug.utils import secure_filename

### Database ################################
def create():
    conn = sqlite3.connect("files.db")
    try:
        conn.execute("DROP TABLE Files;")
    except:
        pass
    conn.execute("CREATE TABLE Files(Name TEXT PRIMARY KEY, Filename TEXTX);")
    conn.commit()
    conn.close()

def addFileEntry(file, filename):
    conn = sqlite3.connect("files.db")
    conn.execute("INSERT INTO Files(Name, Filename) VALUES(?,?);",
                 (file.filename, filename))
    conn.commit()
    conn.close()

def showFiles():
    data = []
    conn = sqlite3.connect("files.db")
    cursor = conn.execute("SELECT Name, Filename FROM Files;")
    for record in cursor:
        print(record)
        newRecord = list(record)
        filename = record[1]
        if record[0].split('.')[-1] in ['jpg', 'jpeg', 'png']:
            newRecord[1] = f"<img src='{flask.url_for('download', filename=filename)}'>"
        else:
            newRecord[1] = f"<a href='{flask.url_for('download', filename=filename)}'>Download</a>"
        data.append(newRecord)
    conn.close()
    print(data)
    return data

create()
### Web app ##############################
app = flask.Flask(__name__)

@app.route('/')
def main():
    options = {"Upload": 'upload', "Download":"files"}
    return flask.render_template_string("""
    <ol>
        {% for i in options.keys() %}
            <li><a href="{{url_for(options[i])}}">{{i}}</a></li>
        {% endfor %}
    </ol>
    """, options=options)

@app.route('/upload', methods=['GET', 'POST'])
def upload():
    if flask.request.method == "GET":
        return flask.render_template_string("""
        <h1>Upload File</h1>
        <form action='{{url_for("upload")}}' method="POST" enctype="multipart/form-data">
            <input type="file" name="file"><input type="submit">
        </form>
        """)
    else:
        if flask.request.files:
            file = flask.request.files['file']
            filename = secure_filename(file.filename)
            path = './'
            file.save(path + filename)
            addFileEntry(file, filename)
            return flask.redirect(flask.url_for('main'))
        else:
            return "Uploaded"

@app.route('/downloadlist', methods=['GET'])
def files():
    header = ['Name', 'Download']
    data = showFiles()
    return flask.render_template_string("""
    <table>
        <tr>
            {% for col in header %}
            <th>{{col}}</th>
            {% endfor %}
        </tr>

        {% for record in data %}
        <tr>
            {% for col in record %}
            <td>{{col|safe}}</td>
            {% endfor %}
        </tr>
        {% endfor %}
    </table>
    """, header=header, data=data)

@app.route('/download/<filename>')
def download(filename):
    return flask.send_from_directory('./', filename)


app.run('0.0.0.0', 5000, debug=True)
