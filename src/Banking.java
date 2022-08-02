import java.util.Scanner;

public class Banking{

    static float balance;
    static void createAccount(){
        //customer name, account number, initial balance, rate of interest, contact number and address field
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR DETAILS: ");
        System.out.println("FULL NAME: ");
        String accNo = sc.nextLine();
        System.out.println("UID NO: ");
        String uidNo = sc.nextLine();
        System.out.println("PAN CARD NO: ");
        String panNo = sc.nextLine();
        System.out.println("ENTER D.O.B. IN dd/mm/yyyy : ");
        String dob = sc.nextLine();
        System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY");
    }

    static void deposit(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED: ");
        int cashDeposit = sc.nextInt();
        balance += cashDeposit;
        System.out.println("THE AMOUNT HAS BEEN DEPOSITED SUCCESSFULLY");

    }

    static void withdraw(){
        Scanner sc = new Scanner(System.in);
        int cashWithdraw;

        do{
            System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN: ");
            cashWithdraw = sc.nextInt();

            if(cashWithdraw > balance){
                System.out.println("INSUFFICIENT BALANCE, PLEASE ENTER A VALID AMOUNT!");
            }

        }while(cashWithdraw > balance);

        balance -= cashWithdraw;
        System.out.println("PLEASE COLLECT YOUR MONEY");
        displayBalance();
    }

    static void computeInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO. OF YEARS: ");
        float years = sc.nextFloat();
        System.out.println("ENTER RATE OF INTEREST: ");
        float rateOfInterest = sc.nextFloat();
        float interest = balance * years * rateOfInterest;
    }

    static void displayBalance(){
        System.out.println("YOUR CURRENT BALANCE IS: " +balance);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("ENTER AN OPERATION YOU WANT TO PERFORM");
            System.out.println("1.CREATE ACCOUNT 2.DEPOSIT MONEY 3.WITHDRAW MONEY 4.VIEW BALANCE");
            int choice = sc.nextInt();
            switch(choice){

                    case 1: createAccount();
                        break;

                    case 2: deposit();
                        break;

                    case 3: withdraw();
                        break;

                    case 4: displayBalance();
                        break;

                    default: System.out.println("INVALID OPERATION");
                }



            }
        }

    }
