import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks; 

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            int index = i + 1;
            System.out.println(index + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number) {
        if (number > this.tasks.size() -1) {
            return;
        }
        this.tasks.remove(number - 1); 
    }
}


