package exceptions;
public class MainBank {
    public static void main(String[] args) {
        try {
            // Scenario 1: Successful withdrawal
            BankAccount account1 = new BankAccount(1000);
            account1.withdraw(500);

            // Scenario 2: Attempting to withdraw more than the account balance
            BankAccount account2 = new BankAccount(200);
            account2.withdraw(300);

            // Scenario 3: Attempting to withdraw a negative amount
            BankAccount account3 = new BankAccount(100);
            account3.withdraw(-50);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidWithdrawalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}