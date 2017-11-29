package io.github.alupa.seccion_05_sharedpreferences_lab.splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import io.github.alupa.seccion_05_sharedpreferences_lab.activities.LoginActivity;
import io.github.alupa.seccion_05_sharedpreferences_lab.activities.MainActivity;
import io.github.alupa.seccion_05_sharedpreferences_lab.utils.Util;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        if (!TextUtils.isEmpty(Util.getUserMailPrefs(prefs)) && !TextUtils.isEmpty(Util.getUserPassPrefs(prefs)))
            startActivity(new Intent(this, MainActivity.class));
        else
            startActivity(new Intent(this, LoginActivity.class));

        finish();
    }
}
