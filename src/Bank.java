/*
EXP 3
2) Java Program to Create Account with 1000 Rs Minimum Balance, Deposit Amount, Withdraw
Amount and Also Throws LessBalanceException.
It has a Class Called LessBalanceException Which returns the Statement that Says WithDraw
Amount(_Rs) is Not Valid.
It has a Class Which Creates 2 Accounts, Both Account Deposite Money and One Account Tries to
WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the
Same.
*/
import java.io.*;
class LessBalanceException extends Exception
{
    LessBalanceException(double amt)
    {
        System.out.println("Insufficient Amount!");
    }
}
class CreateAccount
{
    int accno;
    double balance;
    String name;
    CreateAccount(double bal,String n,int accno)
    {
        System.out.println("\nAccount Is Successfully Opened!");
        this.balance=bal;
        System.out.println("Name : " + n);
        name=n;
        System.out.println("Your Account Number is : "+accno);
        this.accno=accno;
    }
    void Deposit(double amt)
    {
        System.out.println("Available Balance : "+balance);
        balance=balance+amt;
        System.out.println("Rs. : "+amt+" /- Deposited");
        System.out.println("Balance : "+balance);
    }
    void withdraw(double amt) throws LessBalanceException
    {
        System.out.println("\nAvailable Balance : "+balance);
        balance-=amt;
        if(balance<1000)
        {
            balance+=amt;
            throw new LessBalanceException(amt);
        }
        System.out.println("Rs. : "+amt+ "/-Debited");
        System.out.println("Balance : "+balance);
    }
    void balance()
    {
        System.out.println("\n******Customer information*****");
        System.out.println("============================================");
        System.out.println("Customer Name : "+name);
        System.out.println("Account Number : "+accno);
        System.out.println("Balance : "+balance);
    }
}
class Bank
{
    static int i=0;
    public static void main(String argv[]) throws IOException
    {
        CreateAccount ob[]=new CreateAccount[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double amt;
        String name;
        int ch,accno,k;
        boolean t=false;
        while(true)
        {
            System.out.println("\n***** Bank Transaction *****");
            System.out.println("1.Create Account\n2.Deposit");
            System.out.println("3.Withdraw\n4.Balance\n5.Exit");
            System.out.print("Enter your choice : ");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Opening New Account : ");
                    System.out.print("Enter your name : ");
                    name=br.readLine();
                    System.out.print("\nEnter Account Number : ");
                    accno=Integer.parseInt(br.readLine());
                    System.out.print("\nEnter Initial Amount To open A Account: ");
                    amt=Double.parseDouble(br.readLine());
                    if(amt<1000)
                        System.out.println("You cannot create an account with less than Rs.1000/-");
                    else
                    {
                        ob[i]=new CreateAccount(amt,name,accno);
                        i++;
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {
                        System.out.print("\nEnter the Amount for Deposit : ");
                        amt=Double.parseDouble(br.readLine());
                        ob[k].Deposit(amt);
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 3:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {
                        System.out.print("\nEnter the Amount for Withdraw : ");
                        amt=Double.parseDouble(br.readLine());
                        try
                        {
                            ob[k].withdraw(amt);
                        }
                        catch(LessBalanceException e)
                        {}
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 4:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {

                        ob[k].balance();
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 5:
                    System.exit(1);
                default: System.out.println("Invalid Choice !!!");
            }
        }
    }
}
