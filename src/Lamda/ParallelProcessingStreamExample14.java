package Lamda;

import DTO.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class ParallelProcessingStreamExample14 {

    public static void main(String[] arg) {
        //stream is split into multiple chunks, with each chunk processed independently and with
        // the result summarized at the end. Since our implementation of isPrime method is extremely ineffective and
        // CPU intensive, we can take advantage of parallelization and utilize all available CPU cores.

        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(Employee.populator()));

        System.out.println(employees.parallelStream().filter(employee -> employee.getAge()> 10).findFirst());
    }
}
