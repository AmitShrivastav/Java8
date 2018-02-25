package Lamda;

import DTO.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class OptionalBasicExample7 {

    public static void main(String[] args) {

      /*  Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
*/
        // java.lang.NullPointerException
//        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(Employee.populator()));
        // Optional.empty
        System.out.println( employees.stream().filter(stud->stud.getAge() == 60).findFirst());



    }

}
