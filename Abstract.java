abstract class Shape
{
    abstract void draw();
    void display()
    {
        System.out.println("This is Shape");
    }
}
class Circle extends Shape
{
    @Override 
    void draw()
    {
        System.out.println("Circle is Drawn");
    }
    
}
public class Abstract 
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.draw();
        c.display();
    }    
}
