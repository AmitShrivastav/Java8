package Lamda;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class TestPredicte_Example6 {

    public static  boolean predicate_IsPrime(final  int number) {
        Predicate<Integer> isDivisible = divisor->number % divisor ==0;
        return number > 1&&
                IntStream.range(2,number).
                        noneMatch(index->isDivisible.test(index));
    }
    public static void strLength(String test) {
        Predicate<String> pred  = s-> s.length() > 5;
        System.out.println(pred.test(test));
    }

    public static void main(String arg[]) {
        // Imperative Style- How to do
       System.out.println(predicate_IsPrime(1));
        System.out.println(predicate_IsPrime(2));
        System.out.println(predicate_IsPrime(3));
        System.out.println(predicate_IsPrime(4));
        // Functional Style -What to do
        System.out.println(predicate_IsPrime(1));
        System.out.println(predicate_IsPrime(2));
        System.out.println(predicate_IsPrime(3));
        System.out.println(predicate_IsPrime(4));


        strLength("test");
        strLength("test231232");
    }
}
