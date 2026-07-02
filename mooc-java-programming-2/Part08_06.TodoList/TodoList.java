import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> taskList;

    // constructor
    public TodoList() {
        this.taskList = new ArrayList<>();
    }


    public void add(String task) {
        this.taskList.add(task);
    }


    public void print() {
        int index = 1;
        for (String task: this.taskList) {
            System.out.println(index + ": " + task);
            index += 1;
        }
    }

    public void remove(int number) {
        this.taskList.remove(number - 1);
    }

}

