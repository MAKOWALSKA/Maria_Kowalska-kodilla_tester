package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {
    int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
        return;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        return;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
