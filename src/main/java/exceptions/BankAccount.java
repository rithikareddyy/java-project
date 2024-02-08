package exceptions;

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        // Check for negative withdrawal amount first
        if (amount < 0) {
            throw new InvalidWithdrawalException("Invalid withdrawal amount. Amount cannot be negative.");
        }

        // Check for insufficient funds
        if (amount > balance) {
            throw new InsufficientFundsException("Attempting to withdraw more money than the account balance.\n.");
        }

        // Perform withdrawal
        balance -= amount;
        System.out.println("Successful withdrawal. Remaining balance: " + balance);
    }
}