class Employee
{
    private String name;
    private double basicSalary;
    Employee(String name,double basicSalary)
    {
        this.name=name;
        this.basicSalary=basicSalary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void SetBasicSalary(double basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    public String getName()
    {
        return name;
    }
    public double basicSalary()
    {
        return basicSalary;
    }
    public double calculateSalary()
    {
       return basicSalary;
    }
}
class Developer extends Employee
{
    private double bonus;
    Developer(String name,double basicSalary,double bonus)
    {
        super(name, basicSalary);
        this.bonus=bonus;
    }
    @Override 
    public double calculateSalary()
    {
        super.calculateSalary();
        return basicSalary()+bonus;
    }
}
class Manager extends Employee
{
    private double allowance;
    Manager(String name,double basicSalary,double allowance)
    {
        super(name, basicSalary);
        this.allowance=allowance;
    }
    @Override 
    public double calculateSalary()
    {
       return basicSalary()+allowance;
    }
}
public class EmployeeSalary 
{
    public static void main(String args[])
    {
        Employee e;
        e=new Developer("Vidya",80000,40000);
        System.out.println("Developer Salary: " + e.calculateSalary());

        e=new Manager("Vidya",80000,20000);
        System.out.println("Manager Salary: " + e.calculateSalary());
        
    }    
}
