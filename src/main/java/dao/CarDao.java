package dao;

import model.Car;

import java.util.List;

public interface CarDao
{
    List<Car> getAll();
    Car getCar(int id);
    void rentCar(int id);
    void returnCar(int id);
    void deleteCar(int id);
}
