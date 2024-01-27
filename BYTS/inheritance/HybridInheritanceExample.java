package BYTS.inheritance;


interface Work {
    void doWork();
}

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

class Manager extends Employee implements Work {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void doWork() {
        System.out.println("Manager is working on managerial tasks.");
    }

    void manageTeam() {
        System.out.println("Manager is managing the team in the " + department + " department.");
    }
}

class Programmer extends Employee implements Work {
    String programmingLanguage;

    Programmer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    public void doWork() {
        System.out.println("Programmer is coding in " + programmingLanguage + ".");
    }
}

class TeamLead extends Manager {
    int teamSize;

    TeamLead(String name, int employeeId, String department, int teamSize) {
        super(name, employeeId, department);
        this.teamSize = teamSize;
    }

    void leadTeam() {
        System.out.println("Team Lead is leading a team of " + teamSize + " members.");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("Eva Williams", 106, "Quality Assurance", 8);
        teamLead.displayDetails();
        teamLead.manageTeam();
        teamLead.doWork();
        teamLead.leadTeam();

        Programmer programmer = new Programmer("David Miller", 107, "Python");
        programmer.displayDetails();
        programmer.doWork();
    }
}
