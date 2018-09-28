package com.socialminner.twitter.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class User {
    private long id;
    private String idStr;
    private String name;
    private String screenName;
    private String location;
    private String url;
    private String description;
    private String translatorType;
    private boolean userProtected;
    private boolean verified;
    private long followersCount;
    private long friendsCount;
    private long listedCount;
    private long favouritesCount;
    private long statusesCount;
    private String createdAt;
    private Object utcOffset;
    private Object timeZone;
    private boolean geoEnabled;
    private String lang;
    private boolean contributorsEnabled;
    private boolean isTranslator;
    private String profileBackgroundColor;
    private String profileBackgroundImageURL;
    private String profileBackgroundImageURLHTTPS;
    private boolean profileBackgroundTile;
    private String profileLinkColor;
    private String profileSidebarBorderColor;
    private String profileSidebarFillColor;
    private String profileTextColor;
    private boolean profileUseBackgroundImage;
    private String profileImageURL;
    private String profileImageURLHTTPS;
    private String profileBannerURL;
    private boolean defaultProfile;
    private boolean defaultProfileImage;
    private Object following;
    private Object followRequestSent;
    private Object notifications;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("id_str")
    public String getIDStr() { return idStr; }
    @JsonProperty("id_str")
    public void setIDStr(String value) { this.idStr = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("screen_name")
    public String getScreenName() { return screenName; }
    @JsonProperty("screen_name")
    public void setScreenName(String value) { this.screenName = value; }

    @JsonProperty("location")
    public String getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(String value) { this.location = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("translator_type")
    public String getTranslatorType() { return translatorType; }
    @JsonProperty("translator_type")
    public void setTranslatorType(String value) { this.translatorType = value; }

    @JsonProperty("protected")
    public boolean getUserProtected() { return userProtected; }
    @JsonProperty("protected")
    public void setUserProtected(boolean value) { this.userProtected = value; }

    @JsonProperty("verified")
    public boolean getVerified() { return verified; }
    @JsonProperty("verified")
    public void setVerified(boolean value) { this.verified = value; }

    @JsonProperty("followers_count")
    public long getFollowersCount() { return followersCount; }
    @JsonProperty("followers_count")
    public void setFollowersCount(long value) { this.followersCount = value; }

    @JsonProperty("friends_count")
    public long getFriendsCount() { return friendsCount; }
    @JsonProperty("friends_count")
    public void setFriendsCount(long value) { this.friendsCount = value; }

    @JsonProperty("listed_count")
    public long getListedCount() { return listedCount; }
    @JsonProperty("listed_count")
    public void setListedCount(long value) { this.listedCount = value; }

    @JsonProperty("favourites_count")
    public long getFavouritesCount() { return favouritesCount; }
    @JsonProperty("favourites_count")
    public void setFavouritesCount(long value) { this.favouritesCount = value; }

    @JsonProperty("statuses_count")
    public long getStatusesCount() { return statusesCount; }
    @JsonProperty("statuses_count")
    public void setStatusesCount(long value) { this.statusesCount = value; }

    @JsonProperty("created_at")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(String value) { this.createdAt = value; }

    @JsonProperty("utc_offset")
    public Object getUTCOffset() { return utcOffset; }
    @JsonProperty("utc_offset")
    public void setUTCOffset(Object value) { this.utcOffset = value; }

    @JsonProperty("time_zone")
    public Object getTimeZone() { return timeZone; }
    @JsonProperty("time_zone")
    public void setTimeZone(Object value) { this.timeZone = value; }

    @JsonProperty("geo_enabled")
    public boolean getGeoEnabled() { return geoEnabled; }
    @JsonProperty("geo_enabled")
    public void setGeoEnabled(boolean value) { this.geoEnabled = value; }

    @JsonProperty("lang")
    public String getLang() { return lang; }
    @JsonProperty("lang")
    public void setLang(String value) { this.lang = value; }

    @JsonProperty("contributors_enabled")
    public boolean getContributorsEnabled() { return contributorsEnabled; }
    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(boolean value) { this.contributorsEnabled = value; }

    @JsonProperty("is_translator")
    public boolean getIsTranslator() { return isTranslator; }
    @JsonProperty("is_translator")
    public void setIsTranslator(boolean value) { this.isTranslator = value; }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() { return profileBackgroundColor; }
    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String value) { this.profileBackgroundColor = value; }

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageURL() { return profileBackgroundImageURL; }
    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageURL(String value) { this.profileBackgroundImageURL = value; }

    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageURLHTTPS() { return profileBackgroundImageURLHTTPS; }
    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageURLHTTPS(String value) { this.profileBackgroundImageURLHTTPS = value; }

    @JsonProperty("profile_background_tile")
    public boolean getProfileBackgroundTile() { return profileBackgroundTile; }
    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(boolean value) { this.profileBackgroundTile = value; }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() { return profileLinkColor; }
    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String value) { this.profileLinkColor = value; }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() { return profileSidebarBorderColor; }
    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String value) { this.profileSidebarBorderColor = value; }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() { return profileSidebarFillColor; }
    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String value) { this.profileSidebarFillColor = value; }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() { return profileTextColor; }
    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String value) { this.profileTextColor = value; }

    @JsonProperty("profile_use_background_image")
    public boolean getProfileUseBackgroundImage() { return profileUseBackgroundImage; }
    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(boolean value) { this.profileUseBackgroundImage = value; }

    @JsonProperty("profile_image_url")
    public String getProfileImageURL() { return profileImageURL; }
    @JsonProperty("profile_image_url")
    public void setProfileImageURL(String value) { this.profileImageURL = value; }

    @JsonProperty("profile_image_url_https")
    public String getProfileImageURLHTTPS() { return profileImageURLHTTPS; }
    @JsonProperty("profile_image_url_https")
    public void setProfileImageURLHTTPS(String value) { this.profileImageURLHTTPS = value; }

    @JsonProperty("profile_banner_url")
    public String getProfileBannerURL() { return profileBannerURL; }
    @JsonProperty("profile_banner_url")
    public void setProfileBannerURL(String value) { this.profileBannerURL = value; }

    @JsonProperty("default_profile")
    public boolean getDefaultProfile() { return defaultProfile; }
    @JsonProperty("default_profile")
    public void setDefaultProfile(boolean value) { this.defaultProfile = value; }

    @JsonProperty("default_profile_image")
    public boolean getDefaultProfileImage() { return defaultProfileImage; }
    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(boolean value) { this.defaultProfileImage = value; }

    @JsonProperty("following")
    public Object getFollowing() { return following; }
    @JsonProperty("following")
    public void setFollowing(Object value) { this.following = value; }

    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() { return followRequestSent; }
    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object value) { this.followRequestSent = value; }

    @JsonProperty("notifications")
    public Object getNotifications() { return notifications; }
    @JsonProperty("notifications")
    public void setNotifications(Object value) { this.notifications = value; }
}