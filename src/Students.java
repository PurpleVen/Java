class StudentsMarks{
    double Maths;
    double Physics;
    double Chemistry;
    double BEE;
    double Mechanics;
}
public class Students {
    public static void main(String args[])

    {
        StudentsMarks a = new StudentsMarks();
        double average;

        a.Maths = 16;
        a.Physics = 15;
        a.Chemistry = 17;
        a.BEE = 15;
        a.Mechanics = 13;

        average = (a.Maths + a.Physics + a.Chemistry + a.BEE + a.Mechanics / 5);
        System.out.println("Average is " + average);
    }
}