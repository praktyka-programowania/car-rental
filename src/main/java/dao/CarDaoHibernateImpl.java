package dao;

import model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Repository("carDao")
@Transactional
public class CarDaoHibernateImpl implements CarDao
{
    @Autowired
    private SessionFactory session;

    @Override
    public List<Car> getAll()
    {
        return session.getCurrentSession().createQuery("from model.Car").list();
    }

    @Override
    public Car getCar(int id)
    {
        return (Car)session.getCurrentSession().get(Car.class, id);
    }

    @Override
    public void addCar(Car car)
    {
        session.getCurrentSession().saveOrUpdate(car);
    }

    @Override
    public void rentCar(int id, Date date)
    {
        Car car = getCar(id);
        car.setEnabled(false);
        car.setReturningDate(date);
        session.getCurrentSession().update(car);
    }

    @Override
    public void returnCar(int id)
    {
        Car car = getCar(id);
        car.setEnabled(true);
        car.setReturningDate(null);
        session.getCurrentSession().update(car);
    }

    @Override
    public void deleteCar(int id)
    {
        session.getCurrentSession().delete(id);
    }
}
