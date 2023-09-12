Table of Contents

    Introduction
    Installation
    Examples
    Android Tests

Introduction

StringUtil - String Validation Utility for Android
Overview

StringUtil is a utility class that provides advanced string validation functionalities. This includes checking the string against various security requirements and constraints, making it useful for validating passwords, tokens, or any other secure strings.
Features

    Validates that the string length falls within a given limit.
    Checks for at least one uppercase letter, one lowercase letter, one digit, and one special character.
    Verifies that the string doesn't contain any whitespace characters.

Installation

Simply copy the StringUtil.java file into your Android project's java/com/yourpackage/utils/ directory.
Usage

Here's how to use the validateString function in your Android app:

java

boolean isValid = StringUtil.validateString("Valid1#", 20);

if (isValid) {
    // Proceed with logic
} else {
    // Show an error message
}

Parameters

    str (String): The string to validate.
    maxLength (int): The maximum allowable length of the string.

Return Value

    Returns true if the string meets all the criteria.
    Returns false if it fails any of the conditions.

Examples

java

boolean isValid1 = StringUtil.validateString("Valid1#", 20);  // Returns true
boolean isValid2 = StringUtil.validateString("invalid", 20);  // Returns false
boolean isValid3 = StringUtil.validateString("TooLongString1#", 10);  // Returns false
boolean isValid4 = StringUtil.validateString("With Space1#", 20);  // Returns false

Unit Tests

Unit tests are available in the StringUtilTest.java file. They cover various edge cases and can be run to verify the functionality of StringUtil.
Running Unit Tests

In Android Studio, right-click on the StringUtilTest.java file and choose Run 'StringUtilTest'.
Android Tests

Android-specific tests can be found in StringUtilAndroidTest.java. These tests include checking for edge cases specific to Android use-cases.
Running Android Tests

In Android Studio, right-click on the StringUtilAndroidTest.java file and choose Run 'StringUtilAndroidTest'.
