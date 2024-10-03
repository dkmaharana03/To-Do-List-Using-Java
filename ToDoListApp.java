import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp 
{
    private final ArrayList<String> tasks = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ToDoListApp app = new ToDoListApp();
        app.run();
    }
    public void run() 
    {
        boolean running = true;
        while (running)
        {
            printMenu();
            int choice = getUserChoice();
            switch (choice) 
            {
                case 1 -> addTask();
                case 2 -> removeTask();
                case 3 -> viewTasks();
                case 4 -> 
                {
                    System.out.println("Exiting the application.");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void printMenu() 
    {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. View all tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    private int getUserChoice() 
    {
        return scanner.nextInt();
    }
    private void addTask() 
    {
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }
    private void removeTask() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks to remove.");
            return;
        }
        viewTasks();
        System.out.print("Enter the number of the task to remove: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) 
        {
            tasks.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } 
        else 
        {
            System.out.println("Invalid task number.");
        }
    }
    private void viewTasks() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks to display.");
        } else 
        {
            System.out.println("\n--- To-Do List ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}


/*import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp 
{
    private ArrayList<String> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ToDoListApp app = new ToDoListApp();
        app.run();
    }
    public void run() 
    {
        boolean running = true;
        while (running) 
        {
            printMenu();
            int choice = getUserChoice();
            switch (choice) 
            {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private void printMenu() 
    {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. View all tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    private int getUserChoice() 
    {
        return scanner.nextInt();
    }
    private void addTask() {
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }
    private void removeTask() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks to remove.");
            return;
        }
        viewTasks();
        System.out.print("Enter the number of the task to remove: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) 
        {
            tasks.remove(taskNumber - 1);
            System.out.println("Task removed.");
        } 
        else 
        {
            System.out.println("Invalid task number.");
        }
    }
    private void viewTasks() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks to display.");
        } 
        else 
        {
            System.out.println("\n--- To-Do List ---");
            for (int i = 0; i < tasks.size(); i++) 
            {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}*/