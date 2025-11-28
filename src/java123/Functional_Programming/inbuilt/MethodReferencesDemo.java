package java123.Functional_Programming.inbuilt;

import java.util.Arrays;
import java.util.*;

public class MethodReferencesDemo {
    public static void main(String[] args)
    {

         List<String> names = Arrays.asList("Alice","Bob","Carl");
       for(int i=0;i<names.size();i++)
       {
       System.out.println(names.get(i));
        }
  //names.forEach(name-> System.out.println(name));
        //names.forEach(name -> System.out.println(name));
names.forEach(System.out::println);

    }}

