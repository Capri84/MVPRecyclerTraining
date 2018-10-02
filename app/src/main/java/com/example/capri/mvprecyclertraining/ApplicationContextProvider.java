package com.example.capri.mvprecyclertraining;

import android.app.Application;
import android.content.Context;

public class ApplicationContextProvider extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    /**
     * Returns the application context
     *
     * @return application context
     */
    public static Context getContext() {
        return sContext;
    }
}