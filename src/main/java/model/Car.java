package model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
@Table(name = "cars")
public class Car
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    @Length(min = 3, message = "Should contain at least 3 characters")
    private String company;

    @Column
    @Length(min = 3, message = "Should contain at least 3 characters")
    private String model;

    @Column
    @Min(1995)
    private int year;

    @Column
    private boolean enabled;

    @Column(name = "returning_date")
    private Date returningDate;

    @Column
    @Min(0)
    private double price;

    @Column(name = "img")
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
}
