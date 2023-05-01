module com.example.assignment4section6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment4section6 to javafx.fxml;
    exports com.example.assignment4section6;
}