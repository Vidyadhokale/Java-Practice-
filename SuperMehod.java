class Parent
{
    void display()
    {
        System.out.println("This is Parent Method");
    }
}
class Child extends Parent
{
    void display()
    {
        System.out.println("This is Child Method");
        super.display();
    }
}
public class SuperMehod 
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.display();
    }
}
