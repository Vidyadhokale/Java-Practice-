import java.util.*;
public class SumOf2DArray
{
    public static void main(String args[])
    {
        int arr[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Matrix Elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                System.out.print(arr[i][j] +" ");
                sum=sum+arr[i][j];
            }System.out.println();
        }
        System.out.println("Sum of Matrix is:"+sum);

    }
}
