/*
EXP 3
0)
Create an interface vehicle and classes like bicycle,car, bike etc, having common functionalities and put
all the common functionalities in the interface.
Classes like Bicycle, Bike, car etc implement all these functionalities in their own class in their own
way
*/

import java.io.*;

interface Vehicle {

    void Gear(int a);            //calling methods (no body) , body provided during implement
    void SpeedInc(int a);
    void SpeedDec(int a);
    void Model(String a);
}

class Bicycle implements Vehicle{        //To access interface we are calling implements

    int speed;
    int gear;
    String model;

    @Override                                 //Override has to be done over all methods as implement is called
    public void Gear(int newGear){

        gear = newGear;
    }

    @Override
    public void Model(String newModel){        //Defaultly abstract or public

        model = newModel;
    }

    @Override
    public void SpeedInc(int increment){

        speed = speed + increment;
    }

    @Override
    public void SpeedDec(int decrement){

        speed = speed - decrement;
    }

    public void DisplayBicycle() {
        System.out.println("Speed: " + speed
                + "\nGear: " + gear + "\nModel: " +model);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;
    String model;

    @Override
    public void Gear(int newGear){

        gear = newGear;
    }

    @Override
    public void Model(String newModel){

        model = newModel;
    }

    @Override
    public void SpeedInc(int increment){

        speed = speed + increment;
    }

    @Override
    public void SpeedDec(int decrement){

        speed = speed - decrement;
    }

    public void DisplayBike() {
        System.out.println("Speed: " + speed
                + "\nGear: " + gear + "\nModel: " +model);
    }

}

class Car implements Vehicle{

    int speed;
    int gear;
    String model;

    @Override
    public void Gear(int newGear){

        gear = newGear;
    }

    @Override
    public void Model(String newModel){

        model = newModel;
    }

    @Override
    public void SpeedInc(int increment){

        speed = speed + increment;
    }

    @Override
    public void SpeedDec(int decrement){

        speed = speed - decrement;
    }

    public void DisplayCar() {
        System.out.println("Speed: " + speed
                + "\nGear: " + gear + "\nModel: " +model);
    }
}

class InterfaceFunction {

    public static void main(String[] args) {       // cant use gear etc as objects but can use the different classes used as object
        Bicycle bicycle = new Bicycle();
        bicycle.Gear(7);
        bicycle.SpeedInc(3);
        bicycle.SpeedDec(1);
        bicycle.Model("Mountain Bicycle");

        System.out.println("\n*** Bicycle Functionalities ***");
        bicycle.DisplayBicycle();

        Bike bike = new Bike();
        bike.Gear(5);
        bike.SpeedInc(4);
        bike.SpeedDec(3);
        bike.Model("Royal Enfield Thunderbird 350");

        System.out.println("\n*** Bike Functionalities ***");
        bike.DisplayBike();

        Car car = new Car();
        car.Gear(4);
        car.SpeedInc(4);
        car.SpeedDec(3);
        car.Model("Kia Seltos");

        System.out.println("\n*** Car Functionalities ***");
        car.DisplayCar();
    }
}



