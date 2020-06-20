package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {

    //记录并保留了一步步学习到到几种方法

    @Test
    public void should_return_0A0B_given_GuessNumber_1234_when_input_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        //when
        String result = guessNumber.compare("5 6 7 8");
        //then
        Assert.assertEquals("0A0B", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void should_return_4A0B_given_GuessNumber_1234_when_input_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        //when
        String result = guessNumber.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B", result);
        Assert.assertNotNull(result);
    }
/*
    @Test
    public void should_return_2A0B_given_GuessNumber_1234_when_input_1256() {
        //given
        GuessNumber guessNumber = new GuessNumber("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(guessNumber);
        //when
        String result = guessNumberGame.guess("1 2 3 4");
        //then
        Assert.assertEquals("2A0B", result);
    }
*/
}
