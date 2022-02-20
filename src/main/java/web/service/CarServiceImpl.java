package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private final List<Car> list = new Car().getFiveCars();

    @Override
    public List<Car> getListCars(int count) {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            carList.add(list.get(i));
        }
        return carList;
    }

    @Override
    public List<Car> getAllListCars() {
        return list;
    }
}
