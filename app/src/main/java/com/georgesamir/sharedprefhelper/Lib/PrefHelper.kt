package com.georgesamir.sharedprefhelper.Lib

import android.content.SharedPreferences
import androidx.annotation.InspectableProperty

class PrefHelper {

    companion object {
        var sharedPreferences: SharedPreferences? = null
    }

    fun setIntToShared(enumEntry: InspectableProperty.EnumEntry, value: Int) {
        try {
            sharedPreferences?.edit()?.putInt(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getIntFromShared(enumEntry: InspectableProperty.EnumEntry): Int? {
        return try {
            sharedPreferences?.getInt(enumEntry.name, 0)
        } catch (e: Exception) {
            e.printStackTrace()
            0
        }
    }

    fun setBooleanToShared(enumEntry: InspectableProperty.EnumEntry, value: Boolean) {
        try {
            sharedPreferences?.edit()?.putBoolean(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getBooleanFromShared(enumEntry: InspectableProperty.EnumEntry): Boolean? {
        return try {
            sharedPreferences?.getBoolean(enumEntry.name, false)
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun setStringToShared(enumEntry: InspectableProperty.EnumEntry, value: String) {
        try {
            sharedPreferences?.edit()?.putString(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getStringFromShared(enumEntry: InspectableProperty.EnumEntry): String? {
        return try {
            sharedPreferences?.getString(enumEntry.name, "")
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

    fun setFloatToShared(enumEntry: InspectableProperty.EnumEntry, value: Float) {
        try {
            sharedPreferences?.edit()?.putFloat(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getFloatFromShared(enumEntry: InspectableProperty.EnumEntry): Float? {
        return try {
            sharedPreferences?.getFloat(enumEntry.name, 0f)
        } catch (e: Exception) {
            e.printStackTrace()
            0f
        }
    }

    fun setLongToShared(enumEntry: InspectableProperty.EnumEntry, value: Long) {
        try {
            sharedPreferences?.edit()?.putLong(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getLongFromShared(enumEntry: InspectableProperty.EnumEntry): Long? {
        return try {
            sharedPreferences?.getLong(enumEntry.name, 0)
        } catch (e: Exception) {
            e.printStackTrace()
            0
        }
    }

    fun setStringSetShared(enumEntry: InspectableProperty.EnumEntry, value: Set<String>) {
        try {
            sharedPreferences?.edit()?.putStringSet(enumEntry.name, value)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getStringSetFromShared(enumEntry: InspectableProperty.EnumEntry): Set<String>? {
        var stringSet: MutableSet<String> = HashSet()
        return try {
            sharedPreferences?.getStringSet(enumEntry.name, stringSet)
        } catch (e: Exception) {
            e.printStackTrace()
            stringSet
        }
    }

    fun remove(enumEntry: InspectableProperty.EnumEntry) {
        try {
            sharedPreferences?.edit()?.remove(enumEntry.name)?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun contain(enumEntry: InspectableProperty.EnumEntry): Boolean? {
        return try {
            sharedPreferences?.contains(enumEntry.name)
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun clearAll() {
        try {
            sharedPreferences?.edit()?.clear()?.apply()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}