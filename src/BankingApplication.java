/*EXP 1
  Write a Menu driven program in java to implement simple banking applications.
  Application should read the customer name, account number, initial balance,
  rate of interest, contact number and address field etc.
  Application should have following methods.
  1. createAccount()
  2. deposit()
  3. withdraw()
  4. computeInterest()
  5. displayBalance()
*/
import java.util.*;
public class BankingApplication {

        static double balance = 9000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose one:\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Compute Interest\n5.Display\n6.Exit.");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    Interest();
                    break;
                case 5:
                    Dispaly();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public static void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details required to Create a Account");
        System.out.println("Enter your Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Address: ");
        String address = sc.nextLine();
        System.out.println("Enter your Mobile No: ");
        String Mobno = sc.nextLine();
        System.out.println("Enter you PAN No: ");
        String Age = sc.nextLine();
        System.out.println("Your Account Is Created Succesfully.");
    }

    public static void Deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You've choosed to Deposit");
        //int amount;
        //double balance=9000;
        //amount = 9000;
        System.out.println("Enter the Amount to Deposit: ");
        int amount = sc.nextInt();
        balance +=amount;

        System.out.println("The Balance of The Account is: "+balance);
        System.out.println("Amount Deposited Successfully.");
    }

    public static void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to Withdraw");
        //int amount;
        //float balance=9000;
        double amount;
        System.out.println("Enter the Amount to Withdraw: ");
        amount = sc.nextDouble();
        balance -=amount;
       // double balance;
        System.out.println("The Balance of The Account is: "+balance);
        System.out.println("Amount Withdrawal successful.");
    }

    public static void Interest(){
        float Interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("You have selected to Compute Interest");
        System.out.println("Enter the Principal amount: ");
        float PrincipalAmount = sc.nextFloat();
        System.out.println("Enter Interest Rate Per Annum: ");
        float Rate = sc.nextFloat();
        System.out.println("Enter the No of Year(s): ");
        int Years = sc.nextInt();
        Interest = (PrincipalAmount * Rate * Years)/100;
        System.out.println("The interest is: "+ Interest);
    }

    public static void Dispaly(){
        System.out.println("Your total balance is: "+balance);
    }
}
