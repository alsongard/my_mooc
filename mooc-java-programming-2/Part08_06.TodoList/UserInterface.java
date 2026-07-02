import java.util.Scanner;

public class UserInterface {
    private TodoList toDoInstance;
    private Scanner scanner;


    // constructor
    public UserInterface(TodoList todolist, Scanner scan) {
        this.toDoInstance = todolist;
        this.scanner = scan;
    }

    public void start(){

        while (true) {
            String command = this.scanner.nextLine();
    
            if (command.equals("add")) {
                System.out.println("Command: ");
                String userInput = this.scanner.nextLine();
                this.toDoInstance.add(userInput);
    
            } else if (command.equals("list")) {
                this.toDoInstance.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int userValue = Integer.valueOf(this.scanner.nextLine());
                this.toDoInstance.remove(userValue);
            }  else if (command.equals("stop")) {
                return;
            }
        }
    }
}

