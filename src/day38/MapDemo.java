package day38;

import java.util.*;

public class MapDemo {


    public static void main(String[] args) {


        Map<String, String> customers =  new HashMap<>(); // does not keep the insertion order
        customers.put("123-09-1234", "Alice Smith");
        customers.put("123-00-3321", "Alice Smith");
        customers.put("423-43-3212", "Bob Dole");
        customers.put("542-43-3232", "Jane Smith");
        System.out.println(customers);

        // Retrieval
        String customer = customers.get("423-43-3212");  // provide the key to retrieve the value
        System.out.println(customer);

        System.out.println(customers.get("32452342365")); // for non-existing key get() method returns null
        String anotherCustomerName = customers.get("32452342365");
//        System.out.println(anotherCustomerName.substring(2)); // this can result in NPException
        if(customers.get("32452342365") != null){
            System.out.println(anotherCustomerName.substring(2));
        }


        // Adding an entry with an existing key updates the value

        customers.put("542-43-3232", "Dave Matthews");
        System.out.println(customers);


//        Map<String, String> anotherCustomerCollection = new HashMap<>(customers);
        Map<String, String> anotherCustomerCollection = new HashMap<>();

        anotherCustomerCollection.put("111-22-3333",  "Joe Schmoe");
        anotherCustomerCollection.putAll(customers); // Copies all of the mappings from the specified map to this map

        System.out.println(anotherCustomerCollection);

        System.out.println(anotherCustomerCollection.remove("423-43-3212"));

        System.out.println(anotherCustomerCollection);

        anotherCustomerCollection.clear();

        System.out.println(anotherCustomerCollection);

        System.out.println(anotherCustomerCollection.isEmpty());
        System.out.println(anotherCustomerCollection.size());


        System.out.println(customers);

        System.out.println(customers.containsKey("123-00-3321"));

        System.out.println(customers.containsValue("Alice Smith"));

        // Obtaining methods

        Set<String> ssns = customers.keySet();
        System.out.println(ssns);
        //Convert set into a list
        List<String> ssnsAsList = new ArrayList<>(ssns);

        // Values

        Collection<String> values = customers.values();
        List<String> valuesAsList = new ArrayList<>(values);

        System.out.println(customers.get("123-00-3321"));
        System.out.println(customers.containsKey("123-00-3321"));


        // Obtain the set of Entry objects

      Set<Map.Entry<String, String>> entryset =  customers.entrySet();

//      for (Map.Entry<String,String> eachEntry : entryset){
      for (Map.Entry<String,String> eachEntry : customers.entrySet()){
//          System.out.println(eachEntry);
          System.out.println(eachEntry.getKey() + ":" + eachEntry.getValue());
      }

      // Find the key for a value "Alice Smith"

        for (Map.Entry<String, String> entry : customers.entrySet()) {
            if(entry.getValue().equals("Alice Smith")){
                System.out.println(entry.getKey());
            }
        }


        // You can also update the values for each entry

        for (Map.Entry<String, String> entry : customers.entrySet()){
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(customers);


        Map<String, Integer> fruits = Map.of("apple", 1, "banana", 2, "lemon", 3);
//        fruits.put("orange", 4); //UnsupportedOperationException


//        Map<Integer, String> towns =  new HashMap<>(); // does not keep the order of insertion
//        Map<Integer, String> towns =  new LinkedHashMap<>(); // keeps the order of insertion
        Map<Integer, String> towns =  new TreeMap<>(); // sorts the entries by the natural order of the keys



        towns.put(22150, "Springfield");
        towns.put(22312, "Alexandria");
        towns.put(20165, "Sterling");
        towns.put(20000, "Washington DC");

        System.out.println(towns);


        Map<Integer, String> myMap =  new Hashtable<>();

        // Null keys and null values

        Map<Integer, String> map1 =  new TreeMap<>();
        map1.put(1, null);
        map1.put(2, null); // multiple null values are allowed for all maps
        map1.put(null, "cdsgvh"); //
        map1.put(null, "dsvsdcs"); // In HashMap and LinkedHashmap you can have at most 1 null key, TreeMap does not allow any null keys


        System.out.println(map1);

        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map1);  // creates a synchronized version of the hashmap


    }
}
