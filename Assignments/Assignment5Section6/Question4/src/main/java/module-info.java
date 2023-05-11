module com.example.question4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.question4 to javafx.fxml;
    exports com.example.question4;
}