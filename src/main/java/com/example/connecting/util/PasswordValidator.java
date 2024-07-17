package com.example.connecting.util;

import java.util.regex.Pattern;

public class PasswordValidator {

    private static final Pattern UPPER_CASE = Pattern.compile("[A-Z]");
    private static final Pattern LOWER_CASE = Pattern.compile("[a-z]");
    private static final Pattern DIGIT = Pattern.compile("[0-9]");
    private static final Pattern SPECIAL_CHARACTER = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]");
    private static final int MIN_LENGTH = 8;

    public static void validatePassword(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            throw new RuntimeException("A senha deve ter pelo menos " + MIN_LENGTH + " caracteres.");
        }

//        if (!UPPER_CASE.matcher(password).find()) {
//            throw new RuntimeException( "A senha deve conter pelo menos uma letra maiúscula.");
//        }
//
//        if (!LOWER_CASE.matcher(password).find()) {
//            throw new RuntimeException( "A senha deve conter pelo menos uma letra minúscula.");
//        }

        if (!DIGIT.matcher(password).find()) {
            throw new RuntimeException( "A senha deve conter pelo menos um número.");
        }

        if (!SPECIAL_CHARACTER.matcher(password).find()) {
            throw new RuntimeException( "A senha deve conter pelo menos um caractere especial.");
        }
    }

}
