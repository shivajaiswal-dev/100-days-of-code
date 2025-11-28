package java123.Functional_Programming.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicatedemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n->n%2==0;
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
        BiPredicate<Integer,Integer> isGreater = (x,y)->x>y;
        System.out.println("x is greater than y is "+isGreater.test(1,2));
        System.out.println("x is greater than y is "+isGreater.test(19,2));
    }
}
