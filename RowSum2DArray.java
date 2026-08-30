import java.util.*;
public class RowSum2DArray
{
    public static void main(String args[])
    {
        int arr[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[i][j];
            }System.out.println("Row:"+(i+1)+ "Sum:"+sum);
        }
    }
}
