
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        // TodoList list = new TodoList();
        // Scanner scanner = new Scanner(System.in);

        // UserInterface ui = new UserInterface(list, scanner);
        // ui.start();

        // Expected the output to contain the string:
        // 1: read the course material
        // Try the code: TodoList list = new TodoList();
        
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy raisins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();

        // print()
        // 1: read the course material
        // 2: watch the latest fool us
        // 3: take it easy

        // remove(2) 
        // print()
        // 1: read the course material
        // 2: watch the latest fool us

        // add("buy raisins")
        // print()
        // 1: read the course material
        // 2: watch the latest fool us
        // 3: buy raisins


        // remove(1)
        // remove(1)
        // print()
        // 1: read the course material

        // Try the code: TodoList list = new TodoList();
        // list.add("first");
        // list.add("second");
        // Scanner scanner = new Scanner(System.in);

        // UserInterface ui = new UserInterface(list, scanner);
        // ui.start();
        // and the commands are:
        // list
        // stop
    }
}

