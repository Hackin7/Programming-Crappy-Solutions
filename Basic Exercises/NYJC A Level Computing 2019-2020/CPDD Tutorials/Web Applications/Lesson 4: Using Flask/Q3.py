import flask

app = falsk.Flask(__name__)

NAMES = [
    'Janurary', 'Feburary', 'March', 'April',
    'May', 'June', 'July', 'August',
    'September', 'October', 'November', 'December'
]

@app.route('/')
def home():
    return 'Home'

@app.route('/<int:month>')
