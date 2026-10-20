interface PaymentGateway {
    double SERVICE_CHARGE = 0.015;

    void processPayment(double amount);
    void printReceipt(double amount);
}

class BkashPayment implements PaymentGateway {
    private String mobileNumber;

    BkashPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void processPayment(double amount) {
        double total = amount + (amount * SERVICE_CHARGE);
        System.out.println("Processing bKash payment from: " + mobileNumber);
        System.out.println("Amount: $" + amount + " + Charge: $" + (amount * SERVICE_CHARGE));
        System.out.println("Total Paid: $" + total);
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Receipt sent to SMS: " + mobileNumber);
        System.out.println("-------------------------");
    }
}

class CreditCardPayment implements PaymentGateway {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Total Charged: $" + amount);
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Card transaction receipt generated.");
        System.out.println("-------------------------");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        PaymentGateway payment1 = new BkashPayment("01712345678");
        payment1.processPayment(1000.0);
        payment1.printReceipt(1000.0);

        PaymentGateway payment2 = new CreditCardPayment("1234567890123456");
        payment2.processPayment(2500.0);
        payment2.printReceipt(2500.0);
    }
}
