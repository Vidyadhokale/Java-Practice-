class Animal1
{
     void eat()
    {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal1
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
public class Animal 
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
