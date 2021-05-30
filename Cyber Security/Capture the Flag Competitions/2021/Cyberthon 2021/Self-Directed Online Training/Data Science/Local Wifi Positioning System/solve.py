# %% markdown
# # WiFi Localisation Starting Notebook
# ## Cyberthon 2021 organised by CSIT, DCO and HCI
#
# This notebook is to help people interact with the data, you may use it if you want to or not.
#
# ALT-TAB LABS LLP &copy; 2020 All Rights Reserved
# %% codecell
# import libraries
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# feel free to add any library you need
# %% codecell
# load training data

df0 = pd.read_json("wifi_train.json")
df0.describe()
print(df0.columns)
print(df0)
# sample iteration over df0
for ssid in df0:
    locationX = df0[ssid]['location']['x']
    locationY = df0[ssid]['location']['y']
    # print(ssid, locationX, locationY) # this prints 404 lines
    # do some other stuff you want to
# %% codecell
# format training data
# do train_test_split
# %% codecell
# define your model
# %% codecell
# do your training here
# %% codecell
# do your validation here
# %% codecell
# use plt to visualise your model's performance (optional)
#
# fig, ax = plt.subplots(figsize=(10,10))
# ax.scatter(y_true_x, y_true_y) # change these variables to your ones
# ax.scatter(y_pred_x, y_pred_y) # change these variables to your ones
# %% codecell
# load test data
df1 = pd.read_json("./wifi_test.json")
print(df1.head())
# %% codecell
# preprocess your test data

# sample iteration over df0
for ssid in df1:
    locationX = df1[ssid]['location']['x']
    locationY = df1[ssid]['location']['y']
    # print(ssid, locationX, locationY) # this prints 404 lines
    # do some other stuff you want to

# %% codecell
# format test data

# %% codecell
# predict the location X and Y using your model

# %% codecell
# generate mysubmission

df2 = pd.read_csv('submission.csv')
for i, row in df2.iterrows():
    df2.at[i,'locationX'] = 0
    df2.at[i,'locationY'] = 0

print(df2)
# %% codecell
# save mysubmission to file mysubmission.csv
df2.to_csv('./mysubmission.csv', index=False)
# %% markdown
# # Submitting to the CTFSG DataScience Grader
# ALT-TAB LABS LLP &copy; 2020-2021 All Rights Reserved
# %% markdown
# # Using the web interface
#
# Just visit the grader URL provided with the questions and upload using the web interface:
# http://ABC.XYZ.ctf.sg:12345/
# %% markdown
# # Using the python library
# %% codecell
# Download CTFSG Grader Libraries
import urllib.request, os
urllib.request.urlretrieve('https://raw.githubusercontent.com/alttablabs/ctfsg-utils/master/pyctfsglib.py', './pyctfsglib.py')
print('Downloaded pyctfsglib.py:', 'pyctfsglib.py' in os.listdir())
# %% codecell
# Connect to graders
import pyctfsglib as ctfsg
import random

USER_TOKEN = "USER_TOKEN" # You need to fill this up
GRADER_URL = random.choice([ # Check if these are correct GRADER URLS for the specific challenge
    "http://ABC.XYZ.ctf.sg:12345/",
    "http://ABC.XYZ.ctf.sg:23456/"
])

grader = ctfsg.DSGraderClient(GRADER_URL, USER_TOKEN)
# %% codecell
# Submitting a file
grader.submitFile('./mysubmission.csv')
