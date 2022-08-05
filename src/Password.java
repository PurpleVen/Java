/*
EXP 3
1)
Write java program where user will enter loginid and password as input.
The password should be 8 digit containing one digit and one special symbol.
If user enter valid password satisfying above criteria then show “Login Successful Message”.
If user enter invalid Password then create InvalidPasswordException stating Please enter valid
password of length 8 containing one digit and one Special Symbol.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        System.out.println("Enter LoginID:");
        Scanner in = new Scanner(System.in);
        String LoginID = in.nextLine();

        System.out.println("Enter Password:");
        String password = in.nextLine();
        try {
            isValid(password);
            System.out.println("Your Login Is Successful!");
        } catch (InvalidPasswordException e) {
            System.out.println(e.printMessage());
        }
    }

    public static void isValid(String password) throws InvalidPasswordException {
        if (password.length()<8) {
            throw new InvalidPasswordException(1);
        }
        if(true) {
            int count=0;

            for (int i=0;i<=9;i++) {
                String str1=Integer.toString(i);
                if(password.contains(str1)) {
                    count=1;
                }
            }
            if(count==0) {
                throw new InvalidPasswordException(2);
            }
        }
        Pattern specialCharPattern=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);

        if(!specialCharPattern.matcher(password).find()) {
            throw new InvalidPasswordException(3);
        }
    }
}

class InvalidPasswordException extends Exception{

    int PasswordCondition = 0;

    public InvalidPasswordException(int conditions) {
        PasswordCondition = conditions;
    }

    public String printMessage() {
        switch(PasswordCondition) {
            case 1: return("Please Enter Valid Password Where Length Should Be 8 Characters");
            case 2: return("Please Enter Valid Password Where Password Should Contain At Least One Digit(0-9)");
            case 3: return("Please Enter Valid Password Where Password Should Contain At Least One Special Character");
        }
        return ("");
    }

}
