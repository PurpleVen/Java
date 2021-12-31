class Box {
    double weight;
    double depth;
    double height;
    double width;
}

public class UseBox{
    public static void main(String args[]){

        //Create Object of class this way
        Box a = new Box();
        Box b = new Box();
        double volume1 , volume2;

        //assign values
        a.depth = 10;
        a.height = 10;
        a.width = 10;
        a.weight = 10;

        b.depth = 10;
        b.height = 10;
        b.width = 10;
        b.weight = 10;

        volume1 = a.height * a.width * a.depth;
        volume2 = a.height * a.width * a.depth;
        System.out.println("Volume " + volume1);
        System.out.println("Volume " + volume2);
    }
}