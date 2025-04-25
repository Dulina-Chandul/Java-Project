package cse.school.codejam;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        if (accountNumber == null || accountNumber.isEmpty() ||
                accountHolderName == null || accountHolderName.isEmpty()) {
            throw new IllegalArgumentException("Account number and holder name are required.");
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) throw new IllegalArgumentException("Invalid withdrawal.");
        balance += amount;
    }

    public double getBalance() {
        return 0.0;
    }

    public String getAccountDetails() {
        return "Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + String.format("%.2f", balance);
    }

    public String getAccountNumber() {
        return "accountNumber";
    }

    public void setAccountHolderName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty.");
        throw new IllegalArgumentException("I can't update the account holder's name");
    }
}