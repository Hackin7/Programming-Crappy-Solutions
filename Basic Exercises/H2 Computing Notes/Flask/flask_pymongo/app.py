import pymongo
import flask

### MongoDB ##############################
DB_NAME = "TestDB"
COLL_NAME = "TestColl"

def mongoGet():
    client = pymongo.MongoClient('127.0.0.1', 27017)
    db = client.get_database(DB_NAME)
    coll = db.get_collection(COLL_NAME)
    return client, db, coll

def mongoClear():
    client = pymongo.MongoClient('127.0.0.1', 27017)
    client.drop_database(DB_NAME)
    client.close()
    
def mongoInsert(item):
    client, db, coll = mongoGet()
    coll.insert_many([ite])
    client.close()
    
def mongoDisplay():
    client, db, coll = mongoGet()
    data = []
    for record in coll.find({}):
        data.append(record)
    client.close()
    return data

### Web App ###############################
app = flask.Flask(__name__)

@app.route('/')
def main():
    return flask.render_template_string("""
    <h1>Main</h1>
    <ol>
        <li><a href="{{url_for('insertRoute')}}">Insert</a></li>
        <li><a href="{{url_for('displayRoute')}}">Display</a></li>
    </ol>
    """)

@app.route('/insert', methods=["GET", "POST"])
def insertRoute():
    if flask.request.method == "GET":
        return flask.render_template_string("""
        <form action="{{url_for('insertRoute')}}" method="POST" enctype="multipart/form-data">
            <label for="key">Key:</label><input type="text" name="key" >
            <label for="value">Value:</label><input type="text" name="value" >
            <input type="submit">
        </form>
        """)
    else:
        key = flask.request.form['key']
        value = flask.request.form['value']
        
        client, db, coll = mongoGet()
        coll.insert_one({key: value})
        return "Inserted"

@app.route('/display')
def displayRoute():
    data = mongoDisplay()
    header = []
    for record in data:
        keys = record.keys()
        for key in keys:
            if key not in header:
                header.append(key)

    print(header, data)
    return flask.render_template_string("""
    <table>
        <tr>
            {% for col in header %}
            <th>{{col}}</th>
            {% endfor %}
        </tr>
        
        {% for item in data %}
        <tr>
            {% for col in header %}
            <td>
            {{item.get(col)}}
            </td>
            {% endfor %}
        </tr>
        {% endfor %}
    
    </table>
    """, header=header, data=data)

app.run('0.0.0.0', debug=True)
