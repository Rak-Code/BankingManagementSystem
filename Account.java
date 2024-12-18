abstract class Account {
    protected int accountId;
    protected String accountHolderName;
    protected double balance;

    public Account(int accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Amount " + amount + " withdrawn successfully.");
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public abstract void displayAccountType();
}
