package java123.Functional_Programming.inbuilt;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomsupplier= Math::random;
        //        Supplier<Double> randomsupplier= ()-> Math.random();
        System.out.println(randomsupplier.get());

    }
}
