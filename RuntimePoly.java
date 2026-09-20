class Payment
{
    void pay()
    {
        System.out.println("Making a Payment");
    }
}
class UPIPayment extends Payment
{
    @Override 
    void pay()
    {
        System.out.println("Payment Through UPI");
    }
}
class CardPayment extends Payment
{
    @Override 
    void pay()
    {
        System.out.println("Payment Through Card");
    }
}
public class RuntimePoly
{
    public static void main(String args[])
    {
        Payment p=new Payment();
        p.pay();
        p=new CardPayment();
        p.pay();
        p=new UPIPayment();
        p.pay();
    }    
}
