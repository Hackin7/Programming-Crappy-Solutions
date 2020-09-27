# Task 2.3
from flask import Flask, render_template, request
import sqlite3
app = Flask(__name__)


### Form Processing ##################################
def fieldsEmpty():
    for item in request.form.keys():
        if request.form[item] == "":
            return True
    return False
### Web App ##########################################
@app.route('/')
def main():
    return render_template('index.html')

@app.route('/form', methods=["POST"]) # Only POST Requests -> Prevent direct access
def form():
    ### Read from Form #######################
    if fieldsEmpty():
        return "Not all fields filled up"
    matricno = int(request.form['MatricNo'])
    
    ### Read from database ###################
    conn = sqlite3.connect("../school.db")
    cursor = conn.execute("SELECT Student.Name, Gender, CivicsClass, Tutor, Homeroom, CCAName, TeacherIC "
                          " FROM (Student INNER JOIN Civics ON Student.CivicsClass==Civics.Class) INNER JOIN "
                          " (StudentCCA INNER JOIN CCAInfo ON StudentCCA.CCAName==CCAInfo.Name) "
                          " ON Student.MatricNo == StudentCCA.MatricNo "
                          " WHERE Student.MatricNo == ?;", 
                         (matricno, ))
    for record in cursor:
        name, gender, civicsclass, tutor, homeroom, ccaname, teacherIC = record
    conn.close()
    
    return render_template('info.html', 
                           matricno=matricno, 
                           name=name, 
                           gender=gender, 
                           civicsclass=civicsclass, 
                           tutor=tutor, 
                           homeroom=homeroom, 
                           ccaname=ccaname, 
                           teacherIC=teacherIC, 
                          )

@app.route('/cca', methods=['POST'])
def cca():
    matricno = int(request.form['MatricNo'])
    change_cca = request.form.get("change")
    if change_cca == "N":
        return render_template("the_end.html")
    elif change_cca == "Y":
        db = sqlite3.connect('../school.db')
        c = db.cursor()
        c.execute('''SELECT Name from CCAInfo''')
        data = []
        for record in c:
            data.append(record[0])
        
        db.close()
        return render_template("cca.html", data=data, matricno=matricno)
    
@app.route('/update', methods=['POST'])
def update():
    matricno = int(request.form['MatricNo'])
    cca = request.form.get('cca')
    #return f"{cca} {matricno}"
    
    conn = sqlite3.connect("../school.db")
    conn.execute("UPDATE StudentCCA SET CCAName=? WHERE MatricNo==?;", (cca, matricno))
    conn.commit()
    conn.close()
    return render_template("success.html", matricno=matricno, cca=cca)
app.run(debug=True, port=5000)
