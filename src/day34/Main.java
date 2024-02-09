package day34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



//        List<Product> productList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        productList.add( new Product(10, "Ice Cream"));
        productList.add( new Product(11, "Chocolate"));


        for (Product product: productList){
            System.out.println(product);
        }

        Product pi = new Product(10, "Ice Cream");

        System.out.println(productList.indexOf(pi));

        productList.remove(pi);

        System.out.println(productList);


        List<String> someList = getSomeList(new LinkedList<>());



    }



    public static List<String> getSomeList(List<String> list){

        return new ArrayList<>();
    }
}
