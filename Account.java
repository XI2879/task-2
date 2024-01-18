package Task_2;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.deposit(1000.0);
        account1.withdraw(500.0);
        account1.displayBalance();

        System.out.println();

        Account account2 = new Account(2000.0);
        account2.deposit(500.0);
        account2.withdraw(1500.0);
        account2.displayBalance();
    }
}
