class Triangle {

    private double length;
    private double height;

    public Triangle(int l, int h) {
        length = l;
        height = h;
    }

    public double area() {
        return (length * height / 2.0);
    }
}

class RightAngleTriangle {
    public static double test(Triangle rt) {
        return rt.area();
    }
    public static void main( String args[] ) {
        Triangle one= new Triangle(3,5);
        System.out.println("Area Of The Right Angle Traingle Is:" + test(one));
    }
}

