package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CarDaoTemporaryImpl implements CarDao
{
    private static List<Car> list;
    private static int count;

    static
    {
        count = 1;
        list = new ArrayList<>();
        list.add(new Car(count++, "Mercedes", "w140", 2005, 1555));
        list.add(new Car(count++, "BMW", "e36", 2005, 2000));
        list.add(new Car(count++, "Mazda", "6", 2005, 1222));
        list.add(new Car(count++, "WAZ", "2101", 1995, 400));
    }

    public static int getCount()
    {
        return count;
    }

    @Override
    public List<Car> getAll()
    {
        List<Car> result = new ArrayList<>();
        for (Car car : list)
            if (car.isEnabled())
                result.add(car);
        return result;
    }

    @Override
    public Car getCar(int id)
    {
        for (Car car : list)
            if (car.getId() == id)
                return car;
        return null;
    }

    @Override
    public void addCar(Car car)
    {
        list.add(new Car(count++, car.getCompany(), car.getModel(), car.getYear(), car.getPrice()));
    }

    @Override
    public void rentCar(int id)
    {
        for (Car car : list)
            if (car.getId() == id)
                car.setEnabled(false);
    }

    @Override
    public void returnCar(int id)
    {
        for (Car car : list)
            if (car.getId() == id)
                car.setEnabled(true);
    }

    @Override
    public void deleteCar(int id)
    {
        Iterator<Car> it = list.iterator();
        while (it.hasNext())
        {
            Car car = it.next();
            if (car.getId() == id)
                it.remove();
        }
    }

    @Override
    public List<Car> search(String str)
    {
        List<Car> result = new ArrayList<>();
        for (Car car : list)
        {
            if (car.isEnabled() && (car.getCompany().equals(str) || car.getModel().equals(str)))
                result.add(car);
        }
        return result;
    }

    @Override
    public List<Car> search(String company, String model)
    {
        List<Car> result = new ArrayList<>();
        for (Car car : list)
        {
            if (car.isEnabled() && (car.getCompany().equals(company) && car.getModel().equals(model)))
                result.add(car);
        }
        return result;
    }

    @Override
    public List<Car> search(int year)
    {
        List<Car> result = new ArrayList<>();
        for (Car car : list)
        {
            if (car.isEnabled() && car.getYear() == year)
                result.add(car);
        }
        return result;
    }

    @Override
    public List<Car> search(Car c)
    {
        List<Car> result = new ArrayList<>();
        for (Car car : list)
        {
            if (car.isEnabled() && car.equals(c))
                result.add(car);
        }
        return result;
    }
}
