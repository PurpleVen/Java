import java.util.Scanner;
class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number till which fibonacci series has to be found till: ");
        int number = sc.nextInt();
        int i = 1, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + number + " terms:");
        while (i <= number) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}