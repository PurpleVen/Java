public class SumDigits {
    public static int SumOfDigit(int var) {
        int result = 0;
        int lastDigit = 0;
        while (var > 0) {
            lastDigit = var % 10;
            result = result + lastDigit;
            System.out.println("Last Digit: " + lastDigit);
            System.out.println("Sum: " + result);
            var /= 10;
            System.out.println("\nNumber: " + var);
        }
        return result;
    }

    public static void main(String args[]) {
        int number = 9999;
        System.out.println("\nNumber: " + number);
        System.out.println("Sum of digits in 9999 is: " + SumOfDigit(number));
    }
}
