package OOP.ThisKeyword;

public class Student {
    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
