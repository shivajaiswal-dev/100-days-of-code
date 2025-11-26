package java123.Collection_Framewok;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    //Unordered Duplicates not allowed
    static void main(String args[]) {
        Set<String> roles = new HashSet<String>();
   roles.add("admin");
   roles.add("user");
   roles.add("manager");
   for(String role:roles){
      System.out.println(role);
  }
  //roles.get(0);
  // get method se access nhi kar skte kyuki unordered hai

    }
}
