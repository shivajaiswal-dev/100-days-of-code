package java123.Functional_Programming.inbuilt;
import java.util.function.Function;

public class FunctionInterfaceDemo {
public static Function<Integer,Integer> addFunction = (a) -> a+3;
    public static Function<Integer,Integer> sub = (a) -> a-1;
//chaining
    public static Function<Integer,Integer> combine = addFunction.andThen(sub);
    public static void main(String[] args)

    {
        System.out.println(addFunction.apply(12));
System.out.println(sub.apply(12));
   System.out.println(combine.apply(12)); }

}
