# show files in current directory
import os
os.listdir()

def dataCleanup():
    pass
### load csvs ##################################################
import pandas as pd
MyDataFrame = pd.read_csv('avocado-train.csv', index_col='id')
MyDataFrame.head()

MyDataFrame.dropna()
# Convert strings to numbers
#TODO TODO TODO TODO TODO TODO TODO TODO
c = ['TotalVolume',"4046","4225","4770","TotalBags","SmallBags","LargeBags","XLargeBags","AveragePrice"]
for column in c:
    MyDataFrame[column] = pd.to_numeric(MyDataFrame[column])

# Select data for learning
features = ['TotalVolume',"TotalBags","SmallBags","LargeBags","XLargeBags"]
features = c[:-1]

X = MyDataFrame[features]
y = MyDataFrame["AveragePrice"]


# https://scikit-learn.org/stable/modules/generated/sklearn.model_selection.train_test_split.html
from sklearn.model_selection import train_test_split
Xtrain, Xtest, ytrain, ytest = train_test_split(X, y, test_size=0.33, random_state=42)
print("training split: ", len(Xtrain), "; test split: ", len(Xtest))

###Regression###########################################################################################
# Pick the regression model we want to use
from sklearn import *
import sklearn.tree as tree
models = [
    tree.DecisionTreeRegressor(random_state=2020),
    ensemble.RandomForestRegressor(random_state=2020, n_estimators=100)
]

currScore = 0
model = None
for i in models:
    i.fit(Xtrain,ytrain)
    score = i.score(Xtest,ytest)
    if score > currScore:
        model = i
        currScore = score

print(model)
###############################################################

### Prediction ###############################################################################################
# Clean Data
MyDataFrame = pd.read_csv('avocado-test.csv', index_col='id')
# Drops missing values 
#MyDataFrame.dropna()
# Convert strings to numbers
c = ['TotalVolume',"4046","4225","4770","TotalBags","SmallBags","LargeBags","XLargeBags"]#,"AveragePrice"]
for column in c:
    MyDataFrame[column] = pd.to_numeric(MyDataFrame[column])
'''
# Read more advanced ways to clean data
 https://scikit-learn.org/stable/modules/generated/sklearn.preprocessing.LabelEncoder.html
 https://stackoverflow.com/questions/24458645/label-encoding-across-multiple-columns-in-scikit-learn
'''
# Select features
XforPredictions =  MyDataFrame[features]
XforPredictions.head()

# Make Predictions!
model.fit(X,y)
yPredictions = model.predict(XforPredictions)# None #TODO TODO TODO TODO TODO TODO TODO TODO
print("Predictions:", yPredictions)
# Save to CSV File!
XforPredictions =  MyDataFrame[features]
output = pd.DataFrame({'id': XforPredictions.index, 'AveragePrice': yPredictions})
output.to_csv('avocado-submission.csv', index=False)
#print(output)

### Grading ###################################################################
import urllib.request, os
urllib.request.urlretrieve('https://raw.githubusercontent.com/alttablabs/ctfsg-utils/master/pyctfsglib.py', './pyctfsglib.py')
print('Downloaded pyctfsglib.py:', 'pyctfsglib.py' in os.listdir())

import pyctfsglib as ctfsg
import random

USER_TOKEN = "MXhtGfdjdsUfiEKTHHEuVGohZESBdMiHrFkmYqNqIFfcWOHGvcubvHJvnxpAqRMh" # You need to fill this up
GRADER_URL = random.choice([ # Check if these are correct GRADER URLS for the specific challenge
    "http://ABC.XYZ.ctf.sg:12345/",
    "http://ABC.XYZ.ctf.sg:23456/"
])
GRADER_URL = random.choice([
"http://challenges.csdc20t.ctf.sg:30001/", "http://challenges.csdc20t.ctf.sg:30002/"
])
grader = ctfsg.DSGraderClient(GRADER_URL, USER_TOKEN)
results = grader.submitFile('avocado-submission.csv')
