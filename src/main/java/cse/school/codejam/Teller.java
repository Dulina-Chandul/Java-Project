package cse.school.codejam;

public class Teller {
    private final InputUtil inputUtil;
    private final BankService bankService;
    private final TransactionLogger transactionLogger;
    private static final String ENTER_ACCOUNT_NUMBER = "Enter account number: ";

    public Teller(InputUtil inputUtil, BankService bankService, TransactionLogger transactionLogger) {
        this.inputUtil = inputUtil;
        this.bankService = bankService;
        this.transactionLogger = transactionLogger;
    }

    public void createAccount() {
        System.out.println("\n----- Create New Account -----");
        String accountNumber = inputUtil.readString(ENTER_ACCOUNT_NUMBER);
        String accountHolderName = inputUtil.readString("Enter account holder name: ");

        try {
            bankService.createAccount(accountNumber, accountHolderName);
            System.out.println("Account created successfully!");
            System.out.println("Account details: " + bankService.getAccountDetails(accountNumber));
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create account: " + e.getMessage());
        }
    }

    public void depositFunds() {
        System.out.println("\n----- Deposit Funds -----");
        String accountNumber = inputUtil.readString(ENTER_ACCOUNT_NUMBER);
        double amount = inputUtil.readDouble("Enter amount to deposit: ");

        try {
            bankService.deposit(accountNumber, amount);
            System.out.println("Deposit successful!");
            System.out.println("New balance: Rs." + String.format("%.2f", bankService.getAccountBalance(accountNumber)));
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }

    public void withdrawFunds() {
        System.out.println("\n----- Withdraw Funds -----");
        String accountNumber = inputUtil.readString(ENTER_ACCOUNT_NUMBER);
        double amount = inputUtil.readDouble("Enter amount to withdraw: ");

        try {
            bankService.withdraw(accountNumber, amount);
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: Rs." + String.format("%.2f", bankService.getAccountBalance(accountNumber)));
        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    public void transferFunds() {
        System.out.println("\n----- Transfer Funds -----");
        String fromAccountNumber = inputUtil.readString("Enter source account number: ");
        String toAccountNumber = inputUtil.readString("Enter destination account number: ");
        double amount = inputUtil.readDouble("Enter amount to transfer: ");

        try {
            bankService.transfer(fromAccountNumber, toAccountNumber, amount);
            System.out.println("Transfer successful!");
            System.out.println("Source account balance: Rs." +
                    String.format("%.2f", bankService.getAccountBalance(fromAccountNumber)));
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }

    public void checkAccountDetails() {
        System.out.println("\n----- Account Details -----");
        String accountNumber = inputUtil.readString(ENTER_ACCOUNT_NUMBER);

        try {
            String accountDetails = bankService.getAccountDetails(accountNumber);
            System.out.println(accountDetails);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to retrieve account details: " + e.getMessage());
        }
    }

    public void checkTransactionHistory() {
        System.out.println("\n----- Transaction History -----");
        String accountNumber = inputUtil.readString(ENTER_ACCOUNT_NUMBER);

        try {
            bankService.getAccountDetails(accountNumber);
            transactionLogger.printHistory(accountNumber);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to retrieve transaction history: " + e.getMessage());
        }
    }

    public int getUserPreference() {
        return inputUtil.readInt("Select an option: ");
    }
}