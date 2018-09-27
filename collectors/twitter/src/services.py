import tweepy

#override tweepy.StreamListener to add logic to on_data
class TwitterStreamListenner(tweepy.StreamListener):

   # def on_status(self, status):
   #     print("STATUS")
   #     print(status.text)

   def on_data(self, data):
       print("DATA")
       print(data)