package io.github.alupa.seccion_05_sharedpreferences_lab.app;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Alvaro on 23-10-2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Este es solo para poder ver el Splash Screen durante 2 segundos
        SystemClock.sleep(2000);
    }
}
