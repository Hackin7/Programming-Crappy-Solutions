#https://github.com/TanayY/100DaysofMLCode/blob/master/Iris_Data.ipynb

from sklearn.datasets import load_iris
iris = load_iris()
print(iris.feature_names)
print(iris.target_names)
print(iris.data[0])

print(iris.target[0])

############
import numpy as np
from sklearn import tree
test_idx=[0,50,100]

train_target = np.delete(iris.target, test_idx)
train_data= np.delete(iris.data,test_idx,axis=0)

test_target = iris.target[test_idx]
test_data=iris.data[test_idx]

clf = tree.DecisionTreeClassifier()
clf.fit(train_data, train_target)

print(test_target)
print(clf.predict(test_data))

##################
#from sklearn.externals.six import StringIO
#https://stackoverflow.com/questions/61901365/modulenotfounderror-no-module-named-sklearn-externals-six
from six import StringIO
import pydot
dot_data = StringIO()
tree.export_graphviz(clf,out_file=dot_data,feature_names=iris.feature_names,class_names=iris.target_names,filled=True,rounded=True,impurity=False)

graph=pydot.graph_from_dot_data(dot_data.getvalue())
graph[0].write_pdf("iris.pdf")

#################
# https://pypi.python.org/pypi/pydot
#!apt-get -qq install -y graphviz && pip install -q pydot
import pydot
