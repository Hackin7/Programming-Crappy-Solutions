import flask
import sqlite3

### Database Functions ##########################
DBNAME = "main.db"
def login(TeacherUsername, TeacherPassword):
    conn = sqlite3.connect(DBNAME)
    cursor = conn.execute("SELECT TeacherUsername FROM Teacher"
                          " WHERE TeacherUsername == ? AND TeacherPassword == ?",
                          (TeacherUsername, TeacherPassword))
    count = 0
    for record in cursor:
        count += 1
    conn.close()
    return count == 1

def insertStudentScore(StudentIndex, Class, PresentationDate, Marks):
    conn = sqlite3.connect(DBNAME)
    conn.execute("INSERT INTO StudentScore(StudentIndex, Class, PresentationDate, Marks)"
                 " VALUES(?, ?, ?, ?);",
                 (StudentIndex, Class, PresentationDate, Marks)
                )
    conn.commit()
    conn.close()

def totalByTeacher(TeacherUsername):
    total = {}
    conn = sqlite3.connect(DBNAME)
    cursor = conn.execute("SELECT Lesson.Class, Lesson.PresentationDate, (Marks) FROM StudentScore INNER JOIN Lesson"
                          " ON StudentScore.PresentationDate == Lesson.PresentationDate"
                          " AND StudentScore.Class == Lesson.Class"
                          " WHERE Lesson.TeacherUsername == ? ;", 
                          (TeacherUsername,))
    data = []
    for record in cursor:
        data.append(record)
        if total.get(record[0]) == None:
            total[record[0]] = record[2]
        else:
            total[record[0]] += record[2]
    conn.close()
    return data, total
        

### Web App Functions ###########################
app = flask.Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def form():
    if flask.request.method == 'GET':
        return flask.render_template('form.html')
    elif flask.request.method == 'POST':
        data = flask.request.form

        submit = data['submit']
        TeacherUsername = data['TeacherUsername']
        TeacherPassword = data['TeacherPassword']
        StudentIndex = data['StudentIndex']
        Class = data['Class']
        PresentationDate = data['PresentationDate']
        Marks = data['Marks']
        
        if login(TeacherUsername, TeacherPassword):
            ### Options ###
            if submit == "Insert":
                insertStudentScore(StudentIndex, Class, PresentationDate, Marks)
                return "Inserted"
            elif submit == 'View For Student':
                return "" # Tell me what you want idk what to do DHS paper nlmao
            elif submit == 'Show Total Marks for your classes': # Task 3.5
                data, total = totalByTeacher(TeacherUsername)
                headers = ['Class', 'PresentationDate', 'Total Marks']
                return flask.render_template('table.html', headers=headers, data=data)
        else:
            return "Wrong Teacher Credentials"

app.run('0.0.0.0', 5000, debug=True)
