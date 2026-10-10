package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    // class variables
    private HashMap<String, String> wordPair;
    private ArrayList<String> words;    

    // constructor
    public Dictionary() {
        this.wordPair = new HashMap<>();
        this.words = new ArrayList<>();
    }

    // other methods
    public String get(String word) {
        return this.wordPair.get(word);
    }

    public  void add(String word, String translation) {
        if (!this.wordPair.containsKey(word)) { // word does not exist in HashMap
            this.words.add(word);
        }
        // else update value
        this.wordPair.put(word, translation);
    }

    public void printAll() {
        for (Map.Entry<String, String> entry : this.wordPair.entrySet()) {
            String key   = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
