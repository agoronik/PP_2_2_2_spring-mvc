package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarService {
    private List<Car> cars = new ArrayList();

    public List<Car> getAll() {
        cars.add(new Car("Lada", "Granta", "White", 2008));
        cars.add(new Car("Lada", "Priora", "Yellow", 2016));
        cars.add(new Car("Lada", "X-Ray", "Black", 2019));
        cars.add(new Car("Hyundai", "Sonata", "Green", 2016));
        cars.add(new Car("Nissan", "Pathinder", "Balck", 2016));

        return cars;
    }

    public List<Car> getCarsByCountCar(int count) {
        return this.getAll().stream().limit(count).toList();
    }
}
