package car.dao;

import car.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("carDao")
public class CarDaoHibernateImpl implements CarDao
{
    @Autowired
    private SessionFactory sessionFactory;

    public CarDaoHibernateImpl(SessionFactory session) {
        this.sessionFactory = session;
    }

    @Override
    public List<Car> getAll()
    {
        return sessionFactory.getCurrentSession().createQuery("from Car").list();
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
