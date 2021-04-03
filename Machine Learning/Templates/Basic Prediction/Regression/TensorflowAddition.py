'''
try:
  # Use the %tensorflow_version magic if in colab.
  %tensorflow_version 2.x
except Exception:
  pass
'''
import tensorflow as tf
import logging
logger = tf.get_logger()
logger.setLevel(logging.ERROR)

import numpy as np

inputs = []
outputs = []
for i in range(100):
    for j in range(100):
        inputs.append((i,j))
        outputs.append(i+j)

X = np.array(inputs, dtype = float)
Y = np.array(outputs, dtype = float)

# Units refers to the number of neurons
l0 = tf.keras.layers.Dense(units=2, input_shape=[2])
l1 = tf.keras.layers.Dense(units=1)
model = tf.keras.Sequential([l0, l1])
model.compile(loss='mean_squared_error', optimizer=tf.keras.optimizers.Adam(0.1))
model.fit(X, Y, epochs=5, verbose=True)

print(model.predict(np.array([[100,101], [9,8]])))
print("Finished training the model")
print("These are the l0 variables: {}".format(l0.get_weights()))
print("These are the l1 variables: {}".format(l1.get_weights()))

results = model.evaluate(X,Y)#,batch_size=128, steps=100)
def add(x, y):
    inputs = np.array([[x,y]])
    output = model.predict(inputs)
    return output[0][0]

print(add(1,3))
