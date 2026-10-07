package application;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/*

In the practice view the user is presented with a word in the original language, and their task is to write down the translation. If the answer is correct, the user interface displays the text "Correct!". If the answer is incorrect, the text that is displayed is "Incorrect!"
*/
public class PracticeView {
    // class variables // access to dictionary
    private  Dictionary dictionary;
    private String key;
    
    public  PracticeView(Dictionary dict) {
        this.dictionary = dict;
    }
    public  Parent getView() {

        this.key = this.dictionary.getRandomWord();  

        GridPane layout= new GridPane();
        // this.key = this.dictionary.getRandomWord();
        Label firstLabel =new Label("Translate the word: " + this.key);
        TextField userInput = new TextField();
        Label feedBack = new Label();
        Button checkBtn = new Button("Check");

        checkBtn.setOnMouseClicked((event)-> {
            System.out.println("Key : " + this.key + ", Value: " + this.dictionary.get(this.key));

            if (this.dictionary.get(this.key).equals(userInput.getText())) {
                feedBack.setText("Correct!");
                // assign new word to translateString
            } else {
                feedBack.setText("Incorrect!");
                userInput.clear();
                return ;
            }
            this.key = this.dictionary.getRandomWord();
            System.out.println("New key: " + this.key + ", Value: " + this.dictionary.get(this.key)); 

            firstLabel.setText("Translate the word: " + this.key);
            userInput.clear();
        });

        layout.add(firstLabel, 0, 0);
        layout.add(userInput, 0, 1);
        layout.add(checkBtn,0 , 3);
        layout.add(feedBack, 0, 4);


        return layout;

    }
}
