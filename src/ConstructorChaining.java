import javax.swing.*;

public class ConstructorChaining {
}

class Demo
{
    this(80;
}
//derived class or child class
class Prototype extends Demo
{
    //
    Prototype()
    {
        this("Java","Python");
        System.out.println("Default class default constructer called");
    }
}

Prototype(String str1, String str2)
{
    super();
    System.out.println("Strings are "+str1+" "+str2);
    System.out.println("Derived class parameterized constructer called");
}
}
public class ConstructorChaining
{
    public static void main(String args[])
    {
          Prototype my_example = new Prototype( );
    }
}