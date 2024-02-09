package day31;

import java.util.Arrays;

public class Dog {


    public static void main(String[] args) {
       System.out.println(Arrays.toString(args));
       if(args[0].equals("1")){
         System.out.println("Cat");
       }else{
       System.out.println("Dog");
       }
      

    }

}