module com.example.ola_mundo_swing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ola_mundo_swing to javafx.fxml;
    exports com.example.ola_mundo_swing;
}