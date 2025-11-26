package java123.Collection_Framewok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratingDemo {


         public static void main(String[] args) {
             List<String> users = new ArrayList<>();
             users.add("Alice");
             users.add("Bob");
             users.add("Carl");
        //for each
             for(String user : users){
                 System.out.println(user);
             }
             //using for loop
             for(int i = 0; i < users.size(); i++){
                 System.out.println(users.get(i));
             }
             Iterator<String> it = users.iterator();
             while(it.hasNext()){
                // System.out.println(it.next());
                 if(it.next().equals("Bob")){
                     it.remove();
                 }
             }
             for(int i = 0; i < users.size(); i++){
                 System.out.println(users.get(i));
             }
         }}