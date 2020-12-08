package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=100;
    }

    @Override
    public void decreaseSpeed() {
        speed -=10;
    }
    @Override
    public int getSpeed() {
        if (speed <= 0) {
            return 0;
        } else {
            return speed;
        }
    }
}