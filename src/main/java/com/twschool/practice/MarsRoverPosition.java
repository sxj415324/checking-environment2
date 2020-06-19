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

    public void move() {
        if("N".equals(getDirection())){
            setCoordinatesY(getCoordinatesY()+1);
        }else if("W".equals(getDirection())){
            setCoordinatesX(getCoordinatesX()-1);
        }else if("S".equals(getDirection())){
            setCoordinatesY(getCoordinatesY()-1);
        }else if("E".equals(getDirection())){
            setCoordinatesX(getCoordinatesX()+1);
        }
    }
}
