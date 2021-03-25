import flask

app = flask.Flask(__name__)

NAMES = [
    'Janurary', 'Feburary', 'March', 'April',
    'May', 'June', 'July', 'August',
    'September', 'October', 'November', 'December'
]

@app.route('/')
def home():
    return 'Home'

@app.route('/<int:month>/')
def name_month(month):
    if month in range(1, 13):
        return 'Month {}: {}'.format(month, NAMES[month - 1])
    return 'Invalid month'

@app.route('/compare/<float:temp>/')
def compare_temp(temp):
    if temp > 35.5:
        return 'It\'s hot!'
    if temp < 25.5:
        return 'It\'s cold!'
    return 'It\'s normal!'

@app.route('/greet/')
def greet():
    return 'Hello!'

@app.route('/greet/<name>/')
def greet_name(name):
    return 'Hello, {}!'.format(name)

@app.route('/data/', methods=['POST'])
def post_data():
    return 'You are using POST'

@app.route('/data/', methods=['GET'])
def get_data():
    return 'You are using GET'

if __name__ == '__main__':
    app.run()
