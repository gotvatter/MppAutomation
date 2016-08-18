package org.vocalink.demo;

/**
 * Created by dcoslet on 8/17/2016.
 */
public class Registrations {

    private AccountHolder accountHolder;

    private Account account;

    private String displayName;

    public AccountHolder getAccountHolder ()
    {
        return accountHolder;
    }

    public void setAccountHolder (AccountHolder accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public Account getAccount ()
    {
        return account;
    }

    public void setAccount (Account account)
    {
        this.account = account;
    }

    public String getDisplayName ()
    {
        return displayName;
    }

    public void setDisplayName (String displayName)
    {
        this.displayName = displayName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [accountHolder = "+accountHolder+", account = "+account+", displayName = "+displayName+"]";
    }
}
