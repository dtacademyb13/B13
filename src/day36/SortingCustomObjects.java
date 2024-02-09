package day36;

import java.util.*;

public class SortingCustomObjects {


    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(5,6,2,3,4,1));

        Collections.sort(nums);

        System.out.println(nums);

        List<String> strs = new ArrayList<>(Arrays.asList("aqua", "Beta", "gamma", "4delta"));

        Collections.sort(strs);

        System.out.println(strs);



        List<Employee> employees = new ArrayList<>(Arrays.asList(
          new Employee("Bob", 34,120000),
          new Employee("Alice", 33,150000),
          new Employee("Jane", 45,200000),
          new Employee("Zane", 23,100000)
        ));



        Collections.sort(employees, new ByAge());


        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort the Employees by names

        Comparator myComparator = new ComparatorByName();

        Collections.sort(employees, myComparator);

        System.out.println("---------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        // Sort by the natural order(by age) in reverse
//        Collections.sort(employees, Comparator.naturalOrder());
        Collections.sort(employees, Comparator.reverseOrder());

        System.out.println("---------------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //Sort by name using lambda expression

        Collections.sort(employees, (a,  b) ->  a.getName().compareTo(b.getName()) );

        System.out.println("---------------------------SORT BY NAME LAMBDA");
        for (Employee employee : employees) {
            System.out.println(employee);
        }



        Collections.sort(employees, (o1,  o2) ->   Double.compare(o1.getSalary(),o2.getSalary()) );
        System.out.println("---------------------------SORT BY SALARY LAMBDA");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        // Sort by age using lambda with multiple statements in the body

        Comparator<Employee> customComparatorByAge = (Employee o1, Employee o2) ->
        {
            if(o1.getAge() > o2.getAge()){
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }else{
                return 0;
            }
        };

        Collections.sort(employees, (Employee o1, Employee o2) ->
                {
                    if(o1.getAge() > o2.getAge()){
                        return 1;
                    } else if (o1.getAge() < o2.getAge()) {
                        return -1;
                    }else{
                        return 0;
                    }
               }
        );





    }
}
