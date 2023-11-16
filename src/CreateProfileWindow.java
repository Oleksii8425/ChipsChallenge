import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class CreateProfileWindow extends Application {
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

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

    public void addButtonCLicked(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Congratulations! "
                + "You added a new profile with username: "
                + usernameTextField.getText());
        alert.getDialogPane().getChildren().stream().filter(node ->
            node instanceof Label).forEach(node ->
                ((Label)node).setMinHeight(Region.USE_PREF_SIZE));
        alert.showAndWait();

        Stage stage = (Stage) addButton.getScene().getWindow();
        stage.close();
    }

    public void cancelButtonClicked(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
