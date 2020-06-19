package com.twschool.practice;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;
    public MarsRover(MarsRoverPosition marsRoverPosition){
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {
        return marsRoverPosition;
    }

    public MarsRoverPosition execute(String command) {
        for(int i = 0;i<command.length();i++){
            if("L".equals(String.valueOf(command.charAt(i)))||"R".equals(String.valueOf(command.charAt(i)))){
                marsRoverPosition.setDirection(getDirection(marsRoverPosition.getDirection(), String.valueOf(command.charAt(i))));
            }else{
                marsRoverPosition.move();
            }
        }
        return marsRoverPosition;
    }

    public String getDirection(String direction, String roll) {
        if ("N".equals(direction) && "L".equals(roll)) {
            return "W";
        }
        if ("N".equals(direction) && "R".equals(roll)) {
            return "E";
        }
        if ("W".equals(direction) && "L".equals(roll)) {
            return "S";
        }
        if ("W".equals(direction) && "R".equals(roll)) {
            return "N";
        }
        if ("S".equals(direction) && "L".equals(roll)) {
            return "E";
        }
        if ("S".equals(direction) && "R".equals(roll)) {
            return "W";
        }
        if ("E".equals(direction) && "L".equals(roll)) {
            return "N";
        }
        if ("E".equals(direction) && "R".equals(roll)) {
            return "S";
        }
        return "0";
    }
}
