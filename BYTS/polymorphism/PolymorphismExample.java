package BYTS.polymorphism;


class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

    void doWork() {
        System.out.println("Employee is performing general tasks.");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    // Method overriding
    @Override
    void doWork() {
        System.out.println("Manager is managing the team in the " + department + " department.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of different types but referring to the same base class
        Employee emp1 = new Employee("John Doe", 101);
        Employee emp2 = new Manager("Alice Johnson", 102, "Marketing");

        // Polymorphic behavior
        emp1.displayDetails();
        emp1.doWork();

        System.out.println("--------");

        emp2.displayDetails();
        emp2.doWork();
    }
}

