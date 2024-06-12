import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoListApp {
    private List<String> todoList;
    private Scanner scanner;

    public TodoListApp() {
        this.todoList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Todo List App");
            System.out.println("------------");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsDone();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.next();
        todoList.add(task);
        System.out.println("Task added successfully!");
    }

    private void viewTasks() {
        System.out.println("Your Todo List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    private void markTaskAsDone() {
        viewTasks();
        System.out.print("Enter task number to mark as done: ");
        int taskNumber = scanner.nextInt() - 1;
        if (taskNumber >= 0 && taskNumber < todoList.size()) {
            String task = todoList.get(taskNumber);
            todoList.set(taskNumber, "[" + task + "]");
            System.out.println("Task marked as done!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int taskNumber = scanner.nextInt() - 1;
        if (taskNumber >= 0 && taskNumber < todoList.size()) {
            todoList.remove(taskNumber);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        app.start();
    }
}