public class Calculator
{
    void add(int a,int b)
    {
        System.out.println("Sum Of Two Integers is:"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Sum Of Three Integers is:"+(a+b+c));
    }

    public static void main(String args[])
    {
        Calculator c= new Calculator();
        c.add(10,20);
        c.add(5,4,1);
    }
}
