package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private static int ID_CAR;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++ID_CAR, "Opel", "blue"));
        cars.add(new Car(++ID_CAR, "Renault", "red"));
        cars.add(new Car(++ID_CAR, "Nissan", "black"));
        cars.add(new Car(++ID_CAR, "Niva", "white"));
        cars.add(new Car(++ID_CAR, "Suzuki", "orange"));
    }

    @Override
    public List<Car> printCars(int count) {
        if (count < 1 || count > 5) {
            count = cars.size();
        }
        return cars.stream().limit(count).toList();
    }
}
