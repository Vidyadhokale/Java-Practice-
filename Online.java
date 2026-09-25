class Payment
{
    private double amount;
    Payment(double amount)
    {
        this.amount=amount;
    }
    public void setAmount(double amount)
    {
        this.amount=amount;
    }
    public double getAmount()
    {
        return amount;
    }
    void processPayment()
    {
        System.out.println("Processing Payment of :"+amount);
    }
}
class UPIPayment extends Payment
{
    private String upiId;
    UPIPayment(double amount,String upiId)
    {
        super(amount);
        this.upiId=upiId;
    }
    @Override 
    void processPayment()
    {
        System.out.println("\n"+"UPIID :"+upiId);
        super.processPayment();
    }
}
class CardPayment extends Payment
{
    private String cardType;
    CardPayment(double amount,String cardType)
    {
        super(amount);
        this.cardType=cardType;
    }
    @Override 
    void processPayment()
    {
        System.out.println("\n"+"Card Type :"+cardType);
        super.processPayment();
    }
}
public class Online 
{
    public static void main(String args[])
    {
        UPIPayment p=new UPIPayment(10000,"UPI5476231");
        p.processPayment();
        CardPayment p1=new CardPayment(10000,"PhonePay");
        p1.processPayment();
    }    
}
