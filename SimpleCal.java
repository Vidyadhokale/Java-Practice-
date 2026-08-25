import java.util.*;
public class SimpleCal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Simple CalCulation");
        System.out.println("Enter The First Number:");
        int n1=sc.nextInt();
        System.out.println("Enter The Second Number:");
        int n2=sc.nextInt();
        System.out.println("+,-,*,/,%");
        System.out.println("Enter Your Choice:");
        int ch=0;
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                System.out.println("Addition:"+(n1+n2));
                break;
            case '-':
                System.out.println("Subtraction:"+(n1-n2));
                break;
            case '*':
                System.out.println("Multiplication:"+(n1*n2));
                break;
            case '/':
                System.out.println("Division:"+(n1/n2));
                break;
            case '%':
                System.out.println("modulas:"+(n1%n2));
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}
