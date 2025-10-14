import java.util.*;
import java.util.stream.*;
public class Print_even_numbers_from_the_list {

    public static void main(String[]  s){
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12, 13);

        // Using lambda to filter even numbers and print them
        List<Integer> evenNumbers = num.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

}
