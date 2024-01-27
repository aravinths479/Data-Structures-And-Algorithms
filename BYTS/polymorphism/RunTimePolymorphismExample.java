

package BYTS.polymorphism;


class Employee {
    void work() {
        System.out.println("Employee is performing general tasks.");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team.");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Manager();

        emp1.work();  // Calls the work() method of Employee
        emp2.work();  // Calls the overridden work() method of Manager
    }
}

