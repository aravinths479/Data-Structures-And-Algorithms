package BYTS.inheritance;

interface Employee {
    void displayDetails();
}

interface Manager {
    void manageTeam();
}

class ManagerEmployee implements Employee, Manager {
    String name;
    int employeeId;
    String department;

    ManagerEmployee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    public void manageTeam() {
        System.out.println("Manager is managing the team in the " + department + " department.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee("Jane Doe", 102, "HR");
        managerEmployee.displayDetails();
        managerEmployee.manageTeam();
    }
}
