import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createSavingsAccount(int accountId, String name, double balance, double interestRate) {
        Account account = new SavingsAccount(accountId, name, balance, interestRate);
        accounts.add(account);
        System.out.println("Savings Account created successfully.");
    }

   

    public void displayAllAccounts() {
        for (Account account : accounts) {
            System.out.println("\nAccount ID: " + account.accountId);
            System.out.println("Holder Name: " + account.accountHolderName);
            account.displayBalance();
            account.displayAccountType();
        }
    }

    public Account findAccount(int accountId) {
        for (Account account : accounts) {
            if (account.accountId == accountId) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}
