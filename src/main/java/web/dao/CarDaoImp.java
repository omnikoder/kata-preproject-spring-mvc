package web.dao;

import web.model.Car;

import java.util.List;

public class CarDaoImp implements CarDao {
    private static final List<Car> carList;

    static {
        carList = List.of(
                new Car(1L, "Kia Rio", 2020),
                new Car(2L, "Ford Mustang", 2022),
                new Car(3L, "Lada Kalina", 2004),
                new Car(4L, "Bugatti Veyron", 2015),
                new Car(5L, "Chevrolet Corvette", 2022)
        );
    }

    @Override
    public List<Car> getCars(int amount) {
        return (amount > carList.size() || amount <= 0)
                ? carList
                : carList.subList(0, amount);
    }
}
