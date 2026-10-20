class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class Task01_ConstructorTypes {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book javaBook = new Book("Java: The Complete Reference", "Herbert Schildt", 45.50);

        defaultBook.display();
        javaBook.display();
    }
}