package OOP.Constructors;

public class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}
