package org.vocalink.demo;

/**
 * Created by dcoslet on 8/17/2016.
 */
public class Person {



    private String lastName;

    private String secondName;

    private String firstName;

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getSecondName ()
    {
        return secondName;
    }

    public void setSecondName (String secondName)
    {
        this.secondName = secondName;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lastName = "+lastName+", secondName = "+secondName+", firstName = "+firstName+"]";
    }
}
