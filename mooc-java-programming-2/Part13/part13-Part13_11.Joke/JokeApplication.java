
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends  Application{


    @Override 
    public void start(Stage window) {

        BorderPane mainLayout = new BorderPane();
        HBox menu = new HBox();
        Button firstBtn = new Button("Joke");
        Button secondBtn = new Button("Answer");
        Button thirdBtn = new Button("Explanation");
        menu.getChildren().addAll(firstBtn, secondBtn, thirdBtn);
        mainLayout.setTop(menu);


        Label firstLbl = new Label("What do you call a bear with no teeth?");
        Label secondLbl = new Label("A gummy bear.");
        Label thirdLbl = new Label("I have no idea on this?");

        mainLayout.setCenter(firstLbl);
        firstBtn.setOnAction((event)->{
            mainLayout.setCenter(firstLbl);
        });
        secondBtn.setOnAction((event)->{
            mainLayout.setCenter(secondLbl);
        });
        thirdBtn.setOnAction((event)->{
            mainLayout.setCenter(thirdLbl);
        });
        Scene myScene = new Scene(mainLayout);
        window.setScene(myScene);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}

