/*
package dao;

import model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
        return null;//session.getCurrentSession().createQuery("from Cars").list();
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
*/
