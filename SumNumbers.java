public class SumNumbers
{
    public static void main(String args[])
    {
        int i=0;
        int sum=0;
        //By Using While
        while(i<10)
        {
            i++;
            sum=sum+i;
        }
        System.out.println("Sum of Numbers is:"+sum);


        //By using For
        int i1=0;
        int sum1=0;
        for(i1=1;i1<=10;i1++)
        {
            sum1=sum1+i1;
        }
        System.out.println("sum of Numbers is:"+sum1);


    }
}
