package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

class CarsListApplication {
        public static void main(String[] args) {
            List<Audi> cars = new ArrayList<>();
            Audi Audi = new Audi(120);
            cars.add(Audi);
            cars.add(new Audi(280));
            cars.add(new Audi(100));
            cars.add(new Audi(50));
            cars.add(new Audi(200));

            for ( Car car : cars)
                CarUtils.describeCar(car);

            cars.remove(Audi);
            cars.remove(3);

            System.out.println("updated array includes " + cars.size() + " elements");
            for ( Car car : cars)
                CarUtils.describeCar(car);

    }
}
