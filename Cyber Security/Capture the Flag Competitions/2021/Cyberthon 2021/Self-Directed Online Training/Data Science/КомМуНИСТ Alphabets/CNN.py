import pandas as pd

DIR = '/tmp/Cyrillic.package/package/'

# %%
from PIL import Image
import numpy as np
def getImage(dir, label, id):
    im = np.array(Image.open(f'{dir}{label}/{id}.jpg').convert('L'))/255
    #im = im.flatten()
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
    x_train = np.array(x_train).reshape(len(x_train), len(x_train[0]), len(x_train[0]), 1)
    return x_train, y_train

X_train, y_train = getXY(DIR+"train.csv",DIR+'train/')
X_test, y_test = getXY(DIR+"test.csv",DIR+'test')

input_shape = len(X_train[0]), len(X_train[0][0])
no_out_values = len(set(y_train))

labelencoding = {}
for i in range(len(set(y_train))):
    labelencoding[i] = list(set(y_train))[i]
    labelencoding[ list(set(y_train))[i] ] = i

f=np.vectorize(lambda x: labelencoding[x])
f(y_train)
y_train = f(y_train)

################################################################################
from sklearn.model_selection import train_test_split
X_ttrain, X_tval, y_ttrain, y_tval = train_test_split(X_train, y_train, test_size=0.33, random_state=42)

# https://www.kaggle.com/kirillrazumov/cnn-digit-recognizer-tf-keras

import tensorflow as tf

from tensorflow import keras
from tensorflow.keras import layers

model = keras.Sequential([
    layers.Conv2D(filters=32, kernel_size=(5, 5), strides=(1, 1), padding='same',
                  activation='relu', data_format='channels_last',),
    layers.MaxPooling2D(pool_size=(2, 2)),
    layers.Conv2D(filters=64, kernel_size=(5, 5), strides=(1, 1), padding='same',
                 activation='relu'),
    layers.MaxPooling2D(pool_size=(2, 2)),
    layers.Conv2D(filters=128, kernel_size=(5, 5), strides=(1, 1), padding='same',
                  activation='relu'),
    layers.MaxPooling2D(pool_size=(2, 2)),
    layers.Flatten(),
    layers.Dense(512, activity_regularizer='l2'),
    layers.Dropout(0.3),
    layers.Dense(256, activity_regularizer='l2'),
    layers.Dropout(0.3),
    layers.Dense(128, activity_regularizer='l2'),
    layers.Dropout(0.3),
    layers.Dense(no_out_values, activation='softmax')
])

model.compile(
    optimizer='adam',
    loss='sparse_categorical_crossentropy',
    metrics=['accuracy'],
)
history = model.fit(
    X_ttrain, y_ttrain,
    validation_data=(X_tval, y_tval),
    epochs=12,
    verbose=1
)

### Predictions ################################################################
### %% codecell
#X_test.shape
test = pd.read_csv(DIR+"test.csv")
print(test.shape[0])

predictions = []
batch = np.array(X_test).reshape(len(X_test), len(X_test[0]), len(X_test[0]), 1)
print(batch.shape)
predictions += model.predict(batch).tolist()#[:10])
#predictions

#print(test.head(), predictions[:10])
labels = [np.argmax(X) for X in predictions]

test['label'] = f(np.array(labels))#+ (['T']*(test.shape[0]-len(predictions)))

print(test.head())

### %% codecell
test.to_csv("./output_cnn.csv")
#Grader Response: { "challenge": { "name": "КомМуНИСТ Alphabets" }, "status": "PARTIALLY_CORRECT", "multiplier": 0.8344,}
