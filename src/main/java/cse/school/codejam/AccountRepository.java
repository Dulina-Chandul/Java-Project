package cse.school.codejam;

import java.util.*;

public class AccountRepository {
    private final Map<String, BankAccount> accounts = new HashMap<>();

    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    public void addAccount(BankAccount account) {
        if (account == null || accountExists(account.getAccountNumber())) {
            throw new IllegalArgumentException("Invalid or existing account.");
        }
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(String accountNumber) {
        if (!accountExists(accountNumber)) {
            throw new IllegalArgumentException("Account not found.");
        }
        return accounts.get(accountNumber);
    }

    public void removeAccount(String accountNumber) {
        if (!accountExists(accountNumber)) {
            throw new IllegalArgumentException("Account not found.");
        }
        accounts.remove(accountNumber);
    }

    public Collection<BankAccount> getAllAccounts() {
        return accounts.values();
    }

    public int getTotalAccounts() {
        return accounts.size();
    }
}