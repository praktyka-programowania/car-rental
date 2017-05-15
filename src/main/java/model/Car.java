package model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CARS")
public class Car
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    @NotEmpty(message = "Should be not empty")
    private String company;

    @Column
    private String model;

    @Column
    private int year;

    @Column
    private boolean enabled;

    @Column(name = "RETURNING_DATE")
    private Date returningDate;

    @Column
    private double price;

    @Column(name = "IMG")
    private String url;

    public Car()
    {}

    public Car(int id, String company, String model, int year, double price)
    {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year > 2000 || year == 0 ? year : 2000;
        this.enabled = true;
        this.price = price;
    }

    public Car(String company, String model, int year, double price)
    {
        this.company = company;
        this.model = model;
        this.year = year > 2000 || year == 0 ? year : 2000;
        this.enabled = true;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    public Date getReturningDate()
    {
        return returningDate;
    }

    public void setReturningDate(Date returningDate)
    {
        this.returningDate = returningDate;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (car.year != 0 && year != car.year) return false;
        if (company != null ? !company.equals(car.company) : car.company != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    public boolean equalsName(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (company != null ? !company.equals(car.company) : car.company != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }
}
