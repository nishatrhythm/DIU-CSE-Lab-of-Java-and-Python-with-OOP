class BkashProcessor:
    def process(self, amount):
        return f"Processing ${amount:.2f} via bKash mobile gateway."

class NagadProcessor:
    def process(self, amount):
        return f"Processing ${amount:.2f} via Nagad digital wallet."

class CreditCardProcessor:
    def process(self, amount):
        return f"Processing ${amount:.2f} via Visa/MasterCard network."

def checkout(processor, amount):
    print("Initiating checkout:")
    print(processor.process(amount))
    print("Transaction complete.\n")

if __name__ == "__main__":
    gateways = [
        BkashProcessor(),
        NagadProcessor(),
        CreditCardProcessor()
    ]

    for gateway in gateways:
        checkout(gateway, 250.0)