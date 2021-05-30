import pandas as pd

DIR = '/tmp/Cyrillic.package/package/'

# %%
from PIL import Image
import numpy as np
def getImage(dir, label, id):
    im = np.array(Image.open(f'{dir}{label}/{id}.jpg').convert('L'))/255
    im = im.flatten()
    return im

def getImageDatas(dir,data):
    x = []
    y = []
    for i in range(len(data)):
        try:
            id = data[i][0]
            label = data[i][1]
            x.append(getImage(dir,label,id))
            y.append(label)
        except Exception as e:
            x.append(getImage(dir,"",id))
            pass
            #print(e)
    return x, y

def getXY(csv_path, directory):
    train = pd.read_csv(csv_path)
    data = train.values.tolist()
    x_train, y_train = getImageDatas(directory,data)
    return x_train, y_train

x_train, y_train = getXY(DIR+"train.csv",DIR+'train/')
x_test, y_test = getXY(DIR+"test.csv",DIR+'test')
len(x_train[0])
x_train[:10]
len(set(y_train))
#getImage(DIR+'train/','Т','08c557ba55c554f4')
x_test[:10]


### Model ######################################################################
# Based on https://www.kaggle.com/walras/mnist-knn-and-rf
from sklearn.neighbors import KNeighborsClassifier
from sklearn.ensemble import RandomForestClassifier
train_scores = []
test_score = []
# knn gives 459/1000
#model = KNeighborsClassifier(3)
#model.fit(x_train,y_train)

# { "challenge": { "name": "КомМуНИСТ Alphabets" }, "status": "PARTIALLY_CORRECT", "multiplier": 0.4792, "submittedBy": { "username": "lolcat" } }
model = RandomForestClassifier(max_depth= 7, n_estimators = 1000)
model.fit(x_train,y_train)
print("Fitted")


#train_scores.append(knn_model.score(x_train,y_train))
test = pd.read_csv(DIR+"test.csv")
print(test.shape[0])
BATCH_SIZE = 100
predictions = []
for i in range(0,test.shape[0], BATCH_SIZE):
    predictions += model.predict(x_test[i:i+BATCH_SIZE]).tolist()#[:10])
    print(i)
#print(test.head(), predictions[:10])
test['label'] = predictions+ (['T']*(test.shape[0]-len(predictions)))

print(test.head())
test.to_csv("./output_random_forest.csv")
#train = pd.read_csv(csv_path)

#data = train.values.tolist()
