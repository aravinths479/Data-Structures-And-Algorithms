package console_application_practice.ToDo;

import java.util.*;

class Task {
    private String name;
    private String description;
    private String dueDate;

    // Getters and setters for task attributes
    // (omitted for brevity)

    // Constructor
    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

class Todo {
    private List<Task> todo;

    // Constructor
    public Todo() {
        this.todo = new ArrayList<>();
    }

    // Add task to the list
    public void addTask(String name, String desc, String dueDate) {
        Task task = new Task(name, desc, dueDate);
        todo.add(task);
        System.out.println("Task added successfully.");
    }

    // View all tasks in the list
    public void viewTasks() {
        if (todo.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        System.out.println("Viewing All Tasks");
        System.out.println("----------------------------------------------------------------");
        for (Task task : todo) {
            System.out.println("\n Task name : " + task.getName() + "\n Description : " + task.getDescription()
                    + "\n Due Date : " + task.getDueDate());
            System.out.println("----------------------------------------------------------------");
        }
    }

    // Delete task from the list
    public void deleteTask(String taskName) {
        Iterator<Task> iterator = todo.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getName().equals(taskName)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }
}

public class codeByChatGPT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Todo todo = new Todo();

        int choice;
        do {
            System.out.println("\n1. Add Task\n2. View All Tasks\n3. Delete Task\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter task name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter task description:");
                    String desc = scanner.nextLine();
                    System.out.println("Enter due date:");
                    String dueDate = scanner.nextLine();
                    todo.addTask(name, desc, dueDate);
                    break;
                case 2:
                    todo.viewTasks();
                    break;
                case 3:
                    System.out.println("Enter the name of the task to be removed: ");
                    String taskName = scanner.nextLine();
                    todo.deleteTask(taskName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
