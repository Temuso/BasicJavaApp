package com.temcode.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullorEmpty(String str) {
        if (str == null || str.trim().equals("")) {
            return true;
        }
        return false;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
