class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountId, String accountHolderName, double balance, double interestRate) {
        super(accountId, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest earned: " + interest);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
