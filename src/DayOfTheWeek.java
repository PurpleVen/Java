import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number from 1-7 to check the day of the week: ");
        int x = sc.nextInt();
        String answer = "";
        switch (x){
            case 1:
                answer = "Sunday";
                break;
            case 2:
                answer = "Monday";
                break;
            case 3:
                answer = "Tuesday";
                break;
            case 4:
                answer = "Wednesday";
                break;
            case 5:
                answer = "Thursday";
                break;
            case 6:
                answer = "Friday";
                break;
            case 7:
                answer = "Saturday";
                break;
            default:
                answer = "Invalid Input";
        }
        System.out.println("The day is: "+answer);
    }
}
