class Money:
    def __init__(self, amount, currency="USD"):
        self.amount = round(float(amount), 2)
        self.currency = currency

    def __str__(self):
        return f"{self.currency} {self.amount:.2f}"

    def __repr__(self):
        return f"Money({self.amount}, '{self.currency}')"

    def __add__(self, other):
        if isinstance(other, Money) and self.currency == other.currency:
            return Money(self.amount + other.amount, self.currency)
        raise ValueError("Cannot add different currencies or non-Money objects.")

    def __sub__(self, other):
        if isinstance(other, Money) and self.currency == other.currency:
            return Money(self.amount - other.amount, self.currency)
        raise ValueError("Cannot subtract different currencies.")

    def __lt__(self, other):
        if isinstance(other, Money) and self.currency == other.currency:
            return self.amount < other.amount
        return NotImplemented

    def __eq__(self, other):
        if isinstance(other, Money):
            return self.amount == other.amount and self.currency == other.currency
        return False

if __name__ == "__main__":
    wallet1 = Money(150.50, "USD")
    wallet2 = Money(85.25, "USD")
    wallet3 = Money(150.50, "USD")

    print("Wallet 1:", wallet1)
    print("Wallet 2:", wallet2)
    print("Total (Wallet 1 + 2):", wallet1 + wallet2)
    print("Difference (Wallet 1 - 2):", wallet1 - wallet2)
    print("Is Wallet 2 < Wallet 1?", wallet2 < wallet1)
    print("Is Wallet 1 == Wallet 3?", wallet1 == wallet3)