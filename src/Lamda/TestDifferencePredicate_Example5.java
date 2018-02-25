package Lamda;

import DTO.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Lamda.Predicate_Example3.*;
import static Lamda.Predicate_Example3.filterEmployees;
import static Lamda.Predicate_Example3.isAgeMoreThan;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class TestDifferencePredicate_Example5 {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(Employee.populator()));
        // IsAdultMale And IsAdultFemale -Intersection
        System.out.println(filterEmployees(employees, isAdultMale().and(isAdultFemale())));
        // IsAgeMoreThan or negate() -Union
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).or(isAgeMoreThan(35).negate())));

        // IsAgeMoreThan or negate() -NOt
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));

    }
}
