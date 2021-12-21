package com.example.jbl_3356.MultilevelInheritance;

class Colour{
    public Colour()
    {
        System.out.println("Class Colour");
    }
    public void ColourType()
    {
        System.out.println("\n================================================");
        System.out.println("\nDifferent Types: Primary, Secondary, Tertiary");
    }
    public void NoOfColours1()
    {
        System.out.println("Total No Of Colours: 12");
        System.out.println("\n==================================================");
    }

}
    class Primary extends Colour{
    public Primary()
    {
        System.out.println("Class Primary");
    }
    public void colourspresentpri()
    {
        System.out.println("\nColours Under Primary Category: Red, Yellow, Blue.");
    }

}
     class Secondary extends Primary {

        public Secondary() {
            System.out.println("Class Secondary");
        }

        public void colourspresentsec() {
            System.out.println("Colours Under Secondary Category: Orange, Green, Violet.");
        }
    }
    public class Tertiary extends Secondary {

        public Tertiary() {
            System.out.println("Class Tertiary");
        }

        public void colourspresenter() {
            System.out.println("Colours Under Tertiary Category: Red-Orange, Yellow-Orange, Yellow-Green, Blue-Green, Blue-Violet, Red-Violet.");
        }

    public static void main(String args[])
    {
        Tertiary obj=new Tertiary(); //therefore tertiary can use methods of 3 classes i.e. colour, primary, secondary.
        obj.ColourType();
        obj.NoOfColours1();
        obj.colourspresentpri();
        obj.colourspresentsec();
        obj.colourspresenter();

    }

}