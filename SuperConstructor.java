class Parent
{
    Parent()
    {
        System.out.println("This is Parent Constructor");
    }
}
class Child extends Parent
{
    Child()
    {
        super();
        System.out.println("This is Child Constructor");
    }
}
public class SuperConstructor 
{
    public static void main(String args[])
    {
        Child c=new Child();
    
    }
}
