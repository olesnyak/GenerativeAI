package com.generativeAI.uc10;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilAndroidTest {

    @Test
    public void testTooShortInput() {
        assertFalse(StringUtil.validateString("A1#", 30));
    }

    @Test
    public void testTooLongInput() {
        assertFalse(StringUtil.validateString("ThisStringIsWayTooLongForValidation1#", 30));
    }

    @Test
    public void testMatchingInputLength() {
        assertTrue(StringUtil.validateString("Exactly30CharsLongString#", 30));
    }

    @Test
    public void testMissingUppercase() {
        assertFalse(StringUtil.validateString("missinguppercase1#", 30));
    }

    @Test
    public void testMissingLowercase() {
        assertFalse(StringUtil.validateString("MISSINGLOWERCASE1#", 30));
    }

    @Test
    public void testMissingSpecialCharacter() {
        assertFalse(StringUtil.validateString("MissingSpecial1", 30));
    }

    @Test
    public void testMissingDigit() {
        assertFalse(StringUtil.validateString("MissingDigit@", 30));
    }

    @Test
    public void testExcessWhitespace() {
        assertFalse(StringUtil.validateString("Whitespace 1@", 30));
    }

    @Test
    public void testLeadingWhitespace() {
        assertFalse(StringUtil.validateString(" Leading1@", 30));
    }

    @Test
    public void testTrailingWhitespace() {
        assertFalse(StringUtil.validateString("Trailing1@ ", 30));
    }
}