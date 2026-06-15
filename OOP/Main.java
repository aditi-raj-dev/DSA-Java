package OOP;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "kisha";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "manasvi";
        student2.age = 22;

        student1.displayInfo();
        student2.displayInfo();
    }
}
