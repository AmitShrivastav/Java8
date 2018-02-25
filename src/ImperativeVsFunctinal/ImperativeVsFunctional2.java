package ImperativeVsFunctinal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Kmar.Amit on 21-10-2017.
 */
public class ImperativeVsFunctional2 {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

    public static int  imperativeStyle_fibonacci(int number)
    {

        int fib1 = 1;
        int fib2 = 1;
        int fibonacci = fib1;
        for (int i = 2; i < number; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }



    public static IntStream functionalStyle()
    {
        IntStream fibonacciStream = Stream.iterate(
                new int[]{1, 1},
                fib -> new int[] {fib[1], fib[0] + fib[1]}
        ).mapToInt(fib -> fib[0]);
     return fibonacciStream;
    }

     public static void main(String [] arg) {
         // Imperative Style
         for(int i = 1; i  <= 10; i++) {
             System.out.print(imperativeStyle_fibonacci(i) +" ");
         }

         //Fibonacci Sequence in iterative and functional style
     /*    functionalStyle().limit(10).forEach(fib ->
                 System.out.print(fib + " "));*/

         functionalStyle().limit(10).forEach(System.out::println);
     }
}
