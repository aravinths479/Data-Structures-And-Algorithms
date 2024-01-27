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

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("Bob Smith", 103, "Development", 5);
        teamLead.displayDetails();
        teamLead.manageTeam();
        teamLead.leadTeam();
    }
}
