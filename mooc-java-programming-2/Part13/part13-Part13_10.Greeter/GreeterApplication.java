
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends  Application{

    @Override 
    public void start(Stage window) {
        Label startLabel = new Label("Enter your name and start");
        TextField userNameInput = new TextField();
        Button startBtn = new Button("Start");

        VBox vertLayout = new VBox();
        vertLayout.setPadding(new Insets(10, 10, 10, 10));
        vertLayout.setAlignment(Pos.TOP_LEFT);
        vertLayout.getChildren().addAll(startLabel, userNameInput, startBtn);

        Scene firstScene = new Scene(vertLayout);

        Label welcomeMsg = new Label("");
        Scene secondScene = new Scene(welcomeMsg);

        startBtn.setOnAction((event)->{
            welcomeMsg.setText("Welcome " + userNameInput.getText() + "!");
            window.setScene(secondScene);
        });

        window.setScene(firstScene);
        window.show();
        
    }
    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}

