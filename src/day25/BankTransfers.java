package day25;

import java.util.Random;

public class BankTransfers {


    public static void main(String[] args) {


        Transaction transaction = new Transaction(45967,"Deutsche Bank", "UBS Bank", true);

        System.out.println(transaction.getInfo());  //45967

        updateTransactionAmount(transaction, 50000);

        System.out.println(transaction.getInfo());

        // When you pass an object into a method, its reference copy is created in the method and if the method changes the object, it is reflected in the original object

       Transaction randomTransaction =  getRandomTransaction();

        System.out.println(randomTransaction.getInfo());
    }



    public static void updateTransactionAmount(Transaction tr, double amount){
        tr.setAmount(amount);
    }


    public static Transaction getRandomTransaction(){
        String [] senders = {"Bob", "Ana", "Jane", "Rick"};
        String [] receivers = {"Alice", "Danny", "Jake", "Sheldon"};
        Transaction transaction =  new Transaction(new Random().nextInt(100000),
                senders[new Random().nextInt(senders.length)],
                receivers[new Random().nextInt(receivers.length)],
                new Random().nextBoolean());
        return transaction;

    }

}
