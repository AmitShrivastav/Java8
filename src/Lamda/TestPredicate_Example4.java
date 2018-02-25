package Lamda;

import DTO.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static Lamda.Predicate_Example3.*;
/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class TestPredicate_Example4 {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(Employee.populator()));
        // IsAdultMale
        System.out.println(filterEmployees(employees, isAdultMale()));

        // IsAdultFemale
          System.out.println(filterEmployees(employees, isAdultFemale()));

        // IsAgeMoreThan
        System.out.println(filterEmployees(employees, isAgeMoreThan(35)));

        //Reverse -Employees other than above collection of "isAgeMoreThan(35)" can be get using negate()
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
    }
}
