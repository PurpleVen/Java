public class StringsUpperCaseOrLower {
    public static String test(String x){
        if(x.length()%2==0){
            return x.toUpperCase();
        }
        return x.toLowerCase();
    }
    public static void main(String args[]){
        String odd = "Hello";
        String even = "Java";
        System.out.println("Hello: "+test(odd));
        System.out.println("Java : "+test(even));
    }
}
