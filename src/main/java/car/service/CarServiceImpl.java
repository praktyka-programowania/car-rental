package car.service;

import car.dao.CarDao;
import car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CarServiceImpl implements CarService
{
    @Autowired
    CarDao carDao;

    public CarServiceImpl(CarDao dao) {
        this.carDao = dao;
    }

    @Override
    public List<Car> getAll()
    {
        return carDao.getAll();
    }

    @Override
    public Car getCar(int id)
    {
        return carDao.getCar(id);
    }

    @Override
    public void rentCar(int id)
    {
        carDao.rentCar(id);
    }

    @Override
    public void returnCar(int id)
    {
        carDao.returnCar(id);
    }

    @Override
    public void deleteCar(int id)
    {
        carDao.deleteCar(id);
    }

    @Override
    public List<Car> search(Car car)
    {
        return carDao.search(car);
    }
}
