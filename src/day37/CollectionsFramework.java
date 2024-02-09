package day37;

import java.util.*;

public class CollectionsFramework {


    public static void main(String[] args) {


        // Collections Framework -> Umbrella term for Java's collections such as List,Set, Queue and Map
        // Collections -> a utility class that contains methods for List, Set and Queue
        // Collection -> super interface of List,Set and Queue


        List<Integer> nums = new LinkedList<>();

        nums.add(34);
        nums.add(31);
        nums.add(33);
        nums.remove(0);
        nums.add(1,45);
//        nums.addFirst(23); // can't call it since nums is a List which does not have the method
        ((LinkedList<Integer>)nums).addFirst(23);


        Vector<String> names = new Vector<>();
        names.add("cdbsg");
        names.add("ds");
        names.add("fds");


        ArrayList<Integer> nums2 = new ArrayList<>(); // default size of the backed array -> 10

        List<Integer> synced = Collections.synchronizedList(nums2);


        Stack<String> booksStack = new Stack<>();
        booksStack.push("The Great Gatsby");
        booksStack.push("To kill a mockingbird");
        booksStack.push("The lord of the rings");
        booksStack.push("War and Peace");
        booksStack.push("The great Spy");

        System.out.println(booksStack);

        String lastItem = booksStack.pop();
        System.out.println(lastItem);

        System.out.println(booksStack.peek());
        System.out.println(booksStack);

        while(! booksStack.empty()){
            System.out.println(booksStack.pop());
        }


        System.out.println(reverse("Hello World"));


        List<String> stringList = List.of("sd", "dsd", "ds");
        List<String> list = Arrays.asList("cdsd", "ds");

        System.out.println(stringList.getClass());
        System.out.println(list.getClass());

    }


    public static String reverse(String str){

        Stack<Character> characterStack = new Stack<>();

        for (Character ch: str.toCharArray()){
            characterStack.push(ch);
        }

        System.out.println(characterStack);

        StringBuilder newOne = new StringBuilder();
         while(!characterStack.empty()){
             newOne.append(characterStack.pop());
         }

        return newOne.toString();

    }
}
