import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.size() == 0) {
            return "Jokes are in short supply.";
        }

        Random rand = new Random();
        int index = rand.nextInt(this.jokes.size()); // the argument is the upper bound and it's exclusive of the upper bound 
        return this.jokes.get(index);
    }

    public void printJokes() {
        if (this.jokes.size() == 0) {
            System.out.println("Jokes are short in supply.");
        }
        for (String jokeItem: this.jokes) {
            System.out.println(jokeItem);
        }
    }
}

