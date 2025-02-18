package com.temcode.util;

public class Helper {

    public static boolean isNullorEmpty(String str) {
        if (str == null || str.trim().equals("")) {
            return true;
        }
        return false;
    }

}
