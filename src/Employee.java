/*
6. An employee works in a particular department of an organization. Every employee has an employee number,
name and draws a particular salary. Every department has a name and a head of department. The head of
department is an employee. Every year a new head of department takes over. Also, every year an employee is
given an annual salary enhancement. Identify and design the classes for the above description with suitable
instance variables and methods. The classes should be such that they implement information hiding. You must
give logic in support of your design. Also create two objects of each class.
*/
public class Employee {
    String Name;
    int EmployeeNumber;
    double Salary;
    public Employee(String name, int empNo, double salary)
    {
        Name = name;
        EmployeeNumber = empNo;
        Salary = salary;
    }
    public void Display()
    {
        System.out.println("\nEmployee Name = " + Name + "\nEmployee Number = " + EmployeeNumber + "\nSalary = " + Salary);
    }
}
class Department extends Employee {
    String DepartmentName;
    String DepartmentHead;

    public Department(String name, int empNo, double salary, String depName, String depHead) {
        super(name, empNo, salary);
        DepartmentName = depName;
        DepartmentHead = depHead;
    }

    public void Display() {
        System.out.println("\n---Department Details---");
        super.Display();
        System.out.println("Department Name = " + DepartmentName + "\nDepartment Head = " + DepartmentHead);
    }

}
class SalaryEnhancement extends Employee
{
    double salaryEnhancement;
    public SalaryEnhancement(String name, int empNo, double salary, double sal)
    {
        super(name, empNo, salary);
        salaryEnhancement = sal;
    }
    public void Display()
    {
        System.out.println("\n---Salary Enhancement---");
        super.Display();
        System.out.println("Annual Salary Enhancement = " + salaryEnhancement);
    }
}
class EmployeeMain
{
    public static void main(String args[])
    {
        Employee e = new Employee("Ren",57, 17500 );
        System.out.println("---Employee Details---");
        e.Display();
        Department d = new Department("Ben", 113, 17000, "Oasis", ""+e.Name);
        d.Display();
        SalaryEnhancement s = new SalaryEnhancement(""+d.Name,+d.EmployeeNumber, d.Salary, 9000 + d.Salary);
        s.Display();
    }
}

