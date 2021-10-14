import java.util.Scanner;

class MultipliacationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Find The Multiplication Table For: ");
        int num = sc.nextInt();
       // int num = 1;
       for(int x=1; x<=10; x++)
       {
           System.out.println(+num+ " x " +x+ " = " +num*x);
       }
    }
}


