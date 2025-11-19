package java123.OOPS.classdemo;

public class Car {
    String brand;
    String color;
    int speed;


    public Car(){
        System.out.println("Car Constructor Called");
    }
    public void drive()
    {
        System.out.println("Driving Car is of  " +brand+ " at speed "+speed);
    }
}
