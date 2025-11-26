package java123.Collection_Framewok;

import java.util.*;
class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
users.add("Alice");
users.add("Bob");
users.add("Carl");
//users.add(3);
        users.add("Carl");
//List users = new ArrayList<>(); we can add any type of data
  for(Object user:users)
  {
  System.out.println(user);
  }
  System.out.println("Element using index:" + users.get(0));
     //
        //   System.out.println("Element using index:" + users.get(10));
Car car1 =new Car("Toyota");
Car car2 =new Car("Ford");
List<Car> carList = new ArrayList<>();
carList.add(car1);
carList.add(car2);
System.out.println("carList");
        for(Car car:carList)
        {
            System.out.println(car.brand);
        }

    }
    }
