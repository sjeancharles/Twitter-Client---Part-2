package com.codepath.apps.restclienttemplate.models;

import androidx.room.Entity;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
@Entity
public class User {

    public long id;
    public String name;
    public String screenName;
    public String profileImageUrl;

    public User() {

    }

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.id = jsonObject.getLong("");
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;
    }
}
