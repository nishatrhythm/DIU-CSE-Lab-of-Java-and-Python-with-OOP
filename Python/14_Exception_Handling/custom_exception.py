class InsufficientFundsError(Exception):
    def __init__(self, current_balance, withdrawal_amount):
        self.current_balance = current_balance
        self.withdrawal_amount = withdrawal_amount
        self.shortage = withdrawal_amount - current_balance
        super().__init__(f"Shortage of ${self.shortage:.2f}. Balance: ${current_balance:.2f}, Requested: ${withdrawal_amount:.2f}")

class DigitalWallet:
    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def withdraw(self, amount):
        if amount <= 0:
            raise ValueError("Withdrawal amount must be greater than zero.")
        if amount > self.balance:
            raise InsufficientFundsError(self.balance, amount)
        self.balance -= amount
        print(f"Successfully withdrew ${amount:.2f}. New Balance: ${self.balance:.2f}")

if __name__ == "__main__":
    wallet = DigitalWallet("Farhan", 300.0)

    try:
        wallet.withdraw(100.0)
        wallet.withdraw(250.0)
    except InsufficientFundsError as e:
        print("Caught Custom Exception:", e)
    except ValueError as ve:
        print("Validation Error:", ve)