import pandas as pd
import json

### Excel Processing ##############################################################

def readSheet(xlsx, sheet_name, conversion_func):
    df = pd.read_excel(xlsx,  sheet_name)

    output = []
    counter = 0
    for rowIndex in range(df.shape[0]): # Number of rows
        row = df.iloc[rowIndex]

        ### Add custom processing code
        value = conversion_func(row)
        if value == None:
            break
        else:
            output.append(value)

        counter += 1
    print(counter)
    return output

### Converting Each Record to appropriate format ####################################

def read(field):
    string = str(field)
    if string == "nan" or string == '-':
        return ""
    else:
        return str(field)

def readList(string, delimiter='|'):
    string = str(string)
    if string == 'nan' or string == '-':
        return []
    else:
        return string.split(delimiter)

def conversion_func(row):
    '''
    Customise this function to fit whatever specification needed
    '''
    ## Terminating Case
    if str(row["Name"]) == "nan": #Nothing left
        return None
    entry = {}

    ## Tagging
    entry["tags"] = {}
    entry["tags"]["Platform"] = readList(row["Platform"], ',')
    entry["tags"]["Type"] = readList(row["Type"], ',')
    entry["tags"]["Components"] = readList(row["Components"], ',')

    ## OTher Details
    entry["name"] = read(row["Name"])
    entry["description"] = read(row["Description"])

    return entry

'''
Sample code for finding excel sheets if you need them
xlsx = pd.ExcelFile(FILENAME)
for name in xlsx.sheet_names:
    print(name)
    if name.startswith('Questions'):
        readSheetToQuestionStore(qStore, xlsx, name)
'''

### Writing as a file to be imported by HTML code #################################
def write(data, filename):
    jsonData = json.dumps(data)
    with open(filename, 'w') as outfile:
        outfile.write("var taggingSystemData = "+jsonData+";")

### Custom overall code ############################################################
def run():
    XLS_FILENAME = './input.xlsx'
    SHEET_NAME = 'Sheet1'
    OUT_FILENAME = 'data.js'
    data = readSheet(XLS_FILENAME, SHEET_NAME, conversion_func)
    write(data, OUT_FILENAME)

if __name__ == "__main__": run()
