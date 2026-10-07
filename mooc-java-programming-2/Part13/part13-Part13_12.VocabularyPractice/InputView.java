package application;
/*
the first view the user can enter words and their translations into the program.  */

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    // class variables
    // -- new access to a dictionary to add words
    private Dictionary dictionary;


    // constructor
    public InputView(Dictionary dict) {
        this.dictionary = dict;
    } 

    // method that returns Parent : Parent class to most JavaFX components
    public Parent getView() {
        
        GridPane layout = new GridPane();
        Label wordLabel = new Label("Word");
        TextField wordField = new TextField();

        Label translateLabel = new Label("Translation");
        TextField translateField = new TextField();

        Button addBtn = new Button("Add the word pair");


        layout.add(wordLabel, 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(translateLabel, 0, 2);
        layout.add(translateField, 0, 3);
        layout.add(addBtn, 0, 4);


        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);

        addBtn.setOnAction((event)-> {
            this.dictionary.add(wordField.getText(), translateField.getText());
            wordField.clear();
            translateField.clear();
        });

        return layout;
    }
}
