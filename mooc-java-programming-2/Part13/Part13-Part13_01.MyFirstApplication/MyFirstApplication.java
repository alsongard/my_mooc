import  javafx.stage.Stage;
import javafx.application.Application;

public class MyFirstApplication extends Application {
    
    @Override  // Built in method from Application class
    public void start(Stage window) {
        window.setTitle("My First Application");
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MyFirstApplication.class);
    }

}
