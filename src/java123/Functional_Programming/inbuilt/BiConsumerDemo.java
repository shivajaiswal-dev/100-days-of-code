package java123.Functional_Programming.inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (x,y)->System.out.println(x+y);
        biConsumer.accept(1,2);
    }
}
