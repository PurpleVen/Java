/*
7. Consider a hierarchy, where a sportsperson can either be an athlete or a hockey player. Every sportsperson has
a unique name. An athlete is characterized by the event in which he/she participates; whereas a hockey player is
characterised by the number of goals scored by him/her. Perform the following tasks using Java :

(i)Create the class hierarchy with suitable instance variables and methods.
(ii) Create a suitable constructor for each class.
(iii) Create a method named display_all_info with suitable parameters. This method should display all the
information about the object of a class.
(iv) Write the main method that demonstrates
polymorphism

*/
public class Hierarchy{
    String Name;
    int Age;

    public Hierarchy(String name, int age)
    {
        Name = name;
        Age = age;
    }
    public void display_all_info()
    {
        System.out.println("Name = " + Name + "\nAge = " + Age);
    }
}
class Athlete extends Hierarchy
{
    String Event;

    public Athlete(String name, int age, String event)
    {
        super(name, age);
        Event = event;
    }
    public void display_all_info()
    {
        System.out.println("\n---Athlete---");
        super.display_all_info();
        System.out.println("Event = " + Event);
    }
}
class Hockey extends Hierarchy
{
    int NumberOfGoals;

    public Hockey(String name, int age, int goals)
    {
        super(name, age);
        NumberOfGoals = goals;
    }
    public void display_all_info()
    {
        System.out.println("\n---Hockey Player---" );
        super.display_all_info();
        System.out.println("Number Of Goals = " + NumberOfGoals);
    }
}

class HierarchyMain
{
    public static void main(String args[])
    {
        Athlete a = new Athlete("Divock Origi", 26, "Premier League");
        a.display_all_info();
        Hockey h = new Hockey("Manpreet Singh", 29, 22);
        h.display_all_info();

    }
}