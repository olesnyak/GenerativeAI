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
        // Create the regex pattern dynamically to avoid escape sequence issues
        String specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String regex = "^" +
                "(?=.*[A-Z])" + // At least one uppercase letter
                "(?=.*[a-z])" + // At least one lowercase letter
                "(?=.*[0-9])" + // At least one digit
                "(?=.*[" + Pattern.quote(specialCharacters) + "])" + // At least one special character
                "[^\\s]" + // No whitespace characters
                "{1," + maxLength + "}$"; // Length constraint

        // Compile and use the regular expression
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
