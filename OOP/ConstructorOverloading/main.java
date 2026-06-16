package OOP.ConstructorOverloading;

public class main {
    public static void main(String[] args) {
        // Using the no-argument constructor
        Student student1 = new Student();
        student1.displayInfo();

        // Using the constructor with one parameter
        Student student2 = new Student("Aditi");
        student2.displayInfo();

        // Using the constructor with two parameters
        Student student3 = new Student("Raj", 20);
        student3.displayInfo();
    }
}
