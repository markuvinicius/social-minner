package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class UserMention {
    private String screenName;
    private String name;
    private long id;
    private String idStr;
    private long[] indices;

    @JsonProperty("screen_name")
    public String getScreenName() { return screenName; }
    @JsonProperty("screen_name")
    public void setScreenName(String value) { this.screenName = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("id_str")
    public String getIDStr() { return idStr; }
    @JsonProperty("id_str")
    public void setIDStr(String value) { this.idStr = value; }

    @JsonProperty("indices")
    public long[] getIndices() { return indices; }
    @JsonProperty("indices")
    public void setIndices(long[] value) { this.indices = value; }
}