package com.example.oga.dsc_20_days_of_code_ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils  {

    public static void updateScore(Context context, int score) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("answer_value", 1);
        editor.apply();
    }

    public void getScore() {
        return;
    }
}
