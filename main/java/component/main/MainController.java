package component.main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javax.swing.*;

public class MainController {
    @FXML
    private Label colorChangeId;
    @FXML
    private Button ButChangeId;
    @FXML
    private TilePane MainForm;

    private String[] colors = {"#00938b", "#FF8C00"};
    private int currentColorIndex = 0;

    @FXML
    protected void onColorButtonClick() {
        String currentColor = colors[currentColorIndex];
        MainForm.setStyle("-fx-background-color: " + currentColor);
        currentColorIndex = (currentColorIndex + 1) % colors.length; // Увеличение индекса итерации
    }

    public void showPopupWindow() {
        JFrame frame = new JFrame("Форма добавления нового клиента");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}







