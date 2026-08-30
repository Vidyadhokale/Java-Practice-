import java.util.*;
public class Largest2DArray
{
    public static void main(String args[])
    {
        int arr[][]=new int[2][2];
        int max=arr[0][0];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Matrix Elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] +" ");
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }System.out.println();
        }System.out.println("Largest Element is:"+max);
    }
}
