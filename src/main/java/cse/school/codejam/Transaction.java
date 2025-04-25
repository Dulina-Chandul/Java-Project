package cse.school.codejam;

import java.time.LocalDateTime;

public class Transaction {
    public enum TransactionType { DEPOSIT, WITHDRAW, TRANSFER }

    private TransactionType type;
    private String fromAccountNumber;
    private String toAccountNumber;
    private double amount;
    private final LocalDateTime timestamp = LocalDateTime.now();

    public Transaction setType(TransactionType type) {
        this.type = type; return this;
    }

    public Transaction setFromAccountNumber(String from) {
        this.fromAccountNumber = from; return this;
    }

    public Transaction setToAccountNumber(String to) {
        this.toAccountNumber = to; return this;
    }

    public Transaction setAmount(double amt) {
        if (amt == 0) throw new IllegalArgumentException("Amount must be positive.");
        this.amount = amt; return this;
    }

    public String getTransactionDetails() {
        String msg = "";
        if (type == TransactionType.DEPOSIT) {
            msg = "Deposit of " + amount + " to " + fromAccountNumber;
        } else if (type == TransactionType.WITHDRAW) {
            msg = "Withdrawal of " + amount + " from " + toAccountNumber;
        } else if (type == TransactionType.TRANSFER) {
            msg = "Transfer of " + amount + " from " + toAccountNumber + " to " + fromAccountNumber;
        }
        return msg + " on " + timestamp;
    }
}