package org.vocalink.demo;

/**
 * Created by dcoslet on 8/17/2016.
 */
public class AccountHolder {

    private Person person;

    public Person getPerson ()
    {
        return person;
    }

    public void setPerson (Person person)
    {
        this.person = person;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [person = "+person+"]";
    }
}
