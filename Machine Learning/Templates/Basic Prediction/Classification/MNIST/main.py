# Imported and modified from https://colab.research.google.com/github/tensorflow/examples/blob/master/courses/udacity_intro_to_tensorflow_for_deep_learning/l03c01_classifying_images_of_clothing.ipynb#scrollTo=P7mUJVqcINSM

#!pip install -U tensorflow_datasets

# Choose the dataset name first

DATASET_NAME = 'mnist'
#DATASET_NAME = 'fashion_mnist'
### Import Libraries ###########################################################
import tensorflow as tf

# Import TensorFlow Datasets
import tensorflow_datasets as tfds
tfds.disable_progress_bar()

# Helper libraries
import math
import numpy as np
import matplotlib.pyplot as plt

import logging
logger = tf.get_logger()
logger.setLevel(logging.ERROR)

### Import Dataset ##############################################################
dataset, metadata = tfds.load(DATASET_NAME, as_supervised=True, with_info=True)
train_dataset, test_dataset = dataset['train'], dataset['test']
class_names = metadata.features['label'].names
num_train_examples = metadata.splits['train'].num_examples
num_test_examples = metadata.splits['test'].num_examples

def data_preview(dataset, head=5):
    print(dataset)
    train_dataset, test_dataset = dataset['train'], dataset['test']
    print(train_dataset)
    print(test_dataset)
    print(train_dataset.take(10))
def view_metadata(metadata):
    print("Class names: {}".format(class_names))
    print("Number of training examples: {}".format(num_train_examples))
    print("Number of test examples:     {}".format(num_test_examples))

print("#"*30)
data_preview(dataset)
view_metadata(metadata)
print("#"*30)
### Preprocess ####################################################################

def processing(train_dataset, test_dataset):
    # The value of each pixel in the image data is an integer in the range `[0,255]`. For the model to work properly, these values need to be normalized to the range `[0,1]`. So here we create a normalization function, and then apply it to each image in the test and train datasets.
    def normalize(images, labels):
      images = tf.cast(images, tf.float32)
      images /= 255
      return images, labels

    # The map function applies the normalize function to each element in the train
    # and test datasets
    train_dataset =  train_dataset.map(normalize)
    test_dataset  =  test_dataset.map(normalize)

    # The first time you use the dataset, the images will be loaded from disk
    # Caching will keep them in memory, making training faster
    train_dataset =  train_dataset.cache()
    test_dataset  =  test_dataset.cache()
    return train_dataset, test_dataset
train_dataset, test_dataset = processing(train_dataset, test_dataset)\

BATCH_SIZE = 32
train_dataset = train_dataset.cache().repeat().shuffle(num_train_examples).batch(BATCH_SIZE)
test_dataset = test_dataset.cache().batch(BATCH_SIZE)

### Model Building ##################################################################
"""## Train the model

First, we define the iteration behavior for the train dataset:
1. Repeat forever by specifying `dataset.repeat()` (the `epochs` parameter described below limits how long we perform training).
2. The `dataset.shuffle(60000)` randomizes the order so our model cannot learn anything from the order of the examples.
3. And `dataset.batch(32)` tells `model.fit` to use batches of 32 images and labels when updating the model variables.
 - Group by Batch

Training is performed by calling the `model.fit` method:
1. Feed the training data to the model using `train_dataset`.
2. The model learns to associate images and labels.
3. The `epochs=5` parameter limits training to 5 full iterations of the training dataset, so a total of 5 * 60000 = 300000 examples.

(Don't worry about `steps_per_epoch`, the requirement to have this flag will soon be removed.)
"""

def build_and_train(train_dataset, test_dataset, num_train_examples, BATCH_SIZE):
    model = tf.keras.Sequential([
        tf.keras.layers.Flatten(input_shape=(28, 28, 1)),
        tf.keras.layers.Dense(128, activation=tf.nn.relu),
        tf.keras.layers.Dense(10, activation=tf.nn.softmax)
    ])

    model.compile(optimizer='adam',
                  loss=tf.keras.losses.SparseCategoricalCrossentropy(),
                  metrics=['accuracy'])
    model.fit(train_dataset, epochs=5, steps_per_epoch=math.ceil(num_train_examples/BATCH_SIZE))
    return model



TRAIN_MODEL = True
MODEL_FILE = 'model'
if TRAIN_MODEL:
    model = build_and_train(train_dataset, test_dataset, num_train_examples, BATCH_SIZE)
    model.save(MODEL_FILE)
else:
    model = tf.keras.models.load_model(MODEL_FILE)



test_loss, test_accuracy = model.evaluate(test_dataset, steps=math.ceil(num_test_examples/32))

print('Accuracy on test dataset:', test_accuracy)
print("#"*30)


### Prediction ###############################################################################
def plot_image(predictions_array, true_label, img):
  plt.grid(False)
  plt.xticks([])
  plt.yticks([])
  plt.imshow(img, cmap=plt.cm.binary)
  predicted_label = np.argmax(predictions_array)

  if predicted_label == true_label:color = 'blue'
  else:color = 'red'

  plt.xlabel("{} {:2.0f}% ({})".format(class_names[predicted_label],
                                100*np.max(predictions_array),
                                class_names[true_label]),
                                color=color)

def plot_value_array(predictions_array, true_label):
  plt.grid(False)
  plt.xticks([])
  plt.yticks([])
  thisplot = plt.bar(range(10), predictions_array, color="#777777")
  plt.ylim([0, 1])
  predicted_label = np.argmax(predictions_array)

  thisplot[predicted_label].set_color('red')
  thisplot[true_label].set_color('blue')

def predict_show():
    count = 0
    for test_images, test_labels in test_dataset.take(1):
        test_images = test_images.numpy()
        test_labels = test_labels.numpy()
        predictions_all = model.predict(test_images)
        count += 1
    print("No. batches", count)

    i = 31
    print("No. items in a batch",len(predictions_all))
    predictions = predictions_all[i]
    test_labels = test_labels[i]
    test_image = test_images[i]
    plt.figure(figsize=(6,3))
    plt.subplot(1,2,1)
    plot_image(predictions, test_labels, test_image)
    plt.subplot(1,2,2)
    plot_value_array(predictions, test_labels)
    plt.show()

predict_show()
# Exercises
"""
Experiment with different models and see how the accuracy results differ. In particular change the following parameters:
*   Set training epochs set to 1
*   Number of neurons in the Dense layer following the Flatten one. For example, go really low (e.g. 10) in ranges up to 512 and see how accuracy changes
*   Add additional Dense layers between the Flatten and the final `Dense(10)`, experiment with different units in these layers
*   Don't normalize the pixel values, and see the effect that has


Remember to enable GPU to make everything run faster (Runtime -> Change runtime type -> Hardware accelerator -> GPU).
Also, if you run into trouble, simply reset the entire environment and start from the beginning:
*   Edit -> Clear all outputs
*   Runtime -> Reset all runtimes
"""
