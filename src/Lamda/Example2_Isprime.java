package Lamda;

import DTO.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Kmar.Amit on 21-10-2017.
 * Purpose - How
 */
public class Example2_Isprime {

        public static boolean imperativeStyle_IsPrime(final  int number) {
            for(int i=2 ;i<number ;i++) {
                if(number % i==0 ) return false;
            }
            return number >1;
        }


        public static  boolean fucntionalWay_IsPrime(final  int number) {
            return number > 1&&
                    IntStream.range(2,number).
                                    noneMatch(index->number % index==0);
        }
         public static void main(String arg[]) {
             // Imperative Style- How to do
             System.out.println(imperativeStyle_IsPrime(1));
             System.out.println(imperativeStyle_IsPrime(2));
             System.out.println(imperativeStyle_IsPrime(3));
             System.out.println(imperativeStyle_IsPrime(4));
             // Functional Style -What to do
             System.out.println(fucntionalWay_IsPrime(1));
             System.out.println(fucntionalWay_IsPrime(2));
             System.out.println(fucntionalWay_IsPrime(3));
             System.out.println(fucntionalWay_IsPrime(4));
         }
}
