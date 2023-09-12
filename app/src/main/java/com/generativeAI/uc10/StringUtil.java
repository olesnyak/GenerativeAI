package com.generativeAI.uc10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    /**
     * Validates a string based on the given criteria.
     *
     * @param str           The string to validate
     * @param maxLength     The maximum acceptable length for the string
     * @return              true if the string matches all the criteria; false otherwise
     */
    public static boolean validateString(String str, int maxLength) {
        // Regular expression for validating the string
        String regex = String.format(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%%&'()*+,-./:;<=>?@[\\]^_`{|}~])" +
                        "[A-Za-z\\d!\"#$%%&'()*+,-./:;<=>?@[\\]^_`{|}~]{1,%d}$", maxLength);

        // Compile and use the regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
