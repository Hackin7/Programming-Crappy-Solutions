import sqlite3
import flask
app = flask.Flask(__name__)

@app.route('/', methods=['GET'])
def form():
    return flask.render_template('form.html')

@app.route('/products', methods=['POST'])
def products():
    ## Retrieve form data
    location = flask.request.form['Location']
    
    ## Connect to SQL Database
    conn = sqlite3.connect("../bakery.db")
    cursor = conn.execute("SELECT Name, Type, Price FROM Product"
                          " WHERE Location == ? ORDER BY Price ASC;",
                          (location,))
    data = []
    for record in cursor:
        data.append(record)

    # Display
    header = ['Name', 'Type', 'Price']
    return flask.render_template('products.html',
                                 location=location,
                                 header=header,
                                 data=data
                                 )

app.run('0.0.0.0', 5000, debug=True)
