package component.main;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class SampleController {
    @FXML
    private void showPopupWindow() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Popup Window");
        alert.setHeaderText("Hello!");
        alert.setContentText("This is a new popup window.");
        alert.showAndWait();
    }
}
