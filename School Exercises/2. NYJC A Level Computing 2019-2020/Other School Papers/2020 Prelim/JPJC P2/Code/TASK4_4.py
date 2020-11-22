import sqlite3
from flask import *

app = Flask(__name__)

@app.route('/') #decorator for home page
def home():
       return render_template("index.html")
 
@app.route('/query', methods = ["POST"]) #path is set as query
def query():
       connection = sqlite3.connect("computercompany.db")
       
       data = request.form
       #retrieve values from webpage and store into data which is a dict 
       month = data["month"]       
       year = data["year"]

       if int(month) < 10:
              min_date = year+"/0"+month+"/00"
              max_date = year+"/0"+month+"/32"
       else:
              min_date = year+"/"+month+"/00"
              max_date = year+"/"+month+"/32"

       connection.row_factory = sqlite3.Row
       lst_results = []
       temp_results = []
       results = connection.execute("""SELECT SALESPERSON.SalesPersonName, SALESPERSON.OfficeID, SALE.Amount
                                          FROM SALE, SALESPERSON
                                          WHERE SALESPERSON.SalesPersonID = SALE.SalesPersonID
                                          AND SALE.SaleDate > ? AND SALE.SaleDate < ?""", (min_date, max_date)).fetchall()
       connection.close()

       dic = {}       
       for r in results:
              if r[1] not in dic:
                     dic[r[1]] = {r[0]:r[2]}
              else:
                     if r[0] not in dic[r[1]]:
                            dic[r[1]][r[0]] = r[2]
                     else:
                            dic[r[1]][r[0]] = dic[r[1]][r[0]] + r[2]

       offices = [] #number of salespersons in each office
       for office in dic:
              offices.append(len(dic[office]))                           
       
       for office in dic:
              for salesperson in dic[office]:
                     temp_results.append((office, dic[office][salesperson], salesperson))

       temp_results.sort()

       index = -1
       for num in offices:
              index += num
              lst_results.append(temp_results[index])      
              
       months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
       month = months[int(month)-1]
       
       return render_template("results.html", lst_results = lst_results, month = month, year = year)
       
if __name__ == '__main__':
    app.run(port = 6789, debug=True)


