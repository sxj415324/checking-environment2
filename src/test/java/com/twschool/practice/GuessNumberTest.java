package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void should_return_0A0B_given_GuessNumber_1234_when_input_5678(){
        //given
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String result = guessNumber.compare("5678");
        //then
        Assert.assertEquals("0A0B",result);
        Assert.assertNotNull(result);
    }


}
