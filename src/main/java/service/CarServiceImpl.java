package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    @Qualifier("carDao")
    CarDao dao;

    @Override
    public List<Car> getAll()
    {
        List<Car> list = dao.getAll();
        List<Car> result = new ArrayList<>();
        for (Car car : list)
            if (car.isEnabled())
                result.add(car);
        return result;
    }

    @Override
    public List<Car> getSortedList()
    {
        List<Car> list = getAll();
        Collections.sort(list, (a, b) -> a.getCompany().compareTo(b.getCompany()));
        return list;
    }

    @Override
    public Car getCar(int id)
    {
        return dao.getCar(id);
    }

    @Override
    public void rentCar(int id, Date date)
    {
        dao.rentCar(id, date);
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
    public List<Car> search(Car car)
    {
        List<Car> res = new ArrayList<>();
        List<Car> list = dao.getAll();
        for (Car c : list)
        {
            if (car.getCompany().equals(c.getCompany()))
            {
                if (car.getModel().isEmpty())
                {
                    if (car.getYear() == 0 || car.getYear() == c.getYear())
                        res.add(c);
                }
                else if (car.getModel().equals(c.getModel()))
                {
                    if (car.getYear() == 0 || car.getYear() == c.getYear())
                        res.add(c);
                }
            }
        }
        return res;
    }

    @Override
    public void addAll(List<Car> list)
    {
        for (Car car : list)
            dao.addCar(car);
    }
}
