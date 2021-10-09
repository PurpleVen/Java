public class Maths {
    public static void main(String args[]){
        double x = 99.0;
        double y = 18.0;
        double z = 53.0;
        double answer;
        double sum = Math.pow(x,2) + Math.pow(y,3);
        double sub = sum - Math.abs(z);
        answer = Math.cbrt(sub);
        System.out.println(answer);
    }
}
