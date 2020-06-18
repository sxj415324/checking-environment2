package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_coordinate_x0_y0_direction_N_given_coordinate_X0_Y0_direction_N(){
        //given
        MarsRover marsRoverTest = new MarsRover(new MarsRoverPosition(0,0,"N"));
        //when

        //then
        Assert.assertEquals(0,marsRoverTest.getMarsRoverPosition().getCoordinatesX());
        Assert.assertEquals(0,marsRoverTest.getMarsRoverPosition().getCoordinatesY());
        Assert.assertEquals("N",marsRoverTest.getMarsRoverPosition().getDirection());
    }


}

