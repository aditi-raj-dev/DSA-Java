package OOP.Polymorphism;

public class maina {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }
}
