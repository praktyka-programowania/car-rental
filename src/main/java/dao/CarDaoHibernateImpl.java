package dao;

import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CarDaoHibernateImpl implements CarDao
{
    @Override
    public List<Car> getAll()
    {
        return null;
    }

    @Override
    public Car getCar(int id)
    {
        return null;
    }

    @Override
    public void addCar(Car car)
    {

    }

    @Override
    public void rentCar(int id)
    {

    }

    @Override
    public void returnCar(int id)
    {

    }

    @Override
    public void deleteCar(int id)
    {

    }

    @Override
    public List<Car> search(Car car)
    {
        return null;
    }
}
