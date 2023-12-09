package Banks;

import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số vay: ");
        double balance = scanner.nextDouble();

        System.out.print("Nhập lãi suất hàng năm: ");
        double rate = scanner.nextDouble();

        Bank bank = new Bank(balance, rate);

        double interest = bank.calculateInterest();
        System.out.println("Lãi hàng tháng: $" + interest);

        scanner.close();
    }
}