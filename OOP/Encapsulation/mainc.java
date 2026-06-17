package OOP.Encapsulation;

public class mainc {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Rahul");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
