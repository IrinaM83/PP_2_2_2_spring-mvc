package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDao cd = new CarDaoImpl();

    @Override
    public List<Car> printCars(int count) {
        return cd.printCars(count);
    }

}
