package day25;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        int[] arr = {1,2,4};

        String[] names = {new String("Java"), "Hello"};


        // An array of our own custom class
//        String [] strs = new String[4];

        Transaction[] transactions = new Transaction[3];
        // Creating an array of custom type with initial size does not actually create those objects
        System.out.println(Arrays.toString(transactions));

        transactions[0] = new Transaction(21321,"Bob", "Alice", false);
        transactions[1] = new Transaction(23432,"Katie", "Jack", true);
        transactions[2] = new Transaction(43243,"Danny", "Sean", false);

        //print each Transaction details
//        for ( Transaction tr    : transactions ){
//            System.out.println(tr.getInfo());
//        }

        // Find the Transaction object with the max amount

        double max = Double.MIN_VALUE;
        Transaction maxTransaction = null;

        for ( Transaction tr    : transactions ){
              if(tr.getAmount() > max){
                  max = tr.getAmount();
                  maxTransaction = tr;
              }
        }

//        for (int i = 0; i < transactions.length; i++) {
//            if(transactions[i].getAmount() > max){
//                max = transactions[i].getAmount();
//                maxTr = transactions[i];
//            }
//        }

        System.out.println("The max amount is: " + max);
        System.out.println("The transaction object with the max amount is: " + maxTransaction.getInfo());

    }
}
