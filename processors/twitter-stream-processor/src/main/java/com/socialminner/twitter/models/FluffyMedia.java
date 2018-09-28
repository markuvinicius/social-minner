package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class FluffyMedia {
    private long id;
    private String idStr;
    private long[] indices;
    private String mediaURL;
    private String mediaURLHTTPS;
    private String url;
    private String displayURL;
    private String expandedURL;
    private String type;
    private Sizes sizes;

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

    @JsonProperty("media_url")
    public String getMediaURL() { return mediaURL; }
    @JsonProperty("media_url")
    public void setMediaURL(String value) { this.mediaURL = value; }

    @JsonProperty("media_url_https")
    public String getMediaURLHTTPS() { return mediaURLHTTPS; }
    @JsonProperty("media_url_https")
    public void setMediaURLHTTPS(String value) { this.mediaURLHTTPS = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("display_url")
    public String getDisplayURL() { return displayURL; }
    @JsonProperty("display_url")
    public void setDisplayURL(String value) { this.displayURL = value; }

    @JsonProperty("expanded_url")
    public String getExpandedURL() { return expandedURL; }
    @JsonProperty("expanded_url")
    public void setExpandedURL(String value) { this.expandedURL = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("sizes")
    public Sizes getSizes() { return sizes; }
    @JsonProperty("sizes")
    public void setSizes(Sizes value) { this.sizes = value; }
}