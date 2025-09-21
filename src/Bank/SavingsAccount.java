package Bank;

public class SavingsAccount extends Account {
    private double withdrawalLimit = 20000; // per transaction

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Invalid or exceeding withdrawal limit!");
        }
    }
}
