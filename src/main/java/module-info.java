    module com.example.locadora_abvv {
    requires javafx.controls;
    requires javafx.fxml;

        exports com.example.locadora_abvv;
        opens com.example.locadora_abvv to javafx.fxml;
    }