package Lamda;

import DTO.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kmar.Amit on 21-10-2017.
 * Purpose - How
 */
public class Example1 {


    static  List<Student> students = new ArrayList<>();

     public static void setStudent()
     {
         Student s1= new Student(10,"A",2010);
         Student s2= new Student(20,"B",2011);
         Student s3= new Student(30,"C",2011);
         Student s4= new Student(40,"D",2010);
         Student s5= new Student(50,"E",2013);
         students.add(s1);
         students.add(s2);
         students.add(s3);
         students.add(s4);
         students.add(s5);

     }



     public static void main(String arg[]) {
         setStudent();
         //*************Imperative Style*****************How to do************
         int highestScore = 10;
         for (Student stude : students) {
             if (stude.getGradeYear() == 2011) {
                 //  if (stude.getScore() > highestScore)
                 System.out.println(stude.toString());
                 break;
                 // }
             }


             //*************Declarative Style**********What to do*******************
             Student stud = students.stream().
                     filter(s -> s.getGradeYear() == 2011)
                     .map(student -> new Student(student.getScore(), student.getName(), student.getGradeYear()))
                     .findAny()
                     .get();

             System.out.println(stud);

             long studCount = students.stream().
                     filter(s -> s.getGradeYear() == 2011)
                     .map(student -> new Student(student.getScore(), student.getName(), student.getGradeYear()))
                     .count();

             System.out.println(studCount);

         }
 /*    //Effective Final
    @FunctionalInterface
    interface IFuncInt {
        int func(int num1, int num2);
        public String toString();
    }
    public void test(String phoneNumber) {
         int i = 7;
        IFuncInt funcInt = (num1, num2) -> {
           int  iTest = num1 + num2;
            return i;
        };
    }

    public void testEightStyle() {
        String name = "Bob";
     //   name ="test";
        Runnable r = () -> System.out.println("hello, " + name);
        new Thread(r).start();
    }*/
     }
}
