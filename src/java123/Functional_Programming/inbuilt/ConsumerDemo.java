package java123.Functional_Programming.inbuilt;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer2=str -> System.out.println(str.length());
        // Consumer<String> consumer1 =(str) -> System.out.println(str);
        consumer .accept("Hello");
        consumer2.accept("Hello");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> multiplyByTwo = n->System.out.println(n*2);
        numbers.forEach(multiplyByTwo);
    }
}
