import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;
        do {
            System.out.println("\n1. Create Savings Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account ID: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid account ID.");
                        scanner.next();
                    }
                    int savingsId = scanner.nextInt();

                    System.out.print("Enter name: ");
                    String savingsName = scanner.next();

                    System.out.print("Enter initial balance: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid balance.");
                        scanner.next();
                    }
                    double savingsBalance = scanner.nextDouble();

                    System.out.print("Enter interest rate: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid interest rate.");
                        scanner.next();
                    }
                    double interestRate = scanner.nextDouble();

                    bank.createSavingsAccount(savingsId, savingsName, savingsBalance, interestRate);
                    break;

                case 2:
                    System.out.print("Enter account ID: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid account ID.");
                        scanner.next();
                    }
                    int depositId = scanner.nextInt();

                    Account depositAccount = bank.findAccount(depositId);
                    if (depositAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next();
                        }
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    }
                    break;

                case 3:
                    System.out.print("Enter account ID: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid account ID.");
                        scanner.next();
                    }
                    int withdrawId = scanner.nextInt();

                    Account withdrawAccount = bank.findAccount(withdrawId);
                    if (withdrawAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a valid amount.");
                            scanner.next();
                        }
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            withdrawAccount.withdraw(withdrawAmount);
                        } catch (InsufficientFundsException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;

                case 4:
                    bank.displayAllAccounts();
                    break;

                case 5:
                    System.out.print("Enter account ID: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid account ID.");
                        scanner.next();
                    }
                    int balanceId = scanner.nextInt();

                    Account balanceAccount = bank.findAccount(balanceId);
                    if (balanceAccount != null) {
                        balanceAccount.displayBalance();
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
