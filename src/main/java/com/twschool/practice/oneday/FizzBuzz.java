package com.twschool.practice.oneday;

public class FizzBuzz {
    private final static String FIZZ = "fizz";
    private final static String BUZZ = "buzz";
    private final static String WHIZZ = "whizz";

    public String say(int i) {
        String result = "";
        if(isDivisibleByThree(i))
            result += FIZZ;
        if(isDivisibleByFive(i))
            result += BUZZ;
        if(isDivisibleBySeven(i))
            result += WHIZZ;
        if(isContainThree(i))
            result = FIZZ;
        return result.equals("")? String.valueOf(i) : result;
    }

    private boolean isContainThree(int i) {
        return String.valueOf(i).contains("3");
    }

    private boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }

    private boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    private boolean isDivisibleBySeven(int i) {
        return i % 7 == 0;
    }

}
