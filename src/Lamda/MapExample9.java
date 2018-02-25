package Lamda;

import DTO.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class MapExample9 {
    public static void main(String[] args) {

        // Convert Map to List using Stream  map()
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "A");
        map.put(154, "A1");
        map.put(30, "N1");
        map.put(200, "A4");

        List<Employee> list = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
                .map(e -> new Employee(e.getKey(), e.getValue())).collect(Collectors.toList());

        list.forEach(l -> System.out.println("Id: "+ l.getId()+", Fname: "+ l.getFirstName()));

        // Find Element start with A

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }


}
