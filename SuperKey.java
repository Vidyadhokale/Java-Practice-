class Parent
{
    int x=10;
}
class Child extends Parent
{
    int x=20;
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class SuperKey 
{
    public static void main(String args[])
    {
        Child c=new Child();
        c.display();
    }
}
