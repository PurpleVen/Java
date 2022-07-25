/*
1. Create a Java based application to perform various ways of Method overloading.
	i.e No parameters, types of paratemeters, Constructor Overloading.
*/
import java.util.*;
public class MethodOverloading {

    static class Overloading {

        static int add(int a, int b)
        {
            return a + b;
        }

        static int add()
        {
            int a = 53, b = 90;
            return a + b;
        }

        static double add(double a, double b)
        {
            return a + b;
        }

        static int add(int a, int b, int c)
        {
            return a + b + c;
        }

    }

    static class ConstructorOverloading {
        int Student_Id;
        String Student_Name;

        ConstructorOverloading()
        {
            System.out.println("Default Constructor\n");
        }

        ConstructorOverloading(int id, String name)
        {
            Student_Id = id;
            Student_Name = name;
        }

    }
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose one:\n1.No Parameters\n2.Types Of Paratemeters\n3.Constructor Overloading\n4.Exit.");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    NoParameters();
                    break;
                case 2:
                    TypesOfParatemeters();
                    break;
                case 3:
                    ConstructorOverloading();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }
    }

    public static void NoParameters(){
        int a = 53, b = 90;
        System.out.println("--------Method Overloading---------");
        System.out.println(+a+ " + " +b+ " : "+Overloading.add());
    }

    public static void TypesOfParatemeters(){
        System.out.println("Overloading with DataType: "+Overloading.add(90,80));
        System.out.println("Overloading By Changing DataType: "+Overloading.add(55.5,37.9));
        System.out.println("Overloading By Changing No. Of Arguments: "+Overloading.add(70,90,8));
    }

    public static void ConstructorOverloading(){
        System.out.println("---Constructor Overloading---\n");
        ConstructorOverloading c = new ConstructorOverloading();
        System.out.println("---Default Constructor Values ---");
        System.out.println("\nStudent_Id : "+c.Student_Id + "\nStudent Name : "+c.Student_Name);

        System.out.println("\n---Parameterized Constructor Values ---");
        ConstructorOverloading d = new ConstructorOverloading(53, "Vendra");
        System.out.println("\nStudent_Id : "+d.Student_Id + "\nStudent Name : "+d.Student_Name);
    }
}