package Lamda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class MethodReferenceExample15 {

    public static boolean isGreaterThan3(int number) {
        return number >3;
    }

    public static boolean isEven(int number) {
        return number%2 ==0;
    }

    public static int doubleIt(int number) {
        return  number*2;
    }

    public  static void  main(String [] arg) {

        List<Integer>  values = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(
                values.stream().filter(MethodReferenceExample15::isGreaterThan3)  //IsGrtThan
                    .filter(MethodReferenceExample15::isEven) //IsEven Find
                    .map(MethodReferenceExample15::doubleIt) //Double
                    .findFirst());

        //Parallel
        System.out.println(
                values.parallelStream().mapToInt(MethodReferenceExample15::doubleIt).sum())
        ;
    }
}
