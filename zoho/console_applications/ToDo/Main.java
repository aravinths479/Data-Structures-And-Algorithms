package ToDo;

import java.util.*;

class Task {
    private String name;
    private String description;
    private String dueDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDueDate(String duedate) {
        this.dueDate = duedate;
    }

    public String getduedate() {
        return this.dueDate;
    }
}

class Todo {
    private List<Task> todo;

    public Todo() {
        this.todo = new ArrayList<>();
    }

    public void addTask(String task, String desc, String duedate) {
        Task obj = new Task();
        obj.setName(task);
        obj.setDescription(desc);
        obj.setDueDate(duedate);
        todo.add(obj);
        System.out.println("task added sucessfully");
    }

    public void viewTasks() {
        for (Task task : todo) {
            System.out.println("Viewing All Tasks");
            System.out.println("----------------------------------------------------------------");
            System.out.println("\n Task name : " + task.getName() + "\n Description : " + task.getDescription()
                    + "\n Due Date : " + task.getduedate());
            System.out.println("----------------------------------------------------------------");

        }
    }
    public void deleteTask(String taskName){
        for(Task task:todo){
            if(task.getName().equals(taskName)){
                todo.remove(task);
                break;
            }
        }
        System.out.println("Task removed sucessfully ...");
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Todo todo = new Todo();
        do {
            System.out.println("\n 1.Add task \n 2.View All Task \n3.Delete Task");
            System.out.println();
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1: {
                    sc.nextLine(); // Consume newline left by previous input or choice
                    System.out.println("Enter task name:");
                    String name = sc.nextLine();
                    System.out.println("Enter task description:");
                    String desc = sc.nextLine();
                    System.out.println("Enter due date:");
                    String due = sc.nextLine();
                    todo.addTask(name, desc, due);
                    break;
                }
                case 2: {
                    todo.viewTasks();
                    break;
                }
                case 3:{
                    System.out.println("Enter the name of the task to be removed : ");
                    String taskName = sc.next();
                    todo.deleteTask(taskName);
                    break;
                }

                default:
                    break;
            }

        } while (true);
    }
}
