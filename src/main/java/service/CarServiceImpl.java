package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    CarDao dao;

    @Override
    public List<Car> getAll()
    {
        return dao.getAll();
    }

    @Override
    public Car getCar(int id)
    {
        return dao.getCar(id);
    }

    @Override
    public void rentCar(int id)
    {
        dao.rentCar(id);
    }

    @Override
    public void returnCar(int id)
    {
        dao.returnCar(id);
    }

    @Override
    public void deleteCar(int id)
    {
        dao.deleteCar(id);
    }

    @Override
    public List<Car> search(String str)
    {
        return dao.search(str);
    }

    @Override
    public List<Car> search(int year)
    {
        return dao.search(year);
    }

    @Override
    public List<Car> search(Car car)
    {
        return dao.search(car);
    }

    @Override
    public List<Car> search(String company, String model)
    {
        return dao.search(company, model);
    }
}
