package Banks;

public class Bank {
    private final double balance;
    private final double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        return balance * (rate / 1200);
    }
}