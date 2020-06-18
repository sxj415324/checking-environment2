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

    @Test
    public void should_return_fizz_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        assertEquals(result,"fizz");
    }

    @Test
    public void should_return_buzz_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        assertEquals(result,"buzz");
    }

    @Test
    public void should_return_fizzbuzz_given_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(15);
        //then
        assertEquals(result,"fizzbuzz");
    }

    @Test
    public void should_return_whizz_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(7);
        //then
        assertEquals(result,"whizz");
    }
}
