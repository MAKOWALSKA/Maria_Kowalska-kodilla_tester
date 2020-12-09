package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {
    int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
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
