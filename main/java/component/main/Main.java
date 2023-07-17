package component.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Открыть окно");
        button.setOnAction(e -> showPopupWindow());

        Scene scene = new Scene(button, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showPopupWindow() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Всплывающее окно");
        alert.setHeaderText("Привет!");
        alert.setContentText("Это новое всплывающее окно.");

        alert.showAndWait();
    }
}
