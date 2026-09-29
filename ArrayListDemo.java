import java.util.*;
public class ArrayListDemo 
{
    public static void main(String args[])
    {
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Numbers :"+numbers);
        System.out.println("Index Value Of 2 :"+numbers.get(2));
    }    
}
