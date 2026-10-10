import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication  extends  Application {

    @Override 
    public void start(Stage window) {
        FlowPane componentGroup = new FlowPane();
        Scene sceneLayout = new Scene(componentGroup);
        Button myBtn = new Button("Click Me!");
        Label myLabel = new Label("Getting Started");
        componentGroup.getChildren().add(myLabel);
        componentGroup.getChildren().add(myBtn);
        window.setScene(sceneLayout);
        window.show();
    
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
