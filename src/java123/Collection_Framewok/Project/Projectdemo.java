package java123.Collection_Framewok.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Projectdemo {
         public static void main(String[] args) {
            List<String> users = new ArrayList<>();
            users.add("Alice");
            users.add("Bob");
            users.add("Carl");
// t<>(); we can add any type of data
            for(Object user:users)
            {
                System.out.println(user);
            }
             Set<String> roles = new HashSet<String>();
              roles.add("admin");
             roles.add("user");
             roles.add("manager");  }
}
