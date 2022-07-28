/*
EXP 2
Write a menu driven Java program which will read
a number and should implement the following
methods
1. factorial()
2. testArmstrong()
3. testPalindrome()
4. testPrime()
5. fibonacciSeries()
*/

import java.util.*;
public class NumberOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one:\n1.Factorial\n2.Amstrong\n3.Palindrome\n4.Prime No\n5.Fibonacci Series");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                Factorial();
                break;
            case 2:
                Armstrong();
                break;
            case 3:
                Palindrome();
                break;
            case 4:
                Prime();
                break;
            case 5:
                FibonacciSeries();
                break;
        }

    }

    public static void Factorial(){
        int factorial = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to find the Factorial of a Number.");
        System.out.println("Enter the number to find it's factorial: ");
        int number = sc.nextInt();
        for(i=1;i<=number;i++)
        {
            factorial = factorial * i;
        }
        System.out.println("The factorial of "+number+" is: "+factorial);
    }

    public static void Armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to find the Armstrong Number");
        System.out.println("Enter the number to find the Armstrong Number: ");
        int number = sc.nextInt();
        int check, sum=0, rem;
        check = number;
        while(check != 0)
        {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
        }
        if(sum == number)
            System.out.println(+number+ " is an armstrong number.");
        else
            System.out.println(+number+ " is not an armstrong number.");
    }

    public static void Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to find the Palindrome of a Number");
        System.out.println("Enter the number to find if its a Palindrome: ");
        int number = sc.nextInt();
        int r,sum=0;
        int temp=number;
        while(number>0)
        {
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum)
            System.out.println("The entered number "+temp+" is a palindrome number ");
        else
            System.out.println("The entered number "+temp+" is not a palindrome");
    }

    public static void Prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to find the Prime Number.");
        System.out.println("Enter the Number to find if its a Prime No or not: ");
        int number = sc.nextInt();
        int i, a = 0;
        for (i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                a++;
            }
        }
        if (a == 2)
        {
            System.out.println(+number+" is a Prime number.");
        }
        else
        {
            System.out.println(+number+" is not a Prime number.");
        }
        }

        public static void FibonacciSeries(){
        Scanner sc = new Scanner(System.in);
            System.out.println("You have selected to find the Fibonacci Series of a number.");
            System.out.println("The number till which fibonacci series has to be found till: ");
            int number = sc.nextInt();
            int i = 1, firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + number + " terms:");
            while (i <= number)
            {
                System.out.print(firstTerm + ", ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
                i++;
            }
        }
}
