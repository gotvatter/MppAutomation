package org.vocalink.demo;

/**
 * Created by dcoslet on 8/17/2016.
 */
public class Registration {

    private Proxy proxy;

    private Registrations[] registrations;

    public Proxy getProxy ()
    {
        return proxy;
    }

    public void setProxy (Proxy proxy)
    {
        this.proxy = proxy;
    }

    public Registrations[] getRegistrations ()
    {
        return registrations;
    }

    public void setRegistrations (Registrations[] registrations)
    {
        this.registrations = registrations;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [proxy = "+proxy+", registrations = "+registrations+"]";
    }

}
