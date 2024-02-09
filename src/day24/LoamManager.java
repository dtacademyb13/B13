package day24;

public class LoamManager {

    public static void main(String[] args) {



        Loan carLoan = new Loan(40000,7.5,5000,48);

        System.out.println(carLoan.getInterestRate());
        carLoan.setInterestRate(5.6);
//        carLoan.interestRate = 1.2;
        System.out.println(carLoan.getInterestRate());

    }
}
