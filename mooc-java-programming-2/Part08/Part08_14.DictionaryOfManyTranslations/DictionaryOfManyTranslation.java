import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> myDictionary;


    // constructor
    public DictionaryOfManyTranslations() {
        this.myDictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.myDictionary.get(word) == null) {
            this.myDictionary.put(word, new ArrayList<>());
        }
        this.myDictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.myDictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return this.myDictionary.get(word);
    }

    public void remove(String word) {
        this.myDictionary.remove(word);
    }

}

