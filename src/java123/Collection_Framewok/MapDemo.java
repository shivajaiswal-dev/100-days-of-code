package java123.Collection_Framewok;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    //key value pair
    static void main(String[] args) {
      Map<Integer,String> usermap = new HashMap<>();
  usermap.put(1,"Alice");
  usermap.put(2,"Bob");
  usermap.put(3,"Carl");


  System.out.println("User with id 2: "+usermap.get(2));
    System.out.println("ALL Users: ");
    for(Map.Entry<Integer,String> entry:usermap.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
    }

    }
}
