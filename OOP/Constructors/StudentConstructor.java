package OOP.Constructors;

public class StudentConstructor {
    String name;
    int age;

    public StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
