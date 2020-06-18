package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_coordinate_x0_y0_direction_N_given_coordinate_X0_Y0_direction_N() {
        //given
        MarsRover marsRoverTest = new MarsRover(new MarsRoverPosition(0, 0, "N"));
        //when

        //then
        Assert.assertEquals(0, marsRoverTest.getMarsRoverPosition().getCoordinatesX());
        Assert.assertEquals(0, marsRoverTest.getMarsRoverPosition().getCoordinatesY());
        Assert.assertEquals("N", marsRoverTest.getMarsRoverPosition().getDirection());
    }

    @Test
    public void should_add_coordinatesY_by_1_when_execute_M_command_given_init_position_x0_y0_direction_N() {
        //given
        MarsRover marsRoverTest = new MarsRover(new MarsRoverPosition(0, 0, "N"));
        //when
        MarsRoverPosition marsRoverPosition = marsRoverTest.execute("M");
        //then
        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0, marsRoverTest.getMarsRoverPosition().getCoordinatesX());
        Assert.assertEquals(1, marsRoverTest.getMarsRoverPosition().getCoordinatesY());
        Assert.assertEquals("N", marsRoverTest.getMarsRoverPosition().getDirection());
    }

    @Test
    public void should_direction_W_when_execute_L_command_given_init_position_x0_y0_direction_N( ){
        //given
        MarsRover marsRoverTest = new MarsRover(new MarsRoverPosition(0, 0, "N"));
        //when
        MarsRoverPosition marsRoverPosition = marsRoverTest.execute("L");
        //then
        Assert.assertNotNull(marsRoverPosition);
        Assert.assertEquals(0, marsRoverPosition.getCoordinatesX());
        Assert.assertEquals(0, marsRoverPosition.getCoordinatesY());
        Assert.assertEquals("W", marsRoverPosition.getDirection());
    }





}

