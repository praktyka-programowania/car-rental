package car.model;

public class Person
{
    private int id;
    private String firstName;
    private String secondName;
    private String username;
    private String password;

    public int getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }



    @Override
    public String toString()
    {
        return firstName + ", " + secondName + " years old.";
    }
}
