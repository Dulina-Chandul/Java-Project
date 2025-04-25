package cse.school.codejam;

import java.util.*;

public class TransactionLogger {
    private final Map<String, List<Transaction>> map = new HashMap<>();

    public void logTransaction(String accId, Transaction txn) {
        map.computeIfAbsent(accId, k -> new ArrayList<>()).add(txn);
    }

    public void printHistory(String accId) {
        List<Transaction> history = map.getOrDefault(accId, new ArrayList<>());
        if (history.isEmpty()) {
            System.out.println("No transactions for account: " + accId);
        } else {
            System.out.println("Transaction History for " + accId);
            for (Transaction t : history) {
                System.out.println(t.getTransactionDetails());
            }
        }
    }
}