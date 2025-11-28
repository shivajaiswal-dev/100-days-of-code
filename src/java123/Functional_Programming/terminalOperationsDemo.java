package java123.Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class terminalOperationsDemo {
    public static void main(String[] args) {
        //REDUCE()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> str = numbers.stream();
        //   int sum = stream.reduce(  0,(acc,num)->acc+num);
        int sum = str.reduce(0, Integer::sum);
        System.out.println(sum);
        //collect()
        List<Integer> evenNum =numbers.stream()
        .filter(n->n%2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNum);
         // find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());
   boolean has4 =numbers.stream().anyMatch(n->n==4);
        boolean has =numbers.stream().allMatch(n->n==4);
        boolean no =numbers.stream().noneMatch(n->n==4);
System.out.println(no);
        System.out.println(has);
        System.out.println(has4);


//iteration
numbers.stream().forEach(System.out::println);
    }
}
