
#!pip install TextBlob
from textblob import TextBlob
#import nltk
#nltk.download('punkt')
#nltk.download('averaged_perceptron_tagger')
wiki=TextBlob("Tanay is happy because he gets good matches on Tinder.")
wiki.tags
wiki.words
print(wiki.sentiment.polarity)
