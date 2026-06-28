package OOP.MethodOverriding;

public class maini {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();
        Developer developer = new Developer();

        employee.calculateSalary();
        manager.calculateSalary();
        developer.calculateSalary();
    }
}
