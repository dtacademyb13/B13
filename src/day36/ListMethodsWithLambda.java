package day36;

import java.util.*;

public class ListMethodsWithLambda {

    public static void main(String[] args) {


        List<Integer> nums =  new ArrayList<>(Arrays.asList(5,3,5,1,7,8,3,4,5));

        for (Integer num : nums) {
            num = num * 10;
        }

        nums.forEach(s -> s *= 10);
//        nums.forEach( num -> {
//            if (num % 5 == 0){
//            System.out.println(num * 5);
//        } });


//        nums.forEach( s -> System.out.println(s));
        nums.forEach(System.out::println);


        // Iterate through the collection and store only evens

        List<Integer> evens = new ArrayList<>();

        nums.forEach(s ->  { if (s % 2 == 0)  evens.add(s); } );

        System.out.println(evens);


        // Remove all the even numbers in the nums list

        nums.removeIf(s -> s % 2 == 0);
//
        System.out.println(nums);


//        for (Integer num : nums) {  //ConcurrentModificationException because you can't modify the collection when using for each loop
//            if(num % 2 == 0){
//                nums.remove(num);
//            }
//        }

//        Collections.sort(nums);

        nums.sort(Comparator.naturalOrder());
        nums.sort(Comparator.reverseOrder());


        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Bob", 34,120000),
                new Employee("Alice", 33,150000),
                new Employee("Jane", 45,200000),
                new Employee("Zane", 23,100000)
        ));

        employees.sort((a,b) -> a.getName().compareTo(b.getName()));
        employees.sort(Comparator.comparing(Employee::getName));
        employees.sort(Comparator.comparing(Employee::getName, Comparator.reverseOrder()));

        employees.sort((x,y) -> x.getAge() - y.getAge());
        employees.sort(Comparator.comparingInt(Employee::getAge));



        List<Integer> numbers =  new ArrayList<>(Arrays.asList(1,2,3,4,5));

        numbers.replaceAll(s -> s * 10 );

        System.out.println(numbers);
    }
}
