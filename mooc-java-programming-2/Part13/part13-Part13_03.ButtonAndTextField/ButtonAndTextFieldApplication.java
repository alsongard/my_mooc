import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;



public class ButtonAndTextFieldApplication extends  Application{

    @Override 
    public void start(Stage window) {
        Button enterBtn = new Button("Enter");
        TextField userNameInput = new TextField();
        HBox horLayout = new HBox();
        horLayout.getChildren().add(userNameInput);
        horLayout.getChildren().add(enterBtn);
	horLayout.setSpacing(10);
        Scene myScene = new Scene(horLayout);
        window.setScene(myScene);
        window.show();

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}

