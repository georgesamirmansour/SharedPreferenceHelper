package com.georgesamir.sharedprefhelper.Sample;

import androidx.annotation.InspectableProperty;

import java.lang.annotation.Annotation;

public enum SharedPrefKeys implements InspectableProperty.EnumEntry {
    userId, sharedName;

    @Override
    public int value() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
