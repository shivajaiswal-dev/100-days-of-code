package java123.Collection_Framewok.Project;

import java.util.*;

public class UserManagement
{
    public static void main(String args[])
    {
        List<User> users = new ArrayList<>();
        users.add(new User(false,"Alice", new HashSet<>(Arrays.asList("admin","users"))));
         users.add(new User(false,"Bob", new HashSet<>(Arrays.asList("users"))));
         users.add(new User(true,"charlie", new HashSet<>(Arrays.asList("manager","users"))));
// inactive user remove
      Iterator<User> it = users.iterator();
      while (it.hasNext())
      {
          if (!it.next().isActive()){
          it.remove();
      }
          System.out.println("Active Users");
          for(User u:users){
              System.out.println(u.getName());
          }
      }
     Map<String, Integer> roles = new HashMap<>();
       for(User u:users){
           for(String role:u.getRoles()){
               roles.put(role,roles.getOrDefault(role,0)+1);
           }
       }
    }
}