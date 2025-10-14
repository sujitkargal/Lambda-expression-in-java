import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name : "+name + "  ,  "+"Age : " + age;
    }
}
public class Comparing_an_age {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ram", 28),
                new Student("Shyam", 35),
                new Student("Raghavan", 21),
                new Student("Shiva", 24),
                new Student("Vishnu", 20));

        // Sort by age using lambda expression
        students.sort((s1, s2) -> s1.age - s2.age);
        students.forEach(System.out::println);
    }
}





