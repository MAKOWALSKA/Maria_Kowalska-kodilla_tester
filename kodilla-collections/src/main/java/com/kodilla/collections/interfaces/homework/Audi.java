package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=100;
        return;
    }

    @Override
    public void decreaseSpeed() {
        speed -=10;
        return;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}