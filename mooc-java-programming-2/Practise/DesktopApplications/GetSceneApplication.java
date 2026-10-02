import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class GetSceneApplication extends Application {
	@Override
	public void start(Stage window) {
		Button myBtn = new Button("Click Me");
		FlowPane componentGroup = new FlowPane();
		componentGroup.getChildren().add(myBtn);
		Scene scene = new Scene(componentGroup);
		window.setScene(scene);
		window.show();
	}

	public static void main(String[] args) {
		launch(GetSceneApplication.class);
	}

}
