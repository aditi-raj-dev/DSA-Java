package OOP.ConstructorOverloading;

public class Student {
    String name;
    int age;

    // Constructor with no parameters
    Student() {
        this.name = "unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
