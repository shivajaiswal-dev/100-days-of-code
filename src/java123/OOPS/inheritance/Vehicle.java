package java123.OOPS.inheritance;

public class Vehicle {
    private String brand;
    private int speed;
//
    public Vehicle(String brand,int speed) {
this.speed=speed;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void displayInfo(){
        System.out.println("brand:"+brand +"speed:"+speed+"km/hr");
    }
}
