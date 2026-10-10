import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import  javafx.stage.Stage;
import javafx.scene.Scene;

public class BorderPaneApplication extends Application {

    @Override 
    public void start(Stage window) {
        Label topRightText = new Label("EAST");
        Label topEdge = new Label("NORTH");
        Label bottomEdge = new Label("Botton");

        BorderPane layout = new BorderPane();
        layout.setTop(topEdge);
        layout.setRight(topRightText);
        layout.setBottom(bottomEdge);

        Scene view = new Scene(layout);
        window.setScene(view);

        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

}

