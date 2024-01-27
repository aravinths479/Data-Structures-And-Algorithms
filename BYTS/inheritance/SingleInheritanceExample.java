package BYTS.inheritance;

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
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void manageTeam() {
        System.out.println("Manager is managing the team in the " + department + " department.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 101, "IT");
        manager.displayDetails();
        manager.manageTeam();
    }
}

