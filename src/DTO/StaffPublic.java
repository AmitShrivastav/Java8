package DTO;

import java.math.BigDecimal;

/**
 * Created by Kmar.Amit on 22-10-2017.
 */
public class StaffPublic {

    private String name;
    private int age;
    private BigDecimal salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
