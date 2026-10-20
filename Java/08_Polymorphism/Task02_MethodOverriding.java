class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SonaliBank extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class BRACBank extends Bank {
    @Override
    double getInterestRate() {
        return 7.25;
    }
}

class CityBank extends Bank {
    @Override
    double getInterestRate() {
        return 8.0;
    }
}

public class Task02_MethodOverriding {
    public static void main(String[] args) {
        SonaliBank sb = new SonaliBank();
        BRACBank bb = new BRACBank();
        CityBank cb = new CityBank();

        System.out.println("Sonali Bank Interest Rate: " + sb.getInterestRate() + "%");
        System.out.println("BRAC Bank Interest Rate: " + bb.getInterestRate() + "%");
        System.out.println("City Bank Interest Rate: " + cb.getInterestRate() + "%");
    }
}