package OOP.Inheritance;

public class Student extends Person {

    int rollNumber;

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}
