import java.util.*;
public class Smallest2DArray
{
    public static void main(String args[])
    {
        int arr[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Matrix Elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int min =arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                if(arr[i][j]< min)
                {
                    min =arr[i][j];
                }
            }
        }System.out.println("Smallest Element is:"+ min);
    }
}
