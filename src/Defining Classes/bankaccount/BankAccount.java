package bankaccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int accountsCount = 0;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = ++accountsCount;
        this.balance = 0.0;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit (double balance) {
        this.balance += balance;
    }

    public int getId() {
        return this.id;
    }

    public double getProfitAfterYears(int numberOfYears) {
        return this.balance * BankAccount.interestRate * numberOfYears;
    }
}