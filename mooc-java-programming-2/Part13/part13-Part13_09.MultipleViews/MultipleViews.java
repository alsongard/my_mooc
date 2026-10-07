
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends  Application{

    public  void start(Stage window) {
        BorderPane borderView = new BorderPane();
        Label firstLabel = new Label("First View");
        Button firstBtn = new Button("To the second view!");
        borderView.setTop(firstLabel);
        borderView.setCenter(firstBtn);

        Scene firstScene = new Scene(borderView);

        // Second View
        VBox vertLayout = new VBox();
        Button secondBtn = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        vertLayout.getChildren().addAll(secondBtn, secondLabel);
        
        Scene secondScene = new Scene(vertLayout);
    
    
        GridPane gridView = new GridPane();
        gridView.add(new Label("Third View"), 0,0);        
        Button toFirstBtn = new Button("To the first view!");
        gridView.add(toFirstBtn, 1,1);
        // gridView structure: 0,0 : col, row -> column 0 row 0
        // 0,1 -> column 0 row 1
        Scene thirdScene = new Scene(gridView);

        firstBtn.setOnAction((event)->{
            window.setScene(secondScene);
        });

        secondBtn.setOnAction((event)->{
            window.setScene(thirdScene);
        });


        toFirstBtn.setOnAction((event)->{
            window.setScene(firstScene);
        });
        window.setScene(firstScene);
        window.show();
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}

