Table of Contents

    Introduction
    Features
    Installation
    Usage
    Contribution Guidelines
    License

Introduction

StringValidator is a utility Java class designed to validate strings based on specific criteria. It utilizes a single regular expression to enforce:

    Maximum string length (passed as a parameter)
    Presence of at least one uppercase letter, one lowercase letter, one digit, and one special character from a predefined list
    Absence of any whitespace characters

Features

    Maximum Length: Validate if a string's length is within the maximum limit.
    Character Types: Ensure a string contains various types of characters like uppercase, lowercase, digits, and special characters.
    Whitespace Check: Ensure a string does not contain any whitespace characters.

Installation

To use the StringValidator class, copy the source code into your Java project. Make sure you have Java 1.8 or higher installed on your machine.
Usage
Import the Class

Import the StringValidator class into your Java file:

java

import path.to.StringValidator;

Call the validateString Function

Use the validateString function to validate your string.

java

Boolean result = StringValidator.validateString.apply("YourString", maxLength);

Replace "YourString" with the string you wish to validate and maxLength with the maximum allowable length for the string.
Example:

java

Boolean result = StringValidator.validateString.apply("Abc$1", 10);

This will return true because the string meets all the criteria.
Contribution Guidelines

Feel free to contribute to this project by opening a Pull Request or an Issue. Please follow the coding standards used in the existing source code.
License

MIT License. See LICENSE for more details.
