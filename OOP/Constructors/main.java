package OOP.Constructors;

public class main {
    public static void main(String[] args) {
        StudentConstructor student1 = new StudentConstructor("Aditi", 20);
        StudentConstructor student2 = new StudentConstructor("Bisha", 22);
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
