package day25;

public class Transaction {

    private double amount;
    private String sender;
    private String receiver;
    private boolean international;


    public Transaction(double amount, String sender, String receiver, boolean international) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.international = international;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }


    public String getInfo() {
        return "Transaction{" +
                "amount=" + amount +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", international=" + international +
                '}';
    }
}
