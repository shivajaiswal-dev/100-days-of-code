package java123.Functional_Programming;

import java123.Functional_Programming.Streams.bookStoreChallenge.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationTask {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fiction", 15.99, 2018, "The Silent Garden"),
                new Book("Science", 22.50, 2020, "Cosmic Wonders"),
                new Book("Fiction", 12.75, 2005, "Echoes in the Rain"),
                new Book("Biography", 18.00, 2022, "A Life in Code"),
                new Book("Technology", 35.90, 2023, "Java Stream Mastery"),
                new Book("Fiction", 14.50, 2018, "The Midnight Library"),
                new Book("Science", 25.99, 2015, "Quantum Realm"),
                new Book("Technology", 40.00, 2023, "Advanced Spring Boot"),
                new Book("Biography", 16.99, 2019, "The Innovator's Journey"),
                new Book("Fiction", 9.99, 1998, "Old Man and the Sea")
        );

     Double totalcost =books.stream()
        .mapToDouble(book -> book.getPrice())
                .reduce(0,Double::sum);
     System.out.println(totalcost);

        // Collecting books into a list of titles
        List<String> bookTitles = books.stream()
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
        System.out.println(bookTitles);


        // Grouping books by category
        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(Book::getCategory));
        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);
        });
    }

    static Function<Book, String> bookStringFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };

}

