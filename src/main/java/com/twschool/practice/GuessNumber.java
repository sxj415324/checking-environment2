package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GuessNumber {
    private String guessNumber;

    public GuessNumber(String guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String compare(String inputNumber) {
        return "0A0B";
    }

    public String check(String inputNumberString) {
        List<String> inputNumber = Arrays.asList(inputNumberString.split(""));
        int ValueAndPositionCorrectCount = 0;
        int ValueIncorrectAndPositionCorrectCount = 0;
        for (int index = 0; index < inputNumber.size(); index++) {
            if (inputNumber.get(index).equals(inputNumber.get(index))) {
                ValueAndPositionCorrectCount ++;
            } else if (inputNumber.contains(inputNumber.get(index))) {
                ValueIncorrectAndPositionCorrectCount ++;
            }
        }
        return ValueAndPositionCorrectCount + "A" + ValueIncorrectAndPositionCorrectCount + "B";
    }
}
