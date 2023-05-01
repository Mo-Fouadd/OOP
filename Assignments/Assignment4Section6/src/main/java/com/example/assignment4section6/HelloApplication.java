package com.example.assignment4section6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        //Create a circle and set its properties
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setStroke(Color.DARKGRAY);
        circle.setStrokeWidth(10);
        circle.setFill(Color.TRANSPARENT);

        //Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        //Create a scene and place it in the stage
        // int x= stage.get
        Scene scene = new Scene(pane,500,500);
        stage.setTitle("ShowCircle");
        stage.setScene(scene);
//      stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}