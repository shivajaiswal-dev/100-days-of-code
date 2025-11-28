package java123.Functional_Programming.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class BiFunctionDemo {
   public static BiFunction<Integer,Integer,Integer> addFunction = Integer::sum;//(a,b) -> a+b;
public static BiFunction<Integer,Integer,Integer> subFunction =(a,b)->a-b;
    public static void main(String[] args) {
      System.out.println(addFunction.apply(1,2));
       System.out.println(subFunction.apply(100,90));
       Function<Integer,Integer> multiplyBy2 = x -> x*2;
       BiFunction<Integer,Integer,Integer> combinedFunction =addFunction.andThen(multiplyBy2);
       // a,b)->a+b;
        System.out.println(combinedFunction.apply(1,2));
    }
}
