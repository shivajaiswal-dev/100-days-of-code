package java123.optionals;

import java.util.Optional;

public class Optionals2 {
    public static void main(String[] args) {
        System.out.println("No Name value");
        Optional<String> name = Optional.of("Alice");
   System.out.println(name);
   Optional<String> empty = Optional.empty();
   System.out.println(empty);

 Optional<String> maybe = Optional.ofNullable(null);
    System.out.println(maybe);
    System.out.println(maybe.isPresent());
    System.out.println(name.isPresent());
   System.out.println(empty.isPresent());
    System.out.println(name.isEmpty());
    System.out.println(maybe.isEmpty());

    System.out.println(name.get());
   // System.out.println(maybe.get());
// Safely Value retrieve krne ke liye
        // orElse("default-value")
        System.out.println(name.orElse("default"));
        System.out.println(maybe.orElse("default"));
        System.out.println(maybe.orElse(null));

//orElse value can be null
        // orElseGet(<supplier>)
String result= maybe.orElseGet(() -> {
            System.out.println("Generating default value");
            return "default";
        });
System.out.println(result);
        // orElseThrow
//String newResult = maybe.orElseThrow(
//        () -> new RuntimeException("Not found")
//        );
//    System.out.println(newResult);
        String newResult = name.orElseThrow(
                () -> new RuntimeException("Not found")
        );
        System.out.println(newResult);
    }
    }



