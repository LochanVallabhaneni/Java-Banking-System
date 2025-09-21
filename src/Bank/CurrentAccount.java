package Bank;

public class CurrentAccount extends Account {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}
