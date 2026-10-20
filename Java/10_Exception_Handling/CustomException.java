class InsufficientFundsException extends Exception {
    private double deficit;

    public InsufficientFundsException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}

class Wallet {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientFundsException("Withdrawal rejected: balance too low.", deficit);
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount + " | Remaining Wallet Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomException {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(500.0);

        try {
            System.out.println("Current balance: $" + wallet.getBalance());
            wallet.withdraw(200.0);
            wallet.withdraw(450.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
            System.out.println("Shortage amount: $" + e.getDeficit());
        }
    }
}
