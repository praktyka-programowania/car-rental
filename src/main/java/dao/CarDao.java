package dao;

import model.Car;

import java.util.List;

public interface CarDao
{
    List<Car> getAll();
    Car getCar(int id);
    void addCar(Car car);
    void rentCar(int id);
    void returnCar(int id);
    void deleteCar(int id);
    List<Car> search(String str);
    List<Car> search(int year);
    List<Car> search(String company, String model);
    List<Car> search(Car car);
}
