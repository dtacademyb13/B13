package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsefulMethodsAL {


    public static void main(String[] args) {



        List<String> list = Arrays.asList("fsdbhd", "fd", "dfsdf");
        System.out.println(list);

        List<Integer> integers = List.of(1, 2, 34, 4, 5, 6);
        System.out.println(integers);

        // These create unmodifiable lists, any method that modifies the list results in UnsupportedOperationException
//        list.remove(1);
//        integers.remove(0);
//        list.add("dssa");
//        integers.add(23); // UnsupportedOperationException


        List<Integer> unmodifieableList = getUnmodifieableList();

        List<Integer> normalList = new ArrayList<>(unmodifieableList);
        normalList.add(21);
        System.out.println(normalList);



    // Create a modifiable list with shorter syntax
        List<Integer> modifieableList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //Convert an array to an arraylist
        String[] names = {"Alice", "Bob"};
        List<String> list1 = Arrays.asList(names);

        // Convert an arraylist into an array

        Object[] array = list1.toArray();
        String[] array1 = list1.toArray(new String[0]); // provide any size
        System.out.println(Arrays.toString(array1));

        List<Integer> myList = new ArrayList<>(Arrays.asList(4,7,2,13,5,13,6));
        Collections.sort(myList);
        System.out.println(myList);
        int index = Collections.binarySearch(myList,7);
        System.out.println(index);

        Collections.reverse(myList);
        System.out.println(myList);

        System.out.println(Collections.max(myList));
        System.out.println(Collections.min(myList));
        System.out.println(Collections.frequency(myList, 13));
        System.out.println(myList);
        Collections.shuffle(myList);
        System.out.println(myList);




    }


    public static List<Integer> getUnmodifieableList(){
        return List.of(1,2,3,4);
    }
}
