package cse.school.codejam;

public class Main {

    public static void main(String[] args) {
        TransactionLogger transactionLogger = new TransactionLogger();
        InputUtil inputUtil = new InputUtil();
        AccountRepository accountRepository = new AccountRepository();
        BankService bankService = new BankServiceImpl(transactionLogger, accountRepository);
        Teller teller = new Teller(inputUtil, bankService, transactionLogger);

        while (true) {
            System.out.println("====== CodeJam Bank CLI ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Account Details");
            System.out.println("6. View Account History");
            System.out.println("7. Exit");

            int option = teller.getUserPreference();

            try {
                switch (option) {
                    case 1:
                        teller.createAccount();
                        break;
                    case 2:
                        teller.depositFunds();
                        break;
                    case 3:
                        teller.withdrawFunds();
                        break;
                    case 4:
                        teller.transferFunds();
                        break;
                    case 5:
                        teller.checkAccountDetails();
                        break;
                    case 6:
                        teller.checkTransactionHistory();
                        break;
                    case 7:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}

