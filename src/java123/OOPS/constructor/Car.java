package java123.OOPS.constructor;
public class Car {
    String brand;
    String color;
    int speed;


    public Car(String brand, String color, int speed) {

        System.out.println("Car Constructor Called");
       this.brand = brand;
        this.color = color;
        this.speed = speed;

    }
    public void drive()
    {
        System.out.println("Driving Car is of  " +brand+ " at speed "+speed);
    }
    public int   getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
