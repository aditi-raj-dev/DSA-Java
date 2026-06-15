package OOP;

public class Main1 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5.0;
        rect.width = 3.0;

        double area = rect.area();
        System.out.println("Area of the rectangle: " + area);
    }
}
