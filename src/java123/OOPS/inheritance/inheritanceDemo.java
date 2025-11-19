package java123.OOPS.inheritance;


public class inheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();
    }
}