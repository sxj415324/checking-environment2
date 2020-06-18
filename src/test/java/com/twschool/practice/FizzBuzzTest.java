package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_string1_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.say(1) ;
        //then
        assertEquals(result,"1");
    }
}
