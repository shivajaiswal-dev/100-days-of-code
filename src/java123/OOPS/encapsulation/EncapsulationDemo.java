package java123.OOPS.encapsulation;

  class Car {
     private String brand;
    private String color;
     private int speed;



    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
      //  this.speed = speed;
        setSpeed(speed);
    }



    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

      public int getSpeed() {
          return speed;
      }

      public void setSpeed(int speed) {
        if(speed< 0)
        {
          speed=0;
        }
          this.speed = speed;
      }
  }


public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 =new Car("toyota","red",190);
        car1.setSpeed(-90);
        car1.drive();
        Car car2 =new Car("toyota","red",-190);
         car2.drive();
    }
}
