package OOP.MethodOverriding;

public class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = ₹60,000");
    }

}
