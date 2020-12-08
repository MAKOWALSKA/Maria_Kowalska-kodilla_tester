package com.kodilla.collections.interfaces.homework;

public class CarRace {

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }

    public static void main(String[] args) {
        Ford Ford = new Ford(0);
        doRace(Ford);
        Skoda Skoda = new Skoda(0);
        doRace(Skoda);
        Audi Audi = new Audi(0);
        doRace(Audi);
    }

}
