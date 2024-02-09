package day36;

import java.util.*;

public class SortingCustomObjects2 {


    public static void main(String[] args) {






        List<Employee> employees = new ArrayList<>(Arrays.asList(
          new Employee("Bob", 34,120000),
          new Employee("Alice", 33,150000),
          new Employee("Jane", 45,200000),
          new Employee("Zane", 23,100000)
        ));



//        Collections.sort(employees, ( a,  b) ->  a.getAge() - b.getAge() );
//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

       //  ::  Method reference
//        Collections.sort(employees, Comparator.comparingInt(Employee::getAge) );
//        Collections.sort(employees, Comparator.comparing(Employee::getName) );
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary) );

        for (Employee employee : employees) {
            System.out.println(employee);
        }







    }
}
