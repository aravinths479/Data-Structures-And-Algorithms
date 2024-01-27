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

class Programmer extends Employee {
    String programmingLanguage;

    Programmer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    void code() {
        System.out.println("Programmer is coding in " + programmingLanguage + ".");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", 104, "Marketing");
        manager.displayDetails();
        manager.manageTeam();

        Programmer programmer = new Programmer("Charlie Brown", 105, "Java");
        programmer.displayDetails();
        programmer.code();
    }
}
