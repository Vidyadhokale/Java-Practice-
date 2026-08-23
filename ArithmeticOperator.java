import java.util.*;
public class ArithmeticOperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2=sc.nextInt();
        System.out.println("Addition:"+(n1+n2));
        System.out.println("Subtraction:"+(n1-n2));
        System.out.println("Multiplication:"+(n1*n2));
        System.out.println("Division:"+(n1/n2));
        System.out.println("Remainder:"+(n1%n2));

    }
}
