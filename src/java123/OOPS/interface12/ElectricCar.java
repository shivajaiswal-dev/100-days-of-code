package java123.OOPS.interface12;

public class ElectricCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("ElectricCar turn right");
    }

    @Override
    public void turnLeft() {
System.out.println("ElectricCar turn left");
    }
}
