class Employee
{
    private String name;
    Employee(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void work()
    {
        System.out.println("Employee is Working");
    }
}
class Developer extends Employee
{
    Developer(String name)
    {
        super(name);
    }
    @Override 
    public void work()
    {
        System.out.println("Developer is Writing code");
    }
}

public class Override1
{
    public static void main(String args[])
    {
        Developer d=new Developer("Vidya");
        System.out.println(d.getName());
        d.work();
    }   
}
