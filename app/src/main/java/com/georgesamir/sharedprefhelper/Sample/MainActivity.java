package com.georgesamir.sharedprefhelper.Sample;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.georgesamir.sharedprefhelper.Lib.PrefHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity: ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new PrefHelper().setIntToShared(SharedPrefKeys.userId, 10);
        Log.e(TAG, "onCreate: " + new PrefHelper().getIntFromShared(SharedPrefKeys.userId));
    }
}
