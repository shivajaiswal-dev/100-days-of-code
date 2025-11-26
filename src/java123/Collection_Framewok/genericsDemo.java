package java123.Collection_Framewok;

import java.util.*;
class Car2 {
    String brand;

    Car2(String brand) {
        this.brand = brand;
    }
}

public class genericsDemo {
    public static void main(String[] args) {
        List<Object> users = new ArrayList<>();
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
        Car2 car1 =new Car2("Toyota");
        Car2 car2 =new Car2("Ford");
        List<Car2> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        System.out.println("carList");
        for(Car2 car:carList)
        {
            System.out.println(car.brand);
        }

    }
}
