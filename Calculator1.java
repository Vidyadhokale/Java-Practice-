public class Calculator1
{
    void add(int a,int b)
    {
        System.out.println("Addition of Two Numbers:"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Addition of Three Numbers:"+(a+b+c));
    }
    public static void main(String args[])
    {
        Calculator1 c=new Calculator1();
        c.add(5,4);
        c.add(3,3,3);
    }
}
