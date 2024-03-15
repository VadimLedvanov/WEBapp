package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarService {


    CarDAO carDAO;
    @Autowired
    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> printCars(Integer count) {
        return carDAO.printCars(count);
    }
}
