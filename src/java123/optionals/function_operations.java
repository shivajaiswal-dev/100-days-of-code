package java123.optionals;

import java.util.Optional;

public class function_operations {
   public static void main(String[] args) {
       Optional<String> name = Optional.of("Hello");
       Optional<String> name2 = Optional.ofNullable(null);
   name2.ifPresent(value -> {
       System.out.println(value);
       System.out.println("Hi");
   }        );

   name.ifPresent(System.out::println);

//map

   Optional <String> uppercase = name.map(String::toUpperCase);
   System.out.println(uppercase.orElse("default"));
   //filter
       Optional <String> temp = name.filter(n -> n.startsWith("0"));

       temp.ifPresent(System.out::println);
       //combined operations
       name.filter(n -> n.startsWith("F"))
               .map(String::toUpperCase)
               .ifPresent (System.out::println);
   }
}
