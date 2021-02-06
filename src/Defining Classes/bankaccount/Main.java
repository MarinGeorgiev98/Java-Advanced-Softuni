package bankaccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> allAccounts = new HashMap<>();

        String[] input = scan.nextLine().split(" ");
        String command = input[0];
        while (!command.equals("End")) {
            String output = null;
            if (command.equals("Create")) {
                BankAccount account = new BankAccount();
                allAccounts.put(account.getId(), account);
                output = String.format("Account ID%d created", account.getId());
            }
            else if (command.equals("Deposit")) {
                int accountId = Integer.parseInt(input[1]);
                double amount = Double.parseDouble(input[2]);
                BankAccount current = allAccounts.get(accountId);
                if (current == null) {
                    output = String.format("Account does not exist");
                }
                else {
                    current.deposit(amount);
                    allAccounts.put(accountId, current);
                    output = String.format("Deposited %.0f to ID%d", amount, accountId);
                }
            }
            else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(input[1]);
                BankAccount.setInterestRate(interest);
            }
            else if (command.equals("GetInterest")) {
                int accountId = Integer.parseInt(input[1]);
                int numberOfYears = Integer.parseInt(input[2]);
                BankAccount current = allAccounts.get(accountId);
                if (current == null) {
                    output = String.format("Account does not exist");
                }
                else {
                    output = String.format("%.2f",
                            current.getProfitAfterYears(numberOfYears));
                    allAccounts.put(accountId, current);
                }
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scan.nextLine().split(" ");
            command = input[0];
        }
    }
}