import java.util.*;
public class Comparing_two_strings {
    public static void main(String[] s){
        List<String> name= Arrays.asList("Ram","Shyam","Rohit","Raghav");

        // Using lambda to sort the list alphabetically
Collections.sort(name,(a,b)->a.compareTo(b));

System.out.println(name);
    }
}
