package com.twschool.practice;

import java.util.regex.Pattern;

public class GeneratorTest {
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
