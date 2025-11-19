package java123.OOPS.interface12;

public class InterfaceDemo {
    public static void main(String[] args) {
//        ElectricCar ec = new ElectricCar();
//        ec.turnLeft();
//        ec.turnRight();

        CarControls myCar = new ElectricCar();
        myCar.turnRight();


        CarControls myCar2 = new SportsCar();
        myCar2.turnRight();
    }
}
