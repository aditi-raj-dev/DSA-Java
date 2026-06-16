package OOP.ThisKeyword;

public class mainb {
    public static void main(String[] args) {

        Employee e1 = new Employee("Aditi", 50000);
        Employee e2 = new Employee("Raj", 65000);

        e1.displayEmployee();

        System.out.println();

        e2.displayEmployee();
    }
}
