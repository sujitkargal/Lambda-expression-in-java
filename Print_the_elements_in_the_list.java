import java.util.*;
public class Print_the_elements_in_the_list {
    public static void main(String[] s){
        List<String> name = Arrays.asList("Ram","Shyam","Rohit","Raghav","sujit");
        // Using lambda to iterate through the list
        name.forEach(names->System.out.println(name));
    }
}
