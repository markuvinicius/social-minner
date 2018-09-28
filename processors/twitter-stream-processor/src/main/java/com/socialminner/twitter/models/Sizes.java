package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Sizes {
    private Large thumb;
    private Large medium;
    private Large large;
    private Large small;

    @JsonProperty("thumb")
    public Large getThumb() { return thumb; }
    @JsonProperty("thumb")
    public void setThumb(Large value) { this.thumb = value; }

    @JsonProperty("medium")
    public Large getMedium() { return medium; }
    @JsonProperty("medium")
    public void setMedium(Large value) { this.medium = value; }

    @JsonProperty("large")
    public Large getLarge() { return large; }
    @JsonProperty("large")
    public void setLarge(Large value) { this.large = value; }

    @JsonProperty("small")
    public Large getSmall() { return small; }
    @JsonProperty("small")
    public void setSmall(Large value) { this.small = value; }
}