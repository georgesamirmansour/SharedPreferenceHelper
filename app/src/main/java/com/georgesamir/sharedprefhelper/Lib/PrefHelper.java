package com.georgesamir.sharedprefhelper.Lib;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.InspectableProperty;

import java.util.HashSet;
import java.util.Set;

public class PrefHelper {

    private static SharedPreferences sharedPreferences;
    public static void setSharedPreferences(Context context,
                                            InspectableProperty.EnumEntry enumEntry, int modeType) {
        sharedPreferences = context.getSharedPreferences(enumEntry.name(), modeType);
    }

    public void setIntToShared(InspectableProperty.EnumEntry enumEntry, int value) {
        try {
            sharedPreferences.edit().putInt(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public int getIntFromShared(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.getInt(enumEntry.name(), 0);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setStringToShared(InspectableProperty.EnumEntry enumEntry, String value) {
        try {
            sharedPreferences.edit().putString(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public String getStringFromShared(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.getString(enumEntry.name(), "");
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return "null";
        }
    }

    public void setBooleanToShared(InspectableProperty.EnumEntry enumEntry, boolean value) {
        try {
            sharedPreferences.edit().putBoolean(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public boolean getBoolFromShared(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.getBoolean(enumEntry.name(), false);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void setStringSetToShared(InspectableProperty.EnumEntry enumEntry, Set<String> value) {
        try {
            sharedPreferences.edit().putStringSet(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public Set<String> getStringSetFromShared(InspectableProperty.EnumEntry enumEntry) {
        Set<String> emptySet = new HashSet<>();
        try {
            return sharedPreferences.getStringSet(enumEntry.name(), emptySet);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return emptySet;
        }
    }

    public void setFloatToShared(InspectableProperty.EnumEntry enumEntry, float value) {
        try {
            sharedPreferences.edit().putFloat(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public float getFloatFromShared(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.getFloat(enumEntry.name(), 0.0f);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return 0.0f;
        }
    }

    public void setLongToShared(InspectableProperty.EnumEntry enumEntry, long value) {
        try {
            sharedPreferences.edit().putLong(enumEntry.name(), value).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public long getLongFromShared(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.getLong(enumEntry.name(), 0);
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public boolean contain(InspectableProperty.EnumEntry enumEntry) {
        try {
            return sharedPreferences.contains(enumEntry.name());
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void remove(InspectableProperty.EnumEntry enumEntry) {
        try {
            sharedPreferences.edit().remove(enumEntry.name()).apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }

    public void clear() {
        try {
            sharedPreferences.edit().clear().apply();
        } catch (ExceptionInInitializerError exception) {
            exception.printStackTrace();
        }
    }
}
