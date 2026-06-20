import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList givenToDoList, Scanner scan) {
        this.toDoList = givenToDoList;
        this.scanner = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String userInput = this.scanner.nextLine();

            if (userInput.equals("stop")) {
                break;
            }

            if (userInput.equals("add")) {
                System.out.println("Task:");
                String userTask = this.scanner.nextLine();
                this.toDoList.add(userTask);
            }

            if (userInput.equals("list")) {
                this.toDoList.print();
            }

            if (userInput.equals("remove")) {
                int taskId = Integer.valueOf(this.scanner.nextLine());
                this.toDoList.remove(taskId);
            }

            if (userInput.equals("completed")) {
                System.out.println("Which task was completed?");
                int number = Integer.valueOf(this.scanner.nextLine());
                this.toDoList.remove(number);
            }
        }
    }
}

