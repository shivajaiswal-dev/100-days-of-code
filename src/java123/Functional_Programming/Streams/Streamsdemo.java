package java123.Functional_Programming.Streams;
import java.util.*;
import java.util.stream.*;

public class Streamsdemo {
    public static void main(String[] args) {
        List<String> items= Arrays.asList("Apple","Banana","cherry");
        for(String fruit : items){
            System.out.println(fruit);
        }
// using streams
        Stream<String> stream= items.stream();
        stream.forEach(System.out::println);
        System.out.println("filtered fruits--------------------");
        Stream<String> stream2= items.stream();
   Stream<String> ft=stream2.filter(name -> name.startsWith("B"));
        ft.forEach(System.out::println);
    items.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);


    }
}
