class BankAccount:
    def __init__(self, account_number, holder_name, initial_balance=0.0):
        self.account_number = account_number
        self.holder_name = holder_name
        self.balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposited ${amount:.2f}. New Balance: ${self.balance:.2f}")
        else:
            print("Deposit amount must be positive.")

    def withdraw(self, amount):
        if amount <= 0:
            print("Withdrawal amount must be greater than zero.")
        elif amount > self.balance:
            print("Insufficient funds! Withdrawal rejected.")
        else:
            self.balance -= amount
            print(f"Withdrew ${amount:.2f}. New Balance: ${self.balance:.2f}")

    def show_statement(self):
        print(f"Account: {self.account_number} | Holder: {self.holder_name} | Balance: ${self.balance:.2f}")

if __name__ == "__main__":
    account = BankAccount("BA-5566", "Tamim Iqbal", 1500.0)

    account.show_statement()
    account.deposit(500.0)
    account.withdraw(300.0)
    account.withdraw(2500.0)
    account.show_statement()