package OOP.Inheritance;

public class mainf {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;
        s1.rollNumber = 101;

        Student s2 = new Student();
        s2.name = "Aditi";
        s2.age = 19;
        s2.rollNumber = 102;

        s1.displayStudentInfo();

        System.out.println();

        s2.displayStudentInfo();
    }
}
