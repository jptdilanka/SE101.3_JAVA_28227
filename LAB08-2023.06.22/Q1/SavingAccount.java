package com.mycompany.bankobject;
public class SavingAccount extends BankAccount 
{
    private static final double interest=0.12;
   
    public double calculateInterest()
    {
        return getbalance()*interest;
    }
    
}
