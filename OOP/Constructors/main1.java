package OOP.Constructors;

public class main1 {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", 8.99);
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}
