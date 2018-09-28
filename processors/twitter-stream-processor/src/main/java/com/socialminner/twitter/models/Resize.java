package com.socialminner.twitter.models;

import java.util.Map;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Resize {
    CROP, FIT;

    @JsonValue
    public String toValue() {
        switch (this) {
        case CROP: return "crop";
        case FIT: return "fit";
        }
        return null;
    }

    @JsonCreator
    public static Resize forValue(String value) throws IOException {
        if (value.equals("crop")) return CROP;
        if (value.equals("fit")) return FIT;
        throw new IOException("Cannot deserialize Resize");
    }
}