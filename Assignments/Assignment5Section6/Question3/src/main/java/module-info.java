module com.example.question3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.question3 to javafx.fxml;
    exports com.example.question3;
}