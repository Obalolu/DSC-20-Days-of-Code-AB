package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils  {

    public static void updateScore(Context context, int score) {
        SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = app_preferences.edit();
        editor.putInt("answer_value", score);
        editor.apply();
    }

    public static int getScore(Context context) {
        SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return app_preferences.getInt("answer_value", 0);
    }

    public static void resetScore(Context context) {
        PreferenceUtils.updateScore(context, 0);
    }
}
