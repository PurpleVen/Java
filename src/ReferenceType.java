public class ReferenceType {
    public String colour;
   // public ReferenceType() {};
    public ReferenceType(String col) {
            this.colour = col;
        }
        public String getColour() {
            return this.colour;
        }
        public static void main(String[] args) {
            ReferenceType newCar = new ReferenceType("Purple");
            System.out.print("Car colour is: " + newCar.getColour() + "\n");
            setColourBlue(newCar);
            System.out.print("Car colour is: " + newCar.getColour() + "\n");
        }
        public static void setColourBlue(ReferenceType c) {
            c.colour = "Blue";
        }
}

