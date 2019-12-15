package com.georgesamir.sharedprefhelper.Sample;

import android.app.Application;
import android.content.Context;

import com.georgesamir.sharedprefhelper.Lib.PrefHelper;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PrefHelper.setSharedPreferences(getApplicationContext(), SharedPrefKeys.sharedName,
                Context.MODE_PRIVATE);
    }
}
