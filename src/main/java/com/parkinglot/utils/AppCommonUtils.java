package com.parkinglot.utils;

import org.apache.commons.lang3.RandomStringUtils;

public final class AppCommonUtils {

    private AppCommonUtils() {

    }

    public static String generateUID() {
        return RandomStringUtils.random(10, true, false);
    }
}
