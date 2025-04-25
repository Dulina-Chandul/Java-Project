package cse.school.codejam;

/**
 * Interface defining banking operations for account management and transactions.
 * Provides methods for creating accounts and handling various financial transactions.
 */
public interface BankService {
    /**
     * Creates a new bank account with the specified account number and account holder name.
     *
     * @param accountNumber     The unique identifier for the account
     * @param accountHolderName The name of the account holder
     * @throws IllegalArgumentException If an account with the given account number already exists
     */
    void createAccount(String accountNumber, String accountHolderName);

    /**
     * Deposits the specified amount into the account identified by the account number.
     *
     * @param accountNumber The unique identifier of the account
     * @param amount        The amount to deposit (must be positive)
     * @throws IllegalArgumentException If the amount is not positive or the account doesn't exist
     */
    void deposit(String accountNumber, double amount);

    /**
     * Withdraws the specified amount from the account identified by the account number.
     *
     * @param accountNumber The unique identifier of the account
     * @param amount        The amount to withdraw (must be positive)
     * @throws IllegalArgumentException If the amount is not positive, the account doesn't exist,
     *                                  or there are insufficient funds
     */
    void withdraw(String accountNumber, double amount);

    /**
     * Transfers the specified amount from one account to another.
     *
     * @param fromAccountNumber The account number to transfer from
     * @param toAccountNumber   The account number to transfer to
     * @param amount            The amount to transfer (must be positive)
     * @throws IllegalArgumentException If the amount is not positive, either account doesn't exist,
     *                                  or there are insufficient funds in the source account
     */
    void transfer(String fromAccountNumber, String toAccountNumber, double amount);

    /**
     * Retrieves the account details for the specified account number.
     *
     * @param accountNumber The unique identifier of the account
     * @return A string representation of the account details
     * @throws IllegalArgumentException If the account doesn't exist
     */
    String getAccountDetails(String accountNumber);

    /**
     * Retrieves the current balance for the specified account number.
     *
     * @param accountNumber The unique identifier of the account
     * @return The current account balance
     * @throws IllegalArgumentException If the account doesn't exist
     */
    double getAccountBalance(String accountNumber);
}