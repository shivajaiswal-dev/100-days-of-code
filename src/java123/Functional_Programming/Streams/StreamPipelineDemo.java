package java123.Functional_Programming.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPipelineDemo {

    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
    };

    static Predicate<Integer> p2 = (integer) -> integer % 2 == 0;

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // old way
        List<Integer> evenNo = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) evenNo.add(num);
        }
        System.out.println(evenNo);

        // using stream with predicate p2
        Stream<Integer> it = numbers.stream();
        Stream<Integer> evenNoStream = it.filter(p2);
        List<Integer> evenNoList = evenNoStream.toList();
        System.out.println(evenNoList);

        // using stream directly
        List<Integer> evenNumber3 = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .toList();
        System.out.println(evenNumber3);
    }
}
