package DTO;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class Student {

        public   Student( int score,
                          String name,
                          int gradeYear)
        {
            this.gradeYear=gradeYear;
            this.name=name;
            this.score=score;

        }
        public Student()
        {

        }
    private  int score;
    private   String name;
    private int gradeYear;

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
       return getGradeYear()+" "+getName()+" "+getScore();
    }
}
