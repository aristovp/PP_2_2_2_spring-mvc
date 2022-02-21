package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarServiceImpl implements CarService{

    private static final List<Car> carsAll = new ArrayList<>();
    static {
        carsAll.add(new Car("volvo", 2, "black"));
        carsAll.add(new Car("BMW", 5, "blue"));
        carsAll.add(new Car("reno", 1, "white"));
        carsAll.add(new Car("toyota", 9, "red"));
        carsAll.add(new Car("mazda", 3, "orang"));
    }

    @Override
    public List<Car> getListCars(Integer count) {
        List<Car> carList = new ArrayList<>();
        Optional<Integer> optionalCount = Optional.ofNullable(count);

        if (optionalCount.isPresent()) {
            if (count < 1 || count >= 5) {
                carList = carsAll;
            }else {
                for (int i = 0; i < count; i++) {
                    carList.add(carsAll.get(i));
                }
            }
        } else {
             carList = carsAll;
        }
        return carList;
    }
}