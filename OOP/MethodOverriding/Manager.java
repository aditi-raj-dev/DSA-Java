package OOP.MethodOverriding;

public class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = ₹80,000");
    }
}
