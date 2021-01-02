package com.georgesamir.sharedprefhelper.Lib

import android.app.Application
import android.content.Context

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        PrefHelper.sharedPreferences = getSharedPreferences(SharedPrefKey.appName.name, Context.MODE_PRIVATE)
        PrefHelper().getIntFromShared(SharedPrefKey.appName)
    }
}