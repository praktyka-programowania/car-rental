package model;

public class Person
{
    private String firstName;
    private String secondName;
    private int[] creditCard;
    private int age;
    private String username;
    private String password;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }

    public int[] getCreditCard()
    {
        return creditCard;
    }

    public void setCreditCard(int[] creditCard)
    {
        this.creditCard = creditCard;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    @Override
    public String toString()
    {
        return firstName + ", " + secondName + ", " + age + "years old.";
    }
}
