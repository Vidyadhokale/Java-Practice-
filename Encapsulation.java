class BankAccount
{
    private  String accountHolder;
    private double balance;
    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder=accountHolder;
    }
    public void setBalance(double balance)
    {
        if(balance >=0)
        {
            this.balance=balance;
        }
        else
        {
            System.out.println("Invalid Balance");
        }
        
    }
    public String getAccountHolder()
    {
        return accountHolder;
    }
    public double getBalance()
    {
        return balance;
    }
}
public class Encapsulation
{
    public static void main(String args[])
    {
        BankAccount b=new BankAccount();
        b.setAccountHolder("vidya");
        b.setBalance(5000);
        b.setBalance(-1000);
        System.out.println(b.getAccountHolder());
        System.out.println(b.getBalance());    
    }    
}
