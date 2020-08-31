import java.io.*;
   class SavingsAccount
   {
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
    }

    public double calculateMonthlyInterest()
    {
        return (savingsBalance*annualInterestRate)/12;
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public static double getannualInterestRate()
    {
        return annualInterestRate;
        
    }

    public double getsavingsBalance()
    {
        return savingsBalance;
        
    }
  } 


public  class Main
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(5000.0);
        SavingsAccount saver2 = new SavingsAccount(5000.0);

        SavingsAccount.modifyInterestRate(4);

        System.out.printf("Balance for Saver1 = %.2f\nBalance (with itr) for Saver1 = %.2f\nInterest Rate = %.2f\n\n",saver1.getsavingsBalance(),saver1.getsavingsBalance()+saver1.calculateMonthlyInterest(),SavingsAccount.getannualInterestRate());

        SavingsAccount.modifyInterestRate(5);

        System.out.printf("Balance for Saver2 = %.2f\nBalance (with itr) for Saver2 = %.2f\nInterest Rate = %.2f\n\n",saver2.getsavingsBalance(),saver2.getsavingsBalance()+saver2.calculateMonthlyInterest(),SavingsAccount.getannualInterestRate());
    }
}
