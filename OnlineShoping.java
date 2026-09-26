class Product
{
    private String productName;
    private double price;
    public void setDetails(String productName,double price)
    {
        this.productName=productName;
        this.price=price;
    }
    protected double calculateDiscount()
    {
        return price * 10 / 100;
    }
    public void displayPrice()
    {
        System.out.println("Product :" +productName);
        System.out.println("Original Price :"+price);
    }
}
class PremiumProduct extends Product
{
    public void showDiscount()
    {
        System.out.println("Discount :" +calculateDiscount());
    }
}
public class OnlineShoping 
{
    public static void main(String args[])    
    {
        PremiumProduct p=new PremiumProduct();
        p.setDetails("Laptop", 50000);
        p.displayPrice();
        p.showDiscount();

    }
}
