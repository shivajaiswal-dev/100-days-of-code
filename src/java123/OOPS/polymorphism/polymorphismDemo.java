package java123.OOPS.polymorphism;


public class polymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();
        c1.start();


        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();
        b1.start();
        Vehicle v1 =new Vehicle("VehicleBrand",90);
        //v1.displayInfo();
        // method overriding
        v1.start();
        Vehicle v2=new Car("Ford",89,5);
        v2.start();
        Vehicle v3=new Bike("Ford",89,true);
        v3.start();
        //method overloading
        b1.start("Hello");
    }
}