module com.example.sto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens component.main to javafx.fxml;
    exports component.main;
}