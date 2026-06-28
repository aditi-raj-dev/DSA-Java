package OOP.Abstraction;

public class maind {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Circle Area: " + circle.area());
    }
}
