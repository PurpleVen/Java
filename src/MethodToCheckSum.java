import java.util.Scanner;

class MethodToCheckSum {
    public  static int checkSum(int one, int two) {
        int check;
        int sum = one + two;

        if (sum <= 100)
            check = 0;

        else if (sum >= 100)
            check = 1;

        else  
            check = 2;

        return check;
    }
    public static void main(String args[]){
        int answer = checkSum(100,0);
        System.out.println("The Value Of Check Is: "+answer);

        answer = checkSum(100, 119);
        System.out.println("The Value Of Check Is: "+answer);

        answer = checkSum(100,-119);
        System.out.println("The Value Of Check Is: "+answer);
    }
}
