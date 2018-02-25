package Lamda;

import DTO.Staff;
import DTO.StaffPublic;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class MapExample8 {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<String> alpha = Arrays.asList("a", "b", "c", "d");


        // Upper Case
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        //Second Example
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]



        //Convert into String Objects
        List<String> collects = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collects); //[mkyong, jack, lawrence]


        // convert inside the map() method directly to Other Object Transforation()
        List<StaffPublic> result = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            return obj;
        }).collect(Collectors.toList());

        System.out.println(result);




    }
}
