abstract class Vehicle
{
    abstract public void start();
    public void stop()
    {
        System.out.println("Vehicle Stopped");
    }
}
class Car extends Vehicle
{
    @Override 
    public void start()
    {
        System.out.println("Car Start with a key");
    }
}
class Bike extends Vehicle
{
    @Override 
    public void start()
    {
        System.out.println("Bike start with a button");
    }
}
public class Main 
{
    public static void main(String args[])
    {
        Vehicle v;
        v=new Car();
        v.start();
        v.stop();
        v=new Bike();
        v.start();
        v.stop();

    }    
}
