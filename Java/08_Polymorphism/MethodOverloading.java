class Printer {
    void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    void print(double number) {
        System.out.println("Printing double: " + number);
    }

    void print(String text) {
        System.out.println("Printing text: " + text);
    }

    void print(String text, int repeatCount) {
        System.out.print("Printing repeated text: ");
        for (int i = 0; i < repeatCount; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(100);
        printer.print(99.99);
        printer.print("Hello Polymorphism");
        printer.print("Echo", 3);
    }
}
