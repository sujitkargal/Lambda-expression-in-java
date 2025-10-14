import java.util.*;
import java.util.function.Predicate;
public class Comparing_String_Length {
    public static void main(String[] a){
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++");// Predicate to check if the string length is greater than 3
        Predicate<String> lengthCheck = s -> s.length() > 3;

        languages.stream() // Filter languages using the predicate
            .filter(lengthCheck)
            .forEach(System.out::println);
        }
    }

