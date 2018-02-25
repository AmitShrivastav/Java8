package Lamda;

import DTO.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class Grouping_Example12 {

    public static void main(String[] args) {

    // Grouping
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(Employee.populator()));

    Map<Integer, List<Employee>> employeeByAge = employees
            .stream()
            .collect(Collectors.groupingBy(p -> p.getAge()));

        employeeByAge.forEach((age, p)  -> System.out.format("age %s: %s\n",age, p));



        //Average
        Double averageAge = employees
                .stream()
                .collect(Collectors.averagingInt(p -> p.getAge()));

        System.out.println(averageAge);     // 19.0

}


}
