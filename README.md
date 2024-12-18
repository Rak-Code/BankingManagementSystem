# Banking Management System

## Project Overview
The Banking Management System is a core Java-based project designed to manage banking operations. It provides functionalities for creating savings accounts, depositing and withdrawing funds, viewing account balances, and displaying all accounts. The application follows Object-Oriented Programming principles to ensure scalability and maintainability.

---

## Features
- Create a savings account with account ID, holder name, balance, and interest rate.
- Deposit funds into an account.
- Withdraw funds with validation for insufficient balance.
- Display the balance of a specific account.
- View details of all created accounts.

---

## Technology Stack
- **Programming Language**: Java
- **IDE**: Any Java-compatible IDE (Eclipse, IntelliJ IDEA, etc.)
- **Tools**: Scanner for user input, Exception handling for error scenarios

---

## Class Diagram

### Diagram Explanation
1. **Bank**:
   - Manages all accounts.
   - Has methods to create accounts, deposit, withdraw, and display accounts.

2. **Account**:
   - Parent class for different account types.
   - Contains common attributes: account ID, holder name, balance.
   - Methods include deposit, withdraw, and display balance.

3. **SavingsAccount**:
   - Inherits from `Account`.
   - Adds an attribute for interest rate.

4. **BankApplication**:
   - Entry point of the application.
   - Handles user input and coordinates with `Bank` and `Account` classes.

5. **InsufficientFundsException**:
   - Custom exception class.
   - Handles errors when attempting to withdraw more funds than available.

### Diagram Representation

![diagram (5)](https://github.com/user-attachments/assets/008a093d-fde5-4c15-9462-640a71d44fcd)


```
-------------------          -------------------
|      Bank       |          |     Account     |
-------------------          -------------------
| - accounts: List<Account> |      + accountId : int |
| + createSavingsAccount()   |      + holderName : String |
| + findAccount()            |      + balance : double |
| + displayAllAccounts()     |      + deposit() |
-------------------          |      + withdraw() |
                             |      + displayBalance() |
                             -------------------
                                      ^
                                      |
                            ---------------------
                            |   SavingsAccount   |
                            ---------------------
                            | + interestRate : double |
                            ---------------------
                                      ^
                                      |
                            -----------------------
                            |   InsufficientFundsException |
                            -----------------------
                                      ^
                                      |
                            ---------------------
                            |   BankApplication  |
                            ---------------------
```

---

## Project Structure
```
BankingManagementSystem/
  |- src/
      |- Bank.java
      |- Account.java
      |- SavingsAccount.java
      |- InsufficientFundsException.java
      |- BankApplication.java
  |- README.md
  |- .gitignore
```

---

## Setup Instructions
1. Clone the repository from GitHub.
   ```bash
   git clone https://github.com/yourusername/BankingManagementSystem.git
   ```
2. Open the project in your favorite Java IDE.
3. Compile the project files:
   ```bash
   javac BankApplication.java
   ```
4. Run the project:
   ```bash
   java BankApplication
   ```

---

## Usage Guide
- **Creating an Account**:
  - Select option `1` from the menu.
  - Enter the required details: account ID, name, balance, and interest rate.

- **Depositing Funds**:
  - Select option `2`.
  - Provide the account ID and deposit amount.

- **Withdrawing Funds**:
  - Select option `3`.
  - Provide the account ID and withdrawal amount. Insufficient balance will trigger an exception.

- **Displaying Account Balance**:
  - Select option `5`.
  - Provide the account ID to view its balance.

- **Viewing All Accounts**:
  - Select option `4` to list all created accounts with their details.

---

## Future Enhancements
- Add support for current accounts.
- Implement file-based persistence to save account data across sessions.
- Add a graphical user interface (GUI) for enhanced usability.
- Include transaction history for accounts.

---

## Contributing
1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Commit your changes with a descriptive message.
4. Push your branch and create a pull request.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

