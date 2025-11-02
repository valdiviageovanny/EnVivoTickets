package com.envivo.common;

public class StringUtils {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int ALPHABET_LENGTH = ALPHABET.length();

    public static String randomString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * ALPHABET_LENGTH);
            sb.append(ALPHABET.charAt(index));
        }
        return sb.toString();
    }
}