public class Array_Sum
{
    public static void main(String args[])
    {
        int sum=0;
        int arr[]={10,20,30,40,50};
        for(int i=0; i< arr.length;i++)
        {
            System.out.println("Array Element:"+arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Sum Of Array:"+sum);
    }
}
