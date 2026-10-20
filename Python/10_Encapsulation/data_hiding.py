class SecureVault:
    def __init__(self, owner, secret_key, balance):
        self.owner = owner
        self._access_level = "Standard"
        self.__secret_key = secret_key
        self.__balance = balance

    def verify_and_get_balance(self, entered_key):
        if entered_key == self.__secret_key:
            return self.__balance
        print("Access Denied: Incorrect secret key.")
        return None

    def update_secret_key(self, old_key, new_key):
        if old_key == self.__secret_key:
            self.__secret_key = new_key
            print("Secret key updated successfully.")
        else:
            print("Key update failed: Incorrect current key.")

if __name__ == "__main__":
    vault = SecureVault("Tahmid", "vault@123", 25000)

    print("Owner (Public):", vault.owner)
    print("Access Level (Protected convention):", vault._access_level)

    print("Checking balance with wrong key:")
    vault.verify_and_get_balance("wrong_key")

    print("Checking balance with correct key:")
    print("Balance:", vault.verify_and_get_balance("vault@123"))

    vault.update_secret_key("vault@123", "new_vault@456")

    print("Name mangled access demonstration:", vault._SecureVault__balance)