package com.example.question1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Write a program that displays four images in a grid pane, as
        //shown in Figure
        GridPane gridPane = new GridPane();
        Image image1 = new Image("file:images/ca.gif");
        Image image2 = new Image("file:images/china.gif");
        Image image3 = new Image("file:images/uk.gif");
        Image image4 = new Image("file:images/us.gif");
        ImageView imageView1= new ImageView(image1);
        ImageView imageView2= new ImageView(image2);
        ImageView imageView3= new ImageView(image3);
        ImageView imageView4= new ImageView(image4);
        //gridPane.getChildren().addAll(imageView1,imageView2,imageView3,imageView4);
        gridPane.add(imageView1,0,0);
        gridPane.add(imageView2,0,1);
        gridPane.add(imageView3,1,0);
        gridPane.add(imageView4,1,1);
        Scene scene = new Scene(gridPane,400,300);
        stage.setTitle("Question 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main() {
        launch();
    }
}