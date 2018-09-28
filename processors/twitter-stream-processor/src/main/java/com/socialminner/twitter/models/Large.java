package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Large {
    private long w;
    private long h;
    private Resize resize;

    @JsonProperty("w")
    public long getW() { return w; }
    @JsonProperty("w")
    public void setW(long value) { this.w = value; }

    @JsonProperty("h")
    public long getH() { return h; }
    @JsonProperty("h")
    public void setH(long value) { this.h = value; }

    @JsonProperty("resize")
    public Resize getResize() { return resize; }
    @JsonProperty("resize")
    public void setResize(Resize value) { this.resize = value; }
}