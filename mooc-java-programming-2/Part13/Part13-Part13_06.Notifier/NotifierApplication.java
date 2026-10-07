import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    // start method
    @Override 
    public void start(Stage window) {
        // 
        TextField  myField  = new TextField();
        Button clickBtn = new Button("Update");
        Label bottomLabel = new Label();

        clickBtn.setOnAction((event) -> {
            System.out.println("Pressed!");
            bottomLabel.setText(myField.getText());
        });
        VBox vertLayout = new VBox();

        vertLayout.getChildren().addAll(myField, clickBtn, bottomLabel);

        Scene myScene = new Scene(vertLayout);
        window.setScene(myScene);
	window.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
	launch(NotifierApplication.class);
    }

}

