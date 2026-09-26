class BankAcc
{
    private int accountNumber;
    private double balance;
    public void setAccountDetails(int accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountDetails()
    {
        System.out.println("Account Number :" +accountNumber);
        System.out.println("Balance :" +balance);
    }
}
public class BankAccount 
{
    public static void main(String args[])
    {
        BankAcc b=new BankAcc();
        b.setAccountDetails(12345,25000);
        b.displayAccountDetails();
    }    
}
