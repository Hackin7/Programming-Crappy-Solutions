# Task 4.4
import sqlite3
import flask

### Database ##########################################
STATEMENT = f'''
SELECT OfficeID, SalesPersonName, MAX(TotalAmt) FROM 
(SELECT SalesPersonName, SUM(Amount) AS TotalAmt, OFFICE.OfficeID 
FROM SALESPERSON INNER JOIN SALE ON SALESPERSON.SalesPersonID == SALE.SalesPersonID
INNER JOIN OFFICE ON OFFICE.OfficeID==SALESPERSON.OfficeID
WHERE SaleDate like ? || '/' || ? || '/%' GROUP BY SalesPersonName) AS SALEAMOUNT GROUP BY OfficeID
ORDER BY OfficeID ASC
'''

def getTopPerforming(month, year):
    conn = sqlite3.connect('../computercompany.db')
    data = []
    dateFormatting = (f"{year:04}", f"{month:02}")
    #return dateFormatting
    cursor = conn.execute(STATEMENT, dateFormatting)
    for record in cursor:
        data.append(record)
    conn.close()
    return data

### Web app ###########################################
app = flask.Flask(__name__)

@app.route('/')
def main():
    return flask.render_template('form.html')

@app.route('/top_performers', methods=['POST'])
def topPerformers():
    # Processing form data
    month = int(flask.request.form['month'])
    year = int(flask.request.form['year'])
    # Templating
    monthNames = ['January', 'Feburary', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
    monthName = monthNames[month - 1]
    title = f"Top Performers in {monthName} {year}"
    headers = ['Office ID', 'Salesperson', 'Total Amount S$']
    data = getTopPerforming(month, year)
    return flask.render_template('table.html',
                                 title=title,
                                 headers=headers, data=data)


app.run('0.0.0.0', 5000, debug=True)
