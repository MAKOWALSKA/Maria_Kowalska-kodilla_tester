package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }

    public int getSpeed() {
        if (speed <= 0) {
            return 0;
        } else {
            return speed;
        }
    }
}

