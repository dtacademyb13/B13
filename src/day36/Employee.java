package day36;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
//public class Employee {


    // POJO -> Plain Old Java Object
    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.age > o.age){
            return 1;
        } else if (this.age<o.age) {
            return -1;
        }else{
            return 0;
        }

//      return this.age - o.age;
//
////        return  this.name.compareTo(o.name);
//
////        return Double.compare(this.salary, o.salary);
//
//
    }

}
