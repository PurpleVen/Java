import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A Number To Check If It's Even Or Odd: ");
        int x = sc.nextInt();
        if(x % 2 == 0)
        {
            System.out.println("It Is even");
        }
        else if(x % 2 == 1)
        {
            System.out.println("It Is Odd");
        }
    }
}
