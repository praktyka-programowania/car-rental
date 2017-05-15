package service;

import model.Car;

import java.util.List;

public interface CarService
{
    List<Car> getAll();
    Car getCar(int id);
    void rentCar(int id);
    void returnCar(int id);
    void deleteCar(int id);
    List<Car> search(Car car);

    void addAll(List<Car> list);
}
