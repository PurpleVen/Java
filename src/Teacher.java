/*
3. Create a Teacher class and derive Professor/Associate_Professor/Assistant_Professor class from Teacher class.
    Define appropriate constructor for all the classes.
    Also define a method to display information of Teacher.
    Make necessary assumptions as required.
*/
public class Teacher
{
    private String Name;
    private int Age;
    private String EmailId;
    private String Subject;
    public Teacher(String n, int age, String emailId, String sub)
    {
        Name = n;
        Age = age;
        EmailId = emailId;
        Subject = sub;
    }
    public void Display()
    {
        System.out.println("Name = " + Name + "\nAge = " + Age + "\nEmailId = " + EmailId + "\nSubject = " +Subject);
    }
}
 class Professor extends Teacher
{
    double salary;

    public Professor(String n, int age, String emailId, String sub, double s)
    {
        super(n, age, emailId, sub);
        salary = s;
    }

    public void Display()
    {
        System.out.println("\n---Professor---");
        super.Display();
        System.out.println("salary = " + salary);
    }
}
class Associate_Professor extends Teacher
{
    String major;
    double salary;

    public Associate_Professor(String n, int age, String emailId, String sub, double s,String m)
    {
        super(n, age, emailId, sub);
        major = m;
        salary = s;
    }

    public void Display()
    {
        System.out.println("\n---Associate_Professor---");
        super.Display();
        System.out.println("Salary = " + salary + "\nMajor = " + major);
    }
}
class TeacherInfo
{
    public static void main(String[] args)
    {
        Teacher a = new Teacher("Jones", 30, "jones@123", "Physics");
        System.out.println("---Teacher---");
        a.Display();
        Professor b = new Professor("Ron", 28, "ron@256", "Chemistry", 35000);
        b.Display();
        Associate_Professor c = new Associate_Professor("Jim", 27, "jim@789", "DSA", 25000, "Information Technology");
        c.Display();
    }
}