package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ALDemo {

    public static void main(String[] args) {


        int[] arr = new int[34];
        Integer[] arr2 = new Integer[2];


//        ArrayList<Integer> list = new ArrayList<Integer>(); //older syntax
//        ArrayList<int> list = new ArrayList<>();// primitives are not allowed

//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list);
//        list.add(34);
//        list.add(23.5);
//        list.add(new String());


        ArrayList arrayList = new ArrayList(); // raw/non-parametrized type
        arrayList.add("cdscd");
        arrayList.add(23);
        arrayList.add(23.5);
        arrayList.add(new Scanner(System.in));

        System.out.println(arrayList);


        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(23);
        nums.add(23);
        nums.add(Integer.valueOf(45));

        List<Character> chars =  new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');

        List<Character> anotherOne = new ArrayList<>(chars); // creates an arraylist from an existing arraylist
        System.out.println(anotherOne);
        anotherOne.add('x');
        System.out.println(anotherOne);
        anotherOne.add(1,'y');
        System.out.println(anotherOne);
//        anotherOne.add(-1,'z'); //IndexOutOfBoundsException
        anotherOne.add(5,'z');
        System.out.println(anotherOne);
//        anotherOne.add(7,'b'); ///IndexOutOfBoundsException

        Character ch = anotherOne.get(0);
        System.out.println(ch);

        System.out.println(anotherOne.size());

        for (int i = 0; i < anotherOne.size(); i++) {
            System.out.println(anotherOne.get(i));
        }

//        anotherOne.clear();
//        System.out.println(anotherOne);
       anotherOne.add('x');
        System.out.println(anotherOne);
        anotherOne.remove(Character.valueOf('x'));
        System.out.println(anotherOne);
        anotherOne.remove(1);
        System.out.println(anotherOne);
//        anotherOne.remove('a');

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
//        numbers.remove(1);
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);


        List<String> ages = new ArrayList<>();
        ages.add("12");

        ages.add("12");

        ages.add("12");
        ages.add("12");
        ages.add("12");
        ages.add("12");
        ages.add("12");

        System.out.println(ages);

        for (int i = 0; i < ages.size(); i++) {
            if(ages.get(i).equals("12")){
                ages.remove(i);
                i--;
            }
        }

        System.out.println(ages);


        // collection ->  array,arraylist,map,set
        // Collections framework -> Map, List, Set, Queue
        // Collections -> utility class like Arrays



        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);

//        System.out.println(numbers2);
//        numbers2.set(0, 10);
//        System.out.println(numbers2);
//        numbers2.set(numbers2.size()-1, numbers2.get(numbers2.size()-1) * 10);
//        System.out.println(numbers2);

        for (int i = 0; i < numbers2.size(); i++) {
            numbers2.set(i, numbers2.get(i)*10);
        }

        System.out.println(numbers2);

        System.out.println(numbers2.contains(30));
        System.out.println(numbers2.contains(100));

        System.out.println(numbers2.indexOf(30));
        System.out.println(numbers2.lastIndexOf(30));
        System.out.println(numbers2.indexOf(100));

        System.out.println(numbers2.isEmpty());

        if(numbers2.contains(100)){
            System.out.println(numbers2.indexOf(100));
        }










        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("phone");

        ArrayList<String> updatedList = changePigLatin(list);

        System.out.println(updatedList);

    }

    public static ArrayList<String> changePigLatin(ArrayList<String> list){


        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            String newNew = word.substring(1) + word.charAt(0) + "ay";
            list.set(i, newNew);
        }
        // implement here
        return list;
    }
}
