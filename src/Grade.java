public class Grade {
    public static double letterToGPA(String grade){
        double answer;

        switch (grade){
            case "A+":
                answer = 4;
                break;

            case "A-":
                answer = 3.7;
                break;

            case "B+":
                answer = 3.3;
                break;

            case "B-":
                answer = 2.8;
                break;

            case "C+":
                answer = 2.5;
                break;

            case "C-":
                answer = 1.8;
                break;

            case "D":
                answer = 1.5;
                break;

            case "F":
                answer = 0;
                break;

            default:
                answer = -1;
        }

        return answer;

    }
    public static void main(String args[]){
        System.out.println("Grade A: "+letterToGPA("A+"));
        System.out.println("Grade D: "+letterToGPA("D"));
        System.out.println("Grade L: "+letterToGPA("L"));
    }
}
