class Vehicle
{
    private String brand;
    protected int speed;
    public String color;
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void displayVehicle()
    {
        System.out.println("Brand :"+brand);
        System.out.println("Speed :"+speed);
        System.out.println("Color :"+color);
    }
}
class Car extends Vehicle
{
    public void increaseSpeed()
    {
        speed = speed + 20;
        System.out.println("Updated Speed :"+speed);
    }
}
public class VehicleSystem 
{
    public static void main(String args[])
    {
        Car c=new Car();
        c.setBrand("Toyota");
        c.setSpeed(80);
        c.setColor("Black");
        c.displayVehicle();
        c.increaseSpeed();
    }    
}
