package ImperativeVsFunctinal;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kmar.Amit on 21-10-2017.
 */
public class ImperativeVsFunctional1 {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
    static List<String> numbers2 = Arrays.asList("Test","B");

    public static void imperativeStyle() {
        int results= 0;
        for(Integer i: numbers) {
            if( numbers.get(i) > 5 &&  numbers.get(i) < 10 && numbers.get(i) % 2 ==0 && numbers.get(i) * 2 > 15){
             System.out.println(numbers.get(i));
             break;
            }
        }
    }



    public static void functionalStyle()
    {
        int results= numbers.stream()
                            .filter(abc-> abc > 5)
                            .filter(number-> number <10)
                            .filter(number -> number%2==0)
                            .filter(number->number * 2  >15 )
                             .findFirst()
                            .get();
        System.out.println(results);
    }

     public static void main(String [] arg)
     {
         imperativeStyle();
         functionalStyle();
     }
}
