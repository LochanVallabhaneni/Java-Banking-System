package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        // Create sample accounts
        bank.addAccount(new SavingsAccount("S001", "Alice", 50000));
        bank.addAccount(new CurrentAccount("C001", "Bob", 20000));

        while (true) {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 4) break;

            System.out.print("Enter Account Number: ");
            String accNo = sc.next();

            Account acc = bank.getAccount(accNo);
            if (acc == null) {
                System.out.println("Account not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 3:
                    System.out.println(acc);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Thank you for banking with us!");
    }
}
