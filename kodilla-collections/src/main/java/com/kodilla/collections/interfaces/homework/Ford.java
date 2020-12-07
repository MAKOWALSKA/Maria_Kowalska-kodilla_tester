package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=10;
        return;
    }
    @Override
    public void decreaseSpeed() {
        speed -= 5;
        return;
    }
    public int getSpeed() {
        return speed;
    }
}
