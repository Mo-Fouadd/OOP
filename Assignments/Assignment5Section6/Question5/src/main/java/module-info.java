module com.example.question5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.question5 to javafx.fxml;
    exports com.example.question5;
}