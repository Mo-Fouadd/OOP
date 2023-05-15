module com.example.krfs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.krfs to javafx.fxml;
    exports com.example.krfs;
}