package OOP.ConstructorOverloading;

public class Rectangle {
    int length;
    int width;

    // Constructor with no parameters
    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Constructor with one parameter
    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}
