package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class RetweetedStatusExtendedEntities {
    private FluffyMedia[] media;

    @JsonProperty("media")
    public FluffyMedia[] getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(FluffyMedia[] value) { this.media = value; }
}
