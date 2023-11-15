import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreateProfileWindow extends Application {
    public void show() {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CreateProfileWindow.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Creating new profile window");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
