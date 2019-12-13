package com.georgesamir.sharedprefhelper;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class PrefHelper {

    private static SharedPreferences sharedPreferences;

    public static void setSharedPreferences(Context context,
                                            String sharedPrefName, int modeType) {
        sharedPreferences = context.getSharedPreferences(sharedPrefName, modeType);
    }

    public void setIntToShared(String key, int value) {
        try {
            sharedPreferences.edit().putInt(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public int getIntFromShared(String key) {
        try {
            return sharedPreferences.getInt(key, 0);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public void setStringToShared(String key, String value) {
        try {
            sharedPreferences.edit().putString(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public String getStringFromShared(String key) {
        try {
            return sharedPreferences.getString(key, "");
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return "null";
    }

    public void setBooleanToShared(String key, boolean value) {
        try {
            sharedPreferences.edit().putBoolean(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public boolean getBoolFromShared(String key) {
        try {
            return sharedPreferences.getBoolean(key, false);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public void setStringSetToShared(String key, Set<String> value) {
        try {
            sharedPreferences.edit().putStringSet(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public Set<String> getStringSetFromShared(String key) {
        Set<String> emptySet = new HashSet<>();
        try {
            return sharedPreferences.getStringSet(key, emptySet);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return emptySet;
    }

    public void setFloatToShared(String key, float value) {
        try {
            sharedPreferences.edit().putFloat(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public float getFloatFromShared(String key) {
        try {
            return sharedPreferences.getFloat(key, 0.0f);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return 0.0f;
    }

    public void setLongToShared(String key, long value) {
        try {
            sharedPreferences.edit().putLong(key, value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public long getLongFromShared(String key) {
        try {
            return sharedPreferences.getLong(key, 0);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    public boolean contain(String key) {
        return sharedPreferences.contains(key);
    }

    public void remove(String key) {
        sharedPreferences.edit().remove(key).apply();
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }
}
