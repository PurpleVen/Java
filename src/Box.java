public class Box {
    public String shape;
    public Box() {};
    public Box(String s){
        this.shape = s;
    }
    public String getShape(){
        return  this.shape;
    }
    public static void main(String args[]){
        Box newBox = new Box("Square");
        System.out.println("Box Shape is: "+newBox.getShape() + "\n");
        setNewShape(newBox);
        System.out.println("Box Shape is: "+newBox.getShape() + "\n");
    }
    public static void setNewShape(Box b){
        b.shape = "Rectangle";
    }
}
