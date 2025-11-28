package java123.Functional_Programming.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> integerstream=numbers.stream();
        integerstream.forEach(System.out::println);
        int[] numberArray={1,2,3,4,5,6,7,8,9,10};
        IntStream arraystream=Arrays.stream(numberArray);
        arraystream.forEach(System.out::println);
        Stream<String> stringstream=Stream.of("A","B","C","D","E","F","G");
        Stream<Integer> intstream1=Stream.iterate(0,n->n+2);
        intstream1.forEach(System.out::println);
    }
}
