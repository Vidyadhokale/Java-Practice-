class Employee
{
    private String name;
    private double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    void displayDetails()
    {
        System.out.println("\n" +"Name :"+name);
        System.out.println("Salary :"+salary);
    }
}
class Manager extends Employee
{
    private String department;
    Manager(String name,double salary,String department)
    {
        super(name,salary);
        this.department=department;
    }
    @Override 
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Department :"+department);
    }
}
class Developer extends Employee
{
    private String programmingLanguage;
    Developer(String name,double salary,String programmingLanguage)
    {
        super(name,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override 
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("ProgrammingLanguage :"+programmingLanguage);
    }
}
public class Main2
{
    public static void main(String args[])
    {
        Manager m1=new Manager("Vidya",70000,"Computer Science");
        m1.displayDetails();
        Developer d1=new Developer("Vidya",80000,"Java");
        d1.displayDetails();
    }
}
