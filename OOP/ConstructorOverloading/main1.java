package OOP.ConstructorOverloading;

public class main1 {
    public static void main(String[] args) {
        // Using the no-argument constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rect1: " + rect1.area());

        // Using the constructor with one parameter
        Rectangle rect2 = new Rectangle(5);
        System.out.println("Area of rect2: " + rect2.area());

        // Using the constructor with two parameters
        Rectangle rect3 = new Rectangle(4, 6);
        System.out.println("Area of rect3: " + rect3.area());
    }
}
