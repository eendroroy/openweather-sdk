package com.github.eendroroy.sdk.openweather;

/**
 * @author indrajit
 */

public enum Unit {
    STANDARD("standard"),
    METRIC("metric"),
    IMPERIAL("imperial");

    private final String value;

    Unit(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }

    public String value(){
        return this.value;
    }
}