class Account {
    public String accountHolder;
    private double balance;
    protected String accountType;
    int branchCode;

    public Account(String holder, double initialBalance, String type, int branch) {
        accountHolder = holder;
        balance = initialBalance;
        accountType = type;
        branchCode = branch;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    private boolean isBalanceSufficient(double amount) {
        return balance >= amount;
    }

    public void withdraw(double amount) {
        if (isBalanceSufficient(amount)) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class Task01_AccessSpecifiers {
    public static void main(String[] args) {
        Account acc = new Account("Rahim Ahmed", 5000.0, "Savings", 101);

        System.out.println("Account Holder: " + acc.accountHolder);
        System.out.println("Account Type: " + acc.accountType);
        System.out.println("Branch Code: " + acc.branchCode);
        System.out.println("Current Balance: $" + acc.getBalance());

        acc.deposit(1500.0);
        acc.withdraw(2000.0);
        System.out.println("Final Balance: $" + acc.getBalance());
    }
}