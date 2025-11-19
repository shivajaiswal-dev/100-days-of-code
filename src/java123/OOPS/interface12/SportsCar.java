package java123.OOPS.interface12;

public class SportsCar implements CarControls {

    @Override
    public void turnRight() {
        System.out.println("Sportscar turn right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sportscar turn left");

    }
}
