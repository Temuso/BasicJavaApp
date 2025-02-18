package com.temcode.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {

    public static boolean isNullorEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }

}
