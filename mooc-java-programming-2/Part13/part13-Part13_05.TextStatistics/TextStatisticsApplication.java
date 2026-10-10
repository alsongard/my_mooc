
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override 
    public void start(Stage window) {
        BorderPane pane = new BorderPane();

        // hor layout for TextComponents
        HBox  textLayout = new HBox();
        textLayout.setSpacing(10);
        
        textLayout.getChildren().add(new Label("Letters: 0"));
        textLayout.getChildren().add(new Label("Words: 0"));
        textLayout.getChildren().add(new Label("The longest word is:"));

        TextArea myTextArea = new TextArea();
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

