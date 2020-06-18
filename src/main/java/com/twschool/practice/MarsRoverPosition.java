package com.twschool.practice;

public class MarsRoverPosition {
    private  int coordinatesX;
    private  int coordinatesY;
    private String direction;
    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX ;
        this.coordinatesY = coordinatesY;
        this.direction = direction;
    }
    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getDirection() {
        return direction;
    }
    public void setCoordinatesX(int x){
        this.coordinatesX = x;
    }

    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
