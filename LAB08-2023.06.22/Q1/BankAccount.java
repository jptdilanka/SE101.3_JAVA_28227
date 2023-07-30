package com.mycompany.bankobject;
public abstract class BankAccount 
{
    private int accountNumber;
    private double balance;
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getbalance()
    {
        return balance;
    }
    public abstract double calculateInterest();
}
