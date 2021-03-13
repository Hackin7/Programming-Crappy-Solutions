
#Use NLTK Downloader to download reuters first
from nltk.corpus import reuters
fileid = 'training/9866'

text = reuters.raw(fileid)
#print(text)
'''
from nltk.sentiment.vader import SentimentIntensityAnalyzer
def sentiments(text):
    sid = SentimentIntensityAnalyzer()
    ss = sid.polarity_scores(text)
    if ss['neg']>ss['neu'] and ss['neg']>ss['pos']: return('Negative')
    elif ss['pos']>ss['neu'] and ss['pos']>ss['neg']: return('Positive')
    else: return('Neutral')


import nltk.classify.util
from nltk.classify import NaiveBayesClassifier

import nltk
from nltk.corpus import movie_reviews
 
def word_feats(words):
    return dict([(word, True) for word in words])
 
negids = movie_reviews.fileids('neg')
posids = movie_reviews.fileids('pos')
 
negfeats = [(word_feats(movie_reviews.words(fileids=[f])), 'neg') for f in negids]
posfeats = [(word_feats(movie_reviews.words(fileids=[f])), 'pos') for f in posids]

negcutoff = int(len(negfeats)*3/4)
poscutoff = int(len(posfeats)*3/4)
 
trainfeats = negfeats[:negcutoff] + posfeats[:poscutoff]
testfeats = negfeats[negcutoff:] + posfeats[poscutoff:]
print ('train on %d instances, test on %d instances' % (len(trainfeats), len(testfeats)))

classifier = NaiveBayesClassifier.train(trainfeats)
print ('accuracy:', nltk.classify.util.accuracy(classifier, testfeats))
classifier.show_most_informative_features()

from nltk.tokenize import word_tokenize # or use some other tokenizer
all_words = set(list(negfeats[0][0].keys())+list(posfeats[0][0].keys()))#word.lower() for passage in train for word in 
def sentiments(text):
    test_sent_features = {word.lower(): (word in word_tokenize(text.lower())) for word in all_words}
    out = classifier.classify(test_sent_features)
    return out

'''
from textblob import TextBlob
def sentiments(text):
    polarity = TextBlob(text).sentiment.polarity
    if polarity < -0.15: return('neg')
    elif polarity > 0.15: return('pos')
    else: return('neu')

size = 100
pos=[]
neg=[]
neu=[]

count = 1
for i in range(10000):
    fileid = 'training/'+str(count)
    try:
        text = reuters.raw(fileid)
        if (sentiments(text) == 'pos') and len(pos)<size:
            pos.append(text)
        elif sentiments(text) == 'neg' and len(neg)<size:neg.append(text)
        elif sentiments(text) == "neu" and len(neu)<size:neu.append(text)
    except:pass
    if len(pos) == size and len(neg) == size and len(neu) == size:break
    count+=1
    print(i,len(pos),len(neg),len(neu),sentiments(text))

text = pos+neg+neu
sentiments = [1 for i in range(len(pos))]+[-1 for i in range(len(neg))]+[0 for i in range(len(neu))]

import pandas as pd
df = pd.DataFrame({"Text":text,"Sentiments":sentiments})
df.dropna()
df.to_csv("NewsSentiments.csv")

