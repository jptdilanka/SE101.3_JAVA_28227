package com.mycompany.bankobject;
public class CheckingAccount extends BankAccount
{
    private static final double interestRate=0.02;
    public double calculateInterest()
    {
        return getbalance()*interestRate;
    }
}
