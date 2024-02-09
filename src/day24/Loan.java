package day24;

import java.util.Scanner;

public class Loan {


    // Encapsulation - make the fields private and provide public getter and setter methods

    private double totalBalance;
    private double interestRate;

    private double downPayment;
    private int months;

    public Loan(double totalBalance, double interestRate, double downPayment, int months) {
        this.totalBalance = totalBalance;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
        this.months = months;
    }

    public void printDetails(){
        System.out.println("Loan{" +
                "totalBalance=" + totalBalance +
                ", interestRate=" + interestRate +
                ", downPayment=" + downPayment +
                ", months=" + months +
                '}');
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        System.out.println("Please enter your password:");
        String pass = new Scanner(System.in).next();
        if(pass.equals("abc123")){
            this.interestRate = interestRate;
            System.out.println("The interest rate has been successfully updated.");
        }else {
            System.out.println("The password is incorrect.");
            return;
        }

    }


    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
