/*
5. A university has two types of students — graduate students and research students.
        The University maintains the record of name, age and programme of every student.
        For graduate students, additional information like percentage of marks and stream, like
        science, commerce, etc. is recorded;
        whereas for research students, additionally, specialization and years of working experience, if any, is recorded.
        Each class has a constructor. The constructor of subclasses makes a call to constructor of the superclass.
        Assume that every constructor has the same number of parameters as the
        number of instance variables.
        In addition, every subclass has a method that may update the instance variable values of that subclass.
        All the classes have a function display_student_info( ), the subclasses must override this method of the base class.
*/

public class University
{
    String Name;
    int Age;
    String Programme;
    public University(String name, int age, String programme)
    {
        Name = name;
        Age = age;
        Programme = programme;
    }
    public void display_student_info()
    {
        System.out.println("Name = " + Name + "\nAge = " + Age + "\nProgramme = " + Programme);
    }
}
class GraduateStudents extends University
{
    double PercentageOfMarks;
    String Stream;

    public GraduateStudents(String name, int age, String programme, double percentage, String stream)
    {
        super(name, age, programme);
        PercentageOfMarks = percentage;
        Stream = stream;
    }
    public void display_student_info()
    {
        System.out.println("\n---Graduate Students---");
        super.display_student_info();
        System.out.println("Percentage Obtained = " + PercentageOfMarks + "\nStream = " + Stream);
    }
}
class ResearchStudents extends University
{
    String Specialization;
    int YearsOfWorkingExperience;

    public ResearchStudents(String name, int age, String programme, String specialization, int experience)
    {
        super(name, age, programme);
        Specialization = specialization;
        YearsOfWorkingExperience = experience;
    }

    public void display_student_info()
    {
        System.out.println("\n---Research Students---");
        super.display_student_info();
        System.out.println("Specialization = " + Specialization + "\nYears Of Working Experience (if any) = " + YearsOfWorkingExperience);
    }
}
class UniversityMain
{
    public static void main(String args[])
    {
        GraduateStudents g = new GraduateStudents("Mark", 21,"B.SC",61, "Science");
        g.display_student_info();
        ResearchStudents r = new ResearchStudents("Jackson",25,"Computer Engineering", "Analytics", 2);
        r.display_student_info();
    }
}