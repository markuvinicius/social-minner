package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class TweeterDataExtendedEntities {
    private PurpleMedia[] media;

    @JsonProperty("media")
    public PurpleMedia[] getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(PurpleMedia[] value) { this.media = value; }
}