package day38;

import java.util.*;

public class CheckForDuplicates {


    public static void main(String[] args) {


    List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 5);

        System.out.println(containsDuplicate1(myList));
        System.out.println(containsDuplicate2(myList));
        System.out.println(containsDuplicate3(myList));
        System.out.println(containsDuplicate4(myList));




}


    public static boolean containsDuplicate1(List<Integer> list){

        // nested loop approach -> inefficient -> O(n2)
        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {

                if(list.get(i).equals(list.get(j))){
                    return true;
                }
            }
        }

        return false;

    }


    public static boolean containsDuplicate2(List<Integer> list){

        // Sorting and checking adjacent values -> more efficient than nested loop, but still not as efficient as the following 2 approaches
        List<Integer> mutableList = new ArrayList<>(list);
        Collections.sort(mutableList);
        for (int i = 0; i < mutableList.size()-1; i++) {
            if(mutableList.get(i).equals(mutableList.get(i+1))){
                return true;
            }
        }

        return false;

    }

    public static boolean containsDuplicate3(List<Integer> list){

        // Efficient -> O(n)
        HashSet<Integer> integerSet = new HashSet<>();

        for (Integer i : list) {
            if(integerSet.add(i) == false){
                return true;
            }
        }



        return false;

    }

    public static boolean containsDuplicate4(List<Integer> list){

        // Efficient -> O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                return true; // the key is occurring more than once, so it is a duplicate
            }
        }



        return false;

    }
}
