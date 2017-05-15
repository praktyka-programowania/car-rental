package dao;

import model.Car;

import java.util.Date;
import java.util.List;

public interface CarDao
{
    List<Car> getAll();
    Car getCar(int id);
    void addCar(Car car);
    void rentCar(int id, Date date);
    void returnCar(int id);
    void deleteCar(int id);
}
