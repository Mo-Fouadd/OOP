package com.example.question2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane pane = new GridPane();
        //Write a program that displays a tic-tac-toe board, as shown in
        //Figure. A cell may be X, O, or empty. What to display at each cell is
        //randomly decided. The X and O are images in the files x.gif and o.gif.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = (int)(Math.random()*5);
                if (n%2 == 0)
                    pane.add(new ImageView(new Image("file:images/x.gif")), j, i);
                else
                    pane.add(new ImageView(new Image("file:images/o.gif")), j, i);
            }
        }
        Scene scene = new Scene(pane, 120, 120);
        stage.setTitle("Question 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}