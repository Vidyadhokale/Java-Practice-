import java.util.*;
public class TreeSetDemo 
{
    public static void main(String args[])
    {
        TreeSet <Integer> marks =new TreeSet<>();
        marks.add(75);
        marks.add(45);
        marks.add(90);
        marks.add(60);
        marks.add(45);
        marks.add(80);
        System.out.println("\n"+"Marks Set :"+marks+"\n");
        System.out.println("In Marks Set 60 Exists :"+marks.contains(60)+"\n");
        marks.remove(45);
        System.out.println("After Removing 45 Marks From Marks Set :"+marks+"\n");
        System.out.println("Highest Marks From Marks Set :"+marks.last()+"\n");
        System.out.println("Final Set :"+marks+"\n");
        System.out.println("Size :"+marks.size());
    }    
}
