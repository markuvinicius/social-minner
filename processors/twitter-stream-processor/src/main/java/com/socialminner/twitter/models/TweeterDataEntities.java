package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class TweeterDataEntities {
    private Object[] hashtags;
    private Object[] urls;
    private UserMention[] userMentions;
    private Object[] symbols;
    private PurpleMedia[] media;

    @JsonProperty("hashtags")
    public Object[] getHashtags() { return hashtags; }
    @JsonProperty("hashtags")
    public void setHashtags(Object[] value) { this.hashtags = value; }

    @JsonProperty("urls")
    public Object[] getUrls() { return urls; }
    @JsonProperty("urls")
    public void setUrls(Object[] value) { this.urls = value; }

    @JsonProperty("user_mentions")
    public UserMention[] getUserMentions() { return userMentions; }
    @JsonProperty("user_mentions")
    public void setUserMentions(UserMention[] value) { this.userMentions = value; }

    @JsonProperty("symbols")
    public Object[] getSymbols() { return symbols; }
    @JsonProperty("symbols")
    public void setSymbols(Object[] value) { this.symbols = value; }

    @JsonProperty("media")
    public PurpleMedia[] getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(PurpleMedia[] value) { this.media = value; }
}