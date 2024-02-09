package day38;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsWithLambda {

    public static void main(String[] args) {


        Map<String, String> customers =  new HashMap<>(); // does not keep the insertion order
        customers.put("123-09-1234", "Alice Smith");
        customers.put("123-00-3321", "Alice Smith");
        customers.put("423-43-3212", "Bob Dole");
        customers.put("542-43-3232", "Jane Smith");


        customers.forEach((key, value) -> System.out.println(key.replace("-", "") + ": " + value.toUpperCase()));


//        System.out.println(customers.get("111-11-1111").toUpperCase());
        System.out.println(customers.getOrDefault("111-11-1111", "Invalid Customer").toUpperCase());


        customers.putIfAbsent("542-43-3232", "Claire Voyant");
        customers.putIfAbsent("222-22-2222", "Claire Voyant");
        System.out.println(customers);


    }


}
