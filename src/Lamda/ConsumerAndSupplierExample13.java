package Lamda;

import DTO.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class ConsumerAndSupplierExample13 {

    public static void main(String[] arg) {
        Consumer<Integer> consumer = i -> System.out.print(" " + i);

        consumer.accept(10);
        consumer.accept(10);
        consumer.accept(10);

        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));

        printList(integerList, consumer);


        // Supplier
        Supplier<String> supplierStr = () -> {   return "Hello world.";     };

        Supplier<Number> supplierNum = () -> {  return 40;    };

        System.out.println(supplierStr.get());
        System.out.println(supplierNum.get());

        Supplier <Student> supplier = () -> { return new Student(10,"1",11);    };
        Student p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getName() + ", " + p.getScore());

    }

    public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
        for (Integer integer : listOfIntegers) {
            consumer.accept(integer);
        }
    }
}