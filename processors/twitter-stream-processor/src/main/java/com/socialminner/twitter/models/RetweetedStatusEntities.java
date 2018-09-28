package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class RetweetedStatusEntities {
    private Object[] hashtags;
    private Object[] urls;
    private Object[] userMentions;
    private Object[] symbols;
    private FluffyMedia[] media;

    @JsonProperty("hashtags")
    public Object[] getHashtags() { return hashtags; }
    @JsonProperty("hashtags")
    public void setHashtags(Object[] value) { this.hashtags = value; }

    @JsonProperty("urls")
    public Object[] getUrls() { return urls; }
    @JsonProperty("urls")
    public void setUrls(Object[] value) { this.urls = value; }

    @JsonProperty("user_mentions")
    public Object[] getUserMentions() { return userMentions; }
    @JsonProperty("user_mentions")
    public void setUserMentions(Object[] value) { this.userMentions = value; }

    @JsonProperty("symbols")
    public Object[] getSymbols() { return symbols; }
    @JsonProperty("symbols")
    public void setSymbols(Object[] value) { this.symbols = value; }

    @JsonProperty("media")
    public FluffyMedia[] getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(FluffyMedia[] value) { this.media = value; }
}