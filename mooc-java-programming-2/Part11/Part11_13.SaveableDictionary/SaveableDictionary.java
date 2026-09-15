package dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> myDictWords;
    private String fileDictionary;
    // private Scanner scanner;
    // default constructor
    public SaveableDictionary(String file) {
        this.myDictWords = new HashMap<>();
        this.fileDictionary = file;
    }
    public SaveableDictionary() {
        this.myDictWords = new HashMap<>();
    }
    public void add(String words, String translation)  {
        if (this.myDictWords.get(words) ==  null ) { // does not exist
            this.myDictWords.put(words, translation);
        }
        return;
    }
    public String translate(String word) {
        for (Map.Entry<String, String> entry : this.myDictWords.entrySet()) {
            // System.out.println("key: " + entry.getKey() + " : value " + entry.getValue());
            if (word.equals(entry.getKey())) { // match for key: therefore return value
                return entry.getValue();
            } else if (word.equals(entry.getValue())) { // match for word on value: therefore return key
                return  entry.getKey();
            } 
        }

        return null; 
    }
    /*
        public void add(String words, String translation) adds a word to the dictionary. 
        Every word has just one translation, and if the same word is added for the second time, 
        nothing happens.
        public String translate(String word) returns the translation for the given word. If the 
        word is not in the dictionary, returns null.
    */
    public void delete(String word) {
        Iterator<Map.Entry<String, String>> map =  this.myDictWords.entrySet().iterator();
        while (map.hasNext()) {
            Map.Entry<String, String> val = map.next();
            if (val.getKey().equals(word) || val.getValue().equals(word)) {
                // remove  the key in the map
                map.remove();
            } 
        }
        return;
    }


    public boolean load() {
        try (Scanner scan = new Scanner(Paths.get(this.fileDictionary))) {
            while(scan.hasNextLine()) {
                String someLine = scan.nextLine();
                // System.out.println("this is someLine: " + someLine);
                String[] wordArray = someLine.split(":");
                // System .out.println("this is wordArray: " + wordArray);
                this.myDictWords.put(wordArray[0], wordArray[1]);
            }

            return  true;
        } catch(Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        if (this.fileDictionary == null) {
            return false;
        }

        try (PrintWriter fileReader = new PrintWriter(new FileWriter(this.fileDictionary, false), false)) {
            for (Map.Entry<String, String> entry: this.myDictWords.entrySet()) {
                String myString = entry.getKey() + ":" + entry.getValue();
                fileReader.println(myString);
            } 
            return true;
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}

