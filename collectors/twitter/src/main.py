import tweepy
from confluent_kafka import Producer

#override tweepy.StreamListener to add logic to on_data
class TwitterStreamListenner(tweepy.StreamListener):

    producer = None
    topic = None

    def __init__(self, producer, topic):
       self.producer = producer  
       self.topic = topic

    def on_data(self, data):
       #print("DATA")
       #print(data)

        try:        
            self.producer.produce(self.topic, data , callback=self.acked)
            self.producer.poll(0.5)
            self.producer.flush(30)
        except KeyboardInterrupt:
            pass
        print( 'entrou no on_data')
        #p = Producer({'bootstrap.servers': 'broker:9092'})
        #p.produce('bolsonaro', key='hello', value=data)
        #p.flush(30)

    def acked(self, err, msg):
        if err is not None:
            print("Failed to deliver message: {0}: {1}".format(msg.value(), err.str()))
        else:
            print("Message produced: {0}".format(msg.value())) 



#twitter_oauth_autentication
def tw_oauth(authfile):
    with open(authfile, "r") as f:
        ak = f.readlines()
    f.close()

    auth1 = tweepy.auth.OAuthHandler(ak[0].replace("\n", ""), ak[1].replace("\n", ""))
    auth1.set_access_token(ak[2].replace("\n", ""), ak[3].replace("\n", ""))
    return tweepy.API(auth1)



#main collector execution
if __name__ == "__main__":
    auth = tw_oauth('../config/tw_auth.k')

    producer = Producer({'bootstrap.servers': 'broker:9092'})

    listener = TwitterStreamListenner(producer=producer, topic='bolsonaro')
    myStream = tweepy.Stream(auth=auth.auth, listener=listener)

    myStream.filter(track=['bolsonaro'])