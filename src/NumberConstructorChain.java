/*
2.  Write a Java program to illustrate Constructor Chaining
*/
public class NumberConstructorChain {
    NumberConstructorChain()
    {
        this(9);
        System.out.println("The Default Constructor");
    }

    NumberConstructorChain(int x)
    {
        System.out.println(x);
    }

    public static void main(String args[]){
        NumberConstructorChain cc = new NumberConstructorChain();
    }
}
