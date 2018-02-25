package Lamda;

import DTO.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class MapToIntExample10 {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, 20);
        Employee e2 = new Employee(2, 15);
        Employee e3 = new Employee(3, 30);
        List<Employee> list = Arrays.asList(e1, e2, e3);

        // Map to Int - Sum all age
        // Same way possible Map to  mapToLong(), mapToDouble
        int sum = list.stream().mapToInt(e -> e.getAge()).sum();


        System.out.println("Sum: "+ sum);
    }

}
