package com.example.jbl_3356.ExceptionHandling;

/*class Exception {
    public static void main(String args[]) {
        int d = 0;
        int n = 20;
        try {
            int fraction = n / d;
            System.out.println("This line will not be Executed");
        } catch (ArithmeticException e) {
            System.out.println("In the catch Block due to Exception = " + e);
        }
        System.out.println("End Of Main");
    }
}*/
//The finally block is executed irrespective of an exception being raised in the try block. It is optional to use with a try block.
class Exception {
    public static void main(String args[]){
        try{
            int d = 0;           //if d = 1, then it'll directly reach the finally blcok as there is no exception.
            int n =20;
            int fraction = n/d;
        }
        catch(ArithmeticException e){
            System.out.println("\nIn the catch block due to Exception = "+e);
        }
        finally{
            System.out.println("\nInside the finally block");
        }
    }
}