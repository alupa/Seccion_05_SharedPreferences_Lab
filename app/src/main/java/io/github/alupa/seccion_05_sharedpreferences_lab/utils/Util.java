package io.github.alupa.seccion_05_sharedpreferences_lab.utils;

import android.content.SharedPreferences;

/**
 * Created by Alvaro on 22-10-2017.
 */

public class Util {

    public static String getUserMailPrefs(SharedPreferences preferences){
        return preferences.getString("email", "");
    }

    public static String getUserPassPrefs(SharedPreferences preferences){
        return preferences.getString("pass", "");
    }

    public static void removeSharedPreferences(SharedPreferences preferences){
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("email");
        editor.remove("pass");
        editor.apply();
    }
}
