package com.epicodus.myrestaurants;

/**
 * Created by Guest on 4/19/16.
 */
public class Robolectric {
    private static Class<MainActivity> upActivity;

    public static void setupActivity(Class<MainActivity> upActivity) {
        Robolectric.upActivity = upActivity;
    }
}
