package com.example.instagramclone;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("x9REul8xkyJ39180Cvle0y5zA87vF945OBJ5MxYj")
                .clientKey("ruGU8Rs57AnMGswEokcmWqpe0SFQcm8sQezmX6MF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
