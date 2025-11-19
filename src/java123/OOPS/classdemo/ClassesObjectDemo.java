package java123.OOPS.classdemo;

public class ClassesObjectDemo {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.speed=100;
        car1.color="red";
        car1.brand="Audi";
        car1.drive();
        Car car2 =new Car();
        car2.speed=200;
        car2.color="blue";
        car2.brand="BMW";
        car2.drive();
        //car1 and car2 are instances of car class

    }
}
