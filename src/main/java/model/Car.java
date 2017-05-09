package model;

import dao.CarDaoTemporaryImpl;

public class Car
{
    private int id;
    private String company;
    private String model;
    private int year;
    private boolean enabled;
    private double price;

    public Car()
    {}

    public Car(int id, String company, String model, int year, double price)
    {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
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

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
