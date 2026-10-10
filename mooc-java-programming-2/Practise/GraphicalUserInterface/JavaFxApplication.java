import javafx.application.Application;
import javafx.state.Stage;

public class JavaFxApplication   extends  Application{
    
    @Override 
    public  void start(Stage window) {
        window.setTitle("Hello World");
        window.show();
    }

    public static void main(String[] args) {
        lauch(JavaFxApplication.class);
    }
}
