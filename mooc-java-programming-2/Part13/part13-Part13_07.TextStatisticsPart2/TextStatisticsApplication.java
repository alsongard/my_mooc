
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends  Application{
    // start function
    @Override 
    public void start(Stage window) {
        BorderPane pane = new BorderPane();

        // hor layout for TextComponents
        HBox  textLayout = new HBox();
        textLayout.setSpacing(10);
        

        Label lettersLength = new Label();
        Label wordsNum = new Label();
        Label longestWord = new Label();



        TextArea myTextArea = new TextArea();

        myTextArea.textProperty().addListener((change, oldValue, newVaue)->{
            lettersLength.setText("Letters: " + String.valueOf(newVaue.length()));
            String[] parts = newVaue.split(" ");
            wordsNum.setText(String.valueOf("Words: " + parts.length));

            String longest = Arrays.stream(parts)
                .sorted((s1,s2)-> s2.length() - s1.length())
                .findFirst()
                .get();
            longestWord.setText("The longest word is " + longest);

        });
        textLayout.getChildren().add(lettersLength);
        textLayout.getChildren().add(wordsNum);
        textLayout.getChildren().add(longestWord);
        pane.setCenter(myTextArea);
        pane.setBottom(textLayout);
        Scene myScene = new Scene(pane);

        window.setScene(myScene);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
	launch(TextStatisticsApplication.class);

    }

}

