package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Answer {
    private String gameAnswer;
    public Answer(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }
    public String compare(String userAnswer){
        int ValueAndPositionCorrectCount = 0;
        int ValueIncorrectAndPositionCorrectCount = 0;
        for (int i = 0;i<this.gameAnswer.length();i++){
            if (String.valueOf(this.gameAnswer.charAt(i)).equals(String.valueOf(userAnswer.charAt(i)))){
                ValueAndPositionCorrectCount += 1;
                continue;
            }
            if (this.gameAnswer.contains(String.valueOf(userAnswer.charAt(i)))){
                ValueIncorrectAndPositionCorrectCount +=1;
            }
        }
        return ValueAndPositionCorrectCount+"A"+ValueIncorrectAndPositionCorrectCount+"B";
    }
}
