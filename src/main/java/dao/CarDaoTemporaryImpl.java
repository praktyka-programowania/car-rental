package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.*;

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
        list.add(new Car(count++, "BMW", "e37", 2006, 2000));
        list.add(new Car(count++, "Mazda", "RX8", 2005, 1222));
        list.add(new Car(count++, "Mazda", "626", 2005, 1222));
        list.add(new Car(count++, "BMW", "e38", 2003, 2000));
        list.add(new Car(count++, "BMW", "e36", 2005, 2000));
        list.add(new Car(count++, "BMW", "e36", 2005, 2000));
        list.add(new Car(count++, "Mazda", "6", 2005, 1222));
        list.add(new Car(count++, "Mazda", "3", 2005, 1222));
        list.add(new Car(count++, "Waz", "2101", 2005, 1222));
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
        Collections.sort(result, (a, b) -> a.getCompany().compareTo(b.getCompany()));
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
    public List<Car> search(Car car)
    {
        List<Car> res = new ArrayList<>();
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
}
