package java123.Functional_Programming.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExample {
    public static void main(String[] args) {
        BiFunction<String,Double,String> formatter =(title,price)->title+"cost $"+price;
        System.out.println(formatter.apply("java Basics  ",899.9));
        System.out.println(formatter.apply("c Basics  ",890.9));
        System.out.println(formatter.apply("c# Basics  ",499.9));
Predicate<Double>  isExpensive =price ->price>500;
System.out.println(isExpensive.test(1200.9));

    }
}
